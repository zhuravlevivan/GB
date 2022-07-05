
// Задача 29: Напишите программу, которая задаёт случайный массив
// случайного размера элементов и выводит на экран массив квадратов этих чисел.
// 1, 2, 5, 7, 19 -> [2, 4, 25, 49, 361]
// 6, 1, 33 -> [36, 1, 1089]
namespace DZ_29
{
    class Program
    {
        // Создаем функцию заполнения массива случайными числами (от 1 до 20).
        // И выводим его в консоль для наглядности
        public static void FillArray(int[] array)
        {
            Console.Write("Массив:   ");
            for (int i = 0; i < array.Length; i++)
            {
                array[i] = new Random().Next(1, 21);
                Console.Write($"{array[i]} ");
            }
        }
        // Создаем функцию возведения в квадрат значений массива поиндексно.
        // Выводим полученные значения в консоль 
        public static void GetSquares(int[] array_n)
        {                
            Console.WriteLine(); // Перенос строки
            Console.Write("Квадраты: ");
            for (int i = 0; i < array_n.Length; i++)
            {
                array_n[i] = Convert.ToInt32(Math.Pow(array_n[i], 2));
                Console.Write($"{array_n[i]} ");
            }
        }
        // Создаем массив случайного размера (от 1 до 15)
        // Вызываем по очереди созданные ранее функции. В параметрах указываем созданный массив
        public static void Main()
        {
            int[] numbers = new int[new Random().Next(1, 15)];
                        
            FillArray(numbers);
            GetSquares(numbers);
            Console.WriteLine();
        }
        
    }
}
