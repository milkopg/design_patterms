package design_patterns.com.milko.training.java_interfaces_abstraction.m1.common;

public class ClientEngagement {
	
	private String client;
	private int hoursWorked;
	private double anticipatedRevenue;
	
	public ClientEngagement(final String client, final int hoursWorkded, final double anticipatedRevenue) {
		this.client = client;
		this.hoursWorked = hoursWorkded;
		this.anticipatedRevenue = anticipatedRevenue;
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAnticipatedRevenue() {
		return anticipatedRevenue;
	}
	
	@Override
    public String toString()
    {
        return "uk.co.monotonic.java_interfaces_and_abstraction.m1.ClientEngagement{" +
                "client='" + client + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", anticipatedRevenue=" + anticipatedRevenue +
                '}';
    }
}
