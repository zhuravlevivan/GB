# 1.Хакер Василий получил доступ к классному журналу
# и хочет заменить все свои минимальные оценки на максимальные.
# Напишите программу, которая заменяет оценки Василия,
# но наоборот: все максимальные – на минимальные.
# Input: 5 -> 1 3 3 3 4

# Output: 1 3 3 3 1

n = int(input('Введите количество оценок: '))
s = []
for i in range(n):
    s.append(int(input()))
    if s[i] > 3:
        s[i] = 1

print(*s)
