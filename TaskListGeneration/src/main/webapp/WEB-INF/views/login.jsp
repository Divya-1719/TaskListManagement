<%@ include file="../common/Header.jspf" %>
<%@ include file="../common/navigation.jspf" %>


	<div class="container">
		<p>
			<font color="Red"> ${ErrorMessage} </font>
		</p>
		<form action="/login.do" method="post">
			Enter the name <input type="text" name="name" /> Enter the Passcode <input
				type="password" name="passcode" /> <input type="submit"
				value="login" class = "btn btn-success"/>
		</form>

	</div>

<%@ include file="../common/Footer.jspf" %>