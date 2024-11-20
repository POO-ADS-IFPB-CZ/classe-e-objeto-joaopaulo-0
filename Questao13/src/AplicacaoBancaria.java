public class AplicacaoBancaria {
    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, double valor) {
        if (origem.retira(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();

        conta1.abreContaSimples("João Silva");
        conta2.abreContaSimples("Maria Oliveira");

        conta1.deposita(500.00);
        conta2.deposita(200.00);

        System.out.println("Antes da transferência:");
        conta1.mostraDados();
        conta2.mostraDados();

        System.out.println("\nTentando transferir R$ 300,00 de João para Maria...");
        boolean sucesso = transfere(conta1, conta2, 300.00);

        if (sucesso) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência falhou! Saldo insuficiente.");
        }

        System.out.println("\nDepois da transferência:");
        conta1.mostraDados();
        conta2.mostraDados();
    }
}