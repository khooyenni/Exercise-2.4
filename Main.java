package SettersGetters;

public class Main {

	public static void main(String[] args) {
		
		SmartWatch huawei = new SmartWatch();
		SmartWatch samsung = new SmartWatch();
		SmartWatch apple = new SmartWatch();
		SmartWatch garmin = new SmartWatch();
		
		System.out.println("*****Huawei*****");
		huawei.setBrand("Huawei");
		huawei.setModel("G2 Pro");
		huawei.setColour("Night Black");
		huawei.setMemory(4);
		huawei.setDisplay(1.39);
		huawei.setWeight(52);
		
		System.out.println("Brand     : " + huawei.getBrand());
		System.out.println("Model     : " + huawei.getModel());
		System.out.println("Colour    : " + huawei.getColour());
		System.out.println("Memory    : " + huawei.getMemory() + "GB");
		System.out.println("Display   : " + huawei.getDisplay() + " " + "inches");
		System.out.println("Weight    : " + huawei.getWeight() + "g\n");
		
		System.out.println("*****Samusung*****");
		samsung.setBrand("Samsung");
		samsung.setModel("Galaxy Watch Active2");
		samsung.setColour("Silver");
		samsung.setMemory(4);
		samsung.setDisplay(1.4);
		samsung.setWeight(42);
		
		System.out.println("Brand     : " + samsung.getBrand());
		System.out.println("Model     : " + samsung.getModel());
		System.out.println("Colour    : " + samsung.getColour());
		System.out.println("Memory    : " + samsung.getMemory() + "GB");
		System.out.println("Display   : " + samsung.getDisplay() + " " + "inches");
		System.out.println("Weight    : " + samsung.getWeight() + "g\n");
		
		System.out.println("*****Apple*****");
		apple.setBrand("Apple");
		apple.setModel("Watch Series 6");
		apple.setColour("Gold");
		apple.setMemory(32);
		apple.setDisplay(1.78);
		apple.setWeight(47.1);
		
		System.out.println("Brand     : " + apple.getBrand());
		System.out.println("Model     : " + apple.getModel());
		System.out.println("Colour    : " + apple.getColour());
		System.out.println("Memory    : " + apple.getMemory() + "GB");
		System.out.println("Display   : " + apple.getDisplay() + " " + "inches");
		System.out.println("Weight    : " + apple.getWeight() + "g\n");
		
		System.out.println("*****Garmin*****");
		garmin.setBrand("Garmin");
		garmin.setModel("Venu Sq");
		garmin.setColour("Black with Rose Gold Bezel");
		garmin.setMemory(3);
		garmin.setDisplay(1.3);
		garmin.setWeight(36.7);
		
		System.out.println("Brand     : " + garmin.getBrand());
		System.out.println("Model     : " + garmin.getModel());
		System.out.println("Colour    : " + garmin.getColour());
		System.out.println("Memory    : " + garmin.getMemory() + "GB");
		System.out.println("Display   : " + garmin.getDisplay() + " " + "inches");
		System.out.println("Weight    : " + garmin.getWeight() + "g\n");

	}

}
