class ProcessadorDePedidos {
    
    private final CalcularTotalPedido calcularTotalPedido;
    private final ProcessarTipoPagamento processarTipoPagamento;
    private final SalvarBanco salvarBanco;
    private final EnviarEmail enviarEmail;

    public ProcessadorDePedidos(CalcularTotalPedido calcularTotalPedido, ProcessarTipoPagamento processarTipoPagamento, SalvarBanco salvarBanco, EnviarEmail enviarEmail) {
        this.calcularTotalPedido = calcularTotalPedido;
        this.processarTipoPagamento = processarTipoPagamento;
        this.salvarBanco = salvarBanco;
        this.enviarEmail = enviarEmail;
    }
    
    public void processar(Pedido pedido) {

        calcularTotalPedido.calcular(pedido);

        processarTipoPagamento.processar(pedido.getTipoPagamento());

                // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
        if (pedido.getTipoPagamento().equals("cartao")) {
            System.out.println("Processando pagamento via Cartão de Crédito...");
            // Lógica específica para cartão
        } else if (pedido.getTipoPagamento().equals("boleto")) {
            System.out.println("Processando pagamento via Boleto Bancário...");
            // Lógica específica para boleto
        }

        salvarBanco.salvar(pedido);

        enviarEmail.enviar(pedido);

    }
}