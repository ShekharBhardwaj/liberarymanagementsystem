package com.nerdbot.lms.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ehistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ehid;
	private String actionType;
	private Timestamp actTime;
	private boolean bookIssued;
	private int buid;
	private int suid;
	public int getEhid() {
		return ehid;
	}
	public void setEhid(int ehid) {
		this.ehid = ehid;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public Timestamp getActTime() {
		return actTime;
	}
	public void setActTime(Timestamp actTime) {
		this.actTime = actTime;
	}
	public boolean isBookIssued() {
		return bookIssued;
	}
	public void setBookIssued(boolean bookIssued) {
		this.bookIssued = bookIssued;
	}
	public int getBuid() {
		return buid;
	}
	public void setBuid(int buid) {
		this.buid = buid;
	}
	public int getSuid() {
		return suid;
	}
	public void setSuid(int suid) {
		this.suid = suid;
	}
	
	

}
