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
        float valor = 0;
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
                c.getConta().depositar(valor);
                System.out.print("Valor do depósito: ");
                double deposito = optionbd.nextDouble();
                optionbd.nextLine();
            }   if (!encontrado) {
            System.out.println("CPF não encontrado.");
            optionbd.nextDouble();
            optionbd.nextLine();

        }
    }
}

