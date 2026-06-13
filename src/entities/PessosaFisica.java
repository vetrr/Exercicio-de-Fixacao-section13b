package entities;

public final class PessosaFisica extends Pessoa{
    protected final Double RENDAMIN=20000.00;

    protected Double gastoSaude;

    
        public PessosaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude=gastoSaude;
    }


    @Override
    public Double calcularImposto() {
        Double impostoBase=0.0;
        Double desconto=0.0;

        if (rendaAnual <RENDAMIN) {
            impostoBase = rendaAnual * 0.15;
        }
        else {
            impostoBase = rendaAnual * 0.25;
        }

        if (gastoSaude>0.0) {
           desconto = gastoSaude * 0.50;
           impostoBase -= desconto;
        }
        
        return impostoBase;
    }


    @Override
    public String toString() {
        calcularImposto();
        return nome+" $ "+String.format("%.2f", calcularImposto());
    }

}
