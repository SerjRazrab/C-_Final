﻿// 1. Напишите программу, которая будет принимать на вход число
//    и возвращать сумму его цифр. Использовать рекурсию.

int rec(int a)
{
    if(a==0)
    {
    return 0;
    }
    return rec(a/10)+a%10;
}
int result = rec(123);

Console.WriteLine(result);