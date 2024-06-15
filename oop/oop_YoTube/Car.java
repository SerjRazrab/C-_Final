package oop_YoTube;

public class Car {
    private String mark;
    private String model;
    private String color;
    private String form;
    private double vEngine;
    private double fuelConsumption;
    private String id;
    private double fuelInTank;

    Car(){}

    Car(String id,String mark,String model,String color,String form,double vEngine, double fuelConsumption,double fuelInTank){
        this.id=id;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.form = form;
        this.vEngine = vEngine;
        this.fuelConsumption = fuelConsumption;
        this.fuelInTank = fuelInTank;
    }

    
    public void fillTank(int fuelV){
        fuelInTank+=fuelV;
    }

    public void drive(double distance){
        fuelInTank-=distance / 100 * fuelConsumption;
    }

    public double fuelInTank(int fillTank){
        return fuelInTank+=fillTank ;
    }

    public String color(String color){
        color+="Красный";
        return color;
    }

    public void setColor(String color){
        color = "Красный";
        
    }



    public String getMark(){
        return mark;
    }

    public String getModel(){
        return model;
    }

    public int getId(int id){
        
        return id;
    }

    public String getForm(){
        return form;
    }








    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("id :" + id + "\n");
        sb.append("Марка : " + mark + "\n");
        sb.append("Модель : " + model + "\n");
        sb.append("Форма : " + form + "\n");
        sb.append("Цвет : " + color(" ") + "\n");
        sb.append("Объем двигателя : " + vEngine + "\n");
        sb.append("Расход топлива : " + fuelConsumption + "\n");
        sb.append("Топливный бак : " + fuelInTank);

        return sb.toString();

    }
}
