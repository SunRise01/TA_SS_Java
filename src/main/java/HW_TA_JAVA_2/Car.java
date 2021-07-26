package HW_TA_JAVA_2;

public class Car implements Alarm, Vehicle{
    int speed=0;
    String brand;
    String model;
    boolean alarm;

    @Override
    public void turnAlarmOff() {
        System.out.println("Alarm Is Off");
        alarm=false;
    }

    @Override
    public void turnAlarmOn() {
        System.out.println("Alarm Is ON");
        alarm=true;
    }

    @Override
    public void speedUp(int speed) {
        this.speed+=speed;
    }

    @Override
    public void speedDown(int speed) {
        this.speed+=speed;
    }
    public int getSpeed(){
        return speed;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }
}
