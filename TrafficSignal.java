package mypack;

public enum TrafficSignal {
	RED("STOP"),
	GREEN("GO"),
	YELLOW("SLOW DOWN");
	
	private String action;
	
	private TrafficSignal(String a) {
		this.action = a;
	}
	public String getAction() {
		return this.action;
	}
	public static void main(String args[]) {
		TrafficSignal[] arr = TrafficSignal.values();
		for(TrafficSignal t : arr)
			System.out.println("name: " + t.name() + " action: " + t.getAction());
	}
}
