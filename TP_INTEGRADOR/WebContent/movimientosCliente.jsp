<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

	<div>
		<jsp:include page="PageMaster/SidebarCliente.jsp"/>
	</div>
	
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
		
			<tr>  
				<td>10/05/2021</td>   
				<td>Honorarios</td>     
				<td style="color:#90ee90;">$60000</td>
			</tr>
			
			<tr>  
				<td>07/06/2020</td>   
				<td>Varios</td>
				<td style="color:red;">-$7000</td>   
			</tr>
			
			<tr>  
				<td>17/11/2020</td>   
				<td>Bienes Registrables Habitualistas</td>
				<td style="color:#90ee90;">$8000</td>   
			</tr>
			
			<tr>  
				<td>20/10/2020</td>   
				<td>Cuotas</td>
				<td style="color:red;">-$7600</td>   
			</tr>
		</tbody>
	</table>

</div>
</div>

</body>
</html>