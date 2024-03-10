package com.codeWithProjects.ecom.dto;

import com.codeWithProjects.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {


    private Long Id;
    private String email;
    private String name;
    private UserRole userRole;


}
