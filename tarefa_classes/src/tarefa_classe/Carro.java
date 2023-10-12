package tarefa_classe;
/**
 * Classe que representa um Carro.
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    /**
     * Construtor da classe Carro.
     * @param marca a marca do carro
     * @param modelo o modelo do carro
     * @param ano o ano de fabricação do carro
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método que retorna a marca do carro.
     * @return a marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que retorna o modelo do carro.
     * @return o modelo do carro
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método que retorna o ano de fabricação do carro.
     * @return o ano de fabricação do carro
     */
    public int getAno() {
        return ano;
    }

    /**
     * Método main para testar a classe Carro.
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2021);
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
    }
}