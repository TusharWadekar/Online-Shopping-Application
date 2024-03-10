package com.codeWithProjects.ecom.controller.customer;

import com.codeWithProjects.ecom.dto.WishlistDto;
import com.codeWithProjects.ecom.entity.Wishlist;
import com.codeWithProjects.ecom.repository.WishlistRepository;
import com.codeWithProjects.ecom.services.customer.Wishlist.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class WishlistController {

     private final WishlistService wishlistService;

     @PostMapping("/wishlist")
     public ResponseEntity<?> addProductToWishlist(@RequestBody WishlistDto wishlistDto) {
         WishlistDto postedWishlistDto;
         postedWishlistDto = WishlistService.addProductToWishlist(wishlistDto);
         if (postedWishlistDto == null)
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
             return ResponseEntity.status(HttpStatus.CREATED).body(postedWishlistDto);

     }
     @GetMapping("/wishlist/{userId}")
     public ResponseEntity<List<WishlistDto>> getWishlistByUserId(@PathVariable Long userId){
         return ResponseEntity.ok(wishlistService.getWishlistByUserId(userId));
     }

}
