package com.hwj.tgy.controller.wx;

import com.hwj.tgy.common.utils.PropertiesUtils;
import com.hwj.tgy.common.utils.httpClient.HttpClientUtils;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.service.wx.WxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

@RestController
@RequestMapping("/wx")
public class WxController {

    @Autowired
    private WxService wxService;

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
     * 微信小程序登录
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
}
