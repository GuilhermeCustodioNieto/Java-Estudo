package guilhermenieto.projects.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
    public void enviar(String mensagem){
        System.out.println("Enviando email com a seguinte mensagem... " + mensagem);
    }
}
