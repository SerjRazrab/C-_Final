//Задача 3: Задайте произвольную строку. 
// Выясните, является ли она палиндромом.
public class Task3
{
    public static void Main(string[] args)
    {
        // Входная строка для проверки
        string input = "Аргентина манит негра";
        // Вызов метода для проверки, является ли строка палиндромом
        bool isPalindrome = IsPalindrome(input);
        // Вывод результата
        Console.WriteLine(isPalindrome ? "Да" : "Нет");
    }
    // Метод для проверки, является ли строка палиндромом
    public static bool IsPalindrome(string str)
    {
        // Нормализация строки путем удаления не буквенно-цифровыхсимволов и приведения к нижнему регистру
        string normalized = new
        string(str.Where(char.IsLetterOrDigit).ToArray()).ToLower();
        // Сравнение строки с ее перевернутым вариантом
        return normalized.SequenceEqual(normalized.Reverse());
    }
}

