package com.example.learn.learn.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 其他部门审查意见属性
 */
@ApiModel("其他部门审查意见属性")
@Data
public class Qtbmscyj implements Serializable {
    /**
     * 标识码
     */
    @ApiModelProperty("标识码")
    private String bsm;

    /**
     * 要素代码
     */
    @ApiModelProperty("要素代码")
    private String ysdm;

    /**
     * 业务号
     */
    @ApiModelProperty("业务号")
    private String ywh;

    /**
     * 顺序号a
     */
    @ApiModelProperty("顺序号a")
    private Integer sxh;

    /**
     * 部门名称
     */
    @ApiModelProperty("部门名称")
    private String bmmc;

    /**
     * 部门审查意见
     */
    @ApiModelProperty("部门审查意见")
    private String bmscyj;

    /**
     * 部门审查人姓名
     */
    @ApiModelProperty("部门审查人姓名")
    private String bmscrxm;

    /**
     * 部门审查时间
     */
    @ApiModelProperty("部门审查时间")
    private Date bmscsj;

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

    private static final long serialVersionUID = 1L;
}