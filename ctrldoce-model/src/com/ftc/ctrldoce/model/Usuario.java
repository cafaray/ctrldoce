package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="jusm01t")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioPK id;

	private String cdidegrp;

	private String cdusuari;

	private String cdusulog;

	private String dsipfrom;

	private String dsvalenc;

	private String instatus;

	private int inusumod;

	private String programa;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	//uni-directional many-to-one association to Contacto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="cdcontac", referencedColumnName="cdcontac"),
		@JoinColumn(name="cdperson", referencedColumnName="cdperson")
		})
	private Contacto jpem10t;

	public Usuario() {
	}

	public UsuarioPK getId() {
		return this.id;
	}

	public void setId(UsuarioPK id) {
		this.id = id;
	}

	public String getCdidegrp() {
		return this.cdidegrp;
	}

	public void setCdidegrp(String cdidegrp) {
		this.cdidegrp = cdidegrp;
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

	public String getDsvalenc() {
		return this.dsvalenc;
	}

	public void setDsvalenc(String dsvalenc) {
		this.dsvalenc = dsvalenc;
	}

	public String getInstatus() {
		return this.instatus;
	}

	public void setInstatus(String instatus) {
		this.instatus = instatus;
	}

	public int getInusumod() {
		return this.inusumod;
	}

	public void setInusumod(int inusumod) {
		this.inusumod = inusumod;
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

	public Contacto getJpem10t() {
		return this.jpem10t;
	}

	public void setJpem10t(Contacto jpem10t) {
		this.jpem10t = jpem10t;
	}

}