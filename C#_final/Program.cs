using System;
class Program
{
    // // Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк, длина которых меньше, либо равна 3 символам.
    // Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма.
    // При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.
    private static void Main(string[] args)
    {
        string[] arr = new string[] { "Hello", "2", "world", ":-)", "123", "JBL" };
        string[] arr2 = new string[arr.Length];
        void Arrays(string[] arr, string[] arr2)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                int value = 0;
                if (arr[i].Length <= 2)
                {
                    arr2[i] = arr[i];
                    value++;
                }

            }

        }

    
    }
}




