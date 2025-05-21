package com.man.repository;

import com.man.dto.ProductDto;

public interface ProductRepo {
    boolean persist(ProductDto productDto);
}
