package Pagamento;

import java.util.Scanner;

public class PagamentoPayPal implements iPagamento {

    @Override
    public boolean processarPagamento(double valor) {
        // Valida se o e-mail está vinculado ao PayPal
        if (validarEmail()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via PayPal.");
            return true;
        } else {
            System.out.println("Falha no pagamento. Conta PayPal não vinculada a este e-mail.");
            return false;
        }
    }

    private boolean validarEmail() {
        String email = lerEmail();
        if (email.endsWith("@paypal.com")) {
            return true;
        }
        return false;
    }

    private String lerEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o e-mail vinculado à conta PayPal: ");
        return scanner.nextLine();
    }
}
