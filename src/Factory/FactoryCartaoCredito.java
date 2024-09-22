package Factory;

import Pagamento.PagamentoCartaoCredito;
import Pagamento.iPagamento;

public class FactoryCartaoCredito extends PagamentoFactory{
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCartaoCredito();
    }
}
