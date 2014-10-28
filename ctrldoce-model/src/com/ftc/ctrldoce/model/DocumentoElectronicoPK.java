package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the jdem10t database table.
 * 
 */
@Embeddable
public class DocumentoElectronicoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String cdperson;

	private String cddocele;

	public DocumentoElectronicoPK() {
	}
	public String getCdperson() {
		return this.cdperson;
	}
	public void setCdperson(String cdperson) {
		this.cdperson = cdperson;
	}
	public String getCddocele() {
		return this.cddocele;
	}
	public void setCddocele(String cddocele) {
		this.cddocele = cddocele;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocumentoElectronicoPK)) {
			return false;
		}
		DocumentoElectronicoPK castOther = (DocumentoElectronicoPK)other;
		return 
			this.cdperson.equals(castOther.cdperson)
			&& this.cddocele.equals(castOther.cddocele);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cdperson.hashCode();
		hash = hash * prime + this.cddocele.hashCode();
		
		return hash;
	}
}