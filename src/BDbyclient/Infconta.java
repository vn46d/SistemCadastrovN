package BDbyclient;

public class Infconta {


    public class Conta {

    private String titular;
    private double saldo;


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }



    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor deve ser maior que 0");
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {

            System.out.println("O valor do saque deve ser maior que zero.");

        } else if (saldo >= valor) {

            saldo -= valor;
            System.out.println("Saque realizado!");

        } else {

            System.out.println("Saldo insuficiente.");

        }
    }

    public void transferir(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transferência realizada!");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

}

}
