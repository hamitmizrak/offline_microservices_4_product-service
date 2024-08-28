package com.hamitmizrak.productservice.controller.api.impl;

import com.hamitmizrak.productservice.business.dto.ProductDto;
import com.hamitmizrak.productservice.business.services.IProductServices;
import com.hamitmizrak.productservice.controller.api.IProductApi;
import com.hamitmizrak.productservice.utils.frontend.ReactFrontend;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// API
@RestController
@CrossOrigin(origins = ReactFrontend.PRODUCTION_REACT_FRONTEND_PORT_URL) // http://localhost:3000
@RequestMapping("/product/api/v1")
public class ProductApiImpl implements IProductApi<ProductDto> {

    // Injection
    private final IProductServices iProductServices;

    // http://localhost:5555/product/api/v1/create
    @Override
    @PostMapping("/create")
    public ResponseEntity<?> productApiCreate(@Valid @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(iProductServices.productServiceCreate(productDto));
    }

    // http://localhost:5555/product/api/v1/list
    @Override
    @GetMapping("/list")
    public ResponseEntity<List<ProductDto>> productApiList() {
        return ResponseEntity.ok(iProductServices.productServiceList());
    }

    // http://localhost:5555/product/api/v1/find/1
    @Override
    @GetMapping("/find/{id}")
    public ResponseEntity<?> productApiFindById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(iProductServices.productServiceFindById(id));
    }

    // http://localhost:5555/product/api/v1/update/1
    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<?> productApiUpdate(@PathVariable(name = "id") Long id, @Valid @RequestBody ProductDto productDto) {
       return ResponseEntity.ok(iProductServices.productServiceUpdate(id,productDto));
    }

    // http://localhost:5555/product/api/v1/delete/1
    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity<?> productApiDelete(@PathVariable(name = "id") Long id) {
        return  ResponseEntity.ok(iProductServices.productServiceDelete(id));
    }

} //end ProductApiImpl
