package oop_YoTube;
public class Main{
    public static void main(String[] args) {
        Car myCar = new Car("#1","Ford","Focus","Красный","Хетчбек",2.0,14.0,0);
        
        // myCar.getId(1);
        // myCar.fuelInTank(20);
        myCar.fillTank(15);
        //myCar.color("Красный");
        
    

        System.out.println("Текущее количество топлива : " + myCar.fuelInTank(0));
        System.out.println(myCar.getInfo());
        System.out.println("----------------");
        System.out.println(myCar.getMark());
    }
}

