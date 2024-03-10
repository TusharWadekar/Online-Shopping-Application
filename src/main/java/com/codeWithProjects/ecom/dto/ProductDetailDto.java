package com.codeWithProjects.ecom.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductDetailDto {

    private ProductDto productDto;

    private List<ReviewDto> ReviewDtoList;

    private List<FAQDto> faqDtoList;


    public static void setproductDto(ProductDto dto) {
    }

    public static void setfaqDtoList(List<FAQDto> collect) {
    }

}
