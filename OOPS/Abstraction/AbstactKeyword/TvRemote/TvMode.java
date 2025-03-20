package Abstraction.AbstactKeyword.TvRemote;

abstract class TvMode {

  abstract void turnOn();
  abstract void turnOff();
  
}

class TvRemote extends TvMode{

  @Override
  void turnOn(){
    System.out.println("Tv is turn on.");
  }
  @Override
  void turnOff(){
    System.out.println("Tv is turn off.");
  }
}

class Main{
  public static void main(String[] args) {
    TvMode remote = new TvRemote();
    remote.turnOn();
    remote.turnOff();
      
    
  }
}
