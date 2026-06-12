package entities;

public abstract class Pessoa {
    protected String nome;
    protected Double rendaAnual;

    
    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract Double calcularImposto();

    public abstract String toString();

    
}
