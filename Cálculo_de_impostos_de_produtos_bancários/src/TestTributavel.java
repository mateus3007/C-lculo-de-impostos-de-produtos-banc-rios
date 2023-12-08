public class TestTributavel {
    public static void main(String[] args) {
        // Criando objetos das classes
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        ContaCorrente contaCorrente = new ContaCorrente(2000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        // Calculando e exibindo tributos
        System.out.println("Tributos da Conta Corrente: R$" + contaCorrente.calculaTributos());
        System.out.println("Tributos do Seguro de Vida: R$" + seguroDeVida.calculaTributos());

    }
}
