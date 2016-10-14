package com.mtc.entity.app;

import java.math.BigDecimal;
import java.util.Date;

public class SBLayerHouseAlarm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.farm_id
     *
     * @mbggenerated
     */
    private Integer farmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.house_id
     *
     * @mbggenerated
     */
    private Integer houseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.alarm_delay
     *
     * @mbggenerated
     */
    private Integer alarmDelay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.temp_cpsation
     *
     * @mbggenerated
     */
    private String tempCpsation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.temp_cordon
     *
     * @mbggenerated
     */
    private BigDecimal tempCordon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.alarm_way
     *
     * @mbggenerated
     */
    private String alarmWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.target_temp
     *
     * @mbggenerated
     */
    private BigDecimal targetTemp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.min_temp
     *
     * @mbggenerated
     */
    private BigDecimal minTemp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.max_temp
     *
     * @mbggenerated
     */
    private BigDecimal maxTemp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.alarm_probe
     *
     * @mbggenerated
     */
    private String alarmProbe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.point_alarm
     *
     * @mbggenerated
     */
    private BigDecimal pointAlarm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.create_person
     *
     * @mbggenerated
     */
    private Integer createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.modify_person
     *
     * @mbggenerated
     */
    private Integer modifyPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.modify_date
     *
     * @mbggenerated
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_b_layer_house_alarm.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.farm_id
     *
     * @return the value of s_b_layer_house_alarm.farm_id
     *
     * @mbggenerated
     */
    public Integer getFarmId() {
        return farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.farm_id
     *
     * @param farmId the value for s_b_layer_house_alarm.farm_id
     *
     * @mbggenerated
     */
    public void setFarmId(Integer farmId) {
        this.farmId = farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.house_id
     *
     * @return the value of s_b_layer_house_alarm.house_id
     *
     * @mbggenerated
     */
    public Integer getHouseId() {
        return houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.house_id
     *
     * @param houseId the value for s_b_layer_house_alarm.house_id
     *
     * @mbggenerated
     */
    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.alarm_delay
     *
     * @return the value of s_b_layer_house_alarm.alarm_delay
     *
     * @mbggenerated
     */
    public Integer getAlarmDelay() {
        return alarmDelay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.alarm_delay
     *
     * @param alarmDelay the value for s_b_layer_house_alarm.alarm_delay
     *
     * @mbggenerated
     */
    public void setAlarmDelay(Integer alarmDelay) {
        this.alarmDelay = alarmDelay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.temp_cpsation
     *
     * @return the value of s_b_layer_house_alarm.temp_cpsation
     *
     * @mbggenerated
     */
    public String getTempCpsation() {
        return tempCpsation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.temp_cpsation
     *
     * @param tempCpsation the value for s_b_layer_house_alarm.temp_cpsation
     *
     * @mbggenerated
     */
    public void setTempCpsation(String tempCpsation) {
        this.tempCpsation = tempCpsation == null ? null : tempCpsation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.temp_cordon
     *
     * @return the value of s_b_layer_house_alarm.temp_cordon
     *
     * @mbggenerated
     */
    public BigDecimal getTempCordon() {
        return tempCordon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.temp_cordon
     *
     * @param tempCordon the value for s_b_layer_house_alarm.temp_cordon
     *
     * @mbggenerated
     */
    public void setTempCordon(BigDecimal tempCordon) {
        this.tempCordon = tempCordon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.alarm_way
     *
     * @return the value of s_b_layer_house_alarm.alarm_way
     *
     * @mbggenerated
     */
    public String getAlarmWay() {
        return alarmWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.alarm_way
     *
     * @param alarmWay the value for s_b_layer_house_alarm.alarm_way
     *
     * @mbggenerated
     */
    public void setAlarmWay(String alarmWay) {
        this.alarmWay = alarmWay == null ? null : alarmWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.target_temp
     *
     * @return the value of s_b_layer_house_alarm.target_temp
     *
     * @mbggenerated
     */
    public BigDecimal getTargetTemp() {
        return targetTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.target_temp
     *
     * @param targetTemp the value for s_b_layer_house_alarm.target_temp
     *
     * @mbggenerated
     */
    public void setTargetTemp(BigDecimal targetTemp) {
        this.targetTemp = targetTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.min_temp
     *
     * @return the value of s_b_layer_house_alarm.min_temp
     *
     * @mbggenerated
     */
    public BigDecimal getMinTemp() {
        return minTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.min_temp
     *
     * @param minTemp the value for s_b_layer_house_alarm.min_temp
     *
     * @mbggenerated
     */
    public void setMinTemp(BigDecimal minTemp) {
        this.minTemp = minTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.max_temp
     *
     * @return the value of s_b_layer_house_alarm.max_temp
     *
     * @mbggenerated
     */
    public BigDecimal getMaxTemp() {
        return maxTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.max_temp
     *
     * @param maxTemp the value for s_b_layer_house_alarm.max_temp
     *
     * @mbggenerated
     */
    public void setMaxTemp(BigDecimal maxTemp) {
        this.maxTemp = maxTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.alarm_probe
     *
     * @return the value of s_b_layer_house_alarm.alarm_probe
     *
     * @mbggenerated
     */
    public String getAlarmProbe() {
        return alarmProbe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.alarm_probe
     *
     * @param alarmProbe the value for s_b_layer_house_alarm.alarm_probe
     *
     * @mbggenerated
     */
    public void setAlarmProbe(String alarmProbe) {
        this.alarmProbe = alarmProbe == null ? null : alarmProbe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.point_alarm
     *
     * @return the value of s_b_layer_house_alarm.point_alarm
     *
     * @mbggenerated
     */
    public BigDecimal getPointAlarm() {
        return pointAlarm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.point_alarm
     *
     * @param pointAlarm the value for s_b_layer_house_alarm.point_alarm
     *
     * @mbggenerated
     */
    public void setPointAlarm(BigDecimal pointAlarm) {
        this.pointAlarm = pointAlarm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.create_person
     *
     * @return the value of s_b_layer_house_alarm.create_person
     *
     * @mbggenerated
     */
    public Integer getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.create_person
     *
     * @param createPerson the value for s_b_layer_house_alarm.create_person
     *
     * @mbggenerated
     */
    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.create_date
     *
     * @return the value of s_b_layer_house_alarm.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.create_date
     *
     * @param createDate the value for s_b_layer_house_alarm.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.create_time
     *
     * @return the value of s_b_layer_house_alarm.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.create_time
     *
     * @param createTime the value for s_b_layer_house_alarm.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.modify_person
     *
     * @return the value of s_b_layer_house_alarm.modify_person
     *
     * @mbggenerated
     */
    public Integer getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.modify_person
     *
     * @param modifyPerson the value for s_b_layer_house_alarm.modify_person
     *
     * @mbggenerated
     */
    public void setModifyPerson(Integer modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.modify_date
     *
     * @return the value of s_b_layer_house_alarm.modify_date
     *
     * @mbggenerated
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.modify_date
     *
     * @param modifyDate the value for s_b_layer_house_alarm.modify_date
     *
     * @mbggenerated
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_b_layer_house_alarm.modify_time
     *
     * @return the value of s_b_layer_house_alarm.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_b_layer_house_alarm.modify_time
     *
     * @param modifyTime the value for s_b_layer_house_alarm.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}