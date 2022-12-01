x = int(input("Ingrese el valor de X:"))
y = int(input("Ingrese el valor de Y:"))

if (x > 0) & (y > 0):
    print("Este es el primer cuadrante")
else:
    if (x < 0) & (y > 0):
        print("Este es el segundo cuadrante")
    else: 
        if(x < 0) & (y > 0):
            print("Este es el tercer cuadrante")
        else:    
            if (x > 0) & (y < 0):
                print("Este es el cuarto cuadrante")
