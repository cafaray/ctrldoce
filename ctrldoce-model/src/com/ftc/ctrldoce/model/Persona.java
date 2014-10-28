package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jpem00t database table.
 * 
 */
@Entity
@Table(name="jpem00t")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdperson;

	private String cdusuari;

	private String dsfolder;

	private String dslogo;

	private String dsrazsoc;

	private String dsrfc;

	private String intipprs;

	private String isowner;

	private String programa;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	public Persona() {
	}

	public String getCdperson() {
		return this.cdperson;
	}

	public void setCdperson(String cdperson) {
		this.cdperson = cdperson;
	}

	public String getCdusuari() {
		return this.cdusuari;
	}

	public void setCdusuari(String cdusuari) {
		this.cdusuari = cdusuari;
	}

	public String getDsfolder() {
		return this.dsfolder;
	}

	public void setDsfolder(String dsfolder) {
		this.dsfolder = dsfolder;
	}

	public String getDslogo() {
		return this.dslogo;
	}

	public void setDslogo(String dslogo) {
		this.dslogo = dslogo;
	}

	public String getDsrazsoc() {
		return this.dsrazsoc;
	}

	public void setDsrazsoc(String dsrazsoc) {
		this.dsrazsoc = dsrazsoc;
	}

	public String getDsrfc() {
		return this.dsrfc;
	}

	public void setDsrfc(String dsrfc) {
		this.dsrfc = dsrfc;
	}

	public String getIntipprs() {
		return this.intipprs;
	}

	public void setIntipprs(String intipprs) {
		this.intipprs = intipprs;
	}

	public String getIsowner() {
		return this.isowner;
	}

	public void setIsowner(String isowner) {
		this.isowner = isowner;
	}

	public String getPrograma() {
		return this.programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public Date getTmstmp() {
		return this.tmstmp;
	}

	public void setTmstmp(Date tmstmp) {
		this.tmstmp = tmstmp;
	}

}