using System;

class Example
{
    static void Main()
    {
        string str = "Простая строка dfgfdgdg";

        // Получить длину строки и 6й символ в строке используя индексатор
        Console.WriteLine("Длина строки - {0}, 6й символ - '{1}'",
            str.Length, str[19]);
    }
}