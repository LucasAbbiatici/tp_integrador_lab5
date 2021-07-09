<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
	<title>Transferencia</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
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
			<form class="contact100-form validate-form" action="/TP_INTEGRADOR/transferencia" method="POST">
				<span class="contact100-form-title">
					Transferencia
				</span>

				<div class="wrap-input100 input100-select">
					<span class="label-input100">Cuenta origen</span>
					<div>
						<select class="selection-2" name="selectCuentaOrigen" id="cuenta-origen" >
							<option >Seleccionar cuenta</option>
							<c:forEach items="${listaCuentasCliente}" var="item">
								<option value="${item.id}">${item.CBU} - ${item.nombre} - ${item.saldo}</option>
							</c:forEach>
							
						</select>
					</div>
					<span class="focus-input100"></span>
				</div>


				<div>
					<label class="label-input100">Cuenta destino</label>
					<div class="p-t-15">
						<label class="label-input100">Cuentas propias
							<input type="radio" checked="checked" id="rdbCuenta" name="rdbCuenta" value="si" onclick="document.getElementById('cuenta-destino').disabled = false; document.getElementById('cbu').disabled = true;">
							<span class="checkmark"></span>
						</label>
						<div class="wrap-input100 input100-select">
							<select class="selection-2" name="selectCuentaDestino" id="cuenta-destino">
								<option>Seleccionar cuenta</option>
								
							</select>
						</div>
						<br>
						<label class="label-input100">Cuentas externas
							<input type="radio" id="rdbCuenta" name="rdbCuenta" value="no" onclick="document.getElementById('cuenta-destino').disabled = true; document.getElementById('cbu').disabled = false;">
							<span class="checkmark"></span>
						</label>

						<div class="wrap-input100 validate-input">
							<span class="label-input100">CBU</span>
							<input class="input100" type="text" name="txtCbu" placeholder="Ingresar CBU" id="cbu" disabled>
							<span class="focus-input100"></span>
						</div>
					</div>
				</div>

				<div class="wrap-input100 validate-input">
					<span class="label-input100">Importe</span>
					<input class="input100" type="text" name="txtImporte" placeholder="$">
					<span class="focus-input100"></span>
				</div>

				<div class="wrap-input100 validate-input">
					<span class="label-input100">Concepto</span>
					<input class="input100" type="text" name="txtDetalle" placeholder="Detalle o concepto">
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
			<div style="${color}">
				${mensaje}
			</div>
		</div>
	</div>
	<!--  END FORMULARIO  -->




	<!--===============================================================================================-->
	
	<!--===============================================================================================-->
	<script src="assets/vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/bootstrap/js/popper.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/select2/select2.min.js"></script>

	<!--===============================================================================================-->
	<script src="assets/vendor/daterangepicker/moment.min.js"></script>
	<script src="assets/vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script src="assets/vendor/countdowntime/countdowntime.js"></script>
	<!--===============================================================================================-->
	<script src="assets/js/transferencia.js"></script>
	
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>

        $(document).ready(function(){
            let ddlCuentaOrigen = document.querySelector('#cuenta-origen');

            //clono los options de cuenta-origen despues del 1er elemento("seleccionar origen") y lo copio en cuenta-destino
            $('#cuenta-origen option').clone().slice(1).appendTo('#cuenta-destino');
            
            
            ddlCuentaOrigen.addEventListener("change",() =>{
            	 console.log("pase");
                document.querySelectorAll('#cuenta-destino option')[0].selected = true;

                let options = document.querySelectorAll('#cuenta-destino option');
                options.forEach(option => {
                    if (option.value == ddlCuentaOrigen.value) {
                        option.style.visibility ='hidden';
                        option.style.display  ='none';
                    }else{
                        option.style.visibility ='visible';
                        option.style.display  ='block';
                    }
                });
            });
        });
        
    </script>
    
    
 

</body>

</html>