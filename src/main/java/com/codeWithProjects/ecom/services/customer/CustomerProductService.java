package com.codeWithProjects.ecom.services.customer;

import com.codeWithProjects.ecom.dto.ProductDetailDto;
import com.codeWithProjects.ecom.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {


    List<ProductDto> getAllProducts();
    List<ProductDto>searchProductByName(String name);

    ProductDetailDto getProductDetailById(Long productId);

}
