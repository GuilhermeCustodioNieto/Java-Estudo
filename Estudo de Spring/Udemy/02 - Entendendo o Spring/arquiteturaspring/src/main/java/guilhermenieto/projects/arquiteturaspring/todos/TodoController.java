package guilhermenieto.projects.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService service){
        this.todoService = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
        return this.todoService.salvar(todo);
    }

    @PutMapping("/{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        todoService.atualizarTodo(todo);
    }

    @GetMapping("/{id}")
    public TodoEntity buscar(@PathVariable("id") Integer id){
        return todoService.buscar(id);
    }
}
