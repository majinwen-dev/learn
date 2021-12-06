package com.example.learn.learn.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author 
 * 使用权人属性结构
 */
@ApiModel("使用权人属性结构")
@Data
public class Shyqr implements Serializable {
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
     * 宅基地代码
     */
    @ApiModelProperty("宅基地代码")
    private String zjddm;

    /**
     * 宅基地宗地信息标识码(增)
     */
    @ApiModelProperty("宅基地宗地信息标识码(增)")
    private String zjdzdxxbsm;

    /**
     * 农民房屋代码
     */
    @ApiModelProperty("农民房屋代码")
    private String nmfwdm;

    /**
     * 农民房屋标识码(增)
     */
    @ApiModelProperty("农民房屋标识码(增)")
    private String nmfwbsm;

    /**
     * 使用权人代码a
     */
    @ApiModelProperty("使用权人代码a")
    private String shyqrdm;

    /**
     * 使用权人代表姓 名
     */
    @ApiModelProperty("使用权人代表姓 名")
    private String shyqrdbxm;

    /**
     * 使用权人代表证
件类型

     */
    @ApiModelProperty("使用权人代表证件类型")
    private String shyqrdbzjlx;

    /**
     * 使用权人代表证
件号码

     */
    @ApiModelProperty("使用权人代表证件号码")
    private String shyqrdbzjhm;

    /**
     * 不动产单元号b
     */
    @ApiModelProperty("不动产单元号b")
    private String bdcdyh;

    /**
     * 不动产权证号
     */
    @ApiModelProperty("不动产权证号")
    private String bdcqzh;

    /**
     * 权证印刷序列号
     */
    @ApiModelProperty("权证印刷序列号")
    private String qzysxlh;

    /**
     * 发证机关
     */
    @ApiModelProperty("发证机关")
    private String fzjg;

    /**
     * 所属行业a
     */
    @ApiModelProperty("所属行业a")
    private String sshy;

    /**
     * 国家/地区
     */
    @ApiModelProperty("国家/地区")
    private String gj;

    /**
     * 户籍所在省市
     */
    @ApiModelProperty("户籍所在省市")
    private String hjszss;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private String xb;

    /**
     * 电话
     */
    @ApiModelProperty("电话")
    private String dh;

    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String dz;

    /**
     * 是否使用权人之
间共有

     */
    @ApiModelProperty("是否使用权人之间共有")
    private String sfsyqrzjgy;

    /**
     * 分摊宗地面积
     */
    @ApiModelProperty("分摊宗地面积")
    private BigDecimal ftzdmj;

    /**
     * 权利人类型
     */
    @ApiModelProperty("权利人类型")
    private String qlrlx;

    /**
     * 是否本农村集体 经济组织成员
     */
    @ApiModelProperty("是否本农村集体 经济组织成员")
    private String sfbncjtjjzzcy;

    /**
     * 所有权人代码
     */
    @ApiModelProperty("所有权人代码")
    private String suyqrdm;

    /**
     * 所有权人标识码(增)
     */
    @ApiModelProperty("所有权人标识码(增)")
    private String suyqrbsm;

    /**
     * 农户代码
     */
    @ApiModelProperty("农户代码")
    private String nhdm;

    /**
     * 农户标识码(增)
     */
    @ApiModelProperty("农户标识码(增)")
    private String nhbsm;

    /**
     * 户口类型
     */
    @ApiModelProperty("户口类型")
    private String hklx;

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