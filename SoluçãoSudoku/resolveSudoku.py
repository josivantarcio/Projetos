from random import randint
celulas = []
numeros = []
subLista = {}
bloco = []
temp = []
for l in range(9):
    for c in range(9):
        
        n = randint(0, 9)#int(input(f"Digite o valor [{l}][{c}] "))
        if n >= 0 and n < 10:
            while True:
                if l <= 2:
                    if c >= 0 and c <= 2:
                        temp.append(n)
                        subLista['A'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                    if c >= 3 and c <= 5:
                        temp.append(n)
                        subLista['B'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                    if c >= 6:
                        temp.append(n)
                        subLista['C'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                if l > 2 and l <= 5:
                    if c >= 0 and c <= 2:
                        temp.append(n)
                        subLista['D'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                    if c >= 3 and c <= 5:
                        temp.append(n)
                        subLista['E'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                    if c >= 6:
                        temp.append(n)
                        subLista['F'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                if l > 5 and l <= 8:
                    if c >= 0 and c <= 2:
                        temp.append(n)
                        subLista['G'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                    if c >= 3 and c <= 5:
                        temp.append(n)
                        subLista['H'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
                    if c >= 6:
                        temp.append(n)
                        subLista['I'] = (temp[:])
                        bloco.append(subLista.copy())
                        subLista.clear()
                        temp.clear()
                        break
numeros.append(subLista)
for k, v in enumerate(bloco):
    print(f"{k} de {v}")