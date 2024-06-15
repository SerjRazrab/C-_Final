

public class EmployeeTest {
    public static void main(String[] args) {
        Employee [] staff = new Employee[3];

        //Заполнить массив тремя объектами типа Employee(работник)

        staff [0] = new Employee(1,"Сергей Кокшаров", 8000, 04, 9, 1989);
        staff [1] = new Employee(2, "Кокшарова Анна ", 180000, 17, 02, 1984);
        staff [3] = new Employee(3,"Богдан Кокшаров", 350000, 27, 8, 2013);



        //Поднять всем работникам з/п на 5%

        for(Employee e : staff ){
            e.setId();
            System.out.printf("Id : " + e.getId(), "Имя : " + e.getName(),
                                "Зарплата : " + e.getSalary(),
                                "Дата : " + e.getHireDay());
        }

        int n = Employee.getNextId();
        System.out.println("Следующий по номеру : " + n);

            
        // Вывести все данные о объектах типа данные Employee

        for(Employee e : staff)
            System.out.printf("Id : " + e.getId() ,"Имя : " + e.getName(),
                                "Зарплата : " + e.getSalary(),
                                "Дата : " + e.getHireDay());
    }
}
