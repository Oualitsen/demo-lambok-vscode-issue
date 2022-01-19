/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.extern.java.Log;

import java.util.List;

/**
 *
 */

@Getter
@Setter
@Log
@FieldNameConstants
public abstract class UserBase extends Validatable {

    /**
     * this will be the average rate of this guy
     */
    /**
     * This is the number of people who rated this guy
     */
    protected String firstName;
    protected String lastName;
    protected long dateOfBirth;

    /**
     * this will be the average rate of this guy
     */
    protected double rate;
    /**
     * This is the number of people who rated this guy
     */

    protected int rateCount;
    private int tripCount;
    /**
     * This field is used for profile completion purpose
     */
    private String currentTripId;

    private String password;

    private String stripeAccountId;

}
