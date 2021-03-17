package com.medical.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEfficacyIsNull() {
            addCriterion("efficacy is null");
            return (Criteria) this;
        }

        public Criteria andEfficacyIsNotNull() {
            addCriterion("efficacy is not null");
            return (Criteria) this;
        }

        public Criteria andEfficacyEqualTo(String value) {
            addCriterion("efficacy =", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyNotEqualTo(String value) {
            addCriterion("efficacy <>", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyGreaterThan(String value) {
            addCriterion("efficacy >", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyGreaterThanOrEqualTo(String value) {
            addCriterion("efficacy >=", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyLessThan(String value) {
            addCriterion("efficacy <", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyLessThanOrEqualTo(String value) {
            addCriterion("efficacy <=", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyLike(String value) {
            addCriterion("efficacy like", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyNotLike(String value) {
            addCriterion("efficacy not like", value, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyIn(List<String> values) {
            addCriterion("efficacy in", values, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyNotIn(List<String> values) {
            addCriterion("efficacy not in", values, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyBetween(String value1, String value2) {
            addCriterion("efficacy between", value1, value2, "efficacy");
            return (Criteria) this;
        }

        public Criteria andEfficacyNotBetween(String value1, String value2) {
            addCriterion("efficacy not between", value1, value2, "efficacy");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andForbiddenIsNull() {
            addCriterion("forbidden is null");
            return (Criteria) this;
        }

        public Criteria andForbiddenIsNotNull() {
            addCriterion("forbidden is not null");
            return (Criteria) this;
        }

        public Criteria andForbiddenEqualTo(String value) {
            addCriterion("forbidden =", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotEqualTo(String value) {
            addCriterion("forbidden <>", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenGreaterThan(String value) {
            addCriterion("forbidden >", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenGreaterThanOrEqualTo(String value) {
            addCriterion("forbidden >=", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenLessThan(String value) {
            addCriterion("forbidden <", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenLessThanOrEqualTo(String value) {
            addCriterion("forbidden <=", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenLike(String value) {
            addCriterion("forbidden like", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotLike(String value) {
            addCriterion("forbidden not like", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenIn(List<String> values) {
            addCriterion("forbidden in", values, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotIn(List<String> values) {
            addCriterion("forbidden not in", values, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenBetween(String value1, String value2) {
            addCriterion("forbidden between", value1, value2, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotBetween(String value1, String value2) {
            addCriterion("forbidden not between", value1, value2, "forbidden");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}