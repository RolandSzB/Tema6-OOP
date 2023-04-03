public class Airport {	
	public static void main(String[] args) {
	Planes plane1 = new Boeing("01",2000,100);
	Planes plane2 = new Concorde("02",5000,50);
	Planes plane3 = new Mig("03",1000);
	Planes plane4 = new TomCat("04",4000);
	
	Boeing p1 = (Boeing)plane1;
	Concorde p2 = (Concorde)plane2;
	Mig p3 = (Mig)plane3;
	TomCat p4 = (TomCat)plane4;
	
	System.out.println("The plane 01 has a total number of "+p1.getMaxPassangers()+" seats and is ready to take off and land in Rome");
	plane1.takeOff();
	plane1.fly();
	plane1.land();
	System.out.println("The plane 01 has arived successfully \n");
	
	System.out.println("The plane 02 has a total number of "+p2.getMaxPassangers()+" seats and is ready to take off and land in London");
	plane2.takeOff();
	plane2.fly();
	System.out.println("Turning on supersonic mode");
	p2.goSuperSonic();
	System.out.println("Turning off supersonic mode");
	p2.goSubSonic();
	plane2.land();
	System.out.println("The plane 02 has arived successfully \n");
	
	System.out.println("The plane 03 is ready to take off");
	plane3.takeOff();
	plane3.fly();
	System.out.println("Turning on highSpeedGeometry mode");
	p3.highSpeedGeometry();
	System.out.println("Enemy ahead");
	p3.launchMissile();
	System.out.println("Turning off highSpeedGeometry mode");
	p3.normalSpeedGeometry();
	plane3.land();
	System.out.println("The plane 03 has arived successfully \n");
	
	System.out.println("The plane 04 is ready to take off");
	plane4.takeOff();
	plane4.fly();
	System.out.println("Enemy ahead");
	p3.launchMissile();
	System.out.println("The tank is almost empty");
	p4.refuel();
	plane4.land();
	System.out.println("The plane 04 has arived successfully");
	}
	}