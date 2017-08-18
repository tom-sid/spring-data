<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Add User</h1>

	<form:form modelAttribute="form">
		<form:errors path="" element="div" />
		<div>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
			<form:errors path="name" />
		</div>
		<div>
			<form:label path="role">Role</form:label>
			<form:input path="role" />
			<form:errors path="role" />
		</div>
		<div>
			<input type="submit" />
		</div>
	</form:form>
</body>
</html>
