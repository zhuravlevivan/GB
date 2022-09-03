# Напишите программу для. проверки истинности утверждения
#  ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z
# для всех значений предикат.

x = int(input('Input x'))
y = int(input('Input y'))
z = int(input('Input z'))

pr1 = not (x + y + z)
pr2 = (not x) * (not y) * (not z)
pr = pr1 == pr2
