package br.com.infocomrobson.Lavagemcarro.model;

import org.springframework.stereotype.Component;

@Component
public class Encerar extends AdicionarServico{
    public Encerar() {
    }

    public void config(Lavagem lav){
        super.config("passar cera", lav);
    }

    @Override
    public String getDesc() {
        return lavagem.getDesc()+" - cera";
    }

    @Override
    public double valor() {
        super.setVal(lavagem.valor()+50);
        return lavagem.valor()+50;
    }
}
