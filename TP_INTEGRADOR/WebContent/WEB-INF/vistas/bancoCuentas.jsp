<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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
			<h5 style="font-weight: bold; font-size: 25px; margin-bottom: 25px;"> Cuentas </h5>
			<table id="tabla" class="table table-striped table-bordered table-sm">
				<thead>
					<tr>
						<th class="th-sm">Número de cuenta</th>
						<th class="th-sm">CBU</th>
						<th class="th-sm">Cliente Asignado</th>
						<th class="th-sm">Fecha de creación</th>
						<th class="th-sm">Tipo de cuenta</th>
						<th class="th-sm">Nombre</th>
						<th class="th-sm">Saldo</th>
						<th class="th-sm"> </th>
						<th class="th-sm"> </th>
					</tr>
				</thead>	
				<tbody>
				
					<c:forEach items="${listaCuentas}" var="item">
						<tr>
							<td>${item.id} </td>
							<td>${item.CBU}</td>
							<td>${item.cliente.dni} - ${item.cliente.nombre} ${item.cliente.apellido}</td>
							<td>${item.fechaCreacion}</td>
							<td>${item.tipoDeCuenta.descripcion}</td>
							<td>${item.nombre}</td>
							<td>${item.saldo}</td>
							<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						    <td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
						</tr>
					</c:forEach>
					
				</tbody>
			</table>
			<form action="/TP_INTEGRADOR/redireccionarAgregarCuenta.html">
			<div>
				<input type="submit" value="Crear Nueva Cuenta" name="btnCrearCuenta" class="btnAgregarCliente">
			</div>
		</form>
		</div>
		
	</div>
	
</body>
</html>