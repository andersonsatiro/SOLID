public class SalvarMySQL implements SalvarBanco {

    private final MySQLRepositorio mySQLRepositorio;

    public SalvarMySQL(MySQLRepositorio mySQLRepositorio) {
        this.mySQLRepositorio = mySQLRepositorio;
    }

    @Override
    public void salvar(Pedido pedido) {
        mySQLRepositorio.salvar(pedido);
    }
}
