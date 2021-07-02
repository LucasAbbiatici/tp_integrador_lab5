<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Cliente</title>
<link rel="stylesheet" type="text/css" href="assets/css/Tablas.css">
<link rel="stylesheet" type="text/css" href="assets/css/general.css">
<jsp:include page="PageMaster/MDBTabla.jsp"/>
</head>
<body>

<div class="cuerpo">


		<jsp:include page="PageMaster/SidebarCliente.jsp"/>

	
<div class="containerTabla" style="flex-flow: column nowrap;">
	<h5 style="font-weight: bold; font-size: 25px; margin-bottom: 25px;"> Mis Cuentas </h5>
	<table id="tabla" class="table table-striped table-bordered table-sm">
		<thead>
			<tr>
				<th class="th-sm">Número de Cuenta</th>
				<th class="th-sm">CBU</th>
				<th class="th-sm">Tipo de Cuenta</th>
				<th class="th-sm">Nombre Cuenta</th>
				<th class="th-sm">Saldo</th>
				<th class="th-sm"> </th>
			</tr>
		</thead>	
		<tbody>
			<c:forEach items="${listaCuentasCliente}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.CBU}</td>
					<td>${item.tipoDeCuenta.descripcion}</td>
					<td>${item.nombre}</td>
					<td>${item.saldo}</td>
					<td><a href="<c:url value='/movimientos-cuenta-${item.id}' />"><input type="submit" value="Movimientos" name="btnMovimientos" class="btnMovimientos"></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>
</div>

</body>
</html>