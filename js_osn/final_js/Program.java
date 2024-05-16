package final_js;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Formatter;
import java.io.*;
import java.io.IOException;
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут 
// повторяющиеся имена с разными телефонами, их необходимо считать, 
// как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class Program {
    public static void main(String[] args) {
        Map<String, String> phoneMap = new HashMap<>();
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);// Создание метода ввода Сканнер

        while (flag) {
            System.out.println("Что Вы хотите сделать? : ");
            String action = scanner.nextLine();

            if (action.equals("1")) {
                System.out.println("Укажите имя контакта : ");
                String name = scanner.nextLine();// Добавление данных
                System.out.println("Укажите номер телефона : ");
                String number = scanner.nextLine();
                phoneMap.put(name,number);
                if(){
                    System.out.println("Такой контакт уже существует!");
                    continue;
                }
                
                // Блок поиска
            } else if (action.equals("2")) {
                System.out.println("Укажите имя контакта : ");
                String search = scanner.nextLine();
                System.out.println(phoneMap.getOrDefault(search, "Контакт не найден"));
            } else if (action.equals("3")) {
                System.out.println("Укажите имя контакта : ");
                String delete = scanner.nextLine();
                System.out.println(phoneMap.remove(delete, "Контакт удален" + true));
            } else if (action.equals("4")) {
                flag = false;
                System.out.println("Вы вышли");
                

            } else {
                break;

            }
        
        }
        
    }
}
