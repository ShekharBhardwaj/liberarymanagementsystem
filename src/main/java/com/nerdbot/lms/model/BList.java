package com.nerdbot.lms.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class BList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;

	private int suid;

	private Timestamp black_Listed_Time;

	@Lob
	private String reason;
	
	

	public Timestamp getBlack_Listed_Time() {
		return black_Listed_Time;
	}

	public void setBlack_Listed_Time(Timestamp black_Listed_Time) {
		this.black_Listed_Time = black_Listed_Time;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getSuid() {
		return suid;
	}

	public void setSuid(int suid) {
		this.suid = suid;
	}



	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
