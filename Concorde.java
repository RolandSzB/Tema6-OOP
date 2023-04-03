public class Concorde extends PassangerPlane {
public Concorde(String planeID, int totalEnginePower, int maxPassangers) {
		super(planeID, totalEnginePower, maxPassangers);
	}
public void goSuperSonic() {
	System.out.println("Plane number "+planeID+" (Power: "+totalEnginePower+") - Supersonic mode activated");
}
public void goSubSonic() {
	System.out.println("Plane number "+planeID+" (Power: "+totalEnginePower+") - Supersonic mode deactivated");
}
}