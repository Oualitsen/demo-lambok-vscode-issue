/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

/**
 *
 */

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@FieldNameConstants
public class BasicEntity implements Serializable {

    protected String id;

    protected long creationDate;

    protected long lastUpdate;

    public BasicEntity() {
    }

    public void setId(final String id) {

        if (id != null && id.isEmpty()) {
            this.id = null;
        } else {
            this.id = id;
        }

    }

}
