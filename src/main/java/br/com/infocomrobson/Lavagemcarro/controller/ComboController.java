package br.com.infocomrobson.Lavagemcarro.controller;

import br.com.infocomrobson.Lavagemcarro.model.Historico;
import br.com.infocomrobson.Lavagemcarro.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController
@RequestMapping("combo")
public class ComboController {
    @Autowired
    private HistoricoService historicoService;
    @GetMapping("/{desc}/{valor}")
    public String combo(@PathVariable("desc") String desc, @PathVariable("valor") double valor){
        String head = "<style sheet='text/css'>" +
                ".img{" +
                "width:100%;" +
                "height:100vh;" +
                "background-image: url(\"https://cdn.pixabay.com/photo/2020/05/08/08/49/wash-5144821_960_720.jpg\");" +
                "background-position: center;" +
                "background-repeat: no-repeat;" +
                "background-size: cover;" +
                "filter: blur(2px);" +
                "position:absolute;" +
                "margin:0;" +
                "}" +
                "a{" +
                "text-decoration:none;" +
                "color:green;" +
                "transition: 0.5s ease-in-out" +
                "}" +
                "a:hover{" +
                "text-decoration:none;" +
                "color:blue;" +
                "" +
                "}" +
                ".geral{" +
                "height:100vh;" +
                "width:100%;" +
                "position:absolute;" +
                "margin:0;" +
                "}" +
                ".conteudo{" +
                "padding: 30px;" +
                "background-color: rgba(255,255,255,0.5);" +
                "position:relative;" +
                "box-radius: 8px;" +
                "top:10%;" +
                "max-width:700px;" +
                "margin: auto;" +
                "box-shadow: 2px 2px 2px 2px rgba(0, 0, 0, 0.4);" +
                "}" +
                "</style>";

        LocalDateTime localDateTime = LocalDateTime.now();
        Historico historico = new Historico();
        String servico = desc.replaceAll("_", " ");
        servico = servico.replaceAll("-", "+");
        historico.setLavagem(servico);
        historico.setValor(valor);
        historico.setData(localDateTime);
        historicoService.inserir(historico);
        return head+"<div class='img'></div><div class='geral'><div class='conteudo'><h1>Obrigado pela preferência!<h1>" +
                "<h3>Serviços prestados: "+servico+"</h3>" +
                "<h4>Valor do serviço: R$ "+valor+"</h4>" +
                "<a href='../../novo'><b>--> Clique aqui para voltar<--</b></a></div></div>";
    }
}
