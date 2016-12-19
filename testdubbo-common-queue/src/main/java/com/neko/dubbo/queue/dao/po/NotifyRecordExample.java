package com.neko.dubbo.queue.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotifyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotifyRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("notify_record.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("notify_record.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("notify_record.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("notify_record.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("notify_record.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_record.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("notify_record.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("notify_record.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("notify_record.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("notify_record.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("notify_record.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("notify_record.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("notify_record.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("notify_record.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("notify_record.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_record.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("notify_record.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_record.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("notify_record.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("notify_record.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("notify_record.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_record.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNull() {
            addCriterion("notify_record.last_notify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIsNotNull() {
            addCriterion("notify_record.last_notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeEqualTo(Date value) {
            addCriterion("notify_record.last_notify_time =", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotEqualTo(Date value) {
            addCriterion("notify_record.last_notify_time <>", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThan(Date value) {
            addCriterion("notify_record.last_notify_time >", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_record.last_notify_time >=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThan(Date value) {
            addCriterion("notify_record.last_notify_time <", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_record.last_notify_time <=", value, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeIn(List<Date> values) {
            addCriterion("notify_record.last_notify_time in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotIn(List<Date> values) {
            addCriterion("notify_record.last_notify_time not in", values, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("notify_record.last_notify_time between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andLastNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_record.last_notify_time not between", value1, value2, "lastNotifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNull() {
            addCriterion("notify_record.notify_times is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNotNull() {
            addCriterion("notify_record.notify_times is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesEqualTo(Integer value) {
            addCriterion("notify_record.notify_times =", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotEqualTo(Integer value) {
            addCriterion("notify_record.notify_times <>", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThan(Integer value) {
            addCriterion("notify_record.notify_times >", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_record.notify_times >=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThan(Integer value) {
            addCriterion("notify_record.notify_times <", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThanOrEqualTo(Integer value) {
            addCriterion("notify_record.notify_times <=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIn(List<Integer> values) {
            addCriterion("notify_record.notify_times in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotIn(List<Integer> values) {
            addCriterion("notify_record.notify_times not in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.notify_times between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.notify_times not between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNull() {
            addCriterion("notify_record.notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIsNotNull() {
            addCriterion("notify_record.notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeEqualTo(Integer value) {
            addCriterion("notify_record.notify_type =", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotEqualTo(Integer value) {
            addCriterion("notify_record.notify_type <>", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThan(Integer value) {
            addCriterion("notify_record.notify_type >", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_record.notify_type >=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThan(Integer value) {
            addCriterion("notify_record.notify_type <", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("notify_record.notify_type <=", value, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeIn(List<Integer> values) {
            addCriterion("notify_record.notify_type in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotIn(List<Integer> values) {
            addCriterion("notify_record.notify_type not in", values, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.notify_type between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andNotifyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.notify_type not between", value1, value2, "notifyType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("notify_record.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("notify_record.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("notify_record.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("notify_record.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("notify_record.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_record.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("notify_record.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("notify_record.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("notify_record.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("notify_record.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFkIsNull() {
            addCriterion("notify_record.fk is null");
            return (Criteria) this;
        }

        public Criteria andFkIsNotNull() {
            addCriterion("notify_record.fk is not null");
            return (Criteria) this;
        }

        public Criteria andFkEqualTo(Integer value) {
            addCriterion("notify_record.fk =", value, "fk");
            return (Criteria) this;
        }

        public Criteria andFkNotEqualTo(Integer value) {
            addCriterion("notify_record.fk <>", value, "fk");
            return (Criteria) this;
        }

        public Criteria andFkGreaterThan(Integer value) {
            addCriterion("notify_record.fk >", value, "fk");
            return (Criteria) this;
        }

        public Criteria andFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_record.fk >=", value, "fk");
            return (Criteria) this;
        }

        public Criteria andFkLessThan(Integer value) {
            addCriterion("notify_record.fk <", value, "fk");
            return (Criteria) this;
        }

        public Criteria andFkLessThanOrEqualTo(Integer value) {
            addCriterion("notify_record.fk <=", value, "fk");
            return (Criteria) this;
        }

        public Criteria andFkIn(List<Integer> values) {
            addCriterion("notify_record.fk in", values, "fk");
            return (Criteria) this;
        }

        public Criteria andFkNotIn(List<Integer> values) {
            addCriterion("notify_record.fk not in", values, "fk");
            return (Criteria) this;
        }

        public Criteria andFkBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.fk between", value1, value2, "fk");
            return (Criteria) this;
        }

        public Criteria andFkNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_record.fk not between", value1, value2, "fk");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("notify_record.message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("notify_record.message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("notify_record.message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("notify_record.message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("notify_record.message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("notify_record.message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("notify_record.message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("notify_record.message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("notify_record.message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("notify_record.message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("notify_record.message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("notify_record.message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("notify_record.message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("notify_record.message_id not between", value1, value2, "messageId");
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