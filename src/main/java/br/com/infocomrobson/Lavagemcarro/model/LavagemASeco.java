package br.com.infocomrobson.Lavagemcarro.model;

import org.springframework.stereotype.Component;

@Component
public class LavagemASeco extends Lavagem{
    public LavagemASeco() {
        super.setDesc("Lavagem a seco");
    }

    @Override
    public double valor() {
        super.setVal(80);
        return 80;
    }
}
