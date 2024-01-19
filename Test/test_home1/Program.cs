//Задайте массив заполненный случайными трёхзначными числами. 
//Напишите программу, которая покажет количество чётных чисел в массиве.

using System;
class Program
{
    
    static void Main()
    {   
        Console.Clear();
        Console.Write("Введите количество элементов массива:");
        int a = Convert.ToInt32(Console.ReadLine());
        int[] RandomArr = new int[a]; 
                            

        for (int i = 0; i < a; i++)
        {
            RandomArr[i] = new Random().Next(99,999);
            {
                Console.Write(RandomArr[i] + " "); // Вывод сгенерированного числа
            }
        }
            int kol(int[] RandomArr)
            {
                int kol = 0;// Счетчик четных чисел// Заполнение массива случайными трехзначными числами
                for (int i = 0; i < RandomArr.Length; i++)
                {
                    if (RandomArr[i] % 2 == 0) // Проверка на четность и увеличение счетчика 
                    kol = kol + 1;
                }

                return kol;  
            
            }
            Console.WriteLine($"\nКол-во четных чисел : {kol(RandomArr)}"!);
        } 
}
