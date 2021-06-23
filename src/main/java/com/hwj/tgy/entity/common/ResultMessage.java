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

   public static ResultMessage getResultMessageSuucess(){
        ResultMessage rm = new ResultMessage();
        rm.setCode("200");
        rm.setMessage("success");
        return rm;
    }
}
