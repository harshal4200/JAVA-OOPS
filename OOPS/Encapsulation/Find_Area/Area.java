package Encapsulation.Find_Area;

public class Area {
    private int length;
    private int breadth;

    Area(int length,int breadth){
      this.length=length;
      this.breadth=breadth;
    }

    public void getArea(){
      int area=length*breadth;
      System.out.println("area of rectangle is: "+area);
    }

}
class Shape{
  public static void main(String[] args){
    Area area=new Area(10,20);

    area.getArea();
    
  }
}
