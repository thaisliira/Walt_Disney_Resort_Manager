package Views;

import Controllers.RecepcionistController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecepcionistView {

    private RecepcionistController recepcionistController;

    public RecepcionistView() throws FileNotFoundException {
        this.recepcionistController = new RecepcionistController();
    }

    public void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("\n\n***** Bem-vind@ Staff *****");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Quartos Reservados");
            System.out.println("3. Consultar Reservas Atuais");
            System.out.println("4. Efetuar uma Reserva");
            System.out.println("5. Reservar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Consultar Quartos Disponíveis
                    this.recepcionistController.freeRoomsWeek2();
                    break;

                case 2: // Consultar Quartos Reservados
                    break;

                case 3: // Consultar Reservas Atuais
                    break;

                case 4: // Efetuar uma Reserva
                    break;

                case 5: // Reservar uma Experiência
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
