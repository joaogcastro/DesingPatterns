package Pagamento;

import java.util.Scanner;

public class PagamentoCartaoCredito implements iPagamento {

    @Override
    public boolean processarPagamento(double valor) {
        if (validarNumeroCartao()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso no Cartão de Crédito.");
            return true;
        } else {
            System.out.println("Falha no pagamento. Número de cartão inválido.");
            return false;
        }
    }

    private boolean validarNumeroCartao() {
        String numeroCartao = lerNumeroCartao();

        if (numeroCartao.length() != 16) {
            return false;
        }
        if (!numeroCartao.startsWith("4")) {
            return false;
        }
        return true;
    }

    private String lerNumeroCartao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito (16 dígitos): ");
        return scanner.nextLine();
    }
}
