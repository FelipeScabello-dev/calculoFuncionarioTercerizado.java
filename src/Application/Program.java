package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.FuncionarioTercerizado;

public class Program {
    public static void main(String[] args) {
        // Scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Lista para armazenar todos os funcionários cadastrados
        List<Funcionario> lista = new ArrayList<>();

        // Solicita a quantidade de funcionários a cadastrar
        System.out.print("Informe a quantidade de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nFuncionário #" + i + " dados:");

            // Verifica se o funcionário é terceirizado
            System.out.print("O funcionário é terceirizado? (S/N): ");
            char ch = sc.next().toUpperCase().charAt(0);

            sc.nextLine(); // limpar buffer do Scanner
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Horas: ");
            int horas = sc.nextInt();

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            // Se for terceirizado, solicita o custo adicional
            if (ch == 'S') {
                System.out.print("Informe a taxa adicional: ");
                double custoAdicional = sc.nextDouble();
                // Adiciona funcionário terceirizado à lista
                lista.add(new FuncionarioTercerizado(nome, horas, valorPorHora, custoAdicional));
            } else {
                // Adiciona funcionário normal à lista
                lista.add(new Funcionario(nome, horas, valorPorHora));
            }
        }

        // Exibe o pagamento de cada funcionário
        System.out.println("\nPAGAMENTOS:");
        for (Funcionario f : lista) {
            System.out.printf("%s - R$ %.2f%n", f.getNome(), f.pagamento());
        }

        sc.close(); // fecha o Scanner
    }
}

