public class JedliksToyCar {

    int distance, battery = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery == 0) return "Battery empty";
        return "Battery at " + battery + "%"; 
    }

    public void drive() {
        if(battery != 0) {
            distance = distance + 20;
            battery = battery - 1;
        }
    }
}
