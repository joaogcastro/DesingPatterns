import java.util.Scanner;
import Factory.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PagamentoService service = new PagamentoService();

        System.out.print("Digite o valor a ser pago: ");
        double valor = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Paypal");
        System.out.println("3. Criptomoeda");
        System.out.println("4. ApplePay");
        System.out.print("Digite o número da forma de pagamento escolhida: ");
        int opcao = scanner.nextInt();

        boolean isPago = false;
        switch (opcao) {
            case 1:
                isPago = service.processarPagamento(new FactoryCartaoCredito(), valor);
                break;
            case 2:
                isPago = service.processarPagamento(new FactoryPayPal(),valor);
                break;
            case 3:
                isPago = service.processarPagamento(new FactoryCriptomoeda(), valor);
                break;
            case 4:
                isPago = service.processarPagamento(new FactoryApplePay(), valor);
                break;
            default:
                System.out.print("Opção inválida");
                break;
        }

        if (isPago) {
            System.out.println("Pagamento realizado com sucesso");
            System.out.println("Valor que foi pago: R$" + valor);
        } else {
            System.out.println("Erro ao pagar.");
        }

        scanner.close();
    }
}