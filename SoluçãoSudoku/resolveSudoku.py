from random import randint
subLista = [[],[],[],[],[],[],[],[],[]]
bloco = [[],[],[]]


for l in range(9):
    for c in range(9):
        n = randint(0, 9)#int(input(f"Digite o valor [{l}][{c}] "))
        if n >= 0 and n < 10:
            
            if l <= 2:
                if c >= 0 and c <= 2:
                    subLista[0].append(n)
                if c >= 3 and c <= 5:
                    subLista[1].append(n)
                if c >= 6:
                    subLista[2].append(n)
            bloco[0].append(subLista[:])
            if l > 2 and l <= 5:
                if c >= 0 and c <= 2:
                    subLista[3].append(n)
                if c >= 3 and c <= 5:
                    subLista[4].append(n)
                if c >= 6:
                    subLista[5].append(n)
            bloco[1].append(subLista[:])    
            if l > 5 and l <= 8:
                if c >= 0 and c <= 2:
                    subLista[6].append(n)
                if c >= 3 and c <= 5:
                    subLista[7].append(n)
                if c >= 6:
                    subLista[8].append(n)
            bloco[2].append(subLista[:])
zero = bloco.count(0)
sub = 0
#while True:
#    if 0 not in bloco:
#        break
#    else:
for i in range(1,10):
    if i not in bloco[0][0][0]:
        print(f'{i} não está no Bloco')
        for l in range(9):
            for c in range(9):
                print(f'{i} está aqui dentro')
    else:
        print(f'{i} está no Bloco')
            
        
    

for i in range(len(subLista)):
    print(subLista[i])