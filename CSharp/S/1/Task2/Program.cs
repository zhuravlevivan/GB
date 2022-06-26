// Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

Console.WriteLine("Введите первое число");
int a = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите второе число");
int b = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите третье число");
int c = Convert.ToInt32(Console.ReadLine());

if ((a > b) && (a > c))
Console.WriteLine($"Максимальное введенное число: {a}");
if ((a > b) && (a < c))
Console.WriteLine($"Максимальное введенное число: {c}");
if ((a < b) && (b < c))
Console.WriteLine($"Максимальное введенное число: {c}");
if ((a < b) && (b > c))
Console.WriteLine($"Максимальное введенное число: {b}");
