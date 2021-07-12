<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banco Clientes</title>
<link rel="stylesheet" type="text/css" href="assets/css/Tablas.css">
<link rel="stylesheet" type="text/css" href="assets/css/general.css">
<jsp:include page="PageMaster/MDBTabla.jsp"/>
</head>
<body>
	<div class="cuerpo">

		<div>
			<jsp:include page="PageMaster/SidebarBanco.jsp"/>
		</div>
	
		<div class="containerTabla" style="flex-flow: column nowrap;">
			<h5 style="font-weight: bold; font-size: 25px; margin-bottom: 25px;"> Clientes </h5>
			<table id="tabla" class="table table-striped table-bordered table-sm">
				<thead>
					<tr>
						<th class="th-sm">DNI</th>
						<th class="th-sm">Usuario</th>
						<th class="th-sm">Nombre</th>
						<th class="th-sm">Apellido</th>
						<th class="th-sm">Sexo</th>
						<th class="th-sm">Nacionalidad</th>
						<th class="th-sm">Fecha de Nacimiento </th>
						<th class="th-sm">Dirección </th>
						<th class="th-sm">Localidad </th>
						<th class="th-sm">Provincia </th>
						<th class="th-sm"> </th>
						<th class="th-sm"> </th>
					</tr>
				</thead>	
				<tbody>
					<c:forEach items="${listaClientes}" var="item">
						<tr>
							<td>${item.dni}</td>
							<td>${item.user.user}</td>
							<td>${item.nombre}</td>
							<td>${item.apellido}</td>
							<td>${item.sexo}</td>
							<td>${item.nacionalidad}</td>
							<td>${item.fechaNacimiento}</td>
							<td>${item.direccion}</td>
							<td>${item.localidad.nombre}</td>
							<td>${item.provincia.nombre}</td>
							<td><a href="<c:url value='/redirec-updateCliente-${item.id}' />"><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></a></td>  
						    <td><a href="<c:url value='/delete-user-${item.id}' />"><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		<form action="/TP_INTEGRADOR/redireccionarAgregarCliente" method="get">
			<div>
				<input type="submit" value="Agregar un Nuevo Cliente" name="btnAgregarCliente" class="btnAgregarCliente">
			</div>
		</form>
		<div style="${color}">
			${mensaje}
		</div>
		</div>
	</div>
	
</body>
</html>