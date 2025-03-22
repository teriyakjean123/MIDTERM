public class TrafficIncident {
    private String type;
    private String location;

    public TrafficIncident(String type, String location) {
        this.type = type;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }
}
