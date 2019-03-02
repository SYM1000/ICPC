def sol(seq):
    freq = {}
    fmax = 0 //Frecuencia maxima

    for x in seq:
        if k in freq:
            freq[k] += 1

            if freq[k] >= fmax:
                fmax = freq[k]
        else:
            freq[k] = 1

            if freq[k] >= fmax:
                fmax = freq[k]


    modas = []
    for k in freq:
        if freq[k] == fmax:
            modas.append(k)
    
    modas.sort()
    modaS = " ".join(str(e) for e in modas)
    return modas #Lista de numeros

N = int(input())
for i in range(N):
    seq = input()
    if (seq[-1] == " "):
        seq.pop()
    seq = seq.split()
    seq = list(map(int,seq))