import java.util.ArrayList;
import java.util.List;

public class TrafficIncidentManagementSystem {
    private List<TrafficIncident> incidents;

    public TrafficIncidentManagementSystem() {
        incidents = new ArrayList<>();
    }

    public void reportIncident(String type, String location) {
        TrafficIncident incident = new TrafficIncident(type, location);
        incidents.add(incident);
        System.out.println("Incident reported: " + type + " at " + location);
    }

    public void displayIncidents() {
        if (incidents.isEmpty()) {
            System.out.println("No incidents reported.");
        } else {
            System.out.println("Traffic Incidents:");
            for (TrafficIncident incident : incidents) {
                System.out.println("- Type: " + incident.getType() + ", Location: " + incident.getLocation());
            }
        }
    }
}
