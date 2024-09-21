public class UnitTest2
{
    [Fact]
    public void Soma()
    {
        var calculadora = new Calculadora();
        Assert.Equal(10, calculadora.Adicao(5, 5));
    }

    [Fact]
    public void SomaZero()
    {
        var calculadora = new Calculadora();
        Assert.Equal(5, calculadora.Adicao(5, 0));
    }

    [Fact]
    public void SomaNegativo()
    {
        var calculadora = new Calculadora();
        Assert.Equal(2, calculadora.Adicao(5, -3));
    }
    
    [Fact]
    public void Subtracao()
    {
        var calculadora = new Calculadora();
        Assert.Equal(10, calculadora.Subtracao(15, 5));
    }

    [Fact]
    public void SubtracaoZero()
    {
        var calculadora = new Calculadora();
        Assert.Equal(5, calculadora.Subtracao(5, 0));
    }

    [Fact]
    public void SubtracaoNegativo()
    {
        var calculadora = new Calculadora();
        Assert.Equal(8, calculadora.Subtracao(5, -3));
    }

    [Fact]
    public void Multiplicacao()
    {
        var calculadora = new Calculadora();
        Assert.Equal(25, calculadora.Multiplicacao(5, 5));
    }

    [Fact]
    public void MultiplicacaoZero()
    {
        var calculadora = new Calculadora();
        Assert.Equal(0, calculadora.Multiplicacao(5, 0));
    }

    [Fact]
    public void MultiplicacaoNegativo()
    {
        var calculadora = new Calculadora();
        Assert.Equal(-15, calculadora.Multiplicacao(5, -3));
    }

    [Fact]
    public void DivisaoError()
    {
        var calculadora = new Calculadora();
        Assert.Throws<ArgumentException>(() => calculadora.Divisao(10, 0));
    }

    [Fact]
    public void DivisaoZero()
    {
        var calculadora = new Calculadora();
        Assert.Equal(0, calculadora.Divisao(0, 10));
    }

    [Fact]
    public void Divisao()
    {
        var calculadora = new Calculadora();
        Assert.Equal(2, calculadora.Divisao(6, 3));
    }

    [Fact]
    public void FatorialError()
    {
        var calculadora = new Calculadora();
        Assert.Throws<ArgumentException>(() => calculadora.Fatorial(-1));
    }

    [Fact]
    public void Fatorial()
    {
        var calculadora = new Calculadora();
        Assert.Equal(120, calculadora.Fatorial(5));
    }

    [Fact]
    public void PotenciaError()
    {
        var calculadora = new Calculadora();
        Assert.Throws<ArgumentException>(() => calculadora.Potencia(0, -1));
    }

    [Fact]
    public void PotenciaZero()
    {
        var calculadora = new Calculadora();
        Assert.Equal(1, calculadora.Potencia(0, 0));
        Assert.Equal(0, calculadora.Potencia(0, 1));
    }

    [Fact]
    public void Potencia()
    {
        var calculadora = new Calculadora();
        Assert.Equal(1024, calculadora.Potencia(2, 10));
    }
}