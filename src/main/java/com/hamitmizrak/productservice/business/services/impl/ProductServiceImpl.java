package com.hamitmizrak.productservice.business.services.impl;

import com.hamitmizrak.productservice.bean.ModelMapperBean;
import com.hamitmizrak.productservice.business.dto.ProductDto;
import com.hamitmizrak.productservice.business.services.IProductServices;
import com.hamitmizrak.productservice.data.entity.ProductEntity;
import com.hamitmizrak.productservice.data.repository.IProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// SERVICES
@Service
public class ProductServiceImpl implements IProductServices<ProductDto, ProductEntity> {

    // Injection
    private final IProductRepository iProductRepository;
    private final ModelMapperBean modelMapperBean;


    ///////////////////////////////////////////
    // Model Mapper
    @Override
    public ProductDto EntityToDto(ProductEntity productEntity) {
        return modelMapperBean.getModelMapperMethod().map(productEntity, ProductDto.class);
    }

    @Override
    public ProductEntity DtoToEntity(ProductDto productDto) {
        return modelMapperBean.getModelMapperMethod().map(productDto, ProductEntity.class);
    }

    ///////////////////////////////////////////
    // C R U D
    // CREATE
    @Override
    @Transactional
    public ProductDto productServiceCreate(ProductDto productDto) {
        if(productDto!=null){
            ProductEntity productEntity = DtoToEntity(productDto);
            iProductRepository.save(productEntity);
            // Kayıt işleminden sonra Id Set et
            productDto.setId(productEntity.getId());
            productDto.setCreateDate(productEntity.getCreateDate());
        }else{
            throw new NullPointerException("ProductDto is null");
        }
        return productDto;
    }

    // LIST
    @Override
    public List<ProductDto> productServiceList() {
        return List.of();
    }

    // FIND BY ID
    @Override
    public ProductDto productServiceFindById(Long id) {
        return null;
    }

    // UPDATE
    @Override
    @Transactional
    public ProductDto productServiceUpdate(Long id, ProductDto productDto) {
        return null;
    }

    // DELETE
    @Override
    @Transactional
    public ProductDto productServiceDelete(Long id) {
        return null;
    }

} //end ProductServiceImpl
