descuento=0

pago_cuota=0
extra=0
cantidad_trajes=0

nombre = (input("Ingrese nombre de empleado: "))

tipo = int(input("Ingrese tipo de empleado: "))

numero_horas = int(input("Ingrese numero de cuotas trabajadas: "))

pago_cuota = float(input("Ingrese el pago de cuotas se le paga por hora: "))

extra =numero_horas * pago_cuota


if(tipo==1):
    extra=extra *1.5
else:
    if(tipo==2):
        extra=extra *2
     
    else:
        if(tipo==3):
            extra=extra *2.5
        else:
            if(tipo==4):
                extra=extra *3

print("El sueldo por pagar es: ", extra)