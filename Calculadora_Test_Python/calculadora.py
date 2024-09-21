def adicao (a1, a2):
    return a1 + a2

def subtracao (s1, s2):
    return s1 - s2
    
def divisao (d1, d2):
    if d1 == 0:
        return 0
    elif d2 == 0:
       raise ZeroDivisionError ("error")
    else:
         return d1 / d2
     
def multiplicacao (m1, m2):
    return m1 * m2

def fatorial(f):
    if f == 0:
        return 1
    else:
        return f * fatorial(f - 1)

def potencia(p1, p2):
    if p1 == 0:
        if p2 == 0:
            return 1
        elif p2 < 0:
            raise ZeroDivisionError ("error")
        else:
            return 0
    else:
        return p1 ** p2