package br.com.infocomrobson.Lavagemcarro.model;

import org.springframework.stereotype.Component;

@Component
public class HigienizacaoInterna extends AdicionarServico{
    public HigienizacaoInterna() {
    }

    public void config(Lavagem lav){
        super.config("Higienização Interna", lav);
    }

    @Override
    public String getDesc() {
        return lavagem.getDesc()+" - higienização interna";
    }

    @Override
    public double valor() {
        super.setVal(lavagem.valor()+100);
        return lavagem.valor()+100;
    }
}
