public class PassangerPlane extends Planes {
	int maxPassangers;
public PassangerPlane(String planeID, int totalEnginePower, int maxPassangers) {
		super(planeID, totalEnginePower);
		this.maxPassangers = maxPassangers;
	}
public int getMaxPassangers() {
	return maxPassangers;
}
}