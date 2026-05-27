package com.hs.localserviceai.vo;

import com.hs.localserviceai.entity.ServiceOrderEntity;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class ServiceOrderResponse {
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

    public static ServiceOrderResponse from(ServiceOrderEntity order){
        return ServiceOrderResponse.builder()
                .id(order.getId())
                .userId(order.getUserId())
                .runnerId(order.getRunnerId())
                .serviceType(order.getServiceType())
                .title(order.getTitle())
                .description(order.getDescription())
                .price(order.getPrice())
                .contactPhone(order.getContactPhone())
                .serviceAddress(order.getServiceAddress())
                .expectedServiceTime(order.getExpectedServiceTime())
                .status(order.getStatus())
                .createTime(order.getCreateTime())
                .acceptTime(order.getAcceptTime())
                .finishTime(order.getFinishTime())
                .updateTime(order.getUpdateTime())
                .build();
    }
}
