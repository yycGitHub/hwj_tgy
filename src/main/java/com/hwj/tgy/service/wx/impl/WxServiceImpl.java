package com.hwj.tgy.service.wx.impl;

import com.alibaba.fastjson.JSONObject;
import com.hwj.tgy.common.utils.PropertiesUtils;
import com.hwj.tgy.common.utils.httpClient.HttpClientUtils;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.service.wx.WxService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Properties;

@Service
public class WxServiceImpl implements WxService {

    @Override
    public boolean checkSignature(String signature, String timestamp, String nonce) {
        // 1.将token、timestamp、nonce三个参数进行字典序排序
        Boolean bool = true;
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("tgy.properties");
            String[] arr = new String[] { properties.getProperty("wx.token"), timestamp, nonce };
            Arrays.sort(arr);

            // 2. 将三个参数字符串拼接成一个字符串进行sha1加密
            StringBuilder content = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                content.append(arr[i]);
            }
            MessageDigest md = null;
            String tmpStr = null;
            try {
                md = MessageDigest.getInstance("SHA-1");
                // 将三个参数字符串拼接成一个字符串进行sha1加密
                byte[] digest = md.digest(content.toString().getBytes());
                tmpStr = byteToStr(digest);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            content = null;
            // 3.将sha1加密后的字符串可与signature对比，标识该请求来源于微信
            bool = tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bool;
    }

    private static String byteToHexStr(byte mByte) {
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F' };
        char[] tempArr = new char[2];
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
        tempArr[1] = Digit[mByte & 0X0F];
        String s = new String(tempArr);
        return s;
    }

    private static String byteToStr(byte[] byteArray) {
        StringBuilder strDigest = new StringBuilder();
        for (int i = 0; i < byteArray.length; i++) {
            strDigest.append(byteToHexStr(byteArray[i]));
        }
        return strDigest.toString();
    }

    @Override
    public ResultMessage signInMiniproject(String code) {
        Properties properties = PropertiesUtils.getTgyProperties();
        String code2SessionUrl = "https://api.weixin.qq.com/sns/jscode2session?appid="+properties.getProperty("wx.appid")
                +"&secret="+properties.getProperty("wx.appsecret")+"&js_code="+code+"&grant_type="+properties.getProperty("wx.grant_type");
        String result = HttpClientUtils.sendGet(code2SessionUrl,true,true);
        JSONObject jsonObj = JSONObject.parseObject(result);
        return ResultMessage.getResultMessageSuccess(result);
    }



}
