package Entities;

// Classe que representa um funcionário terceirizado
// Herda de Funcionario e adiciona custo adicional
public class FuncionarioTercerizado extends Funcionario {//fazendo extensão  da classe Funcionario
    private double custoAdicional;

    // Construtor recebe dados do funcionário + custo adicional
    public FuncionarioTercerizado(String nome, int horas, double valorPorHora, double custoAdicional) {
        super(nome, horas, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    // Sobrescreve o método pagamento para incluir o custo adicional
    @Override
    public double pagamento() {
        return super.pagamento() + custoAdicional * 1.1;
    }
}
