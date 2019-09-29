package com.liancheng.lcweb.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MobileManRequestForm {

    // 这玩意儿是保存
    @NotBlank(message = "lineId字段必填")
    private String lineId;

    @NotBlank(message = "token字段必填")
    private String token;

    private String dnum;

    private String orderId;

    private Integer status; // 司机和订单status复用

    private Integer price; // 定价


}