using System;

public class Answer {
    static void CompareNumbers(int firstNumber, int secondNumber, int treenumber)
    {
    // Введите свое решение ниже
    if ( firstNumber >  secondNumber)
    {
        Console.WriteLine( firstNumber);
    }
    else if (treenumber > firstNumber)
    {
        Console.WriteLine(treenumber);
    }
    else
    {
        Console.WriteLine(secondNumber);
    }
    Console.WriteLine("Very Beautifull");
    }


  // Не удаляйте и не меняйте метод Main! 
    static public void Main(string[] args) {
        int firstNumber, secondNumber, treenumber;

        if (args.Length >= 2) {
            firstNumber = int.Parse(args[0]);
            secondNumber = int.Parse(args[1]);
            treenumber = int.Parse(args[2]);
        } else {
           // Здесь вы можете поменять значения для отправки кода на Выполнение
            firstNumber = 7;
            secondNumber = 9;
            treenumber = 15;
        }

        // Не удаляйте строки ниже
        CompareNumbers(firstNumber, secondNumber, treenumber);
    }
}