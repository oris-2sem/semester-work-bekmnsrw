package com.bekmnsrw.anistore.dto;

import com.bekmnsrw.anistore.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String secondName;
    private UserRole userRole;
    private String email;
}
