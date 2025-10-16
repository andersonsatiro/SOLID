public class ProcessaPagamento {

    public void processar(Pedido pedido) {
        if (pedido.getTipoPagamento().equals("cartao")) {
            System.out.println("Processando pagamento via Cartão de Crédito...");
        } else if (pedido.getTipoPagamento().equals("boleto")) {
            System.out.println("Processando pagamento via Boleto Bancário...");
        }
    }
    
}
