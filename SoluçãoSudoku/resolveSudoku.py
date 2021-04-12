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
                        subLista['a'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 3 and c <= 5:
                        subLista['b'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 6:
                        subLista['c'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                if l > 2 and l <= 5:
                    if c >= 0 and c <= 2:
                        subLista['d'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 3 and c <= 5:
                        subLista['e'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 6:
                        subLista['f'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                if l > 5 and l <= 8:
                    if c >= 0 and c <= 2:
                        subLista['g'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 3 and c <= 5:
                        subLista['h'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
                    if c >= 6:
                        subLista['i'] = n
                        bloco.append(subLista.copy())
                        subLista.clear()
                        break
