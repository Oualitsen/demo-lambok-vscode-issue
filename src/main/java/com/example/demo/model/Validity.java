/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

/**
 *
 *
 */

@Getter
@Setter
@FieldNameConstants
public class Validity {

    public static final long EXPIRY_DATE_NEVER = -1;

    private long expiryDate = EXPIRY_DATE_NEVER;

    private ValidityStatus status = ValidityStatus.PENDING;
    private String statusText;

    public Validity(ValidityStatus status, long expiryDate) {
        this.status = status;
        this.expiryDate = expiryDate;
    }

    public Validity() {
    }

    public boolean isExpired() {
        return expiryDate != -1 && System.currentTimeMillis() > expiryDate;
    }

}
