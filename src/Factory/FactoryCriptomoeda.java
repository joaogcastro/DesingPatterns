package Factory;

import Pagamento.PagamentoCriptomoeda;
import Pagamento.iPagamento;

public class FactoryCriptomoeda extends PagamentoFactory{
    @Override
    public iPagamento criarPagamento() {
        return new PagamentoCriptomoeda();
    }
}
