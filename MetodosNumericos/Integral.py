#Desarrollar un programa en el lenguaje libre que pueda resolver la siguiente integral:
import math
print("∫3xcosx dx")
a = 3
x = 1
integral = x * math.cos(x)
print(str(a) + str(integral))
f = x
gPrim = math.cos(x)
fPrim = 1
g = math.sin(x)
print("xsen(x)-∫sen(x) dx")
integral = math.cos(x)
print(str(a * (x * math.sin(x))) + str(a * (x * math.cos(x))))