contador=1
pies=0
pulgadas=0
yardas=0
rep=1
mensaje1=""
mensaje="Metros\tYardas\tPulgadas\tPies\n"



metros = int(input("Ingrese una cantidad en metros: "))

while (contador <= metros):
    pulgadas= rep * 39.37
    pies= rep * 3.28084
    yardas= rep*1.094
    mensaje=mensaje + str(rep)+"\t"+str(yardas)+"\t"+str(pulgadas)+"\t"+"\t"+str(pies)+"\n"
    contador = contador + 1
    rep=rep+1

print(mensaje,rep,yardas,pulgadas,pies)
