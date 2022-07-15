package br.com.infocomrobson.Lavagemcarro.service;

import org.springframework.stereotype.Component;

public interface LavagemService {
    String desc = null;
    double val = 0;

    public void setDesc(String desc);

    public String getDesc();

    public abstract double valor();
}
