public class FightPlane extends Planes {
public FightPlane(String planeID, int totalEnginePower) {
		super(planeID,totalEnginePower);
	}
public void launchMissile() {
	System.out.println("Plane number "+planeID+"  - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
}
}
