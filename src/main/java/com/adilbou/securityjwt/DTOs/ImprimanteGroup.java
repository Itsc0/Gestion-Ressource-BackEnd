package com.adilbou.securityjwt.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ImprimanteGroup {
    private String resolution;
    private int vitesse;
    private Integer count;
}
