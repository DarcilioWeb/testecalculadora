namespace Test_calculator;

public class UnitTest1
{

    [Theory]
    [InlineData(1, 2, 3)]
    [InlineData(-1, 1, 0)]
    [InlineData(5, 5, 10)]
    public void AdicaoVarios(int num1, int num2, int esperado)
    {
        var calculadora = new Calculadora();
        Assert.Equal(esperado, calculadora.Adicao(num1, num2));
    }

    [Theory]
    [InlineData(2, 1, 1)]
    [InlineData(1, -1, 2)]
    [InlineData(5, 5, 0)]
    public void SubtracaoVarios(int num1, int num2, int esperado)
    {
        var calculadora = new Calculadora();
        Assert.Equal(esperado, calculadora.Subtracao(num1, num2));
    }

    [Theory]
    [InlineData(1, 2, 2)]
    [InlineData(-1, 1, -1)]
    [InlineData(5, 5, 25)]
    public void MultiplicacaoVarios(int num1, int num2, int esperado)
    {
        var calculadora = new Calculadora();
        Assert.Equal(esperado, calculadora.Multiplicacao(num1, num2));
    }

    [Theory]
    [InlineData(999, 0, "Numero Negativo")]
    [InlineData(987, 0, "Numero Negativo")]

    public void DivisaoVariosError(int num1, int num2, String error)
    {
        var calculadora = new Calculadora();
        var exception = Assert.Throws<ArgumentException>(() => calculadora.Divisao(num1, num2));
        Assert.Equal(error, exception.Message);
    }

    [Theory]
    [InlineData(2, 1, 2)]
    [InlineData(0, -1, 0)]
    [InlineData(5, 5, 1)]
    public void DivisaoVarios(int num1, int num2, int esperado)
    {
        var calculadora = new Calculadora();
        Assert.Equal(esperado, calculadora.Divisao(num1, num2));
    }

    [Theory]
    [InlineData(-1, "Numero Negativo")]
    [InlineData(-8, "Numero Negativo")]
    [InlineData(-999, "Numero Negativo")]
    public void FatorialVariosError(int num, String error)
    {
        var calculadora = new Calculadora();
        var exception = Assert.Throws<ArgumentException>(() => calculadora.Fatorial(num));
        Assert.Equal(error, exception.Message);
    }

    [Theory]
    [InlineData(2, 2)]
    [InlineData(0, 1)]
    [InlineData(5, 120)]
    public void FatorialVarios(int num, int esperado)
    {
        var calculadora = new Calculadora();
        Assert.Equal(esperado, calculadora.Fatorial(num));
    }

    [Theory]
    [InlineData(0, -6, "Numero Negativo")]
    [InlineData(0, -5, "Numero Negativo")]

    public void PotenciaVariosError(int num1, int num2, String error)
    {
        var calculadora = new Calculadora();
        var exception = Assert.Throws<ArgumentException>(() => calculadora.Potencia(num1, num2));
        Assert.Equal(error, exception.Message);
    }

    [Theory]
    [InlineData(2, 10, 1024)]
    [InlineData(0, 0, 1)]
    [InlineData(0, 120, 0)]
    [InlineData(3, 3, 27)]
    [InlineData(2, 9, 512)]
    public void PotenciaVarios(int num1, int num2, int esperado)
    {
        var calculadora = new Calculadora();
        Assert.Equal(esperado, calculadora.Potencia(num1, num2));
    }
}