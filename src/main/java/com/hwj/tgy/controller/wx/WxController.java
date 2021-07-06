package com.hwj.tgy.controller.wx;

import com.hwj.tgy.entity.UserWxInfo;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.mapper.UserWxInfoMapper;
import com.hwj.tgy.service.wx.WxService;
import com.hwj.tgy.service.wx.UserWxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/wx")
public class WxController {

    @Autowired
    private WxService wxService;
    @Autowired
    private UserWxInfoService userWxInfoService;
    @Autowired
    private UserWxInfoMapper userWxInfoMapper;

    /**
     * 验证消息的确来自微信服务器
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/checkSignature")
    public ResultMessage checkSignature(HttpServletRequest request, HttpServletResponse response){
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        wxService.checkSignature(signature,timestamp,nonce);
        return ResultMessage.getResultMessageSuccess();
    }

    /**
     * 微信小程序登录获取详细登录信息
     * @return
     */
    @RequestMapping("/signInMiniproject")
    public ResultMessage signInMiniproject(HttpServletRequest request, HttpServletResponse response){

        String code = request.getParameter("code");
        if (code==null||code.isEmpty()) {
            return ResultMessage.getResultMessageFail();
        }
        return wxService.signInMiniproject(code);
    }

    /**
     * 微信小程序登录保存用户信息
     * @return
     */
    @RequestMapping("/saveWxUserWxInfo")
    public ResultMessage saveWxUserWxInfo(@RequestBody UserWxInfo userWxInfo){
        //判断该用户是否已存在
        List<UserWxInfo> userWxInfoList = userWxInfoService.selectByExample(userWxInfo);
        if (userWxInfoList.size()==1) {
            //更新
            userWxInfo.setId(userWxInfoList.get(0).getId());
            return userWxInfoService.updateUserWxInfo(userWxInfo);
        } else {
            //新增
            return userWxInfoService.insertUserWxInfo(userWxInfo);
        }

    }

}
