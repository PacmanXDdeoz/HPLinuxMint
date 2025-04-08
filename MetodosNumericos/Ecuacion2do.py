#Desarrollar un programa en el lenguaje libre que pueda resolver la siguiente ecuación de 2do grado:
import math
print("8x^2 + 5x - 2")
a = 8
b = 5
c = -2
raiz = math.sqrt((b*b)-(4*a*c))
numeradorPos = -b + raiz
numeradorNeg = -b - raiz
denominador = 2*a
x1 = numeradorPos / denominador
print("x1 = " + str(x1))
x2 = numeradorNeg / denominador
print("x2 = " + str(x2))