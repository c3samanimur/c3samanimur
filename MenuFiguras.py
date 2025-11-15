print("Inicio del bucle...\nBienvenido al programa: ")

while True:

	while True:
		num = int(input("\nMENU INTERACTIVO FIGURAS GEOMETRICAS\n1. Cuadrado relleno\n2. Cuadrado vacio\n3. Triangulo izquierda\n4. Triangulo derecha\n5. Triangulo invertido\n6. Pirámide\nESCRIBA AQUI SU RESPUESTA: "))
		if num < 1 or num > 6:
			print("Opción no encontrada en el menú. Repite")
			continue
		else:
			break

	if num == 1:
		print("Usted ha elegido la figura del cuadrado relleno")
		altura = int(input("Introduzca la altura deseada: "))

		for i in range(1, altura+1):
			for j in range(1, altura+1):
				print(" *", end="")
			print()

		print("Figura terminada")

	if num == 2:
		print("Usted ha elegido la figura del cuadrado vacio")
		altura = int(input("Introduzca la altura deseada: "))

		for i in range(1, altura+1):
			for j in range(1, altura+1):
				if i == 1 or i == altura or j == 1 or j == altura:
					print("*", end="")
				else:
					print("  ", end="")
			print()

		print("Figura terminada")

	if num == 3:
		print("Usted ha elegido la figura del triangulo alineado a la izquierda")
		altura = int(input("Introduzca la altura deseada: "))

		for i in range(1, altura+1):
			for j in range(1, i+1):
				print("*", end="")
			print()

		print("Figura terminada")

	if num == 4:
		print("Usted ha elegido la figura del triangulo alineado a la derecha")
		altura = int(input("Introduzca la altura deseada: "))

		for i in range(1, altura+1):
			for j in range(1, (altura - i)+1):
				print(" ", end="")
			for k in range(1, i+1):
				print("*", end="")

			print()

		print("Figura terminada")

	if num == 5:
		print("Usted ha elegido la figura del triangulo invertido")
		altura = int(input("Introduzca la altura deseada: "))

		for i in range(altura, 0, -1):
			for j in range(1, i+1):
				print("*", end="")
			print()

		print("Figura terminada")

	if num == 6:
		print("Usted ha elegido la figura de la piramide\n")
		altura = int(input("Introduzca la altura deseada: "))

		for i in range(1, altura+1):
			for j in range(1, (altura-i)+1):
				print(" ", end="")
			for k in range((i*2)-1):
				print("*", end="")
			print()

	letra = str(input("Si quieres seguir pulsa -- S\nSi quieres parar -- otra tecla\n"))

	if letra.lower() != "s":
		break


