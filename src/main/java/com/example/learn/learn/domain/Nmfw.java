package com.example.learn.learn.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 农民房屋属性
 */
@ApiModel("农民房屋属性")
@Data
public class Nmfw implements Serializable {
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
     * 宅基地宗地信息标识码(增)
     */
    @ApiModelProperty("宅基地宗地信息标识码(增)")
    private String zjdzdxxbsm;

    /**
     * 宅基地代码
     */
    @ApiModelProperty("宅基地代码")
    private String zjddm;

    /**
     * 农民房屋代码a
     */
    @ApiModelProperty("农民房屋代码a")
    private String nmfwdm;

    /**
     * 不动产单元号
     */
    @ApiModelProperty("不动产单元号")
    private String bdcdyh;

    /**
     * 农民房屋面积
     */
    @ApiModelProperty("农民房屋面积")
    private String nmfwmj;

    /**
     * 行政区代码(增)
     */
    @ApiModelProperty("行政区代码(增)")
    private String xzqdm;

    /**
     * 房屋编码b
     */
    @ApiModelProperty("房屋编码b")
    private String fwbm;

    /**
     * 自然幢号
     */
    @ApiModelProperty("自然幢号")
    private String zrzh;

    /**
     * 农民房屋幢号
     */
    @ApiModelProperty("农民房屋幢号")
    private String nmfwzh;

    /**
     * 层号
     */
    @ApiModelProperty("层号")
    private String ch;

    /**
     * 实际层d
     */
    @ApiModelProperty("实际层d")
    private BigDecimal sjc;

    /**
     * 名义层e
     */
    @ApiModelProperty("名义层e")
    private String myc;

    /**
     * 坐落
     */
    @ApiModelProperty("坐落")
    private String zl;

    /**
     * 实际层数f
     */
    @ApiModelProperty("实际层数f")
    private BigDecimal sjcs;

    /**
     * 户号g
     */
    @ApiModelProperty("户号g")
    private String hh;

    /**
     * 户型
     */
    @ApiModelProperty("户型")
    private String hx;

    /**
     * 户型结构
     */
    @ApiModelProperty("户型结构")
    private String hxjg;

    /**
     * 房屋结构
     */
    @ApiModelProperty("房屋结构")
    private String fwjg;

    /**
     * 房屋用途
     */
    @ApiModelProperty("房屋用途")
    private String fwyt;

    /**
     * 房基占地面积
     */
    @ApiModelProperty("房基占地面积")
    private BigDecimal fjzdmj;

    /**
     * 建筑面积
     */
    @ApiModelProperty("建筑面积")
    private BigDecimal jzmj;

    /**
     * 证书号
     */
    @ApiModelProperty("证书号")
    private String zsh;

    /**
     * 登记机构
     */
    @ApiModelProperty("登记机构")
    private String djjg;

    /**
     * 登记时间
     */
    @ApiModelProperty("登记时间")
    private Date djsj;

    /**
     * 是否纠纷
     */
    @ApiModelProperty("是否纠纷")
    private String sfjf;

    /**
     * 是否查封
     */
    @ApiModelProperty("是否查封")
    private String sfcf;

    /**
     * 査封起始时间
     */
    @ApiModelProperty("査封起始时间")
    private Date cfkssj;

    /**
     * 査封结束时间
     */
    @ApiModelProperty("査封结束时间")
    private Date cfjssj;

    /**
     * 房屋类型
     */
    @ApiModelProperty("房屋类型")
    private String fwlx;

    /**
     * 房屋性质
     */
    @ApiModelProperty("房屋性质")
    private String fwxz;

    /**
     * 无产权占地面积(增)
     */
    @ApiModelProperty("无产权占地面积(增)")
    private BigDecimal wcqzdmj;

    /**
     * 房屋注记(增)
     */
    @ApiModelProperty("房屋注记(增)")
    private String fwzj;

    /**
     * 建造年代(增)
     */
    @ApiModelProperty("建造年代(增)")
    private String jznd;

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