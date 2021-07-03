package com.hwj.tgy.service.wx;

import com.hwj.tgy.entity.common.ResultMessage;

public interface WxService {
    public boolean checkSignature(String signature, String timestamp,String nonce);

    public ResultMessage signInMiniproject(String code);
}
