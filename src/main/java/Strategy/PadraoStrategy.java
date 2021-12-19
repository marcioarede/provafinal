package Strategy;

public class PadraoStrategy {
    private CalculadoraIF strategy;

    public PadraoStrategy(CalculadoraIF calculadora){
        this.strategy = calculadora;
    }
    public int executaStrategy(int num1,int num2){
        return strategy.operacao(num1,num2);
    }

}
