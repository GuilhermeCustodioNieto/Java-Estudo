package guilhermenieto.projects.arquiteturaspring;

import guilhermenieto.projects.arquiteturaspring.todos.TodoEntity;
import guilhermenieto.projects.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("singleton")
public class BeanGerenciado {
    @Autowired
    public TodoValidator validator;

    public void utiliazr(){
        TodoEntity todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public TodoValidator getValidator() {
        return validator;
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}
