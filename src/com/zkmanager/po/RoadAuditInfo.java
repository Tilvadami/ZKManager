package com.zkmanager.po;

import java.util.List;

public class RoadAuditInfo {
	private int code;
	private String msg;
	private int firstCheckNum;
	private int secondCheckNum;
	private RoadRecord auditRecord;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getFirstCheckNum() {
		return firstCheckNum;
	}
	public void setFirstCheckNum(int firstCheckNum) {
		this.firstCheckNum = firstCheckNum;
	}
	public int getSecondCheckNum() {
		return secondCheckNum;
	}
	public void setSecondCheckNum(int secondCheckNum) {
		this.secondCheckNum = secondCheckNum;
	}
	public RoadRecord getAuditRecord() {
		return auditRecord;
	}
	public void setAuditRecord(RoadRecord auditRecord) {
		this.auditRecord = auditRecord;
	}
	@Override
	public String toString() {
		return "{"
				+ "code:" + code 
				+ ", msg:" + msg 
				+ ", firstCheckNum:" + firstCheckNum 
				+ ", secondCheckNum:" + secondCheckNum 
				+ ", auditRecord:" + auditRecord 
				+ "}";
	}
	
	
}
