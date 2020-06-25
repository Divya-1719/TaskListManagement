package com.todo;

import java.util.List;

public class ToDo {
	String name;
	String category;
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ToDo(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

	@Override
	public String toString() {
		return "ToDo [name=" + name + "]" + "category [category=" + category + "]";
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDo other = (ToDo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}