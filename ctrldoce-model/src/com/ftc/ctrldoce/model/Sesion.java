package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jpem90t database table.
 * 
 */
@Entity
@Table(name="jpem90t")
@NamedQuery(name="Sesion.findAll", query="SELECT s FROM Sesion s")
public class Sesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idsesion;

	private String cdusuari;

	private String cdusulog;

	private String dsipfrom;

	private String dsusulog;

	private String programa;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	public Sesion() {
	}

	public String getIdsesion() {
		return this.idsesion;
	}

	public void setIdsesion(String idsesion) {
		this.idsesion = idsesion;
	}

	public String getCdusuari() {
		return this.cdusuari;
	}

	public void setCdusuari(String cdusuari) {
		this.cdusuari = cdusuari;
	}

	public String getCdusulog() {
		return this.cdusulog;
	}

	public void setCdusulog(String cdusulog) {
		this.cdusulog = cdusulog;
	}

	public String getDsipfrom() {
		return this.dsipfrom;
	}

	public void setDsipfrom(String dsipfrom) {
		this.dsipfrom = dsipfrom;
	}

	public String getDsusulog() {
		return this.dsusulog;
	}

	public void setDsusulog(String dsusulog) {
		this.dsusulog = dsusulog;
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