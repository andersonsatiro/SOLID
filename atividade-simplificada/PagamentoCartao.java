public class PagamentoCartao implements ProcessarTipoPagamento {
    @Override
    public void processar(String tipoPagamento) {
        System.out.println("Processando pagamento via Cartão de Crédito...");
    }
}
