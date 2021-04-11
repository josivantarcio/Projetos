from random import randint
celulas = []
numeros = []
subLista = {}
bloco = []
for l in range(9):
    for c in range(9):
        n = randint(0, 9)#int(input(f"Digite o valor [{l}][{c}] "))
        if n >= 0 and n < 10:
            while True:
                if l <= 2:
                    if c >= 0 and c <= 2:
                        subLista['A'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 3 and c <= 5:
                        subLista['B'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 6:
                        subLista['C'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                if l > 2 and l <= 5:
                    if c >= 0 and c <= 2:
                        subLista['D'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 3 and c <= 5:
                        subLista['E'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 6:
                        subLista['F'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                if l > 5 and l <= 8:
                    if c >= 0 and c <= 2:
                        subLista['G'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 3 and c <= 5:
                        subLista['H'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 6:
                        subLista['I'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
numeros.append(subLista)
for k, v in enumerate(bloco):
    print(f"{k} de {v}")