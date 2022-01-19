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
public class Validatable extends BasicEntity {

    protected Validity validity;

}
