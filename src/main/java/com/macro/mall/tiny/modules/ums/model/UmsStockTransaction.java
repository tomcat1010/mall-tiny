package com.macro.mall.tiny.modules.ums.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 股票交割流水表
 * </p>
 *
 * @author macro
 * @since 2020-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ums_stock_transaction")
@ApiModel(value="UmsStockTransaction对象", description="股票交割流水表")
public class UmsStockTransaction implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "交易流水id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "证券代码")
    private String stockCode;

    @ApiModelProperty(value = "证券名称")
    private String stockName;

    @ApiModelProperty(value = "成交日期")
    private String transactionDate;

    @ApiModelProperty(value = "成交时间")
    private String transactionTime;

    @ApiModelProperty(value = "成交数量")
    private Integer transactionVolume;

    @ApiModelProperty(value = "成交价格")
    private BigDecimal transactionPrice;

    @ApiModelProperty(value = "发生金额")
    private Integer transactionAmount;

    @ApiModelProperty(value = "操作")
    private String operation;

    @ApiModelProperty(value = "合同号")
    private String agreementNo;

    @ApiModelProperty(value = "成交号")
    private String transactionNo;

    @ApiModelProperty(value = " 手续费")
    private BigDecimal serviceFee;

    @ApiModelProperty(value = "印花税")
    private BigDecimal taxFee;

    @ApiModelProperty(value = "过户费")
    private BigDecimal transferFee;

    @ApiModelProperty(value = "其他费")
    private BigDecimal elseFee;

    @ApiModelProperty(value = "资金本次余额")
    private BigDecimal fundBalance;

    @ApiModelProperty(value = "股份本次余额")
    private BigDecimal stockBalance;

    @ApiModelProperty(value = "股东账号")
    private String stockAccount;

    @ApiModelProperty(value = "资金账号")
    private String fundAccount;


}
