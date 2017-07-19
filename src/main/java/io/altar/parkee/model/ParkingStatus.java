package io.altar.parkee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Status")
public class ParkingStatus extends EntityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	@Column(name="StatusName")
//	private int Name;
	@Column(name="StatusCode")
	private int Code;
	
	
//	public int getName() {
//		return (int) (Math.random() * 10);
//	}
//	public void setName(int name) {
//		Name = name;
//	}
	public int getCode() {
		return (int) (Math.random() * 3);
		}
	public void setCode(int code) {
		Code = code;
	}
	
	

<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	public ParkingStatus() {}

=======
	
>>>>>>> 7f3505d3b043b63bf37549b9fea52016236bc03e
>>>>>>> dev
}
