package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkSpot")
public class ParkSpot extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	

	@Column(name="ParkSpotNumber")
	private int number;
	@Column(name="ParkSpotRow")
	private String row;
	@Column(name="statusId")
	private int statusId;
	
	@OneToOne
	@JoinColumn(name="NrOfSpots")
	private Park park;
	
	
	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
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

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public ParkSpot() {
	}

}
