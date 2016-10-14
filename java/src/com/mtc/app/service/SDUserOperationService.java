/**
 *
 * MTC-上海农汇信息科技有限公司
 * Copyright © 2015 农汇 版权所有
 */
package com.mtc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtc.entity.app.SDUserOperation;
import com.mtc.mapper.app.SDUserOperationMapper;

/**
 * @ClassName: SDUserOperationService
 * @Description: 用户操作记录
 *  * 
 */
@Service
public class SDUserOperationService {
	/**
	 * 操作类型
	 */
	public static final String OPERATION_SELECT = "SELECT";
	public static final String OPERATION_ADD = "ADD";
	public static final String OPERATION_DELETE = "DELETE";
	public static final String OPERATION_UPDATE = "UPDATE";
	
	/**
	 * code一共5位数字， demo:10001 
	 * 第一位代表所属模块，最后几位代表模块中的子功能
	 * 
	 * 大模块有
	 * 1：基础信息
	 * 2：环控检测
	 * 3：生产日报
	 * 4：销售日报 /已经添加
	 * 5：数据分析 /体重曲线和销售分析曲线已经添加
	 * 6：农场管理
	 * 
	 */
	/** 农场信息**/
	public static final String MENU_FARMINFO = "10001";
	/** 栋舍信息**/
	public static final String MENU_HOUSEINFO = "10002";
	/** 员工信息**/
	public static final String MENU_MEMBERINFO = "10003";
	/** 修改密码**/
	public static final String MENU_PASSWORD = "10004";
	/** 登录**/
	public static final String MENU_LOGIN= "10005";
	/**农场报警设置*/
	public static final String MENU_FARM_ALARM_SETTING= "10006";
	
	/** 环控监测**/
	public static final String MENU_ENVIMONITOR = "20001";
	/** 环控监测设置**/
	public static final String MENU_ENVIMONITOR_SETTING = "20002";
	/** 报警延迟处理**/
	public static final String MENU_WARNTREATMENT = "20003";
	/** 报警统计**/
	public static final String MENU_WARNSTATISTICS = "20004";
	/** 报警日志**/
	public static final String MENU_WARNLOG = "20005";
	
	/** 生产日报**/
	public static final String MENU_PRODUCTION_DAY = "30001";
	/** 生产周报**/
	public static final String MENU_PRODUCTION_WEEK = "30002";
	
	/** 销售日报**/
	public static final String MENU_EGGSELL = "40001";
	
	/** 数据分析 温度曲线**/
	public static final String MENU_DATAANALYSIS_TEMP = "50001";
	/** 产蛋曲线**/
	public static final String MENU_DATAANALYSIS_EGG = "50002";
	/** 死淘率**/
	public static final String MENU_DATAANALYSIS_DIE = "50003";
	/** 体重曲线	**/
	public static final String MENU_DATAANALYSIS_WEIGHT = "50004";
	/** 料蛋比曲线	**/
	public static final String MENU_DATAANALYSIS_FEEDEGG = "50005";
	/** 采食饮水曲线**/
	public static final String MENU_DATAANALYSIS_FOODWARTER = "50006";
	/** 销售分析曲线**/
	public static final String MENU_DATAANALYSIS_SALE = "50007";
	/** 只鸡累计产蛋比**/
	public static final String MENU_DATAANALYSIS_CHICKEN_EGGS = "50008";
	/** 水料比**/
	public static final String MENU_DATAANALYSIS_WATER_FEED = "50009";
	
	/** 农场管理 新建批次**/
	public static final String MENU_FARMMANAGEMENT_ADD = "60001";
	/** 成本核算**/
	public static final String MENU_FARMMANAGEMENT_COST = "60002";
	/** 盈利**/
	public static final String MENU_FARMMANAGEMENT_PROFIT = "60003";
	/** 累计盈利**/
	public static final String MENU_FARMMANAGEMENT_PROFIT_TOTAL = "60004";
	/** 历史数据**/
	public static final String MENU_FARMMANAGEMENT_HISTORYDATA = "60005";
	/** 生产性能**/
	public static final String MENU_FARMMANAGEMENT_PRODUCTION = "60006";
	/** 青年鸡身价摊销**/
	public static final String MENU_FARMMANAGEMENT_PULLET = "60007";

		
	@Autowired
	private SDUserOperationMapper operationMapper ;
	
	
	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_d_user_operation
     *
     * @mbggenerated
     */
    public int insert(SDUserOperation record){
    	return operationMapper.insert(record);
    }
    
    /**
     * 
     * 插入用户操作记录
     * 
     * @param menuCode
     * @param poerationType
     * @param personId
     * @return
     */
    public int insert(String menuCode,String poerationType,int personId){
    	SDUserOperation record = new SDUserOperation();
		//record.setCreateTime(new Date(System.currentTimeMillis()));
		record.setMenuCode(menuCode);
		record.setOperationType(poerationType);
		record.setPersonId(personId);
    	return insert(record);
    }
	
}








