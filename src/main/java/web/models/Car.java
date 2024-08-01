package web.models;


public class Car {
    private String model;
    private int series;
    private short maxSpeed;

    public Car() {

    }

    public Car(String model, int series, short maxSpeed) {
        this.model = model;
        this.series = series;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public short getMaxSpeed() {
        return maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setMaxSpeed(short maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
