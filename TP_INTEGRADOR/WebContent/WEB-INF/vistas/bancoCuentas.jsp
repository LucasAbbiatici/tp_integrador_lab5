<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				
					<tr>  
						<td>001</td>   
						<td>2850590940090418135201</td>
						<td>41715987</td>   
						<td>21/06/2021</td>  
						<td>Caja de ahorros en pesos</td>  
						<td>Cuenta Lucas Pesos</td>  
						<td>$40000</td>  
						<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						<td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
					</tr>
					
					<tr>  
						<td>002</td>   
						<td>2859530979095418432211</td>
						<td>41715987</td>   
						<td>21/06/2021</td>  
						<td>Caja de ahorros en dolares</td>  
						<td>Cuenta Lucas Dolares</td>  
						<td>$1000</td>  
						<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						<td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
					</tr>
					
					<tr>  
						<td>003</td>   
						<td>2859500000005418432211</td>
						<td>38674701</td>   
						<td>21/03/2019</td>  
						<td>Caja de ahorros en pesos</td>  
						<td>Cuenta Brian Pesos</td>  
						<td>$10000</td>  
						<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						<td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
					</tr>
					
				</tbody>
			</table>
		
		<div>
			<input type="submit" value="Crear Nueva Cuenta" name="btnCrearCuenta" class="btnAgregarCliente">
		</div>
		
		</div>
	</div>
	
</body>
</html>