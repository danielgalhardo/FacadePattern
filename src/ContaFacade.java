public class ContaFacade {

    public void realizaEmprestimo(Conta conta, Cliente cliente, float valor)
    {
       conta.realizaEmprestimo(500,  cliente.numeroConta);
    }

}
