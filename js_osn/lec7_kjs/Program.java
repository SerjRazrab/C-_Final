package lec7_kjs;

import java.util.Arrays;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {

        Jobber j1 = new Jobber();
        j1.firstName = "Имя_1";
        j1.lastName = "Фамилия_1";
        j1.salary = 100;
        j1.id = 1000;

        Jobber j4 = new Jobber();
        j4.firstName = "Имя_1";
        j4.lastName = "Фамилия_1";
        j4.salary = 100;
        j4.id = 1000;

        Jobber j2 = new Jobber();
        j2.firstName = "Имя_1";
        j2.lastName = "Фамилия_1";
        j2.salary = 300;
        j2.id = 3000;

        Jobber j3 = new Jobber();
        j3.firstName = "Имя_1";
        j3.lastName = "Фамилия_1";
        j3.salary = 400;
        j3.id = 4000;

        System.out.println(j1.toString());
        System.out.println(j2);
        System.out.println(j3);

        System.out.println(j1==j4);
        System.out.println(j1.equals(j4));
        var jobbers = new HashSet<Jobber>(Arrays.asList(j1,j2,j3));
        System.out.println(jobbers.contains(j4));
        
    }
}
