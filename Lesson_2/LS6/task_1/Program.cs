//задача 1. Создать двумерный массив с размером 3Х5,состоящий из целых чисел.
//вывестиего элементы на экран

//Этапы создания массива
// - указание типа данных
// - выделение памяти под элементы массива

//Добавить функцию к задаче.
//Функция GreateMatrix
//Что делает функция?
//Какие данные ей для этого нужны?
//Что будет результатом ее работы



int [,] GreateMatrix (int columsCount, int rowCount)
{
int[,] matrix = new int[columsCount,rowCount];

Random rnd = new Random();

for (int i = 0; i < matrix.GetLength(0); i++)
{
    for (int j = 0; j < matrix.GetLength(1); j++)
    {
        matrix[i, j] = rnd.Next(1, 11);
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

int[,] matrix = GreateMatrix(3, 5);
ShowMatrix(matrix);
