package Entities;

/**
 * Classe que representa um funcionário genérico.
 * Contém nome, quantidade de horas trabalhadas e valor por hora.
 */
public class Funcionario {
    private String nome;
    private int horas;
    private double valorPorHora;

    // Construtor vazio
    public Funcionario() {
    }

    /**
     * Construtor com parâmetros
     * @param nome Nome do funcionário
     * @param horas Quantidade de horas trabalhadas
     * @param valorPorHora Valor pago por hora
     */
    public Funcionario(String nome, int horas, double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    /**
     * Calcula o pagamento do funcionário
     * @return Valor total a receber
     */
    public double pagamento() {
        return horas * valorPorHora;
    }
}


