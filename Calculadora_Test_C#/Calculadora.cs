public class Calculadora
{
    public int Adicao(int a1, int a2)
    {
        return a1 + a2;
    }

    public int Subtracao(int s1, int s2)
    {
        return s1 - s2;
    }

    public int Multiplicacao(int m1, int m2)
    {
        return m1 * m2;
    }

    public int Divisao(int d1, int d2)
    {
        if (d1 == 0)
        {
            return 0;
        }
        else if (d2 == 0)
        {
            throw new ArgumentException("Numero Negativo");
        }
        else
        {
            return d1 / d2;
        }
    }
    public int Fatorial(int f)
    {
        if (f < 0) 
        {
            throw new ArgumentException("Numero Negativo");
        }
        int result = 1;
        for (int i = 2; i <= f; i++) 
        {
            result *= i;
        }
        return result;
    }
    public double Potencia(double p1, double p2)
    {
        if (p1 == 0) {
            if (p2 == 0) {
                return 1;
            }
            else if (p2 < 0){
                throw new ArgumentException("Numero Negativo");
            }
            else {
                return 0;
            }
        }
        else {
            return Math.Pow(p1, p2);
        }
    }
}