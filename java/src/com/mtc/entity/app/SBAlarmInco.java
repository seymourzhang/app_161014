package com.mtc.entity.app;

import java.math.BigDecimal;
import java.util.Date;

public class SBAlarmInco {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.alarm_code
     *
     * @mbggenerated
     */
    private String alarmCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.alarm_name
     *
     * @mbggenerated
     */
    private String alarmName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.farm_id
     *
     * @mbggenerated
     */
    private Integer farmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.house_id
     *
     * @mbggenerated
     */
    private Integer houseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.farm_breed_id
     *
     * @mbggenerated
     */
    private Integer farmBreedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.house_breed_id
     *
     * @mbggenerated
     */
    private Integer houseBreedId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.monitor_id
     *
     * @mbggenerated
     */
    private Integer monitorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.actual_value
     *
     * @mbggenerated
     */
    private BigDecimal actualValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.set_value
     *
     * @mbggenerated
     */
    private BigDecimal setValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.value_unit
     *
     * @mbggenerated
     */
    private String valueUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.alarm_time
     *
     * @mbggenerated
     */
    private Date alarmTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.deal_status
     *
     * @mbggenerated
     */
    private String dealStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.deal_delay
     *
     * @mbggenerated
     */
    private Integer dealDelay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.deal_time
     *
     * @mbggenerated
     */
    private Date dealTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.response_person
     *
     * @mbggenerated
     */
    private Integer responsePerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.is_remove
     *
     * @mbggenerated
     */
    private String isRemove;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_alarm_inco.remove_time
     *
     * @mbggenerated
     */
    private Date removeTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.id
     *
     * @return the value of s_b_alarm_inco.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.id
     *
     * @param id the value for s_b_alarm_inco.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.alarm_code
     *
     * @return the value of s_b_alarm_inco.alarm_code
     *
     * @mbggenerated
     */
    public String getAlarmCode() {
        return alarmCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.alarm_code
     *
     * @param alarmCode the value for s_b_alarm_inco.alarm_code
     *
     * @mbggenerated
     */
    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode == null ? null : alarmCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.alarm_name
     *
     * @return the value of s_b_alarm_inco.alarm_name
     *
     * @mbggenerated
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.alarm_name
     *
     * @param alarmName the value for s_b_alarm_inco.alarm_name
     *
     * @mbggenerated
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName == null ? null : alarmName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.farm_id
     *
     * @return the value of s_b_alarm_inco.farm_id
     *
     * @mbggenerated
     */
    public Integer getFarmId() {
        return farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.farm_id
     *
     * @param farmId the value for s_b_alarm_inco.farm_id
     *
     * @mbggenerated
     */
    public void setFarmId(Integer farmId) {
        this.farmId = farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.house_id
     *
     * @return the value of s_b_alarm_inco.house_id
     *
     * @mbggenerated
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.house_id
     *
     * @param houseId the value for s_b_alarm_inco.house_id
     *
     * @mbggenerated
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.farm_breed_id
     *
     * @return the value of s_b_alarm_inco.farm_breed_id
     *
     * @mbggenerated
     */
    public Integer getFarmBreedId() {
        return farmBreedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.farm_breed_id
     *
     * @param farmBreedId the value for s_b_alarm_inco.farm_breed_id
     *
     * @mbggenerated
     */
    public void setFarmBreedId(Integer farmBreedId) {
        this.farmBreedId = farmBreedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.house_breed_id
     *
     * @return the value of s_b_alarm_inco.house_breed_id
     *
     * @mbggenerated
     */
    public Integer getHouseBreedId() {
        return houseBreedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.house_breed_id
     *
     * @param houseBreedId the value for s_b_alarm_inco.house_breed_id
     *
     * @mbggenerated
     */
    public void setHouseBreedId(Integer houseBreedId) {
        this.houseBreedId = houseBreedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.monitor_id
     *
     * @return the value of s_b_alarm_inco.monitor_id
     *
     * @mbggenerated
     */
    public Integer getMonitorId() {
        return monitorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.monitor_id
     *
     * @param monitorId the value for s_b_alarm_inco.monitor_id
     *
     * @mbggenerated
     */
    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.actual_value
     *
     * @return the value of s_b_alarm_inco.actual_value
     *
     * @mbggenerated
     */
    public BigDecimal getActualValue() {
        return actualValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.actual_value
     *
     * @param actualValue the value for s_b_alarm_inco.actual_value
     *
     * @mbggenerated
     */
    public void setActualValue(BigDecimal actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.set_value
     *
     * @return the value of s_b_alarm_inco.set_value
     *
     * @mbggenerated
     */
    public BigDecimal getSetValue() {
        return setValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.set_value
     *
     * @param setValue the value for s_b_alarm_inco.set_value
     *
     * @mbggenerated
     */
    public void setSetValue(BigDecimal setValue) {
        this.setValue = setValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.value_unit
     *
     * @return the value of s_b_alarm_inco.value_unit
     *
     * @mbggenerated
     */
    public String getValueUnit() {
        return valueUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.value_unit
     *
     * @param valueUnit the value for s_b_alarm_inco.value_unit
     *
     * @mbggenerated
     */
    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit == null ? null : valueUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.alarm_time
     *
     * @return the value of s_b_alarm_inco.alarm_time
     *
     * @mbggenerated
     */
    public Date getAlarmTime() {
        return alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.alarm_time
     *
     * @param alarmTime the value for s_b_alarm_inco.alarm_time
     *
     * @mbggenerated
     */
    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.deal_status
     *
     * @return the value of s_b_alarm_inco.deal_status
     *
     * @mbggenerated
     */
    public String getDealStatus() {
        return dealStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.deal_status
     *
     * @param dealStatus the value for s_b_alarm_inco.deal_status
     *
     * @mbggenerated
     */
    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus == null ? null : dealStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.deal_delay
     *
     * @return the value of s_b_alarm_inco.deal_delay
     *
     * @mbggenerated
     */
    public Integer getDealDelay() {
        return dealDelay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.deal_delay
     *
     * @param dealDelay the value for s_b_alarm_inco.deal_delay
     *
     * @mbggenerated
     */
    public void setDealDelay(Integer dealDelay) {
        this.dealDelay = dealDelay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.deal_time
     *
     * @return the value of s_b_alarm_inco.deal_time
     *
     * @mbggenerated
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.deal_time
     *
     * @param dealTime the value for s_b_alarm_inco.deal_time
     *
     * @mbggenerated
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.response_person
     *
     * @return the value of s_b_alarm_inco.response_person
     *
     * @mbggenerated
     */
    public Integer getResponsePerson() {
        return responsePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.response_person
     *
     * @param responsePerson the value for s_b_alarm_inco.response_person
     *
     * @mbggenerated
     */
    public void setResponsePerson(Integer responsePerson) {
        this.responsePerson = responsePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.is_remove
     *
     * @return the value of s_b_alarm_inco.is_remove
     *
     * @mbggenerated
     */
    public String getIsRemove() {
        return isRemove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.is_remove
     *
     * @param isRemove the value for s_b_alarm_inco.is_remove
     *
     * @mbggenerated
     */
    public void setIsRemove(String isRemove) {
        this.isRemove = isRemove == null ? null : isRemove.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_alarm_inco.remove_time
     *
     * @return the value of s_b_alarm_inco.remove_time
     *
     * @mbggenerated
     */
    public Date getRemoveTime() {
        return removeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_alarm_inco.remove_time
     *
     * @param removeTime the value for s_b_alarm_inco.remove_time
     *
     * @mbggenerated
     */
    public void setRemoveTime(Date removeTime) {
        this.removeTime = removeTime;
    }
}