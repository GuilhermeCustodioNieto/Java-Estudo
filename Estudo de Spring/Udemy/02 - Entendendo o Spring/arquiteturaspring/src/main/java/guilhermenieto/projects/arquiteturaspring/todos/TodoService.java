package guilhermenieto.projects.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TodoService {
    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender){
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novaTodo){
        try{
            validator.validar(novaTodo);
        } catch(IllegalArgumentException e){
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        return repository.save(novaTodo);
    }

    public TodoEntity atualizarTodo(TodoEntity todo){
        mailSender.enviar("A tarefa foi atualizada com sucesso");
        return repository.save(todo);

    }

    public TodoEntity buscar(Integer id){
        return repository.findById(id).orElse(null);
    }
}
