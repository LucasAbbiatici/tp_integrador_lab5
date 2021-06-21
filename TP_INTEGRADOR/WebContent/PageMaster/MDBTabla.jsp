<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>

  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Material Design for Bootstrap</title>
  <!-- MDB icon -->
  <link rel="icon" href="assets/img/mdb-favicon.ico" type="image/x-icon">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <!-- Google Fonts Roboto -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="assets/css-b/bootstrap.min.css">
  <!-- Material Design Bootstrap -->
  <link rel="stylesheet" href="assets/css-b/mdb.min.css">
  <!-- Your custom styles (optional) -->
  <link rel="stylesheet" href="assets/css-b/style.css">
  <!-- MDBootstrap Datatables  -->
  <link href="assets/css-b/addons/datatables.min.css" rel="stylesheet">

</head>
<body>

  <!-- jQuery -->
  <script type="text/javascript" src="assets/js/jquery.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="assets/js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="assets/js/mdb.min.js"></script>
  <!-- Your custom scripts (optional) -->
  <script type="text/javascript"></script>
  <!-- MDBootstrap Datatables  -->
  <script type="text/javascript" src="assets/js/addons/datatables.min.js"></script>
  
    <script>
	$(document).ready(function () {
		  $('#tabla').dataTable( {
			  "lengthMenu": [ 5 ],
			  "autoWidth": false
			});
  		$('.dataTables_length').addClass('bs-select');
	});
  </script>
  
    <script>
	$(document).ready(function () {
		  $('#tablaNotas').dataTable( {
			  "lengthMenu": [ 100 ],
			  "autoWidth": false,
			  "paging": false,
			  "searching": false,
			  "ordering": false
			});
  		$('.dataTables_length').addClass('bs-select');
	});
  </script>

</body>
</html>