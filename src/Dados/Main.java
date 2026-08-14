package Dados;

import Update.UpdateCadastro;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        UpdateCadastro cadastro = new UpdateCadastro(clientes, option);

        boolean executando = true;

        while (executando) {

            Menu.mostrarMenu();

            String escolha = option.nextLine();

            switch (escolha) {

                case "1":
                    cadastro.cadastrarClient();
                    break;

                case "2":
                    cadastro.listarClient();
                    break;


                case "3":
                    cadastro.buscarClient();
                    System.out.println();
                    break;

                case "4":

                   cadastro.alterarClient();
                        break;


                case "5":
                   cadastro.excluirClient();
                        break;

            case "6":
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}




