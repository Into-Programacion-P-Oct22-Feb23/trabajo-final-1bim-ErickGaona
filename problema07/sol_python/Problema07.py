contador=1

mensaje=""
suma=0
par=2

num1 = int(input("Ingrese un numero par: "))

while (contador <= num1):
    if(num1 %2==0):
        mensaje=mensaje+" "+str(par)  
        suma=suma +par
        contador = contador +1
        par = par +2
    else:
        print("Error este no es numero par")


print(mensaje)
print("La suma de estos numeros es : ", suma)