//Задача2
//-назовем число интересным если его сумма цифр четная
//-создать двумерный массив ,состоящий из целых чисел.Вывести на экран интересные элементы массива

int [,] GreateMatrix(int columsCount, int rowCount)
{
int[,] matrix = new int[columsCount,rowCount];
Random rnd = new Random();

for (int i = 0; i < matrix.GetLength(0); i++)
{
    for (int j = 0; j < matrix.GetLength(1); j++)
    {
        matrix[i, j] = rnd.Next(1, 1100);
    }
}
return matrix;
}

void ShowMatrix(int[,] matrix)
{
for (int i = 0; i < matrix.GetLength(0); i++)
{
    for (int j = 0; j < matrix.GetLength(1); j++)
    {
        Console.Write($"{matrix[i, j]} ");
    }
    Console.WriteLine();
}

}

int [,] matrix = GreateMatrix(3,4);
ShowMatrix(matrix);

foreach (int e in matrix)
{
    if (isInterestig(e) )
    {
        Console.WriteLine(e);
    }

}

bool isInterestig(int value)
{
    int sumOfDigits = GetSumOfDigits(value);
    if(sumOfDigits % 2 ==0)
    {
        return true;
    }
        return false;
}

int GetSumOfDigits(int value)
{
    int sum = 0;
    while (value>0)
    {
        sum = sum + value % 10;
        value = value / 10;
    }
    return sum;
}