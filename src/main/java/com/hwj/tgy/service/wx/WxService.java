package com.hwj.tgy.service.wx;

public interface WxService {
    public boolean checkSignature(String signature, String timestamp,String nonce);
}
