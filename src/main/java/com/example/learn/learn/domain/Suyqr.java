package com.example.learn.learn.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 所有权人属性结构
 */
@ApiModel("所有权人属性结构")
@Data
public class Suyqr implements Serializable {
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
     * 所有权人代码a
     */
    @ApiModelProperty("所有权人代码a")
    private String suyqrdm;

    /**
     * 区域代码b
     */
    @ApiModelProperty("区域代码b")
    private String qydm;

    /**
     * 所有权人名称
     */
    @ApiModelProperty("所有权人名称")
    private String suyqrmc;

    /**
     * 所有权性质
     */
    @ApiModelProperty("所有权性质")
    private String suyqxz;

    /**
     * 代表人姓名
     */
    @ApiModelProperty("代表人姓名")
    private String dbrxm;

    /**
     * 代表人证件类型
     */
    @ApiModelProperty("代表人证件类型")
    private String dbrzjlx;

    /**
     * 代表人证件号码
     */
    @ApiModelProperty("代表人证件号码")
    private String dbrzjhm;

    /**
     * 代表人联系电话
     */
    @ApiModelProperty("代表人联系电话")
    private String dbrlxdh;

    /**
     * 代表人通讯地址
     */
    @ApiModelProperty("代表人通讯地址")
    private String dbrtxdz;

    /**
     * 代表人邮政编码
     */
    @ApiModelProperty("代表人邮政编码")
    private String dbryzbm;

    /**
     * 代理人姓名
     */
    @ApiModelProperty("代理人姓名")
    private String dlrxm;

    /**
     * 代理人证件类型
     */
    @ApiModelProperty("代理人证件类型")
    private String dlrzjlx;

    /**
     * 代理人证件号码
     */
    @ApiModelProperty("代理人证件号码")
    private String dlrzjhm;

    /**
     * 代理人联系电话
     */
    @ApiModelProperty("代理人联系电话")
    private String dlrlxdh;

    /**
     * 代理人通讯地址
     */
    @ApiModelProperty("代理人通讯地址")
    private String dlrtxdz;

    /**
     * 代理人邮政编码
     */
    @ApiModelProperty("代理人邮政编码")
    private String dlryzbm;

    /**
     * 是否成立农村集体 经济组织
     */
    @ApiModelProperty("是否成立农村集体 经济组织")
    private String sfclncjtjjzz;

    /**
     * 发包方代码
     */
    @ApiModelProperty("发包方代码")
    private String fbfdm;

    /**
     * 发包方名称
     */
    @ApiModelProperty("发包方名称")
    private String fbfmc;

    /**
     * 数据来源
     */
    @ApiModelProperty("数据来源")
    private String sjly;

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