import Factory.PagamentoFactory;
import Pagamento.iPagamento;

public class PagamentoService {
    boolean processarPagamento(PagamentoFactory factory, double value) {
        iPagamento pagamento = factory.criarPagamento();

        return pagamento.processarPagamento(value);
    }
}
