<%@page import="com.service.UserServiceImple"%>
<%@page import="com.service.UserService"%>
<jsp:useBean id="user" class="com.dto.User" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%@ page errorPage="Error_page.jsp" %>   
<%
	UserService userService = new UserServiceImple();
	boolean b = userService.login(user);
	if(b){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("Error_page.jsp");
		//response.sendRedirect("login.jsp?error_msg=wrong credentials");
		 
	}
%>