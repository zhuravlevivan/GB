namespace GeekBrains
{
    class Program{
        public static void Main(string[] args)
        {
            // Вызов метода и получение результатов от метода
            int number = GetRandomNumber(10, 100);
            Console.WriteLine("Number: " + number);
            // Приведение number к строке
            string str = number.ToString(str[0].ToString());
            for (int i = 1; i < str.Length; i++)
            {
                if (result < Convert.ToInt32(str[i].ToString()))
                {
                    result = Convert.ToInt32(str[i].ToString());
                }
            }
            Console.WriteLine("Result: " + result);
        }

        public static int GetRandomNumber(int first, int second)
        {
            int number = new Random().Next(first, second);
            return number;
        }
    }
}
