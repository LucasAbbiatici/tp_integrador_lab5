<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
	<title>Modificar Cliente</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/vendor/bootstrap/css/bootstrap.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/vendor/animate/animate.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/vendor/css-hamburgers/hamburgers.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/vendor/animsition/css/animsition.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/vendor/select2/select2.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/vendor/daterangepicker/daterangepicker.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/css/util.css">
	<link rel="stylesheet" type="text/css" href="assets/css/transferencia.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="assets/css/tailwind.min.css">
</head>
<body class="flex  h-screen  bg-gray-300">	
	
	<jsp:include page="PageMaster/SidebarBanco.jsp"/>
	
	
	<!--  FORMULARIO  -->
	<div class="container-contact100 overflow-auto">
		<div class="wrap-contact100">
			<form class="contact100-form validate-form">
				<span class="contact100-form-title">
					Modificar Cliente
				</span>

					
						<div class="wrap-input100 validate-input">
							<span class="label-input100">DNI</span>
							<input class="input100" type="text" name="dni" value="${cliente.dni}">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input">
							<span class="label-input100">Nombres</span>
							<input class="input100" type="text" name="nombre" value="${cliente.nombre}">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input">
							<span class="label-input100">Apellido</span>
							<input class="input100" type="text" name="apellido" value="${cliente.apellido}">
							<span class="focus-input100"></span>
						</div>
					
				
				
				<div class="wrap-input100 input100-select">
					<span class="label-input100">Sexo</span>
					<div>
						<select class="selection-2" name="sexo">
							<option value="Masculino"  
							<c:if test="${ cliente.sexo == 'Masculino' }">
								selected
							</c:if> 
							>
							Masculino
							</option>
							<option value="Femenino" 
							<c:if test="${ cliente.sexo == 'Femenino' }">
								selected
							</c:if> 
							>
							Femenino
							</option>
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>
				
				
				  <div class="wrap-input100">
                        	<span class="label-input100">Fecha de Nacimiento</span>
                        	<br>
                         	<div class="value">
                            <div class="input-group">
                          		<input class="input100" type="date" name="date_fechaNacimiento" value="${cliente.fechaNacimiento}" required>
                          	</div>
                          	</div>
                        </div>

				<div class="wrap-input100 validate-input">
					<span class="label-input100">Nacionalidad</span>
					<input class="input100" type="text" name="Nacionalidad" value="${cliente.nacionalidad}">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input">
					<span class="label-input100">Direccion</span>
					<input class="input100" type="text" name="Direccion" value="${cliente.direccion}">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 input100-select">
					<span class="label-input100">Provincia</span>
					<div>
						<select id="provincias" name="provincias" >
						
							
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>
			<div class="wrap-input100 input100-select">
					<span class="label-input100">Localidades</span>
					<div>
						<select name="localidades" id="localidades">
						
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>
				

				<div class="container-contact100-form-btn">
					<div class="wrap-contact100-form-btn">
						<div class="contact100-form-bgbtn bg-blue-900"></div>
						<button class="contact100-form-btn">
							<span>
								Modificar Cliente
								<i class="fa fa-long-arrow-right m-l-7" aria-hidden="true"></i>
							</span>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!--  END FORMULARIO  -->


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="assets/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/bootstrap/js/popper.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
	<!--===============================================================================================-->
	<script src="assets/vendor/daterangepicker/moment.min.js"></script>
	<script src="assets/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="assets/js/transferencia.js"></script>
	
	
</body>

</html>