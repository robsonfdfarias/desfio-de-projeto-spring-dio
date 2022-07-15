package br.com.infocomrobson.Lavagemcarro.model;

import org.springframework.stereotype.Component;

@Component
public class LavagemNormal extends Lavagem{

    public LavagemNormal() {
        super.setDesc("Lavagem normal");
    }

    @Override
    public double valor() {
        super.setVal(50);
        return 50;
    }
}
