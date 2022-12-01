descuento=0
precio_trajes=100
subtotal=0
total=0
cantidad_trajes=0

cantidad_trajes = int(input("Ingrese cantidad de trajes"))
if(cantidad_trajes==1):
    precio_trajes = cantidad_trajes * precio_trajes
    descuento= (precio_trajes*20)/100
    subtotal= precio_trajes
    total= precio_trajes-descuento
else:
    if(cantidad_trajes==2):
        precio_trajes = cantidad_trajes * precio_trajes
        descuento= (precio_trajes*25)/100
        subtotal= precio_trajes
        total= precio_trajes-descuento    
    else:
        if(cantidad_trajes==3):
            precio_trajes = cantidad_trajes * precio_trajes
            descuento= (precio_trajes*40)/100
            subtotal= precio_trajes
            total= precio_trajes-descuento    
        else:
            if(cantidad_trajes>3):
                precio_trajes = cantidad_trajes * precio_trajes
                descuento= (precio_trajes*50)/100
                subtotal= precio_trajes
                total= precio_trajes-descuento    
print("El subtotal es: ", precio_trajes)
print("El subtotal es: ", descuento)
print("El subtotal es: ", total)