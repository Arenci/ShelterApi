package com.shelter.rest.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the appoint database table.
 * 
 */
@Embeddable
public class AppointPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int dogID;

	@Column(insertable=false, updatable=false)
	private int userID;

	public AppointPK() {
	}
	public int getDogID() {
		return this.dogID;
	}
	public void setDogID(int dogID) {
		this.dogID = dogID;
	}
	public int getUserID() {
		return this.userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AppointPK)) {
			return false;
		}
		AppointPK castOther = (AppointPK)other;
		return 
			(this.dogID == castOther.dogID)
			&& (this.userID == castOther.userID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dogID;
		hash = hash * prime + this.userID;
		
		return hash;
	}
}