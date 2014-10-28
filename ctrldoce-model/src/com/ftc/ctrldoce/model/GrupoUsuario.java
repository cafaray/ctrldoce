package com.ftc.ctrldoce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jgrm01t database table.
 * 
 */
@Entity
@Table(name="jgrm01t")
@NamedQuery(name="GrupoUsuario.findAll", query="SELECT g FROM GrupoUsuario g")
public class GrupoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdidegrp;

	private String cdusuari;

	private String dsidegrp;

	private int ingrpmod;

	private String programa;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tmstmp;

	public GrupoUsuario() {
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

	public String getDsidegrp() {
		return this.dsidegrp;
	}

	public void setDsidegrp(String dsidegrp) {
		this.dsidegrp = dsidegrp;
	}

	public int getIngrpmod() {
		return this.ingrpmod;
	}

	public void setIngrpmod(int ingrpmod) {
		this.ingrpmod = ingrpmod;
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