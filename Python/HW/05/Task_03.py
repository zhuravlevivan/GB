# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.

def rle_func(s):
    rle = []
    count = 1
    for i in range(len(s) - 1):
        if i <= len(s):
            if s[i] == s[i + 1]:
                count += 1
            else:
                a = s[i]
                rle.append(f'{count}:{s[i]}')
                count = 1
    rle.append(f'{count}:{s[i]}')
    return (rle)


result = rle_func(input('Введите строку: '))
print(*result)
