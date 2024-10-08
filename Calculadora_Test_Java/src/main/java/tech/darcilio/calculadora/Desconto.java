package tech.darcilio.calculadora;
public class Desconto {
    public double calculaDesconto(double preco, double percentualDesconto) {
        if (preco < 0 || percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Preço e percentual de desconto devem ser válidos.");
        }
        return preco - (preco * percentualDesconto / 100);
    }
}
