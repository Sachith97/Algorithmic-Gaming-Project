package com.pdsa.gamingProject.enums;

/**
 * @author Sachith Harshamal
 */
public enum Response {

    SUCCESS(1, "Success"),
    FAILED(2, "Failed");

    private final int responseCode;
    private final String responseMessage;

    Response(int responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }
}
