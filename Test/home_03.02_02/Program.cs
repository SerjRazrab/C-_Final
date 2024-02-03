//Задача 2: Задайте строку, содержащую латинские буквы в обоих регистрах. 
// Сформируйте строку, в которой все заглавные буквы заменены на строчные.


class Program
{
    private static void Main()
    {
    
    string dino = "DinOsAur TiRex Is a MONster";
    string result = string.Empty;

        for(int i = 0; i < dino.Length;i++)
        
            if (char.IsUpper(dino[i]))
            result += char.ToLower(dino[i]);
            else
            result+= char.ToUpper(dino[i]);

            Console.WriteLine(result);
            Console.ReadKey( true );
    }

}

