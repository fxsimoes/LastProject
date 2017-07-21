package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "ParkSpot")
public class ParkSpot extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column (name ="inputSpotNumber")
	private int inputSpotNum;
	@Column(name="ParkSpotNumber")
	private int number;
	@Column(name="ParkSpotRow")
	private String row;
	@Column(name= "StatusId")
//	private int statusId;
	private double statusId;

//	@Column (name="NrOfSpots", table= "Park")
//	private int nrOfSpots;
	
	@Column(name="statusId")
//	private enum statusId{	
//		Free, Reserved, Occupied;
//	}

//	@Column(name="SpotIdent")
//	private String spotIdent = row+number;
	
	@ManyToOne
	@JoinTable(
	        name="Park_Spots",
	        joinColumns=
	         @JoinColumn(name="Park_Id", referencedColumnName="ID"),
	        inverseJoinColumns=
	            @JoinColumn(name="Spot_Id", referencedColumnName="ID")
	    )
    private Park getPark() {
		return getPark(); }	
	
//----------------------------------------------------------------------------------------------

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

//	public String getSpotIdent() {
//		return spotIdent;
//	}
//
//	public void setSpotIdent(String spotIdent) {
//		this.spotIdent = spotIdent;
//	}
//	public void setStatusId(StatusId input) {
//        userPermissions = input;
//    }
//
//	public int getStatusId() {
//		return statusId;	
//	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
		}
	
//	public double getStatusId() {
		
//	Park park = new Park();
//		return Math.random()*Park.class;
//	}

//	public void setStatusId(int statusId) {
//		this.statusId = statusId;
//	}

	public ParkSpot() {
	}

}
