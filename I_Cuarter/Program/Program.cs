// Задача: Написать программу, которая из имеющегося массива строк формирует массив из строк,
// длина которых меньше либо равна 3 символа.
// Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма.
// При решении не рекомендуется пользоваться коллекциями, лучше обойтись исключительно массивами.

// Примеры:

// ["hello", "2", "world", ":-)"] -> ["2", ":-)"]
// ["1234", "1567", "-2", "computer science"] -> ["-2"]
// ["Russia", "Denmark", "Kazan"] -> []

namespace Control
{
    class Program
    {
        public static void Main()
        {
            Console.WriteLine("Задайте размер массива: ");
            int n = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("\nВведите массив данных: ");
            string[] strArray = new string[n];

            // Заполняем массив
            for (int i = 0; i < n; i++)
            {
                strArray[i] = Console.ReadLine();
            }
            // Печатаем оригинальный массив
            PrintArray(strArray);

            // Печатаем итоговый массив
            PrintShortedArray(strArray);
        }

        public static void PrintArray(string[] someArray)
        {
            Console.WriteLine("Введенный массив: [ '" + string.Join("', '", someArray) + "' ]");
        }

        public static void PrintShortedArray(string[] someArray)
        {
            Console.Write("Итоговый массив: [ ");
            for (int i = 0; i < someArray.Length; i++)
            {
                if (someArray[i].Length <= 3)
                {
                    Console.Write($"'{someArray[i]}' ");
                }
            }
            Console.Write("]\n");
        }
    }
}
