package Views;

import Controllers.ClientController;
import Models.Client;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {

    private ClientController clientController;

    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    public void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("\n\n***** Bem-vind@ Exmo. Cliente *****");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Experiências Disponíveis");
            System.out.println("3. Consultar Experiência Favorita");
            System.out.println("4. Consultar Experiência Top-Seller");
            System.out.println("5. Avaliar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Consultar Quartos Disponíveis
                this.clientController.quartosDisponiveis();
                    break;

                case 2: // Consultar Experiências Disponíveis
                    break;

                case 3: // Consultar Experiência Favorita
                    break;

                case 4: // Consultar Experiência Top-Seller
                    break;

                case 5: // Avaliar uma Experiência
                    //printTotalSales();
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
