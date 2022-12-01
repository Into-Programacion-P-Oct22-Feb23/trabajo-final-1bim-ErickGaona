bandera = True
dato1 = 0
mensaje=0
contador = 0
media = 0
opcion = ""
while bandera:
    dato1 = int(input("ingrese el dato a calcular:"))
    mensaje = mensaje + dato1
    opcion = input("ingrese s para salir\n-->")
    contador = contador + 1
    if opcion == "s":
        bandera = False
media = mensaje/contador
print("La media es de :",media)