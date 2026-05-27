package com.hs.localserviceai.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ServiceOrderEntity {
    private Long id;

    private Long userId;
    private Long runnerId;

    private String serviceType;
    private String title;
    private String description;

    private BigDecimal price;
    private String contactPhone;
    private String serviceAddress;

    private LocalDateTime expectedServiceTime;

    private String status;

    private LocalDateTime createTime;
    private LocalDateTime acceptTime;
    private LocalDateTime finishTime;
    private LocalDateTime updateTime;

}
