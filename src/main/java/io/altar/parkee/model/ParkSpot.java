package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkSpot")
public class ParkSpot extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column (name ="InputSpotNumber")
	private int inputSpotNum;
	@Column(name="ParkSpotNumber")
	private int number;
	@Column(name="ParkSpotRow")
	private String row;
	
//	@Column(name="statusId")
	private enum statusId{	
		Free, Reserved, Occupied;
	}

	@Column(name="SpotIdent")
	private String spotIdent = row+number;

	@ManyToOne
	@JoinTable


//	@JoinTable (name="park", nullable= false)
//	@ForeignKey(name="park_fk")
	private Park park = new Park ();
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
