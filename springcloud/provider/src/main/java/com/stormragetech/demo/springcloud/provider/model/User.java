package com.stormragetech.demo.springcloud.provider.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * description: //TODO
 *
 * @author: Xue Bin
 * @version: 1.0.0-SNAPSHOT
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 8302892693129974503L;

    private String name;
    private int age;

}
