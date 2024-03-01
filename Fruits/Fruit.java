package Fruits;
/*
 * Jacpb Nielsen
 * 2/29/24
 */

import java.util.ArrayList;
import java.util.List;

public class Fruit {
	String fruitName;
	String fruitDesc;
	int fruitQty;
	
	public Fruit(String fName,String fDesc,int fQty) {
		this.fruitName = fName;
		this.fruitDesc = fDesc;
		this.fruitQty = fQty;
	}
	
	public String getfruitName () {
		return fruitName;
	}
	
	public String getfruitDesc() {
		return fruitDesc;
	}
	
	public int getfruitQty() {
		return fruitQty;
	}
	
	public void setfruitName(String fName) {
		this.fruitName = fName;
	}
	
	public void setfruitDesc(String fDesc) {
		this.fruitDesc = fDesc;
	}
	
	public void setfruitQty(int fQty) {
		this.fruitQty = fQty;
	}
	

	
	
	
	 @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Fruit {");
	        sb.append("name = ").append(fruitName);
	        sb.append(", Description = ").append(fruitDesc);
	        sb.append(", Quantity = ").append(fruitQty);
	        sb.append('}');
	        return sb.toString();
	    }
	 
	 public static void main(String[] args) {
		 
		 Object Apple = new Fruit("Apple","Red",10);
		 Object Orange = new Fruit("Orange","Round and Orange",4);
		 Object Mango = new Fruit("Mango","Orange",12);
		 
		 List<Object> fruits = new ArrayList<>();
		 fruits.add(Apple);
		 fruits.add(Orange);
		 fruits.add(Mango);
		 
		 
		 fruits.forEach(System.out::println);
		 
	 }
	 
}
