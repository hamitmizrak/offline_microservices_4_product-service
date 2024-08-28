package com.hamitmizrak.productservice.controller.mvc.impl;

import com.hamitmizrak.productservice.business.dto.ProductDto;
import com.hamitmizrak.productservice.controller.mvc.IProductMvc;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public class ProductMvcImpl implements IProductMvc {


    // CREATE GET
    @Override
    public String productCreateGet(Model model) {
        return "";
    }

    // CREATE POST
    @Override
    public String productCreatePost(ProductDto productDto, BindingResult bindingResult, Model model) {
        return "";
    }

    // LIST
    @Override
    public String productListGet(Model model) {
        return "";
    }

    // FIND
    @Override
    public String productFindGet(Long id, Model model) {
        return "";
    }

    // UPDATE GET
    @Override
    public String productUpdateGet(Long id, Model model) {
        return "";
    }

    // UPDATE POST
    @Override
    public String productUpdatePost(Long id, ProductDto productDto, BindingResult bindingResult, Model model) {
        return "";
    }

    // DELETE
    @Override
    public String productDeleteGet(Long id, Model model) {
        return "";
    }

} //end ProductMvcImpl
