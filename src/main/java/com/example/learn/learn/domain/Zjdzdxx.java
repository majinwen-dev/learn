package com.example.learn.learn.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 宅基地宗地信息属性结构
 */
@ApiModel("宅基地宗地信息属性结构")
@Data
public class Zjdzdxx implements Serializable {
    /**
     * 字段名未知
     */
    @ApiModelProperty("字段名未知")
    private String bsm;

    /**
     * 要素代码
     */
    @ApiModelProperty("要素代码")
    private String ysdm;

    /**
     * 宅基地代码
     */
    @ApiModelProperty("宅基地代码")
    private String zjddm;

    /**
     * 宅基地批准面积
     */
    @ApiModelProperty("宅基地批准面积")
    private BigDecimal zjdpzmj;

    /**
     * 是否超占
     */
    @ApiModelProperty("是否超占")
    private String sfcz;

    /**
     * 超占面积
     */
    @ApiModelProperty("超占面积")
    private BigDecimal czmj;

    /**
     * 宅基地取得方式
     */
    @ApiModelProperty("宅基地取得方式")
    private String zjdqdfs;

    /**
     * 宅基地取得时间
     */
    @ApiModelProperty("宅基地取得时间")
    private Date zjdqdsj;

    /**
     * 是否发证
     */
    @ApiModelProperty("是否发证")
    private String sffz;

    /**
     * 证书号
     */
    @ApiModelProperty("证书号")
    private String zsh;

    /**
     * 证书面积
     */
    @ApiModelProperty("证书面积")
    private BigDecimal zsmj;

    /**
     * 发证单位
     */
    @ApiModelProperty("发证单位")
    private String fzdw;

    /**
     * 未办证原因
     */
    @ApiModelProperty("未办证原因")
    private String wbzyy;

    /**
     * 数据来源
     */
    @ApiModelProperty("数据来源")
    private String sjly;

    /**
     * 宅基地面积(增)
     */
    @ApiModelProperty("宅基地面积(增)")
    private BigDecimal zjdmj;

    /**
     * 字段名未知(增)
     */
    @ApiModelProperty("字段名未知(增)")
    private String zzsyqr;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String bz;

    /**
     * 创建者
     */
    @ApiModelProperty("创建者")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新者
     */
    @ApiModelProperty("更新者")
    private String editBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date editTime;

    /**
     * 行政区代码(增)
     */
    @ApiModelProperty("行政区代码(增)")
    private String xzqdm;

    private static final long serialVersionUID = 1L;
}