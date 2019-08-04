package com.zby.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TestRecord {
    private Integer id;

    private String ftsTrxNo;

    private String requestRefNo;

    private String repayOrderNo;

    private String channelTrxNo;

    private String crfUid;

    private Long channelFeeAmount;

    private Long couponAmount;

    private Long dueRepayTotalAmount;

    private Long repayTotalAmount;

    private Date applyDate;

    private Date repayDate;

    private Date frozenDate;

    private Boolean isFundReady;

    private String failCode;

    private String failReason;

    private Byte reserve11;

    private Byte reserve12;

    private Byte reserve13;

    private String reserve21;

    private String reserve22;

    private String reserve23;

    private Long reserve31;

    private Long reserve32;

    private Long reserve33;

    private Date createdDate;

    private Date updatedDate;


}