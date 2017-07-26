package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkSpot")
public class ParkSpot extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @ManyToOne(optional=false, targetEntity=Park.class, 
    		cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Park park;
	
	@Column(name="status")
	private String status;
	@Column(name="SpotRef")
	private String spotRef;
        
    public void setPark(Park park) {
		this.park = park;
	}

	public String getSpotRef() {
		return spotRef;
	}

	public void setSpotRef(String spotRef) {
		this.spotRef = spotRef;
	}

	public Park getPark() { return park; }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ParkSpot() {}
	
	public ParkSpot(String status, String spotRef){
		this.status=status;
		this.spotRef=spotRef;
	}
}











