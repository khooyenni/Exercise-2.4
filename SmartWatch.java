package SettersGetters;

public class SmartWatch {
	
	String brand;
	String model;
	String colour;
	int memory;
	double display;
	double weight;
	  
	 // Create Setter Method
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  
	  public void setModel(String model) {
		    this.model = model;
	  }
	  
	  public void setColour(String colour) {
		    this.colour = colour;
	  }
	  
	  
	  public void setMemory(int memory) {
		  this.memory = memory;
	  }
	  
	  public void setDisplay(double display) {
		  this.display = display;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }

	  // Create Getter Method
	  
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getModel() {
	 	  return this.model;
 	  }
	  
	  public String getColour() {
	 	  return this.colour;
 	  }
	  
	  public Integer getMemory() {
		  return this.memory;
	  }
	  
	  
	  public double getDisplay() {
		  return this.display;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  

}
