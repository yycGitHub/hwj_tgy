package com.hwj.tgy.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMessage {
    private String code;
    private String message;
    private String result;

   public static ResultMessage getResultMessageSuccess(){
        ResultMessage rm = new ResultMessage();
        rm.setCode("200");
        rm.setMessage("success");
        rm.setResult("");
        return rm;
    }

    public static ResultMessage getResultMessageSuccess(String jsonStr){
        ResultMessage rm = new ResultMessage();
        rm.setCode("200");
        rm.setMessage("success");
        rm.setResult(jsonStr);
        return rm;
    }

    public static ResultMessage getResultMessageFail(){
        ResultMessage rm = new ResultMessage();
        rm.setCode("500");
        rm.setMessage("fail");
        rm.setResult("");
        return rm;
    }

    public static ResultMessage getResultMessageFail(String jsonStr){
        ResultMessage rm = new ResultMessage();
        rm.setCode("500");
        rm.setMessage("fail");
        rm.setResult(jsonStr);
        return rm;
    }
}
