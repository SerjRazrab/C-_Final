class Program
{

    /*static void Main(string[] args)
    {
        static void testing(string[] args)
        {
            string name;
            name = "Вася"; //присвоили значение
            Console.WriteLine(name);
            name = "Иван"; //изменили значение

            Console.WriteLine("Введите число :");
            string i = Console.ReadLine()!;
            Console.WriteLine($"Вы ввели число {i}");

        }
        testing(args);

        static void test1(string[] args)
        {
            Console.WriteLine("Введите ответ на вопрос №1");
            Console.ReadLine();
            //что-то делаем с ответом пользователя
            Console.WriteLine("Введите ответ на вопрос №2");
            Console.ReadLine();
            //что-то делаем с ответом пользователя
            Console.WriteLine("Введите ответ на вопрос №3");
            Console.ReadLine();
            _ = Console.ReadLine(); //задали пустую переменную для ожидания нажатия кнопки для выхода с консоли
        }
        
        static void test1(string[] args)
        {
            Console.WriteLine("Вывод элементов массива :");
            int[] array = new int[7] {0,1,2,3,4,5,6};
            foreach(int i in array)
            Console.Write(array[i]+" ");    
          
        }
        test1(args);
        
        static void MySum(string[] args)
        {
            int a = -1;
            int b = 2;
            bool left = (a < 0) & (a > -10); //true - если число a входит в диапазон
            bool right = (b > 1) & (b < 10); //true - если число b входит в диапазон
            if (left ^ right)
            {
                Console.WriteLine("Условие соблюдается - одно из чисел не входит в заданный диапазон");
            }
            else 
            {
                Console.WriteLine("Ошибка - оба числа входят в свои диапазоны");
            }



        }
        MySum(args);
        

        static void Main(string[] args)
        {
            Console.WriteLine("Введите целое число от 1 до 7:");
            char i = char.Parse(Console.ReadLine()!);
            string dayOfWeek = i switch
            {
                'a' => "Понедельник",
                'b' => "Вторник",
                'c' => "Среда",
                'd'=> "Четверг",
                'e' => "Пятница",
                'f' => "Суббота",
                'j' => "Воскресенье",
                _ => "Что ты наделал?!",
            };
            Console.WriteLine(dayOfWeek);
            _ = Console.ReadLine();
        }
        Main(args);
    }
   
        static void TernOper(string[] args)
        {
            Console.WriteLine("Введите число от 0 до 10:");
            int i = int.Parse(Console.ReadLine()!);
            //используем тернарную операцию 
            Console.WriteLine((i % 2 == 0) ? $"{i} - четное число" : $"{i} - нечетное число");
            _ = Console.ReadLine();
        }
        TernOper(args);
    }
     

    static void EvenNum(string[] args)
    {
        Console.WriteLine("Введите целое число от 0 до 10:");
        if (int.TryParse(Console.ReadLine(), out int i))
        {
            if (i >= 0 && i <= 10)
            {
                if (i % 2 == 0)
                    Console.WriteLine($"{i} - четное число");
                else
                    Console.WriteLine($"{i} - нечетное число");
            }
            else
                Console.WriteLine("Введенное число не входит в диапазон от 0 до 10");
        }
        else
            Console.WriteLine("Введено не число или число с плавающей запятой");
        _ = Console.ReadLine();
    }
    EvenNum(args);

}


int[] array = new int[10]{0,1,2,3,4,5,6,7,8,9};
foreach (int i in array)
{
    Console.Write(array[i] + " ");
}



int[] myArr = new int[11] {1,4,24,3,7,88,20,22,15,16,88};
for(int i = 0; i < myArr.Length; i++)
    if (i * 2 < myArr.Length)
    Console.WriteLine($"Счетчик числа: {i}, Читаем элемент с индексом {i * 2} значение {myArr[i*2]}");

   
    }
    

    int[,] array = new int[5, 4] { { 0, 1, 3 , 4}, 
                                   { 2, 3, 15, 8 }, 
                                   { 4, 5, 28, 32 }, 
                                   { 6, 7, 9, 27 }, 
                                   { 8, 9, 11, 34 } 
                                 };

        int rank = array.Rank - 1;
        int maxIndex = array.GetUpperBound(0) + 1;
        for (int i = 0; i < maxIndex; i++)
            Console.Write("{0} ", array[i, array.GetUpperBound(rank)]);
    }
    
    }
}
*/
static void Main(string[] args)
{
            int min = int.MaxValue;
            int num;
            do
            {
                Console.Write("Введите целое число: ");
                num = Convert.ToInt32(Console.ReadLine());
                if ((num<min) && (num != 0))
                {
                   min=num;
                }
            }
            while (num != 0);
            Console.WriteLine($"Минимальное значение {min}");
        
   
}
}

