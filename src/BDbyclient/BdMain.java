package BDbyclient;
import java.util.Scanner;

public class BdMain {

        public static void main(String[] args) {

            Scanner option = new Scanner(System.in);
            Infconta.Conta conta = new Infconta.Conta();

            System.out.print("=======  Seja bem-vindo ao BancoVlux  =======");
            System.out.println();
            System.out.println("Digite seu nome:");
            conta.setTitular(option.nextLine());

            System.out.println("Bem-vindo, " + conta.getTitular());

            boolean executando = true;

            while (executando) {
                BdMenu.BdmostrarMenu();
                String sel = option.nextLine();


                switch (sel) {

                    case "1":
                        System.out.println("Saldo: R$ " + conta.getSaldo());
                        break;

                    case "2":

                        System.out.print("Valor do depósito: ");
                        double deposito = option.nextDouble();
                        option.nextLine();

                        conta.depositar(deposito);
                        break;

                    case "3":

                        System.out.print("Valor do saque: ");
                        double saque = option.nextDouble();
                        option.nextLine();

                        conta.sacar(saque);
                        break;

                    case "4":

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

            option.close();

        }
    }
}
