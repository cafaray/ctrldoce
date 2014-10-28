package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the jpem10t database table.
 * 
 */
@Embeddable
public class ContactoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String cdperson;

	private String cdcontac;

	public ContactoPK() {
	}
	public String getCdperson() {
		return this.cdperson;
	}
	public void setCdperson(String cdperson) {
		this.cdperson = cdperson;
	}
	public String getCdcontac() {
		return this.cdcontac;
	}
	public void setCdcontac(String cdcontac) {
		this.cdcontac = cdcontac;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContactoPK)) {
			return false;
		}
		ContactoPK castOther = (ContactoPK)other;
		return 
			this.cdperson.equals(castOther.cdperson)
			&& this.cdcontac.equals(castOther.cdcontac);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cdperson.hashCode();
		hash = hash * prime + this.cdcontac.hashCode();
		
		return hash;
	}
}