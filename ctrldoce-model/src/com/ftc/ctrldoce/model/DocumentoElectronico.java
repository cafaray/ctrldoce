package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jdem10t database table.
 * 
 */
@Entity
@Table(name="jdem10t")
@NamedQuery(name="DocumentoElectronico.findAll", query="SELECT d FROM DocumentoElectronico d")
public class DocumentoElectronico implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocumentoElectronicoPK id;

	private String cdusuari;

	private String cdusumod;

	private String dsfiles;

	private String dsipfrom;

	private String dsobserv;

	private String dstitle;

	private String instatus;

	private String programa;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tschgstt;

	//uni-directional many-to-one association to Persona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cdperson")
	private Persona jpem00t;

	public DocumentoElectronico() {
	}

	public DocumentoElectronicoPK getId() {
		return this.id;
	}

	public void setId(DocumentoElectronicoPK id) {
		this.id = id;
	}

	public String getCdusuari() {
		return this.cdusuari;
	}

	public void setCdusuari(String cdusuari) {
		this.cdusuari = cdusuari;
	}

	public String getCdusumod() {
		return this.cdusumod;
	}

	public void setCdusumod(String cdusumod) {
		this.cdusumod = cdusumod;
	}

	public String getDsfiles() {
		return this.dsfiles;
	}

	public void setDsfiles(String dsfiles) {
		this.dsfiles = dsfiles;
	}

	public String getDsipfrom() {
		return this.dsipfrom;
	}

	public void setDsipfrom(String dsipfrom) {
		this.dsipfrom = dsipfrom;
	}

	public String getDsobserv() {
		return this.dsobserv;
	}

	public void setDsobserv(String dsobserv) {
		this.dsobserv = dsobserv;
	}

	public String getDstitle() {
		return this.dstitle;
	}

	public void setDstitle(String dstitle) {
		this.dstitle = dstitle;
	}

	public String getInstatus() {
		return this.instatus;
	}

	public void setInstatus(String instatus) {
		this.instatus = instatus;
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

	public Date getTschgstt() {
		return this.tschgstt;
	}

	public void setTschgstt(Date tschgstt) {
		this.tschgstt = tschgstt;
	}

	public Persona getJpem00t() {
		return this.jpem00t;
	}

	public void setJpem00t(Persona jpem00t) {
		this.jpem00t = jpem00t;
	}

}