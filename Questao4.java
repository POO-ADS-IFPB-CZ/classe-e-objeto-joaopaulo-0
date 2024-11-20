public class Questao4 {

    //Classe java do modelo ProdutoLampada

    private int id;
    private String marca;
    private float preco;
    private int potencia;
    private int tensao;
    private int vidaUtil;

    public Questao4(int id, String marca, float preco, int potencia, int tensao, int vidaUtil) {
        this.id = id;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.tensao = tensao;
        this.vidaUtil = vidaUtil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Tensão: " + tensao + "V");
        System.out.println("Vida útil: " + vidaUtil + " horas");
    }

    public static void main(String[] args) {
        Questao4 lampada = new Questao4(1, "Philips", 60, 60, 220, 10000);
        lampada.exibirInformacoes();
    }
}