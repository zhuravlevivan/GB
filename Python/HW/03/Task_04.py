# Напишите программу, которая будет
# преобразовывать десятичное число в двоичное.

# Пример:

# - 45 -> 101101
# - 3 -> 11
# - 2 -> 10

n = int(input('Введите десятичное число: '))
s = ""

while n > 0:
    y = str(n % 2)
    s = y + s
    n = int(n / 2)

print(f'Перевод в двоичную систему: {s}')
