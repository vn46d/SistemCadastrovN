package Update;
import Dados.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateBd {

    private ArrayList<Cliente> clientes;
    private Scanner optionbd;

    public UpdateBd(ArrayList<Cliente> conta, Scanner option) {
        this.clientes = conta;
        this.optionbd = option;
    }

    public void depositar() {
        boolean encontrado = false;
        System.out.println("Digite seu CPF:");
        String cpfBusca = optionbd.nextLine();

        for (Cliente c : clientes)
            if (c.getCpf().equals(cpfBusca)) {
                encontrado = true;
                System.out.println("Nome: " + c.getNome());
                System.out.println("CPF: " + c.getCpf());
                System.out.println("Idade: " + c.getIdade());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println();
                System.out.print("Valor do depósito: ");
                double deposito = optionbd.nextDouble();
                optionbd.nextLine();
                c.getConta().depositar(deposito);
                break;
            }
        if (!encontrado) {
            System.out.println("CPF não encontrado.");
            optionbd.nextDouble();
            optionbd.nextLine();
        }
    }

    public void verSaldo() {
        boolean encontrado = false;
        System.out.println("Digite seu CPF:");
        String cpfBusca = optionbd.nextLine();

        for (Cliente c : clientes)
            if (c.getCpf().equals(cpfBusca)) {
                encontrado = true;
                System.out.println("Nome: " + c.getNome());
                System.out.println("CPF: " + c.getCpf());
                System.out.println("Saldo " + c.getConta().getSaldo());
                break;
            }
        if (!encontrado) {
            System.out.println("CPF não encontrado.");
        }
    }

    public void Sacar() {
        boolean encontrado = false;
        System.out.println("Digite seu CPF:");
        String cpfBusca = optionbd.nextLine();

        for (Cliente c : clientes)
            if (c.getCpf().equals(cpfBusca)) {
                encontrado = true;
                System.out.print("Valor do saque: ");
                double sacar = optionbd.nextDouble();
                optionbd.nextLine();
                c.getConta().sacar(sacar);
                break;
            }
        if (!encontrado) {
            System.out.println("CPF não encontrado.");
        }
    }

    public void transferir() {
        Scanner d = new Scanner(System.in);
        System.out.println("Digite o CPF de origem:");
        String cpfOrigem = optionbd.nextLine();
        System.out.println("Digite o CPF de destino:");
        String cpfDestino = d.nextLine();
        Cliente origem = null;
        Cliente destino = null;

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpfOrigem)) {
                origem = c;
                System.out.println("DE: " + origem.getConta() + "PARA: " + destino.getConta());
                break;
            }
        }

        for (Cliente c : clientes) {
                    if (c.getCpf().equals(cpfDestino)) {
                        destino = c;
                        System.out.println("DE: " + origem.getConta() + "PARA: " + destino.getConta());


                        break;
                    }
        }
    }

}
