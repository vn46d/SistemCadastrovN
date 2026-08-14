package Update;
import BDbyclient.BdMenu;
import BDbyclient.Infconta;
import Dados.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateBd {

    private ArrayList<Cliente> conta;
    private Scanner option;

    public UpdateBd(ArrayList<Cliente> conta, Scanner option) {
        this.conta = conta;
        this.option = option;
    }

    {
        System.out.print("=======  Seja bem-vindo ao BancoVlux  =======");
        System.out.println();
        System.out.println("Digite seu nome:");
        conta.setTitular(option.nextLine());

        System.out.println("Bem-vindo, " + conta.getTitular());

        boolean executando = true;

        while (executando)
            BdMenu.BdmostrarMenu();
        String sel = option.nextLine();

    public class VerSaldo() {
        System.out.println("Saldo: R$ "+conta.getSaldo());
        break;
        }
    }

    public class Depositar() {
                System.out.print("Valor do depósito: ");
        double deposito = option.nextDouble();
                option.nextLine();

                conta.depositar(deposito);
                break;
    }
}

            public class Sacar() {

                System.out.print("Valor do saque: ");
                double saque = option.nextDouble();
                option.nextLine();

                conta.sacar(saque);
                break;
            }

            public class Transferir();

                System.out.print("Valor da transferência: ");
                double transferencia = option.nextDouble();
                option.nextLine();

                conta.transferir(transferencia);
                break;

            case "5":

                executando = false;

                System.out.println("Obrigado por utilizar o BancoVlux!");
                break;

            default:

                System.out.println("Opção inválida.");

        }
    }
}

