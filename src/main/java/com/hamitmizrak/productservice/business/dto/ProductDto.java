package com.hamitmizrak.productservice.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.Date;

// LOMBOK
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// Validation
public class ProductDto implements Serializable {

    // Serileştirme
    public static final Long serialVersionUID = 1L;

    private Long id;
    private String productName;
    private double productPrice;
    private int productQuantify;
    private Date createDate;
} //end ProductDto
