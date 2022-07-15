package br.com.infocomrobson.Lavagemcarro.controller;

import br.com.infocomrobson.Lavagemcarro.model.Encerar;
import br.com.infocomrobson.Lavagemcarro.model.HigienizacaoInterna;
import br.com.infocomrobson.Lavagemcarro.model.LavagemASeco;
import br.com.infocomrobson.Lavagemcarro.model.LavagemNormal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("novo")
public class NovoController {
    @Autowired
    private LavagemASeco lavagemASeco;
    @Autowired
    private LavagemNormal lavagemNormal;
    @Autowired
    private Encerar encerar;
    @Autowired
    private HigienizacaoInterna higienizacaoInterna;
    @GetMapping
    public String te(){

        String head = "<head>" +
                "<style sheet='text/css'>" +
                "body{" +
                "margin:0;" +
                "padding:0;" +
                "height:100vh;" +
                "}" +
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
                "table tr td a{" +
                "text-decoration: none;" +
                "color: green;" +
                "}" +
                "table{" +
                "background-color:black;" +
                "border-radius: 0 0 6px 6px;" +
                "}" +
                "table tr td{" +
                "border: 0px solid black;" +
                "padding:15px;" +
                "background-color:white;" +
                "transition: 0.5s ease-in-out;" +
                "}" +
                "table tr:hover td {" +
                "border: 0px solid blue;" +
                "padding:15px;" +
                "background-color: rgba(125,10,145,0.5);" +
                "transition: 0.5s ease-in-out;" +
                "color:white;" +
                "}" +
                "table tr td a:hover{" +
                "color:blue;" +
                "}" +
                ".menu{" +
                "width:100%;" +
                "top:0;" +
                "left:0;" +
                "position:relative;" +
                "height:60px;" +
                "background-color: rgba(125,10,145,0.5);" +
                "display:flex;" +
                "justify-content:center;" +
                "align-items:center;" +
                "}" +
                ".menu a{" +
                "text-decoration: none;" +
                "color: green;" +
                "height:100%;" +
                "display:flex;" +
                "justify-content:center;" +
                "align-items:center;" +
                "padding: 0 20px;" +
                "}" +
                ".menu a:hover{" +
                "color: white;" +
                "background-color: rgba(0,0,0,0.5);" +
                "padding: 0 20px;" +
                "height:100%;" +
                "}" +
                ".geral{" +
                "width:100%;" +
                "height:100%;" +
                "position:relative;" +
                "display:block;" +
                "justify-content:center;" +
                "align-items:center;" +
                "}" +
                ".divCont{" +
                "margin:auto;" +
                "position:relative;" +
                "display:flex;" +
                "justify-content:center;" +
                "align-items:center;" +
                "}" +
                "</style>" +
                "</head>";
        String desc1 = lavagemNormal.getDesc().replaceAll(" ", "_");
        String tr1 = "<tr><td><a href='../combo/"+desc1+"/"+lavagemNormal.valor()+"'><b>Combo 01</b></a></td><td>"+lavagemNormal.getDesc().replaceAll("-", "+")+"</td><td>R$ "+lavagemNormal.valor()+"</td></tr>";

        encerar.config(lavagemNormal);
        String desc2 = encerar.getDesc().replaceAll(" ", "_");
        String tr2 = "<tr><td><a href='../combo/"+desc2+"/"+encerar.valor()+"'><b>Combo 02</b></a></td><td>"+encerar.getDesc().replaceAll("-", "+")+"</td><td>R$ "+encerar.valor()+"</td></tr>";

        higienizacaoInterna.config(lavagemNormal);
        String desc3 = higienizacaoInterna.getDesc().replaceAll(" ", "_")+"/"+higienizacaoInterna.valor();
        String tr3 = "<tr><td><a href='../combo/"+desc3+"'><b>Combo 03</b></a></td><td>"+higienizacaoInterna.getDesc().replaceAll("-", "+")+"</td><td>R$ "+higienizacaoInterna.valor()+"</td></tr>";

        higienizacaoInterna.config(encerar);
        String desc4 = higienizacaoInterna.getDesc().replaceAll(" ", "_")+"/"+higienizacaoInterna.valor();
        String tr4 = "<tr><td><a href='../combo/"+desc4+"'><b>Combo 04</b></a></td><td>"+higienizacaoInterna.getDesc().replaceAll("-", "+")+"</td><td>R$ "+higienizacaoInterna.valor()+"</td></tr>";

        String desc5 = lavagemASeco.getDesc().replaceAll(" ", "_")+"/"+lavagemASeco.valor();
        String tr5 = "<tr><td><a href='../combo/"+desc5+"'><b>Combo 05</b></a></td><td>"+lavagemASeco.getDesc().replaceAll("-", "+")+"</td><td>R$ "+lavagemASeco.valor()+"</td></tr>";

        encerar.config(lavagemASeco);
        String desc6 = encerar.getDesc().replaceAll(" ", "_")+"/"+encerar.valor();
        String tr6 = "<tr><td><a href='../combo/"+desc6+"'><b>Combo 06</b></a></td><td>"+encerar.getDesc().replaceAll("-", "+")+"</td><td>R$ "+encerar.valor()+"</td></tr>";

        higienizacaoInterna.config(lavagemASeco);
        String desc7 = higienizacaoInterna.getDesc().replaceAll(" ", "_")+"/"+higienizacaoInterna.valor();
        String tr7 = "<tr><td><a href='../combo/"+desc7+"'><b>Combo 07</b></a></td><td>"+higienizacaoInterna.getDesc().replaceAll("-", "+")+"</td><td>R$ "+higienizacaoInterna.valor()+"</td></tr>";

        higienizacaoInterna.config(encerar);
        String desc8 = higienizacaoInterna.getDesc().replaceAll(" ", "_")+"/"+higienizacaoInterna.valor();
        String tr8 = "<tr><td><a href='../combo/"+desc8+"'><b>Combo 08</b></a></td><td>"+higienizacaoInterna.getDesc().replaceAll("-", "+")+"</td><td>R$ "+higienizacaoInterna.valor()+"</td></tr>";

        String menu = "<div class='menu' id='menu'><a href='../swagger-ui/index.html'>Consultar o Swagger</a>" +
                "<a href='../VerHistorico'>Ver histórico</a></div>";

        String conteudo = "<table>" +
                "<tr><td><b>Combo</b></td><td><b>Serviço</b></td><td><b>Preço</b></td></tr>" +
                tr1+tr2+tr3+tr4+tr5+tr6+tr7+tr8+
                "</table>";

        String p1 = "<div class='img'></div><div class='geral'>"+menu+"<div class='divCont'>"+conteudo+"</div></div>";

        return head+p1;
    }
}
