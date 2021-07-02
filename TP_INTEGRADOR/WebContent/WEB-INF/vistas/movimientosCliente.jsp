<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movimientos Cliente</title>
<link rel="stylesheet" type="text/css" href="assets/css/Tablas.css">
<link rel="stylesheet" type="text/css" href="assets/css/general.css">
<jsp:include page="PageMaster/MDBTabla.jsp"/>
</head>
<body>

<div class="cuerpo">


		<jsp:include page="PageMaster/SidebarCliente.jsp"/>

	
<div class="containerTabla" style="flex-flow: column nowrap;">
	<h5 style="font-weight: bold; font-size: 25px; margin-bottom: 25px;"> Movimientos </h5>
	<table id="tabla" class="table table-striped table-bordered table-sm">
		<thead>
			<tr>
				<th class="th-sm">Fecha</th>
				<th class="th-sm">Detalle/Concepto</th>
				<th class="th-sm">Importe</th>
			</tr>
		</thead>	
		<tbody>
			<c:forEach items="${listaMovimientos}" var="item">
				<tr>  
					<td>${item.fecha}</td>   
					<td>${item.detalle}</td>     
					<td <c:choose><c:when test="${item.tipoDeMovimiento.id == 2}"> style="color:#90ee90;"</c:when><c:when test="${item.tipoDeMovimiento.id == 1}"> style="color:red;" </c:when></c:choose>>
					<c:if test="${item.tipoDeMovimiento.id == 1}">-</c:if> ${item.importe}	
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>
</div>

</body>
</html>