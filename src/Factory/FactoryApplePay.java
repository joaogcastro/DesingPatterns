package Factory;

import Pagamento.PagamentoApplePay;
import Pagamento.iPagamento;

public class FactoryApplePay extends PagamentoFactory{
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoApplePay();
    }
}
