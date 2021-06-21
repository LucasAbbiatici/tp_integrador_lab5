<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				
					<tr>  
						<td>38674701</td>   
						<td>kryat</td>
						<td>Brian</td>   
						<td>Bravo</td>  
						<td>Masculino</td>  
						<td>Argentina</td>  
						<td>11/01/1995</td>  
						<td>Cube 602</td>  
						<td>Escobar</td>  
						<td>Buenos Aires</td>  
						<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						<td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
					</tr>
					
					<tr>  
						<td>41715987</td>   
						<td>Saxer</td>
						<td>Lucas</td>   
						<td>Abbiatici</td>  
						<td>Masculino</td>  
						<td>Argentina</td>  
						<td>24/02/1999</td>  
						<td>Guayaquil 2075</td>  
						<td>Grand Bourg</td>  
						<td>Buenos Aires</td>  
						<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						<td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
					</tr>
					
					<tr>  
						<td>44519520</td>   
						<td>Cabehear</td>
						<td>Luca</td>   
						<td>Adinolfi</td>  
						<td>Masculino</td>  
						<td>Argentina</td>  
						<td>10/10/2002</td>  
						<td>1045 700</td>  
						<td>La plata</td>  
						<td>Buenos Aires</td>  
						<td><input type="submit" value="Modificar" name="btnModificar" class="btnModificar"></td>  
						<td><input type="submit" value="Borrar" name="btnBorrar" class="btnBorrar"></td>
					</tr>
				</tbody>
			</table>
		
		<div>
			<input type="submit" value="Agregar un Nuevo Cliente" name="btnAgregarCliente" class="btnAgregarCliente">
		</div>
		
		</div>
	</div>
	
</body>
</html>