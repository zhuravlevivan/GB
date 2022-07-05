
// Задача 29: Напишите программу, которая задаёт случайный массив
// случайного размера элементов и выводит на экран массив квадратов этих чисел.
// 1, 2, 5, 7, 19 -> [2, 4, 25, 49, 361]
// 6, 1, 33 -> [36, 1, 1089]
namespace DZ_29
{
    class Program
    {

        public static void FillArray(int[] array)
        {
            Console.Write("Массив ");
            for (int i = 0; i < array.Length; i++)
            {
                array[i] = new Random().Next(1, 20);
                Console.Write($"{array[i]} ");
            }
            
        }
        public static void Main()
        {

            int a = new Random().Next(1, 50);
            int[] numbers = new int[a];
            int[] squares = new int[a];
            
            FillArray(numbers);
            
            
            
            Console.WriteLine();
            Console.Write("Квадраты ");
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = Convert.ToInt32(Math.Pow(numbers[i], 2));
                squares[i] = numbers[i];

                Console.Write($"{squares[i]} ");

            }

        }
    
    }
}