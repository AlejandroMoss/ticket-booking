package com.mosscompanysas.domain.model.booking;

import com.mosscompanysas.domain.model.user.User;

import java.util.Date;

public class Booking {
    private int ID;
    private User user;
    private int totalPrice;
    private String status;
    private Date expiresAt;
    private Date createAt;

}
