package Encapsulation.CarSpeedManagement;

public class Car {
  
  private String brand;
  private String model;
  private int speed;
  private int maxSpeed;

  Car(String brand, String model, int maxSpeed){
    this.brand=brand;
    this.model=model;
    this.maxSpeed=maxSpeed;
    this.speed=0;
  }

  public String getBrand(){
    return brand;
  }
  public String getModel(){
    return model;
  }
  public int getMaxSpeed(){
    return maxSpeed;
  }
  public int getSpeed(){
    return speed;
  }

  public void accelerate(int value){
    if(speed + value <= maxSpeed){
      speed += value;
      System.out.println("Speed increase by: "+value+" km/hr");
    }
    else{
      speed = maxSpeed;
      System.out.println("Speed is maximum.");
    }
  }
  public void decelerate(int value){
    if (speed - value >= 0) {
      speed -= value;
      System.out.println("Decreased speed.");
      
    }
    else{
      speed=0;
      System.out.println("Car stoped");
    }
  }

}

class Test{
  public static void main(String[] args) {
    Car car= new Car("BMW", "XUV", 200);
    car.accelerate(100);
    car.decelerate(20);
    car.accelerate(50);
    car.decelerate(80);
  }
}