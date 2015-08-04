package com.dsh.m.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public GoodsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andGoodsidIsNull() {
			addCriterion("goodsid is null");
			return (Criteria) this;
		}

		public Criteria andGoodsidIsNotNull() {
			addCriterion("goodsid is not null");
			return (Criteria) this;
		}

		public Criteria andGoodsidEqualTo(Integer value) {
			addCriterion("goodsid =", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidNotEqualTo(Integer value) {
			addCriterion("goodsid <>", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidGreaterThan(Integer value) {
			addCriterion("goodsid >", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
			addCriterion("goodsid >=", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidLessThan(Integer value) {
			addCriterion("goodsid <", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
			addCriterion("goodsid <=", value, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidIn(List<Integer> values) {
			addCriterion("goodsid in", values, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidNotIn(List<Integer> values) {
			addCriterion("goodsid not in", values, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidBetween(Integer value1, Integer value2) {
			addCriterion("goodsid between", value1, value2, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
			addCriterion("goodsid not between", value1, value2, "goodsid");
			return (Criteria) this;
		}

		public Criteria andGnameIsNull() {
			addCriterion("gname is null");
			return (Criteria) this;
		}

		public Criteria andGnameIsNotNull() {
			addCriterion("gname is not null");
			return (Criteria) this;
		}

		public Criteria andGnameEqualTo(String value) {
			addCriterion("gname =", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameNotEqualTo(String value) {
			addCriterion("gname <>", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameGreaterThan(String value) {
			addCriterion("gname >", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameGreaterThanOrEqualTo(String value) {
			addCriterion("gname >=", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameLessThan(String value) {
			addCriterion("gname <", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameLessThanOrEqualTo(String value) {
			addCriterion("gname <=", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameLike(String value) {
			addCriterion("gname like", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameNotLike(String value) {
			addCriterion("gname not like", value, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameIn(List<String> values) {
			addCriterion("gname in", values, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameNotIn(List<String> values) {
			addCriterion("gname not in", values, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameBetween(String value1, String value2) {
			addCriterion("gname between", value1, value2, "gname");
			return (Criteria) this;
		}

		public Criteria andGnameNotBetween(String value1, String value2) {
			addCriterion("gname not between", value1, value2, "gname");
			return (Criteria) this;
		}

		public Criteria andUnitIsNull() {
			addCriterion("unit is null");
			return (Criteria) this;
		}

		public Criteria andUnitIsNotNull() {
			addCriterion("unit is not null");
			return (Criteria) this;
		}

		public Criteria andUnitEqualTo(String value) {
			addCriterion("unit =", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotEqualTo(String value) {
			addCriterion("unit <>", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThan(String value) {
			addCriterion("unit >", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThanOrEqualTo(String value) {
			addCriterion("unit >=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThan(String value) {
			addCriterion("unit <", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThanOrEqualTo(String value) {
			addCriterion("unit <=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLike(String value) {
			addCriterion("unit like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotLike(String value) {
			addCriterion("unit not like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIn(List<String> values) {
			addCriterion("unit in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotIn(List<String> values) {
			addCriterion("unit not in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitBetween(String value1, String value2) {
			addCriterion("unit between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotBetween(String value1, String value2) {
			addCriterion("unit not between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andIscalculateIsNull() {
			addCriterion("isCalculate is null");
			return (Criteria) this;
		}

		public Criteria andIscalculateIsNotNull() {
			addCriterion("isCalculate is not null");
			return (Criteria) this;
		}

		public Criteria andIscalculateEqualTo(Boolean value) {
			addCriterion("isCalculate =", value, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateNotEqualTo(Boolean value) {
			addCriterion("isCalculate <>", value, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateGreaterThan(Boolean value) {
			addCriterion("isCalculate >", value, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateGreaterThanOrEqualTo(Boolean value) {
			addCriterion("isCalculate >=", value, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateLessThan(Boolean value) {
			addCriterion("isCalculate <", value, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateLessThanOrEqualTo(Boolean value) {
			addCriterion("isCalculate <=", value, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateIn(List<Boolean> values) {
			addCriterion("isCalculate in", values, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateNotIn(List<Boolean> values) {
			addCriterion("isCalculate not in", values, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateBetween(Boolean value1, Boolean value2) {
			addCriterion("isCalculate between", value1, value2, "iscalculate");
			return (Criteria) this;
		}

		public Criteria andIscalculateNotBetween(Boolean value1, Boolean value2) {
			addCriterion("isCalculate not between", value1, value2,
					"iscalculate");
			return (Criteria) this;
		}

		public Criteria andSclassidIsNull() {
			addCriterion("sclassid is null");
			return (Criteria) this;
		}

		public Criteria andSclassidIsNotNull() {
			addCriterion("sclassid is not null");
			return (Criteria) this;
		}

		public Criteria andSclassidEqualTo(Integer value) {
			addCriterion("sclassid =", value, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidNotEqualTo(Integer value) {
			addCriterion("sclassid <>", value, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidGreaterThan(Integer value) {
			addCriterion("sclassid >", value, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidGreaterThanOrEqualTo(Integer value) {
			addCriterion("sclassid >=", value, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidLessThan(Integer value) {
			addCriterion("sclassid <", value, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidLessThanOrEqualTo(Integer value) {
			addCriterion("sclassid <=", value, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidIn(List<Integer> values) {
			addCriterion("sclassid in", values, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidNotIn(List<Integer> values) {
			addCriterion("sclassid not in", values, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidBetween(Integer value1, Integer value2) {
			addCriterion("sclassid between", value1, value2, "sclassid");
			return (Criteria) this;
		}

		public Criteria andSclassidNotBetween(Integer value1, Integer value2) {
			addCriterion("sclassid not between", value1, value2, "sclassid");
			return (Criteria) this;
		}

		public Criteria andBeizhuIsNull() {
			addCriterion("beizhu is null");
			return (Criteria) this;
		}

		public Criteria andBeizhuIsNotNull() {
			addCriterion("beizhu is not null");
			return (Criteria) this;
		}

		public Criteria andBeizhuEqualTo(String value) {
			addCriterion("beizhu =", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuNotEqualTo(String value) {
			addCriterion("beizhu <>", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuGreaterThan(String value) {
			addCriterion("beizhu >", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
			addCriterion("beizhu >=", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuLessThan(String value) {
			addCriterion("beizhu <", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuLessThanOrEqualTo(String value) {
			addCriterion("beizhu <=", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuLike(String value) {
			addCriterion("beizhu like", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuNotLike(String value) {
			addCriterion("beizhu not like", value, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuIn(List<String> values) {
			addCriterion("beizhu in", values, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuNotIn(List<String> values) {
			addCriterion("beizhu not in", values, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuBetween(String value1, String value2) {
			addCriterion("beizhu between", value1, value2, "beizhu");
			return (Criteria) this;
		}

		public Criteria andBeizhuNotBetween(String value1, String value2) {
			addCriterion("beizhu not between", value1, value2, "beizhu");
			return (Criteria) this;
		}

		public Criteria andImageIsNull() {
			addCriterion("image is null");
			return (Criteria) this;
		}

		public Criteria andImageIsNotNull() {
			addCriterion("image is not null");
			return (Criteria) this;
		}

		public Criteria andImageEqualTo(String value) {
			addCriterion("image =", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotEqualTo(String value) {
			addCriterion("image <>", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThan(String value) {
			addCriterion("image >", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThanOrEqualTo(String value) {
			addCriterion("image >=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThan(String value) {
			addCriterion("image <", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThanOrEqualTo(String value) {
			addCriterion("image <=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLike(String value) {
			addCriterion("image like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotLike(String value) {
			addCriterion("image not like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageIn(List<String> values) {
			addCriterion("image in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotIn(List<String> values) {
			addCriterion("image not in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageBetween(String value1, String value2) {
			addCriterion("image between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotBetween(String value1, String value2) {
			addCriterion("image not between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andIsSaleIsNull() {
			addCriterion("is_sale is null");
			return (Criteria) this;
		}

		public Criteria andIsSaleIsNotNull() {
			addCriterion("is_sale is not null");
			return (Criteria) this;
		}

		public Criteria andIsSaleEqualTo(String value) {
			addCriterion("is_sale =", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleNotEqualTo(String value) {
			addCriterion("is_sale <>", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleGreaterThan(String value) {
			addCriterion("is_sale >", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleGreaterThanOrEqualTo(String value) {
			addCriterion("is_sale >=", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleLessThan(String value) {
			addCriterion("is_sale <", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleLessThanOrEqualTo(String value) {
			addCriterion("is_sale <=", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleLike(String value) {
			addCriterion("is_sale like", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleNotLike(String value) {
			addCriterion("is_sale not like", value, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleIn(List<String> values) {
			addCriterion("is_sale in", values, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleNotIn(List<String> values) {
			addCriterion("is_sale not in", values, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleBetween(String value1, String value2) {
			addCriterion("is_sale between", value1, value2, "isSale");
			return (Criteria) this;
		}

		public Criteria andIsSaleNotBetween(String value1, String value2) {
			addCriterion("is_sale not between", value1, value2, "isSale");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table goods
	 * @mbggenerated  Tue Aug 04 16:56:35 CST 2015
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 17 13:34:44 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}