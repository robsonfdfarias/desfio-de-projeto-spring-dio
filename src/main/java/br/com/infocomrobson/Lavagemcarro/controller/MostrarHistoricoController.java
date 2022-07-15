package br.com.infocomrobson.Lavagemcarro.controller;

import br.com.infocomrobson.Lavagemcarro.formatacao.FormataData;
import br.com.infocomrobson.Lavagemcarro.model.Historico;
import br.com.infocomrobson.Lavagemcarro.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("VerHistorico")
public class MostrarHistoricoController {
    @Autowired
    private HistoricoService historicoService;
    @Autowired
    private FormataData formataData;

    @GetMapping
    public String verHistorico(){
        List<Historico> historicos = (List<Historico>) historicoService.buascarTodos();
        double total = 0;
        String head = "<style sheet='text/css'>" +
                "body{" +
                "margin:0;" +
                "padding:0;" +
                "}" +
                ".img{" +
                "width:100%;" +
                "height:100vh;" +
                "background-image: url(\"https://cdn.pixabay.com/photo/2020/05/08/08/49/wash-5144821_960_720.jpg\");" +
                "background-position: center;" +
                "background-repeat: no-repeat;" +
                "background-size: cover;" +
                "filter: blur(2px);" +
                "position:fixed;" +
                "margin:0;" +
                "}" +
                "a{" +
                "text-decoration:none;" +
                "color:green;" +
                "transition: 0.3s ease-in-out" +
                "}" +
                "a:hover{" +
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
                "table{" +
                "border-spacing: 0;" +
                "border-collapse: separate;" +
                "border: 1px solid black;" +
                "background-color:white;" +
                "width:100%;" +
                "border-radius: 6px;" +
                "box-shadow: 2px 2px 2px rgba(0,0,0,0.5);" +
                "}" +
                "table tr td{" +
                "cellspacing:" +
                "border: 1px solid black;" +
                "padding:15px;" +
                "background-color:white;" +
                "transition: 0.5s ease-in-out;" +
                "}" +
                "table tr:hover td{" +
                "border: 1px solid black;" +
                "padding:15px;" +
                "background-color:white;" +
                "}" +
                "</style>";
        String conteudo = "<div class='img'></div><div class='geral'><div class='conteudo'>" +
                "<h1>Histórico de serviços:<h1>";

        conteudo = conteudo+"<table><tr><td>Data</td><td>Serviço</td><td>Valor</td></tr>";
        String data = "";
        for(Historico historico : historicos){
            total += historico.getValor();
            data = formataData.formatarData(historico.getData());
            conteudo = conteudo+"<tr><td>"+data+"</td><td>"+historico.getLavagem()+"</td><td>R$ "+historico.getValor()+"</td></tr>";
        }
        conteudo = conteudo+"<tr><td></td><td>Total</td><td style='color:white;background-color:black;'>R$ "+total+"</td></tr>";

        conteudo = conteudo+"</table><br><a href='../../novo'><b>--> Clique aqui para voltar<--</b></a></div></div>";
        return head+conteudo;
    }
}
