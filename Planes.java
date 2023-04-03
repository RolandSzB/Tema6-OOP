public class Planes {
	String planeID;
	int totalEnginePower;

public Planes(String planeID, int totalEnginePower) {
		this.planeID = planeID;
		this.totalEnginePower = totalEnginePower;
	}

public int getTotalEnginePower() {
	return totalEnginePower;
}
public String getPlaneID() {
	return planeID;
}
public void takeOff() {
	System.out.println("Plane number "+planeID+" - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
}
public void fly() {
	System.out.println("Plane number "+planeID+"  - Flying");
}
public void land() {
	System.out.println("Plane number "+planeID+" - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
}
}