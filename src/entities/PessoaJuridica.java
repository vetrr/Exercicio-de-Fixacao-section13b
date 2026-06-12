package entities;

public final class PessoaJuridica extends Pessoa{
    protected Integer qtdFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
        super(nome, rendaAnual);
        this.qtdFuncionarios=qtdFuncionarios;
    }

    @Override
    public Double calcularImposto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularImposto'");
    }

}
