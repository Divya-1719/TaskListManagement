<%@ include file="../common/Header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<div class="container">
		<H1>Welcome ${name}</H1>
		<table class = "table table-striped">
		<caption>Your To-Dos Are</caption>
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Action</th>	 
			</thead>
		<tbody>
		<c:forEach items = "${todo}" var = "todo" >
		<tr>
		<td>${todo.name}</td>
		<td>${todo.category} </td>
		<td><a href="/delete-ToDo.do?todo=${todo.name}&${todo.category}" class = "btn btn-danger">Delete</a>
		</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
		<a href ="/add-ToDo.do" class = "btn btn-success">ADD TO-DO</a>
	</div>

<%@ include file="../common/Footer.jspf" %>