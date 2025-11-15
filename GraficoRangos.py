numeros = [3, 6, 8, 9, 11, -12, -7, 4, 0, -1, -6, 10, -20]
espacios = 10
texto = ""



for i in numeros:
	texto += str(i)
	if i < -9 or i > 9:
		texto += " " * 2
		texto += "FUERA DE RANGO"
	else:
		if i < 0:
			texto += " " * (espacios - abs(i))
			texto += "*" * abs(i)
			texto += "|"
		elif i >= 0:
			texto += " " * espacios
			texto += "|"
			texto += "*" * abs(i)
			
	texto += "\n"

print(texto)


		


		
	