public enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public String getNext() {
        if (this == RED) return "GREEN";
        if (this == GREEN) return "YELLO";
        if (this == YELLOW) return "RED";

        return "Traffic Light is turnOFF";
    }
}
