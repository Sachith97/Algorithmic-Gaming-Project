package com.pdsa.gamingProject.dao;

import com.pdsa.gamingProject.enums.Response;
import lombok.Data;

/**
 * @author Sachith Harshamal
 */
@Data
public class CommonResponseDao {

    private int responseCode;
    private String responseMessage;

    public CommonResponseDao() {
    }

    public CommonResponseDao(Response response) {
        this.responseCode = response.getResponseCode();
        this.responseMessage = response.getResponseMessage();
    }
}
