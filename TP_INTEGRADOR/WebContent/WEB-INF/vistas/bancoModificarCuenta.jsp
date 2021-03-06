<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html><head>
	<title>Modificar Cuenta</title>
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
	<div class="container-contact100">
		<div class="wrap-contact100">
			<form class="contact100-form validate-form" action="/TP_INTEGRADOR/modificarCuenta">
				<span class="contact100-form-title">
					Modificar Cuenta
				</span>

						<div class="wrap-input100 validate-input">
							<input type="hidden" value="${cuenta.id}" name="txtId">
							<span class="label-input100">Nombre</span>
							<input value="${cuenta.nombre}"class="input100" type="text" name="txtNombre" id="txtNombre" placeholder="Ingresar Nombre" onkeypress="return (event.charCode > 64 && event.charCode < 91 ) || (event.charCode > 96 && event.charCode < 123) || (event.charCode == 32 )   " required>
							<span class="focus-input100"></span>
						</div>
					
				<div class="wrap-input100 input100-select">
					<span class="label-input100">Tipo de cuenta</span>
					<div>
						<select class="selection-2" name="selectTipoCuenta" required>
							<c:forEach items="${listaTipoCue}" var="item">
								<option value="${item.id}" <c:if test="${cuenta.tipoDeCuenta.id == item.id}">selected</c:if>>${item.descripcion}</option>
							</c:forEach>
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 input100-select">
					<span class="label-input100">Asignar Cliente</span>
					<div>
						<select class="selection-2" name="selectClientes" required>							
							<c:forEach items="${listaClientes}" var="item">
							
							<option value="${item.id}" <c:if test="${cuenta.cliente.id == item.id}">selected</c:if>>${item.dni} - ${item.nombre} ${item.apellido}</option>
								
							</c:forEach>
							
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>
				
				<div class="container-contact100-form-btn">
					<div class="wrap-contact100-form-btn">
						<div class="contact100-form-bgbtn bg-blue-900"></div>
						<button class="contact100-form-btn">
							<span>
								Modificar Cuenta
								<i class="fa fa-long-arrow-right m-l-7" aria-hidden="true"></i>
							</span>
						</button>
					</div>
				</div>
			</form>
			<div style="${color}">
				${mensaje}
			</div>
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
<script>
	function comprobarNombre(valor,campo){
		 var mensaje="";
		 if(!$('#txtNombre').val().trim().length){
			 mensaje="Ingrese un nombre valido";
		 }
		 
		 this.setCustomValidity(mensaje);
		 
	 }
	 var nombre=document.querySelector("#txtNombre");
	    nombre.addEventListener("invalid", comprobarNombre);
		nombre.addEventListener("input", comprobarNombre);
</script>
</html>