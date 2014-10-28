package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jpem10t database table.
 * 
 */
@Entity
@Table(name="jpem10t")
@NamedQuery(name="Contacto.findAll", query="SELECT c FROM Contacto c")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContactoPK id;

	private String cdusuari;

	private String dsfirst;

	private String dsipfrom;

	private String dslast;

	private String dsmail;

	private String dstelloc;

	private String dstelmov;

	private String programa;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	//uni-directional many-to-one association to Persona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cdperson")
	private Persona jpem00t;

	public Contacto() {
	}

	public ContactoPK getId() {
		return this.id;
	}

	public void setId(ContactoPK id) {
		this.id = id;
	}

	public String getCdusuari() {
		return this.cdusuari;
	}

	public void setCdusuari(String cdusuari) {
		this.cdusuari = cdusuari;
	}

	public String getDsfirst() {
		return this.dsfirst;
	}

	public void setDsfirst(String dsfirst) {
		this.dsfirst = dsfirst;
	}

	public String getDsipfrom() {
		return this.dsipfrom;
	}

	public void setDsipfrom(String dsipfrom) {
		this.dsipfrom = dsipfrom;
	}

	public String getDslast() {
		return this.dslast;
	}

	public void setDslast(String dslast) {
		this.dslast = dslast;
	}

	public String getDsmail() {
		return this.dsmail;
	}

	public void setDsmail(String dsmail) {
		this.dsmail = dsmail;
	}

	public String getDstelloc() {
		return this.dstelloc;
	}

	public void setDstelloc(String dstelloc) {
		this.dstelloc = dstelloc;
	}

	public String getDstelmov() {
		return this.dstelmov;
	}

	public void setDstelmov(String dstelmov) {
		this.dstelmov = dstelmov;
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

	public Persona getJpem00t() {
		return this.jpem00t;
	}

	public void setJpem00t(Persona jpem00t) {
		this.jpem00t = jpem00t;
	}

}