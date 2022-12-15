package DAO;

import javax.persistence.*;


//Tabla de la base de datos DAO

@Entity
@Table(name="eva_cat_evaluacion", schema="sc_evaluacion")
public class catalogoEva {

	//GET AND SETTERS
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}

	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}

	//PROPIEDADES
	@Id
	@Column(name="cod_evaluacion", unique=true, nullable=false)
	String cod_evaluacion;
	
	@Column(name="desc_evaluacion")
	String desc_evaluacion;
	
}
