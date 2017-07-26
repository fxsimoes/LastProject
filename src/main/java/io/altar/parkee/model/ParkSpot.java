package io.altar.parkee.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
<<<<<<< HEAD
	
    
//    @Transactional
//    public void add(entity){
//    	EntityRepository.create(entity);
//    }
    
         
=======
        
>>>>>>> Francisco
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

//	public static void cenas (){
//		
//		List<String> myList = new ArrayList<>();
//		for(getNumber=1; getNumber()<=5; getNumber++) {
//		spotRef=row+getNumber();
//			myList.add(spotRef);
//		}
//		System.out.println(myList);
//		
//		
//	}

//	public static void cenas(){
//
//		int j;
//		int num=5;
//		String cona= "A";
//		for (int i=0; i<=num; i++){	
//			j= i;	
//		}
//	}
	
	public ParkSpot(String status, String spotRef){
		this.status=status;
<<<<<<< HEAD
		row="A";
		List<String> myList = new ArrayList<>();
		for(number=1; number<=5; number++) {
			spotRef=row+number;
			myList.add(spotRef);
		}
		System.out.println(myList);
=======
		this.spotRef=spotRef;
>>>>>>> Francisco
	}
}















