package Dados;

import java.util.Scanner;

public class UpdateCadastro extends Cliente {

    public void UpdateCadastro {
        Scanner option = new Scanner(System.in);
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


    }
}
cadastrarClient()

listarClient()

buscarClient()

alterarClient()

excluirClient()