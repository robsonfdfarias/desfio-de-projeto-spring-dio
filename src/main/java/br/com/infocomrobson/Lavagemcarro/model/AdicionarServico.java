package br.com.infocomrobson.Lavagemcarro.model;


public abstract class AdicionarServico extends Lavagem{
    protected Lavagem lavagem;

    public AdicionarServico() {
    }

    public void config(String desc, Lavagem lav){
        super.setDesc(desc);
        lavagem = lav;
    }

    public abstract String getDesc();
}
