package io.altar.parkee.model;

import java.io.Serializable;
import java.util.Random;

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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkSpot")
public class ParkSpot extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Park park = new Park();
	
	@Column(name = "inputSpotNumber")
	private  int inputSpotNum = x(park.getNrOfSpots());
	@Column(name = "ParkSpotNumber")
	private int number;
	@Column(name = "ParkSpotRow")
	private String row;
	@Column(name= "StatusId")
	private int statusId;

// @Column(name="SpotIdent")
// private String spotIdent = row+number;
// @Column (name="NrOfSpots", table= "Park")
// private int nrOfSpots;

//	@Column(name = "statusId")
//	private statusID statusId = r.random();
//
//	// ------------------RANDOM STATUS-------------------------.....................................................//
//
//	public enum statusID {
//		FREE, RESERVED, OCCUPIED;
//	}
//
//	private static final RandomEnum<statusID> r = new RandomEnum<statusID>(statusID.class);
//
//	// public static void main(String[] args) {
//	// System.out.println(r.random());
//	// }
//
//	private static class RandomEnum<E extends Enum> {
//
//		private static final Random RND = new Random();
//		private final E[] values;
//
//		public RandomEnum(Class<E> token) {
//			values = token.getEnumConstants();
//		}
//
//		public E random() {
//			return values[RND.nextInt(values.length)];
//		}
//	}
	
//-------------------------------------RANDOM NrOFSPOTS-------------------------------------------------------------//

		public  int x (int cenas){	
			cenas = (int) (Math.random()*inputSpotNum);
			return cenas;
		}
	
// -----------------------------------------------------------------------------------------------------------------//

	// @ManyToOne
	// @JoinTable(
	// name="Park_Spots",
	// joinColumns=
	// @JoinColumn(name="Park_Id", referencedColumnName="ID"),
	// inverseJoinColumns=
	// @JoinColumn(name="Spot_Id", referencedColumnName="ID")
	// )
	// private Park getPark() {
	// return getPark(); }

	
	// -------------------------------------------SETTERS-----------------------------------------------------------//

	public int getNumber() {
		return number;
	}

	public int getInputSpotNum() {
		return inputSpotNum;
	}

	public void setInputSpotNum(int inputSpotNum) {
		this.inputSpotNum = inputSpotNum;
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
	

//	public statusID getStatusId() {
//		return statusId;
//	}
//
//	public void setStatusID(statusID statusId) {
//		this.statusId = statusId;
//	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public ParkSpot() {
	}

}
