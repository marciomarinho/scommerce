<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h:form>
	Please enter your name:<br />
		<h:inputText value="#{person.name}" size="15" />
		<br />
		<h:commandButton type="submit" value="Say Hello"
			action="#{manager.sayHello}" />
	</h:form>

</body>
</html>