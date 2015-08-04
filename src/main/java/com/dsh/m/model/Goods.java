package com.dsh.m.model;

import java.io.Serializable;

public class Goods implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.goodsid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer goodsid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.gname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String gname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.unit
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String unit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.isCalculate
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Boolean iscalculate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.sclassid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private Integer sclassid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.beizhu
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String beizhu;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.image
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	private String image;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.goodsid
	 * @return  the value of goods.goodsid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getGoodsid() {
		return goodsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.goodsid
	 * @param goodsid  the value for goods.goodsid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.gname
	 * @return  the value of goods.gname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getGname() {
		return gname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.gname
	 * @param gname  the value for goods.gname
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.unit
	 * @return  the value of goods.unit
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.unit
	 * @param unit  the value for goods.unit
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.isCalculate
	 * @return  the value of goods.isCalculate
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Boolean getIscalculate() {
		return iscalculate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.isCalculate
	 * @param iscalculate  the value for goods.isCalculate
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setIscalculate(Boolean iscalculate) {
		this.iscalculate = iscalculate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.sclassid
	 * @return  the value of goods.sclassid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public Integer getSclassid() {
		return sclassid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.sclassid
	 * @param sclassid  the value for goods.sclassid
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setSclassid(Integer sclassid) {
		this.sclassid = sclassid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.beizhu
	 * @return  the value of goods.beizhu
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getBeizhu() {
		return beizhu;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.beizhu
	 * @param beizhu  the value for goods.beizhu
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.image
	 * @return  the value of goods.image
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.image
	 * @param image  the value for goods.image
	 * @mbggenerated  Sun Jun 28 10:58:04 CST 2015
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7578038818792809124L;
	private String is_sale;

	public String getIs_sale() {
		return is_sale;
	}

	public void setIs_sale(String is_sale) {
		this.is_sale = is_sale;
	}
	
}