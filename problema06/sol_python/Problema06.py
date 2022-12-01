contador = 1
signo = "+"
mensaje=""
denominador = 2

while contador<=100:
    
    mensaje = mensaje + signo+" "+ "1/"+ str(denominador)+" "
    
    contador = contador + 1
    denominador=denominador+1
        
print("1. ",mensaje)