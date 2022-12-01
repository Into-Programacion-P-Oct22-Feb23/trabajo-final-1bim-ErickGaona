contador =1
num =12
cadena="S1= "

print("ingrese el numero de terminos  que quiere imprimir")
k = int(input())

while contador<=k:
    num2= num - contador
    cadena = cadena +str(num)+"-"+str(num2)+"+"
    num = num +12
    contador= contador +1

    print (cadena)