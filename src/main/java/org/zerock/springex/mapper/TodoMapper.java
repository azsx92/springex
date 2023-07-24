package org.zerock.springex.mapper;

import com.sun.tools.javac.comp.Todo;
import org.zerock.springex.domain.TodoVO;

import java.util.List;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();
}
