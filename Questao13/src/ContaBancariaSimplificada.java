class ContaBancariaSimplificada {
    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEhEspecial;

    void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0.00;
        contaEhEspecial = false;
    }

    void deposita(double valor) {
        saldo += valor;
    }

    boolean retira(double valor) {
        if (!contaEhEspecial) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            } else {
                return false;
            }
        } else {
            saldo -= valor;
            return true;
        }
    }

    void mostraDados() {
        System.out.println("Nome do correntista: " + nomeDoCorrentista);
        System.out.println("Saldo: " + saldo);
        System.out.println(contaEhEspecial ? "Conta é especial." : "Conta é comum.");
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
