package com.example.moviewbackend.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;

@Getter
public class ReviewRequestDto {
    private Long user_id; // 임시로 사용자 인증을 위해
    @NotBlank
    private String content;
    @NotNull
    @DecimalMin(value = "0.5")
    @DecimalMax(value = "10.0")
    private float star;
}
