package com.codeWithProjects.ecom.services.customer.Wishlist;

import com.codeWithProjects.ecom.dto.WishlistDto;
import com.codeWithProjects.ecom.entity.Wishlist;

import java.util.List;

public interface WishlistService {

    static WishlistDto addProductToWishlist(WishlistDto wishlistDto);

   List<WishlistDto> getWishlistByUserId(Long userId);

}
