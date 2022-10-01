def transformation(x): return x


values = [2, 3, 4, 5, 6, 7]

transformed_values = list(map(transformation, values))

if values == transformed_values:
    print('ok')
else:
    print('fail')
