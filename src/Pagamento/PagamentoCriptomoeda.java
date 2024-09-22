package Pagamento;

import java.util.Scanner;

public class PagamentoCriptomoeda implements iPagamento {

    private double saldoCarteira;

    @Override
    public boolean processarPagamento(double valor) {
        // Verifica se o saldo é suficiente
        if (validarSaldo(valor)) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via Criptomoedas.");
            saldoCarteira -= valor;  // Deduz o valor pago do saldo da carteira
            System.out.println("Saldo restante na carteira: R$" + saldoCarteira);
            return true;
        } else {
            System.out.println("Falha no pagamento. Saldo insuficiente na carteira.");
            return false;
        }
    }

    private boolean validarSaldo(double valor) {
        lerSaldoCarteira();
        return saldoCarteira >= valor;
    }

    private void lerSaldoCarteira() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo disponível na sua carteira de criptomoedas: ");
        this.saldoCarteira = scanner.nextDouble();
    }
}
