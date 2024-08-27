package com.hamitmizrak.productservice.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Map;

// LOMBOK
@Data
@Builder

// Spring Framework gelen hataları(errors) kendimize göre yakalayalım
// Jackson: Objeyi json'a çevirir
// JsonInclude.Include.NON_NULL: Eğer hata mesajında null değer varsa backentte gönderme
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {


    // sem pvc
    private Integer status;
    private String  error;
    private String  message;
    private String  path;
    private Map<String,String> validationErrors;
    private Date createdDate=new Date(System.currentTimeMillis());

    // parametresiz constructor
    public ApiResult() {
    }

    // smp
    // parametreli constructor
    public ApiResult(Integer status, String message, String path) {
        this.status = status;
        this.message = message;
        this.path = path;
    }

} //end class
