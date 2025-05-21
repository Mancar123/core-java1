package com.man.repository;

import com.man.dto.ProductDto;

public class ProductrepoImpl implements ProductRepo{
    public ProductrepoImpl(){
        System.out.println("constructor created");
    }
    @Override
    public boolean persist(ProductDto productDto) {
        if(productDto!=null){
            System.out.println("productdto is not null");
        }else {
            System.out.println("product is null");
        }
        System.out.println("successfully running in repo");
        return true;

    }
}
