package Dados;

import java.sql.SQLOutput;
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


                case "3":

                    System.out.println("Digite seu CPF:");

                    String cpfBusca = option.nextLine();
                    boolean encontrado = false;

                    encontrado = false;

                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfBusca)) {
                            encontrado = true;
                            System.out.println("Nome: " + c.getNome());
                            System.out.println("CPF: " + c.getCpf());
                            System.out.println("Idade: " + c.getIdade());
                            System.out.println("Telefone: " + c.getTelefone());
                            System.out.println();
                            break;
                        }

                        if (!encontrado == false)
                            System.out.println("CPF Invalido.");

                        break;
                    }

                case "4":

                    System.out.println("Digite seu CPF:");
                    String cpfRec = option.nextLine();
                    boolean encontrado = false;

                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfRec)) {
                            encontrado = true;

                            System.out.print("Novo nome: ");
                            c.setNome(option.nextLine());

                            System.out.println("Nova Idade: ");
                            c.setIdade(option.nextInt());
                            System.out.println("Novo Telefone: ");
                            c.setTelefone(option.nextInt());
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("CPF não encontrado!");
                        break;
                    }

                case "5":
                    System.out.println("Digite seu CPF:");
                    String cpfRem = option.nextLine();

                    boolean encontrado = false;

                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfRem)) {

                            encontrado = true;

                            System.out.print("Excluir Usuario Portador do CPF:"+ c.getCpf());

                            clientes.remove(c);


                            System.out.println("Cliente Excluido com sucesso!");
                            break;
                        }
                    }

                    if (!encontrado){
                        System.out.println("CPF Não Encontrado");
                        break;
                    }

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




