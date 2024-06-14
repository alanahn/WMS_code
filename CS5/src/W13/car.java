package W13;

public class car {
    private String model_name;
    private double length;
    private double weight;
    private double height;
    double engine_power;
    int speed = 0;

    public car(String model_name, double length, double weight, double height, double engine_power) {
        this.model_name = model_name;
        this.length = length;
        this.weight = weight;
        this.height = height;
        this.engine_power = engine_power;
    }

    public void acc() {
        this.speed += 1;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(double engine_power) {
        this.engine_power = engine_power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
}


