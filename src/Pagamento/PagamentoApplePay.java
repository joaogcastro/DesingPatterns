package Pagamento;

import java.util.Scanner;

public class PagamentoApplePay implements iPagamento {

    private boolean dispositivoAtivado;

    @Override
    public boolean processarPagamento(double valor) {
        verificarDispositivo();

        if (dispositivoAtivado) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via Apple Pay.");
            return true;
        } else {
            System.out.println("Falha no pagamento. Apple Pay não está ativado no dispositivo.");
            return false;
        }
    }

    private void verificarDispositivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seu dispositivo está habilitado para Apple Pay? (sim/não): ");
        String resposta = scanner.nextLine().trim().toLowerCase();
        this.dispositivoAtivado = resposta.equals("sim");
    }
}
