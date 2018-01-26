package com.smallcode.bean;

import java.io.Serializable;

/**
 * Created by Lenny on 2018/1/7.
 */
public class ResultMessage implements Serializable {

    private boolean success;

    private String Message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
