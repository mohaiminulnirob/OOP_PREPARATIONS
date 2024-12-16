package lab8.InterfaceDemo;

public class Truck implements Vehicle, advancedVehicle {
   public void run(){
      System.out.println("can run");
   }
   public void fly(){
      System.out.println("can not fly");
   }
   public void wheel(){
      System.out.println("six wheels");
   }
}
