package br.com.infocomrobson.Lavagemcarro.formatacao;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class FormataData {
    public String formatarData (LocalDateTime data){
        String dt = String.valueOf(data);
        String dataQuebrada[] = new String[2];
        dataQuebrada = dt.split("T");
        String dataP1[] = new String[3];
        dataP1 = dataQuebrada[0].split("-");
        String dataP2[] = new String[3];
        dataP2 = dataQuebrada[1].split(":");
        String conteudo = dataP1[2]+"/"+dataP1[1]+"/"+dataP1[0]+"/";
        conteudo = conteudo+" - "+dataP2[0]+":"+dataP2[1];
        return conteudo;
    }
}
