package prakt2;


public class Program {
    public static void main(String[] args) {
    //Дано четное число N (>0) и символы c1 и c2.
        //Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        String c1 = "C1";
        String c2 = "C2";
        int N = 6;

        System.out.println(reternString(N, c1, c2));
    
    }

    public static String reternString(int N, String c1, String c2){
        StringBuilder stringBuilder = new StringBuilder(c1);
        for (int i = 2; i <= N; i++) {
            if(i%2 == 0){
                stringBuilder.append(c2);
            }else {
                stringBuilder.append(c1);
            }
        }
        return stringBuilder.toString();}



// Задача номер 2
//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//a4b3cd2



//Задача 3.Напишите метод, который принимает на вход строку (String) и определяет является
//ли строка палиндромом (возвращает boolean значение).

public static boolean isPolindrom(String text) {
    System.out.printf("Input: %s", text);
    StringBuilder stringBuilder = new StringBuilder(text);
    return text.equalsIgnoreCase(stringBuilder.reverse().toString());}
    };







