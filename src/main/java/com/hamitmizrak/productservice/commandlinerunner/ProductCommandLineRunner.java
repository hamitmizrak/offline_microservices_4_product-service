package com.hamitmizrak.productservice.commandlinerunner;

import com.hamitmizrak.productservice.business.dto.ProductDto;
import com.hamitmizrak.productservice.business.services.IProductServices;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// LOMBOK
@RequiredArgsConstructor

@Configuration
public class ProductCommandLineRunner {

    // Injection
    //private final IProductServices iProductServices;

    @Bean
    public CommandLineRunner productDataSet(IProductServices iProductServices){
        return args -> {
            for (int i = 1; i <=5 ; i++) {
                iProductServices.productServiceCreate(
                        ProductDto.builder()
                                .productName("name"+i)
                                .productPrice(10*i)
                                .productQuantify("large"+i)
                                .build()
                );
            }
        }; //end return
    } //end CommandLineRunner
} //end ProductCommandLineRunner
