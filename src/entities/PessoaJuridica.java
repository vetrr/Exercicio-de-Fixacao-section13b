package entities;

public final class PessoaJuridica extends Pessoa{
    protected Integer qtdFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
        super(nome, rendaAnual);
        this.qtdFuncionarios=qtdFuncionarios;
    }

    @Override
    public Double calcularImposto() {
        Double impostoBase= rendaAnual*0.16;

        if (qtdFuncionarios>10) {
            impostoBase= rendaAnual*0.14;
        }

        return impostoBase;
    }

    @Override
    public String toString() {
        calcularImposto();
        return nome+" $ "+String.format("%.2f", calcularImposto());
    }

}
