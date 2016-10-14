package com.mtc.entity.app;

import java.util.Date;

public class SDUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_code
     *
     * @mbggenerated
     */
    private String userCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_real_name
     *
     * @mbggenerated
     */
    private String userRealName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_real_name_en
     *
     * @mbggenerated
     */
    private String userRealNameEn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_password
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_mobile_1
     *
     * @mbggenerated
     */
    private String userMobile1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_mobile_2
     *
     * @mbggenerated
     */
    private String userMobile2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_tel_1
     *
     * @mbggenerated
     */
    private String userTel1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_tel_2
     *
     * @mbggenerated
     */
    private String userTel2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_email
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.user_status
     *
     * @mbggenerated
     */
    private String userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.freeze_status
     *
     * @mbggenerated
     */
    private String freezeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.memo_1
     *
     * @mbggenerated
     */
    private String memo1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.memo_2
     *
     * @mbggenerated
     */
    private String memo2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.memo_3
     *
     * @mbggenerated
     */
    private String memo3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.memo_4
     *
     * @mbggenerated
     */
    private String memo4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.create_person
     *
     * @mbggenerated
     */
    private Integer createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.modify_person
     *
     * @mbggenerated
     */
    private Integer modifyPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.modify_date
     *
     * @mbggenerated
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_d_user.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.id
     *
     * @return the value of s_d_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.id
     *
     * @param id the value for s_d_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_code
     *
     * @return the value of s_d_user.user_code
     *
     * @mbggenerated
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_code
     *
     * @param userCode the value for s_d_user.user_code
     *
     * @mbggenerated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_real_name
     *
     * @return the value of s_d_user.user_real_name
     *
     * @mbggenerated
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_real_name
     *
     * @param userRealName the value for s_d_user.user_real_name
     *
     * @mbggenerated
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_real_name_en
     *
     * @return the value of s_d_user.user_real_name_en
     *
     * @mbggenerated
     */
    public String getUserRealNameEn() {
        return userRealNameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_real_name_en
     *
     * @param userRealNameEn the value for s_d_user.user_real_name_en
     *
     * @mbggenerated
     */
    public void setUserRealNameEn(String userRealNameEn) {
        this.userRealNameEn = userRealNameEn == null ? null : userRealNameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_password
     *
     * @return the value of s_d_user.user_password
     *
     * @mbggenerated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_password
     *
     * @param userPassword the value for s_d_user.user_password
     *
     * @mbggenerated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_mobile_1
     *
     * @return the value of s_d_user.user_mobile_1
     *
     * @mbggenerated
     */
    public String getUserMobile1() {
        return userMobile1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_mobile_1
     *
     * @param userMobile1 the value for s_d_user.user_mobile_1
     *
     * @mbggenerated
     */
    public void setUserMobile1(String userMobile1) {
        this.userMobile1 = userMobile1 == null ? null : userMobile1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_mobile_2
     *
     * @return the value of s_d_user.user_mobile_2
     *
     * @mbggenerated
     */
    public String getUserMobile2() {
        return userMobile2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_mobile_2
     *
     * @param userMobile2 the value for s_d_user.user_mobile_2
     *
     * @mbggenerated
     */
    public void setUserMobile2(String userMobile2) {
        this.userMobile2 = userMobile2 == null ? null : userMobile2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_tel_1
     *
     * @return the value of s_d_user.user_tel_1
     *
     * @mbggenerated
     */
    public String getUserTel1() {
        return userTel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_tel_1
     *
     * @param userTel1 the value for s_d_user.user_tel_1
     *
     * @mbggenerated
     */
    public void setUserTel1(String userTel1) {
        this.userTel1 = userTel1 == null ? null : userTel1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_tel_2
     *
     * @return the value of s_d_user.user_tel_2
     *
     * @mbggenerated
     */
    public String getUserTel2() {
        return userTel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_tel_2
     *
     * @param userTel2 the value for s_d_user.user_tel_2
     *
     * @mbggenerated
     */
    public void setUserTel2(String userTel2) {
        this.userTel2 = userTel2 == null ? null : userTel2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_email
     *
     * @return the value of s_d_user.user_email
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_email
     *
     * @param userEmail the value for s_d_user.user_email
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.user_status
     *
     * @return the value of s_d_user.user_status
     *
     * @mbggenerated
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.user_status
     *
     * @param userStatus the value for s_d_user.user_status
     *
     * @mbggenerated
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.freeze_status
     *
     * @return the value of s_d_user.freeze_status
     *
     * @mbggenerated
     */
    public String getFreezeStatus() {
        return freezeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.freeze_status
     *
     * @param freezeStatus the value for s_d_user.freeze_status
     *
     * @mbggenerated
     */
    public void setFreezeStatus(String freezeStatus) {
        this.freezeStatus = freezeStatus == null ? null : freezeStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.memo_1
     *
     * @return the value of s_d_user.memo_1
     *
     * @mbggenerated
     */
    public String getMemo1() {
        return memo1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.memo_1
     *
     * @param memo1 the value for s_d_user.memo_1
     *
     * @mbggenerated
     */
    public void setMemo1(String memo1) {
        this.memo1 = memo1 == null ? null : memo1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.memo_2
     *
     * @return the value of s_d_user.memo_2
     *
     * @mbggenerated
     */
    public String getMemo2() {
        return memo2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.memo_2
     *
     * @param memo2 the value for s_d_user.memo_2
     *
     * @mbggenerated
     */
    public void setMemo2(String memo2) {
        this.memo2 = memo2 == null ? null : memo2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.memo_3
     *
     * @return the value of s_d_user.memo_3
     *
     * @mbggenerated
     */
    public String getMemo3() {
        return memo3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.memo_3
     *
     * @param memo3 the value for s_d_user.memo_3
     *
     * @mbggenerated
     */
    public void setMemo3(String memo3) {
        this.memo3 = memo3 == null ? null : memo3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.memo_4
     *
     * @return the value of s_d_user.memo_4
     *
     * @mbggenerated
     */
    public String getMemo4() {
        return memo4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.memo_4
     *
     * @param memo4 the value for s_d_user.memo_4
     *
     * @mbggenerated
     */
    public void setMemo4(String memo4) {
        this.memo4 = memo4 == null ? null : memo4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.create_person
     *
     * @return the value of s_d_user.create_person
     *
     * @mbggenerated
     */
    public Integer getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.create_person
     *
     * @param createPerson the value for s_d_user.create_person
     *
     * @mbggenerated
     */
    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.create_date
     *
     * @return the value of s_d_user.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.create_date
     *
     * @param createDate the value for s_d_user.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.create_time
     *
     * @return the value of s_d_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.create_time
     *
     * @param createTime the value for s_d_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.modify_person
     *
     * @return the value of s_d_user.modify_person
     *
     * @mbggenerated
     */
    public Integer getModifyPerson() {
        return modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.modify_person
     *
     * @param modifyPerson the value for s_d_user.modify_person
     *
     * @mbggenerated
     */
    public void setModifyPerson(Integer modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.modify_date
     *
     * @return the value of s_d_user.modify_date
     *
     * @mbggenerated
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.modify_date
     *
     * @param modifyDate the value for s_d_user.modify_date
     *
     * @mbggenerated
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_d_user.modify_time
     *
     * @return the value of s_d_user.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_d_user.modify_time
     *
     * @param modifyTime the value for s_d_user.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}