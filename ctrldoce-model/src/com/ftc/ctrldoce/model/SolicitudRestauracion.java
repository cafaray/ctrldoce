package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jsegsot database table.
 * 
 */
@Entity
@Table(name="jsegsot")
@NamedQuery(name="SolicitudRestauracion.findAll", query="SELECT s FROM SolicitudRestauracion s")
public class SolicitudRestauracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdsolres;

	private String dsagent;

	private String dsmail;

	private String dsrfc;

	private String instatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tsfecdwn;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tsfecsol;

	public SolicitudRestauracion() {
	}

	public String getCdsolres() {
		return this.cdsolres;
	}

	public void setCdsolres(String cdsolres) {
		this.cdsolres = cdsolres;
	}

	public String getDsagent() {
		return this.dsagent;
	}

	public void setDsagent(String dsagent) {
		this.dsagent = dsagent;
	}

	public String getDsmail() {
		return this.dsmail;
	}

	public void setDsmail(String dsmail) {
		this.dsmail = dsmail;
	}

	public String getDsrfc() {
		return this.dsrfc;
	}

	public void setDsrfc(String dsrfc) {
		this.dsrfc = dsrfc;
	}

	public String getInstatus() {
		return this.instatus;
	}

	public void setInstatus(String instatus) {
		this.instatus = instatus;
	}

	public Date getTmstmp() {
		return this.tmstmp;
	}

	public void setTmstmp(Date tmstmp) {
		this.tmstmp = tmstmp;
	}

	public Date getTsfecdwn() {
		return this.tsfecdwn;
	}

	public void setTsfecdwn(Date tsfecdwn) {
		this.tsfecdwn = tsfecdwn;
	}

	public Date getTsfecsol() {
		return this.tsfecsol;
	}

	public void setTsfecsol(Date tsfecsol) {
		this.tsfecsol = tsfecsol;
	}

}