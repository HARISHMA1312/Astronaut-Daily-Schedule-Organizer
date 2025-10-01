package Structural.Adapter;


public class Main {
    public static void main(String[] args) {
        FahrenheitSensor oldSensor = new FahrenheitSensor();
        TemperatureReader reader = new TemperatureAdapter(oldSensor);

        System.out.println("Temperature in Celsius: " + reader.getTemperature());
    }
}

