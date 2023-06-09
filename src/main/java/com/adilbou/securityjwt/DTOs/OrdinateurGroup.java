package com.adilbou.securityjwt.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrdinateurGroup {

    private String cpu;
    private int ram;
    private String stockage;
    private String ecran;
    private Integer count;

}
