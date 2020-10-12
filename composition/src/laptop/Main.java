package laptop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Laptop laptop = new Laptop();
       System.out.println(laptop.getProcessor().getBrand());
       Processor p = new Processor("Intel", "i8 7689u", 11,  8, 5, "5 GB",
   			"2.20 Ghz", "2.15 Ghz", "4.00 Ghz");
       GraphicsCard g = new GraphicsCard("Nividita", 1000, "4 GB");
       Laptop gamingLaptop = new Laptop(17.5f, p, "8 GB", "DDR5", g,
    		   "MLT layer", "backlit");
       System.out.println(gamingLaptop.toString());
       gamingLaptop.gamingMood();
       System.out.println(gamingLaptop.toString());
	}

}
