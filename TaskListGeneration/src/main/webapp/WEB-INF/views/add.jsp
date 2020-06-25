<%@ include file="../common/Header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<div class="container">
		Enter ToDo Name Here:<br>
		<form action="/add-ToDo.do" method="post">
		<fieldset class="form-group">
		<label>AddDescription</label> <input type ="text" name = "newtodo"  class = "form-control"> <br>
		</fieldset>
		<fieldset class="form-group">
		<label>AddCategory</label> <input type = "text" name = "newcategory" class = "form-control"><br>
		</fieldset>
		<input type="submit" value ="Add" class ="btn btn-success">
		</form>	
	</div>

<%@ include file="../common/Footer.jspf" %>