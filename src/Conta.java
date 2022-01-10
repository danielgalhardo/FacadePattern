public class Conta {

    private Cliente cliente;
    private int numeroConta;
    private String tipoConta;
    private float valorEmConta;

    public float getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(float saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    private float saldoDevedor;

    Conta(Cliente cliente, int numeroConta, String tipoConta, float valorEmConta)
    {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.valorEmConta = valorEmConta;
        this.saldoDevedor = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getValorEmConta() {
        return valorEmConta;
    }

    public void setValorEmConta(float valorEmConta) {
        this.valorEmConta = valorEmConta;
    }

    public void realizaEmprestimo(float valor, int numeroConta)
    {
        if(this.numeroConta == numeroConta) {
            if (cliente.aptoEmprestimo()) {
                this.valorEmConta += valor;
                this.saldoDevedor += valor;
            }
            else {
                throw new IllegalArgumentException("Cliente inadimplente");
            }
        }
        else {
            throw new IllegalArgumentException("Numero da conta do cliente errado");
        }
    }

}
