public class Cliente {

    String nome;
    String rg;
    String cpf;
    Endereco endereco;
    int numeroConta;
    String situacao;

    Cliente(String nome,
            String rg,
            String cpf,
            Endereco endereco,
            int numeroConta,
            String situacao)
    {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numeroConta = numeroConta;
        this.situacao = situacao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public boolean aptoEmprestimo()
    {
        if(!situacao.equals("inadimplente"))
        {
            return true;
        }
        return false;
    }






}