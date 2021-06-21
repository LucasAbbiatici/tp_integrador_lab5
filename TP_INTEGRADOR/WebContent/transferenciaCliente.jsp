<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
	<title>Transferencia</title>
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
<body class="flex items-center h-screen w-screen bg-gray-300">	
	
	<jsp:include page="PageMaster/SidebarCliente.jsp"/>
	
	
	<!--  FORMULARIO  -->
	<div class="container-contact100">
		<div class="wrap-contact100">
			<form class="contact100-form validate-form">
				<span class="contact100-form-title">
					Transferencia
				</span>

				<div class="wrap-input100 input100-select">
					<span class="label-input100">Cuenta origen</span>
					<div>
						<select class="selection-2" name="cuentas-origen">
							<option>Seleccionar cuenta</option>
							<option>2850590940090418135201 - $saldo</option>
							<option>2859530979095418432211 - $saldo</option>
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>


				<div>
					<label class="label-input100">Cuenta destino</label>
					<div class="p-t-15">
						<label class="label-input100">Cuentas propias
							<input type="radio" checked="checked" id="Si" name="seguro" value="si">
							<span class="checkmark"></span>
						</label>
						<div class="wrap-input100 input100-select">
							<select class="selection-2" name="cuentas-destino">
								<option>Seleccionar cuenta</option>
								<option>2850590940090418135201</option>
								<option>2859530979095418432211</option>
							</select>
						</div>
						<br>
						<label class="label-input100">Cuentas externas
							<input type="radio" id="No" name="seguro" value="no">
							<span class="checkmark"></span>
						</label>

						<div class="wrap-input100 validate-input">
							<span class="label-input100">CBU</span>
							<input class="input100" type="text" name="cbu" placeholder="Ingresar CBU">
							<span class="focus-input100"></span>
						</div>
					</div>
				</div>

				<div class="wrap-input100 validate-input">
					<span class="label-input100">Monto</span>
					<input class="input100" type="text" name="monto" placeholder="$">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input">
					<span class="label-input100">Concepto</span>
					<input class="input100" type="text" name="concepto" placeholder="Detalle o concepto">
					<span class="focus-input100"></span>
				</div>

				<div class="container-contact100-form-btn">
					<div class="wrap-contact100-form-btn">
						<div class="contact100-form-bgbtn bg-blue-900"></div>
						<button class="contact100-form-btn">
							<span>
								Transferir
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
</html>