#Desarrollar un programa en el lenguaje libre que pueda resolver el siguiente sistema de ecuaciones:
#Metodo de igualación
print("{ " + "2x - y = 5")
print("{ " + "3x + 4y = 11")
a1 = 2
b1 = -1
c1 = 5
a2 = 3
b2 = 4
c2 = 11
x = a1 - a2
y = b1 - b2
c = c1 - c2
print("Despeje: " + "x" + " = " + str(y) + "y" + str(c))
yy = (a1 * y) + b1
cc = -(a1 * c) + c1
y1 = cc / yy
print("Sustitución: " + str(a2) + "x + " + str(b2) + "(" + str(y1) + ")" + " = " + str(c2))
cc1 = c2 + b2 * (-y1)
x1 = cc1 / a2

print("x = " + str(x1))
print("y = " + str(y1))