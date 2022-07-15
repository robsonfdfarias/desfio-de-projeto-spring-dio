package br.com.infocomrobson.Lavagemcarro.model;

import br.com.infocomrobson.Lavagemcarro.service.LavagemService;

public abstract class Lavagem implements LavagemService {
    private String desc;
    private double val;

    public Lavagem() {
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public abstract double valor();
}
