package com.hs.localserviceai.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class CreateServiceOrderRequest {

    @NotNull
    private Long userId;
    @NotBlank
    private String serviceType;
    @NotBlank
    private String title;
    private String description;
    @NotNull
    @DecimalMin("0.01")
    private BigDecimal price;
    @NotBlank
    private String contactPhone;
    @NotBlank
    private String serviceAddress;
    private LocalDateTime expectedServiceTime;
}
