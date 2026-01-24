package Views;

import Controllers.AdminController;
import Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {

    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("\n\n***** Bem-vind@ Exmo. Patrão *****");
            System.out.println("1. Consultar Total de Reservas");
            System.out.println("2. Consultar total de receitas");
            System.out.println("3. Consultar Reservas/Receitas Mensais");
            System.out.println("4. Consultar Tipologia de Quartos mais Reservada");
            System.out.println("5. Consultar Experiência mais Procurada - Adultos");
            System.out.println("6. Consultar Experiência mais Procurada - Crianças");
            System.out.println("7. Consultar Experiência mais Lucrativa");
            System.out.println("8. Consultar Experiência menos Lucrativa");
            System.out.println("9. Consultar Quarto com melhor Preço/Semana");
            System.out.println("10. Adicionar Novo Login");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Produto Mais Vendido - Unidades
                    this.adminController.optionNotAvailable();
                    break;

                case 2: // Produto Mais Vendido - Valor €
                    this.adminController.optionNotAvailable();
                    break;

                case 3: // Melhor Venda - Unidades
                    this.adminController.optionNotAvailable();
                    break;

                case 4: // Melhor Venda - Valor
                    this.adminController.optionNotAvailable();
                    break;

                case 5: // Total Vendas
                    this.adminController.expMostPopAdult();
                    break;

                case 6: // Média Vendas
                    this.adminController.expMostPopChild();
                    break;

                case 7: // Média Vendas
                    this.adminController.optionNotAvailable();
                    break;

                case 8: // Média Vendas
                    this.adminController.optionNotAvailable();
                    break;

                case 9: // Média Vendas
                    this.adminController.optionNotAvailable();
                    break;

                case 10: // Média Vendas
                    this.adminController.optionNotAvailable();
                    break;

                case 0: // Voltar
                    System.out.println("Até à proxima ⍈");
                    break;

                default:
                    System.out.println("❌ Opção Inválida: " + opcao + " ❌");
                    break;
            }

        } while (opcao != 0);
    }
}
