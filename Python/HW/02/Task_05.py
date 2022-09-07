# Сбор черники

kust = []

n = int(input('Введите количество кустов: '))
for i in range(1, n+1):
    kust.append(i)

kust.sort(reverse=True)

summ = 0
for i in range(n-1):
    summ = summ + kust[i]
print(summ)
