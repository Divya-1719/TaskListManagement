package com.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {
	// defined the List without method
	private static List<ToDo> todo = new ArrayList<ToDo>();
	// Creating the TO-DO Task Static List
	static {
		todo.add(new ToDo("Lets start JSP", "Study"));
		todo.add(new ToDo("Lets Start Servlets", "Study"));
		todo.add(new ToDo("Lets Start Spring", "Study"));
	}

	// To retrive the List
	public List<ToDo> Retrive() {
		return (todo);
	}

	// To add the List
	public void Add(ToDo AddToDo) {
		todo.add(AddToDo);
	}

	// To delete the List
	public void delete(ToDo deleteToDo) {
		todo.remove(deleteToDo);
	}

}
