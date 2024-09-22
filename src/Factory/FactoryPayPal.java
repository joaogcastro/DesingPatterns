package Factory;

import Pagamento.PagamentoPayPal;
import Pagamento.iPagamento;

public class FactoryPayPal extends PagamentoFactory{
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoPayPal();
    }
}
