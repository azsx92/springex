package org.zerock.springex.service;

import com.sun.tools.javac.comp.Todo;
import org.zerock.springex.dto.TodoDTO;

import java.util.List;

public interface  TodoService {
    void register(TodoDTO todoDTO);

    List<TodoDTO> getAll();
}
