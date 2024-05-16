import java.io.IOException;
import java.util.Scanner;

public class program {
    static public void main(String[] args){
        System.out.println("bye world");
        short age = 10;
        int salary = 123456;
        System.out.println("Возраст : " + age);
        System.out.println("Зарплата : " + salary);

        float f = 123.45f;
        double d = 123.45;
        System.out.println(f);

        char c = 'c';
        System.out.println(c);

        var a = 123;
        var b = 123.456;
        System.out.println(getType(a));
        System.out.println(getType(b));

        // Побитовый сдвиг
        int r = 8;
        System.out.println(r>>1);

        int i = 5;
        int j = 2;
        System.out.println(i | j);

        // Здесь мы инициализировали строковую переменную со значением
        // в переменной t выполняем проверку,длинна строки 's' больше или равна
        //длинне строки и (&&) содержится ли символ 1 в строке под индексом 6
        String s = "peo2le1";
        boolean t = s.length()>= 7 && s.charAt(6) == '1' && s.charAt(3) =='2';
        System.out.println(t);

        //Массивы.Одномерные
        int[] arr = new int[10];
        System.out.println(arr.length);

        arr = new int[]{1,2,3,4,5,6};
        System.out.println(arr.length);

        // Массивы.Многомерные
        int[][] arr1 = new int [3][5];
        for (int[] line: arr1) {
            for(int item:line) {
                System.out.printf("&d",item);
            }
            System.out.println();
        }

        //Неявное преобразование
        int q = 123; double y = q;
        System.out.println(q);
        System.out.println(y);
        d=3.1343; i = (int)d;
        System.out.println(d);
        System.out.println(i);

        // Получение данных из терминала
        //import java.util.Scanner; 

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
        
        //Форматированный вывод
        int a = 1 ,b = 2;
        int c = a + b;
        String res = a + "+" + b + "=" + c;
        System.out.println(res);

        //подстановка данных в значения %d
        {
    
        int a = 1 ,b = 2;
        int c = a + b;
        String res = String.format("%d" + %d = %d\n",a,b,c)
        System.out.printf("%d" + %d = %d\n",a,b,c);
        System.out.println(res);
        }

        //Функции и методы
        class Program {
            static void sayHi(){
                System.out.println("hi!");
            }
            static in sum(int a,int b){
                return a+b;
            }
            static double factor(int n){
                if(n==1  return 1);
                return n*factor(n-1);
            }

            //Тернарный оператор
            {
                int a = 1;
                int b = 2;
                int min = a < b ? a : b;
                System.out.println(min);
            }

            //Оператор выбора  Switch
            //import java.util.Scanner
            int mounth = value;
            String text = " ";
            switch(mounth){
                case1 :
                text = "Autumn";
                break;
                default:
                text = "mistake";
                break; 
            }
            System.out.println(text);
            iScanner.close();

            //Циклы :
            // Цикл While :
            int value = 321;
            int count = 0;

            while (value !=0) {
                value /= 10;
                count ++;
            }
            System.out.println(count);
            // Цикл do While:
            do{
                value /= 10;
                count ++;
            }
            while (value !=0);
            System.out.println(count);

            //Проверка на четность
            for (int i = 0; i < 10; i++){
                if(i%2==0){
                    continue;   
                }
            }
            System.out.println(i);

            int [] arr = new int [] {1,2,3,4,5,66,77};
            for (int item : arr){
                System.out.println(item);
            }

            //Работа с файлами
            import java.io.FileWriter;
            import java.io.IOException;
            public class Program{
                public static void main (String [] args){
                    try(FileWriter fw = new FileWriter("file.txt", false)){
                        fw.write("line 1");
                        fw.append('\n');
                        fw.append('2');
                        fw.append('\n');
                        fw.write("line 3");
                        fw.flush();
                    } catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }




        }
        


        
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }

}