package prakt_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Formatter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Program {
    // public static void main(String[] args) {
    // Map<String,Integer> map = new HashMap<>();
    // map.put("Alice",20);// добавлдение по ключу
    // map.put("Bob",19);
    // map.put("Charlie",25);
    // System.out.println(map.get("Bob"));
    // int a = map.get("Bob"); // получение элемента по ключу
    // boolean bool = map.containsKey("Bob");
    // System.out.println("Присутствует ли Боб ? - " + bool);
    // map.remove("Alice");// удаление объекта по ключу
    // System.out.println(map);

    // for (Map.Entry<String,Integer>entry:map.entrySet()){
    // System.out.println(" name " + entry.getKey()+ " age is "
    // + entry.getValue());
    // }
    // System.out.println(map.getOrDefault("Bob", 42));

    // TreeMap<String, Integer> treeMap = new TreeMap<>();
    // //Comparator.reverseOrder());// в тримэп встроена,сортировка,
    // Comparator.reverseOrder - переворачивает значения
    // treeMap.put("Zoey",38);
    // treeMap.put("Peter",26);
    // treeMap.put("Alice",20);
    // System.out.println(treeMap);
    // }

    // public static void main(String[] args) {
    // Map<Integer,String> map2 = new HashMap<>();
    // map2.put(1234,"Петрович");
    // map2.put(1389,"Игнатюк");
    // map2.put(1898,"Леонтьев");
    // map2.put(1789,"Иванов");
    // map2.put(1987,"Иванов");
    // // System.out.println(map2.containsValue("Сергей Иванов"));
    // // System.out.println(map2.get(1789));
    // // boolean bool = map2.containsValue("Сергей Иванов");
    // // System.out.println("Присутствует ли Иванов ? - " + bool);

    // for (Map.Entry<Integer,String> entry:map2.entrySet()){
    // if (entry.getValue().equals("Иванов"))
    // System.out.println(entry.getKey() + " " + "Иванов");

    // Напишите программу которая считывает текст из файла и подсчитывает сколько
    // раз каждое слово встречаеься в тексте.Используйте HashMap для хранения слов и
    // их частоты.
    // public static void main(String[] args) {
    // Map<String,Integer> repeat = new HashMap<>();
    // try (BufferedReader br = new BufferedReader(new FileReader("List.txt"))) {
    // StringBuilder sb = new StringBuilder();
    // String line = br.readLine();
    // while (line != null) {
    // String[] words = line.split(" ");
    // for (String s : words ){
    // if(s!=null && !s.isEmpty()){

    // if(repeat.get(s)==null){
    // repeat.put(s,1);
    // }
    // }

    // else {
    // int count = repeat.get(s);
    // repeat.put(s,++count);}
    // }
    // }

    // Создайте программу для хранения реестра контактов. Используйте HashMap, где
    // ключами будут имена контактов, а значениями - их номера телефонов. Реализуйте
    // добавление новых контактов, поиск по имени и удаление контактов.
    public static void main(String[] args) {
        Map<String, String> phoneMap = new HashMap<>();
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);// Создание метода ввода Сканнер
        while(flag){
        System.out.println("Что Вы хотите сделать? : ");
        String action = scanner.nextLine();

        if (action.equals ("1")) {
            System.out.println("Укажите имя контакта : ");
            String name = scanner.nextLine();// Добавление данных
            System.out.println("Укажите номер телефона : ");
            String number = scanner.nextLine();
            phoneMap.put(name,number);
            //Блок поиска
        } else if (action.equals ("2")){
            System.out.println("Укажите имя контакта : ");
            String search = scanner.nextLine();
            System.out.println(phoneMap.getOrDefault(search,"Контакт не найден"));
        }else if (action.equals ("3")){
            System.out.println("Укажите имя контакта : ");
            String delete = scanner.nextLine();
            System.out.println(phoneMap.remove(delete,"Контакт удален" + true));
        } else if (action.equals("4")){
            flag = false;
            System.out.println("Вы вышли");
            
        }else{
            break;
            
        }
        
    }
    }
}
