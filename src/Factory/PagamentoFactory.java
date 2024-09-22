package Factory;

import Pagamento.iPagamento;

public abstract class PagamentoFactory {
    public abstract iPagamento criarPagamento();
}
