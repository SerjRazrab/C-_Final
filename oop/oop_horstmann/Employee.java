import java.time.LocalDate;

public class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;
    

    public Employee(int id,String n, double s,int day, int month, int year) {
        id = 0;
        name = n;
        salary = s;
        hireDay = LocalDate.of(day, month, year);
    }

    public int getId(){
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(){
        double raise = salary * 5/100;
        salary+=raise;
    }

    public boolean equals(Employee other){
        return name.equals(other.name);
    }


    public static void main(String[] args) {
        var e = new Employee(4,"Виталя Гладков",12400,17,12,1973);
        System.out.println(e.getName() + " " + e.getSalary());
    }


    

    

}
