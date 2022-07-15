package br.com.infocomrobson.Lavagemcarro.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_historico_lavagem")
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;
    private String lavagem;
    private double valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLavagem() {
        return lavagem;
    }

    public void setLavagem(String lavagem) {
        this.lavagem = lavagem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
