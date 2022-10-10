Python 3.10.7 (tags/v3.10.7:6cc6b13, Sep  5 2022, 14:08:36) [MSC v.1933 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.

>>>
 peso = input('¿Cuál es tu peso en kg?')
¿Cuál es tu peso en kg?55

altura = input('¿Cuál es tu altura en metros?')
¿Cuál es tu altura en metros?1.62

peso = int(peso)
altura = float(altura)
altura_calculo = altura ** 2
imc_decimales = peso // altura_calculo
imc = round(imc_decimales)   
print(f'Tu índice de masa corporal es {imc}')
Tu índice de masa corporal es 20
