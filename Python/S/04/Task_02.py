# 2. Найдите корни квадратного уравнения Ax² + Bx + C = 0 двумя способами:
# 1) с помощью математических формул нахождения корней квадратного уравнения
# 2) с помощью дополнительных библиотек Python

# D = b ** 2 - 4 * a * c
# x1 = (-b + sqrt(D)) // 2 * a
# x2 = (-b - sqrt(D)) // 2 * a

from math import sqrt

A = int(input('Число А: '))
B = int(input('Число B: '))
C = int(input('Число C: '))
D = B * B - 4 * A * C
if D > 0:
    x1 = ((-B) + D ** 0.5) / 2 * A
    x2 = ((-B) - sqrt(D)) / 2 * A
    print(round(x1, 3), round(x2, 3))
elif D == 0:
    x1 = (-B) / 2 * A
    print(x1)
else:
    print('корней нет')
