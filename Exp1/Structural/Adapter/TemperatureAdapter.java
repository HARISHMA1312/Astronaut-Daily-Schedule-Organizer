package Structural.Adapter;

public class TemperatureAdapter implements TemperatureReader {
    private FahrenheitSensor sensor;

    public TemperatureAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        // Convert Fahrenheit to Celsius
        return (sensor.getFahrenheitTemperature() - 32) * 5 / 9;
    }
}
