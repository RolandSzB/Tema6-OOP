public class Mig extends FightPlane {
	public Mig(String planeID, int totalEnginePower) {
		super(planeID,totalEnginePower);
	}
	public void highSpeedGeometry() {
		System.out.println("Plane number "+planeID+"  - High speed geometry selected");
	}
	public void normalSpeedGeometry() {
		System.out.println("Plane number "+planeID+"  - Normal speed geometry selected");
	}
}