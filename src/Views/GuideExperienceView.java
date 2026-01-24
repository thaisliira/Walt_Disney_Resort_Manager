package Views;

import Controllers.GuideExperienceController;

import java.util.Scanner;

public class GuideExperienceView {

    private GuideExperienceController guideExperienceController;

    public GuideExperienceView(GuideExperienceController guideExperienceController) {
        this.guideExperienceController = guideExperienceController;
    }

    public void menu() {

        Scanner input = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("\n\n***** Bem-vind@ Exmo. Patrão *****");
            System.out.println("1. Consultar Histórico de Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Produto Mais Vendido - Unidades
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
