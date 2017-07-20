package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkSpot")
public class ParkSpot extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Park park;
	@Column (name ="InputSpotNumber")
	private int inputSpotNum;
	@Column(name="ParkSpotNumber")
	private int number;
	@Column(name="ParkSpotRow")
	private String row;
	
//	@Column(name="statusId")
	private enum StatusId{	
		F,B,O;
	}

	@Column(name="SpotIdent")
	private String spotIdent = row+number;

	@ManyToOne
	@JoinTable

	public int getInputSpotNum() {
		return inputSpotNum;
	}

	public void setInputSpotNum(int inputSpotNum) {
		this.inputSpotNum = inputSpotNum;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}
	
	public String getSpotIdent() {
		return spotIdent;
	}

	public void setSpotIdent(String spotIdent) {
		this.spotIdent = spotIdent;
	}
//	public void setStatusId(StatusId input) {
//        userPermissions = input;
//    }

	public ParkSpot() {
	}

}