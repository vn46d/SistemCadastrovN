package Dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

    boolean executando = true;

        while (executando) {

            Menu.mostrarMenu();

            String escolha = option.nextLine();

            switch (escolha) {

                case "1":

                    Cliente cliente = new Cliente();

                    System.out.print("Digite o nome: ");
                    cliente.setNome(option.nextLine());

                    System.out.print("Digite o CPF: ");
                    cliente.setCpf(option.nextLine());

                    System.out.print("Digite a idade: ");
                    cliente.setIdade(option.nextInt());
                    option.nextLine();

                    System.out.print("Digite o telefone: ");
                    cliente.setTelefone(option.nextLine());

                    clientes.add(cliente);

                    System.out.println("Cliente cadastrado!");
                    break;

                case "2":

                    for (Cliente c : clientes) {

                        System.out.println("Nome: " + c.getNome());
                        System.out.println("CPF: " + c.getCpf());
                        System.out.println("Idade: " + c.getIdade());
                        System.out.println("Telefone: " + c.getTelefone());
                        System.out.println();
                    }
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
