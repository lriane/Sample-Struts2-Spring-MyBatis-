/*
 ******************************************************************************
 *
 *  UserInfoDto.java
 *
 ******************************************************************************
 */
package com.tnkmatic.trial.dto;

public class UserInfoDto extends BaseDto {
	private Integer[]	keys;			//更新対象判別用（対象ユーザIDの配列）
	private Integer	userId;			//ユーザID
	private String		userName;		//ユーザ名
	private String		pref;			//出身地
	private String		telNumber;		//内線番号

	public Integer[] getKeys() {
		return keys;
	}

	public void setKeys(Integer[] keys) {
		this.keys = keys;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPref() {
		return pref;
	}

	public void setPref(String pref) {
		this.pref = pref;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
}
