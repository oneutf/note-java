package com.oneutf.algorithm.demo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author oneutf
 * @desc 服务费类实体类
 */
@Data
public class ServiceEntity {

    /**
     * 唯一id
     */
    private Integer id;

    /**
     * 贷款单id
     */
    private Long markerId;

    /**
     * 手续费类型
     */
    private Integer category;

    /**
     * 应收手续费
     */
    private Double receivableService;

    /**
     * 受益人
     */
    private String beneficiary;

    /**
     * 日期
     */
    private LocalDateTime date;

    /**
     * 手续费状态
     */
    private Integer state;

    /**
     * 已收手续费
     */
    private Double receivedService;
}
