<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
<link rel="stylesheet" type="text/css" href="assets/css/tailwind.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/mainCliente.css">
</head>
<body class="flex items-center h-screen bg-gray-300">	
	<!-- Component Start -->
	<div class="flex flex-col items-center w-40 h-full overflow-hidden text-gray-50 bg-blue-900">
		<a class="flex items-center w-full px-3 mt-3" href="#">
			<svg class="w-8 h-8 fill-current" fill="currentColor" viewBox="0 0 512 512" xmlns="http://www.w3.org/2000/svg">
				<path d="M472.215 353.215C478.819 353.215 484.193 347.854 484.193 341.265V320.504H499.908C506.575 320.504 511.999 315.079 511.999 308.412V280.973C511.999 274.306 506.574 268.881 499.908 268.881H478.297V186.443C480.413 186.97 482.582 187.248 484.768 187.248C487.142 187.248 489.534 186.935 491.892 186.301C498.916 184.414 504.768 179.92 508.354 173.67C511.977 167.41 512.937 160.092 511.057 153.064C509.176 146.032 504.685 140.166 498.413 136.547L270.569 5.00501C266.397 2.57801 261.358 1.29501 255.998 1.29501C250.638 1.29501 245.599 2.57801 241.449 4.99301L13.575 136.55C0.60197 144.059 -3.85403 160.706 3.63697 173.661C7.25697 179.934 13.117 184.425 20.14 186.306C24.666 187.518 29.314 187.544 33.728 186.444V268.88H12.117C5.44897 268.88 0.0249695 274.305 0.0249695 280.972V308.411C0.0249695 315.078 5.44997 320.503 12.117 320.503H27.831V341.264C27.831 347.854 33.192 353.214 39.781 353.214H48.807V426.37H39.781C33.192 426.37 27.831 431.743 27.831 438.348V459.081H12.117C5.44897 459.081 0.0249695 464.506 0.0249695 471.173V498.612C0.0249695 505.279 5.44997 510.704 12.117 510.704H240.352C244.494 510.704 247.852 507.346 247.852 503.204C247.852 499.062 244.495 495.704 240.352 495.704H15.024V474.081H497V495.704H274.961C270.819 495.704 267.461 499.062 267.461 503.204C267.461 507.346 270.818 510.704 274.961 510.704H499.908C506.575 510.704 511.999 505.279 511.999 498.612V471.173C511.999 464.506 506.574 459.081 499.908 459.081H484.193V438.348C484.193 431.743 478.819 426.37 472.215 426.37H463.19V353.214H472.215V353.215ZM33.256 170.617C30.45 172.235 27.172 172.661 24.02 171.817C20.871 170.973 18.245 168.966 16.629 166.164C16.627 166.161 16.626 166.159 16.624 166.156C13.268 160.357 15.271 152.899 21.082 149.536L248.97 17.971C250.8 16.906 253.362 16.295 255.998 16.295C258.673 16.295 261.169 16.89 263.048 17.983L490.917 149.538C493.717 151.154 495.724 153.783 496.569 156.941C497.413 160.095 496.988 163.368 495.36 166.181C493.759 168.97 491.146 170.971 488.001 171.817C484.848 172.664 481.572 172.241 478.772 170.62L259.748 44.167C258.588 43.497 257.293 43.162 255.998 43.162C254.703 43.162 253.408 43.497 252.248 44.167L33.256 170.617ZM15.024 283.881H240.352C244.494 283.881 247.852 280.523 247.852 276.381C247.852 272.239 244.495 268.881 240.352 268.881H48.727V179.004L255.998 59.322L463.298 179.005V268.881H273.714C269.572 268.881 266.214 272.239 266.214 276.381C266.214 280.523 269.571 283.881 273.714 283.881H497V305.504H15.024V283.881ZM209.5 338.215V320.504H302.496V338.215H209.5ZM281.492 353.215V426.371H230.504V353.215H281.492ZM42.831 338.215V320.504H135.798V338.215H42.831ZM114.823 353.215V426.371H63.807V353.215H114.823ZM135.798 459.082H42.831V441.371H135.798V459.082ZM194.5 438.349V459.082H150.797V438.349C150.797 431.744 145.437 426.371 138.847 426.371H129.822V353.215H138.847C145.437 353.215 150.797 347.854 150.797 341.265V320.504H194.5V341.265C194.5 347.855 199.874 353.215 206.478 353.215H215.504V426.371H206.478C199.874 426.371 194.5 431.744 194.5 438.349ZM302.496 459.082H209.5V441.371H302.496V459.082ZM361.198 438.349V459.082H317.495V438.349C317.495 431.744 312.121 426.371 305.517 426.371H296.492V353.215H305.517C312.121 353.215 317.495 347.854 317.495 341.265V320.504H361.198V341.265C361.198 347.855 366.572 353.215 373.177 353.215H382.202V426.371H373.177C366.572 426.371 361.198 431.744 361.198 438.349ZM469.194 441.371V459.082H376.198V441.371H469.194ZM397.202 426.371V353.215H448.19V426.371H397.202ZM376.198 338.215V320.504H469.194V338.215H376.198Z"/>
				<path d="M288.611 119.004C288.611 101.63 274.477 87.495 257.103 87.495C239.729 87.495 225.595 101.63 225.595 119.004C225.595 136.378 239.729 150.513 257.103 150.513C274.477 150.513 288.611 136.378 288.611 119.004ZM240.595 119.004C240.595 109.901 248.001 102.495 257.103 102.495C266.205 102.495 273.611 109.901 273.611 119.004C273.611 128.107 266.205 135.513 257.103 135.513C248.001 135.513 240.595 128.107 240.595 119.004Z" />
				<path d="M328.748 205.246L357.52 245H376.265V172H357.55V212.771L328.327 172H310V245H328.748V205.246Z"/>
				<path d="M265.169 245V187.854H285.883V172H226V187.854H246.762V245H265.169Z"/>
				<path d="M183.527 212.07C183.529 221.706 183.38 224.599 180.072 227.168C176.912 229.624 168.378 229.99 164.312 226.997C160.427 224.14 160.275 220.098 160.342 213.198L160.356 172H142V210.29C142 223.617 142 236.205 156.777 242.571C163.563 245.5 178.798 246.028 186.977 242.78C201.883 236.859 201.883 224.319 201.883 209.739V172H183.527V212.07Z" />
			</svg>
			<span class="ml-2 text-sm font-bold">UTN BANK</span>
		</a>
		<div class="w-full px-2">
			<div class="flex flex-col items-center w-full mt-3 border-t border-gray-700">
				<a class="flex items-center w-full h-12 px-3 mt-2 rounded hover:bg-gray-700 hover:text-gray-300" href="#">
					<svg class="w-6 h-6 stroke-current" xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 512 512" stroke="currentColor">
						<path d="M487.59,299.894h-7.662v-69.015c0-10.926-5.438-20.6-13.743-26.478v-9.397c0-13.631-11.089-24.72-24.72-24.72h-5.721
								l21.889-32.12c7.337-10.766,4.547-25.495-6.219-32.833L302.883,4.111c-5.215-3.555-11.501-4.867-17.705-3.69
								c-6.201,1.175-11.574,4.694-15.128,9.91L141.849,198.454h-35.675l8.607-87.13c0.097-0.982,0.735-1.833,1.625-2.168
								c11.089-4.181,20.699-11.989,27.059-21.985c0.501-0.787,1.446-1.237,2.424-1.138l55.955,5.528
								c4.012,0.389,7.581-2.533,7.977-6.543s-2.533-7.581-6.543-7.977l-55.955-5.528c-6.495-0.636-12.689,2.357-16.169,7.825
								c-4.676,7.35-11.742,13.09-19.895,16.164c-6.137,2.314-10.351,7.826-10.999,14.387l-8.748,88.564h-9.303L95.821,60.649
								c0.49-4.96,4.917-8.604,9.883-8.107l113.074,11.17c4.01,0.387,7.581-2.533,7.977-6.543s-2.533-7.581-6.543-7.977l-113.074-11.17
								C94.174,36.743,82.581,46.248,81.3,59.214l-10.972,111.07H51.643c-13.63,0-24.72,11.089-24.72,24.72v6.41
								c-11.151,5.134-18.915,16.406-18.915,29.465v248.695c0,17.88,14.546,32.426,32.427,32.426h407.067
								c17.88,0,32.426-14.546,32.426-32.426V410.56h7.662c9.044,0,16.401-7.357,16.401-16.4v-77.865
								C503.992,307.251,496.634,299.894,487.59,299.894z M441.465,184.876L441.465,184.876c5.586-0.001,10.129,4.543,10.129,10.129
								v3.717c-1.342-0.17-2.705-0.267-4.092-0.267h-30.955l9.253-13.579H441.465z M282.107,18.547c1.36-1.995,3.415-3.341,5.787-3.791
								c0.567-0.107,1.136-0.161,1.701-0.161c1.797,0,3.553,0.538,5.071,1.572l148.531,101.22c4.118,2.807,5.186,8.441,2.38,12.559
								l-46.686,68.506h-11.204l22.889-33.587c3.712-5.447,4.018-12.379,0.796-18.092c-4.282-7.59-6.018-16.527-4.888-25.166
								c0.84-6.427-1.988-12.701-7.38-16.375L322.106,52.76c-5.393-3.675-12.267-4.012-17.941-0.879
								c-7.625,4.21-16.578,5.863-25.208,4.655c-6.4-0.898-12.891,1.992-16.548,7.357l-91.699,134.56h-11.204L282.107,18.547z
								 M285.32,142.438c-31.771,0-57.851,24.773-59.976,56.015h-36.979L274.464,72.11c0.001,0,0.001,0,0.001,0
								c0.489-0.719,1.3-1.147,2.133-1.147c0.111,0,0.222,0.008,0.333,0.023c11.738,1.642,23.913-0.604,34.285-6.331
								c0.816-0.452,1.864-0.387,2.672,0.163l76.999,52.473c0.806,0.55,1.249,1.502,1.129,2.426c-1.537,11.749,0.825,23.903,6.648,34.225
								c0.467,0.829,0.41,1.891-0.144,2.706l-28.488,41.804h-24.733C343.172,167.211,317.093,142.438,285.32,142.438z M330.668,198.454
								h-90.695c2.09-23.189,21.624-41.424,45.347-41.424C309.044,157.029,328.579,175.265,330.668,198.454z M41.514,195.004
								c0-5.586,4.543-10.13,10.129-10.13h17.244l-1.341,13.579H41.514V195.004z M22.599,230.879c0-9.834,8.001-17.835,17.836-17.835
								h407.067c9.835,0,17.835,8.001,17.835,17.835v20.244H22.599V230.879z M465.337,479.574c0,9.834-8,17.835-17.835,17.835H40.435
								c-9.835,0-17.836-8.001-17.836-17.835V459.33h39.342c4.03,0,7.295-3.266,7.295-7.295c0-4.029-3.266-7.295-7.295-7.295H22.599
								V265.714h442.738v34.18h-69.366h-0.001c-21.856,0-40.788,12.74-49.773,31.181c-0.03,0.062-0.064,0.122-0.095,0.184
								c-0.076,0.157-0.142,0.32-0.216,0.478c-1.07,2.273-2,4.626-2.757,7.054c-0.002,0.007-0.004,0.013-0.006,0.02
								c-1.615,5.189-2.486,10.702-2.486,16.416c0,30.511,24.822,55.333,55.332,55.333h0.001h69.366v34.18H108.655
								c-4.03,0-7.295,3.266-7.295,7.295c0,4.029,3.266,7.295,7.295,7.295h356.682V479.574z M489.401,394.159
								c0,0.998-0.812,1.81-1.811,1.81h-91.618c-15.445,0-28.911-8.639-35.818-21.338c-0.314-0.577-0.614-1.163-0.901-1.756
								c-0.573-1.187-1.09-2.406-1.547-3.654c-1.602-4.366-2.476-9.08-2.476-13.994s0.875-9.628,2.476-13.994
								c0.458-1.247,0.975-2.466,1.547-3.654c0.287-0.593,0.587-1.179,0.901-1.756c6.907-12.699,20.373-21.338,35.818-21.338h91.618
								c0.998,0,1.811,0.812,1.811,1.81V394.159z"/>
					</svg>
					<span class="ml-2 text-sm font-medium">Mis Cuentas</span>
				</a>
				<a class="flex items-center w-full h-12 px-3 mt-2 rounded hover:bg-gray-700 hover:text-gray-300" href="#">
					<svg class="w-6 h-6 stroke-current" fill="currentColor" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" stroke="currentColor">
						<g id="_13-transfer" data-name="13-transfer"><g id="linear_color" data-name="linear color">
						<path d="M32,454a10,10,0,0,0,0,20H224a10,10,0,0,0,0-20h-6V361h6a10,10,0,0,0,10-10V336a10,10,0,0,0-4.453-8.32l-96-64a10,10,0,0,0-11.094,0l-96,64A10,10,0,0,0,22,336v15a10,10,0,0,0,10,10h6v93Zm58-92h76v92H90Zm96,92V362h12v92ZM128,284.019,213.472,341H42.528ZM58,362H70v92H58Z"/>
						<path d="M240,486H16a10,10,0,0,0,0,20H240a10,10,0,0,0,0-20Z"/>
						<path d="M288,200a10,10,0,0,0,0,20H480a10,10,0,0,0,0-20h-6V107h6a10,10,0,0,0,10-10V82a10,10,0,0,0-4.453-8.32l-96-64a10,10,0,0,0-11.094,0l-96,64A10,10,0,0,0,278,82V97a10,10,0,0,0,10,10h6v93Zm58-92h76v92H346Zm96,92V108h12v92ZM384,30.019,469.473,87H298.527ZM314,108h12v92H314Z"/>
						<path d="M496,232H272a10,10,0,0,0,0,20H496a10,10,0,0,0,0-20Z"/>
						<path d="M429.129,289.2a10,10,0,0,0-12.136,7.26A165.381,165.381,0,0,1,298.061,416.607l12.247-22.894a10,10,0,0,0-17.635-9.434L270.031,426.6a10,10,0,0,0,4.285,13.631l42.8,21.76a10,10,0,1,0,9.065-17.828l-18.6-9.457A185.863,185.863,0,0,0,436.39,301.339,10,10,0,0,0,429.129,289.2Z"/>
						<path d="M82.872,222.8a9.984,9.984,0,0,0,12.135-7.26A165.383,165.383,0,0,1,213.939,95.393l-12.247,22.894a10,10,0,1,0,17.635,9.434L241.969,85.4a10,10,0,0,0-4.285-13.631l-42.8-21.76a10,10,0,1,0-9.065,17.828l18.6,9.457A185.86,185.86,0,0,0,75.611,210.661,10,10,0,0,0,82.872,222.8Z"/>
						</g></g>
					</svg>
					<span class="ml-2 text-sm font-medium">Transferencias</span>
				</a>
				<a class="flex items-center w-full h-12 px-3 mt-2 rounded hover:bg-gray-700 hover:text-gray-300" href="#">
					<svg class="w-6 h-6 stroke-current" xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 512 512" stroke="currentColor">
						<path d="M503.971,242.039l-121.055-89.303c-9.814-7.24-23.72-0.206-23.72,11.977v44.651h-29.768V44.651
									C329.429,20.031,309.398,0,284.777,0H46.637C22.063,0,1.986,20.027,1.986,44.651c0,13.702,0,324.373,0,343.264
									c0,14.963,7.433,28.852,19.884,37.152l119.07,79.38c29.642,19.762,69.42-1.572,69.42-37.152v-18.797h74.419
									c24.621,0,44.651-20.031,44.651-44.651V298.668h29.768v44.651c0,12.27,13.981,19.161,23.72,11.977l121.055-89.303
									C512.029,260.049,512.028,247.983,503.971,242.039z M157.452,479.678l-119.07-79.38c-4.151-2.767-6.628-7.397-6.628-12.384
									c0-4.22,0-287.54,0-343.264c0-1.834,0.349-3.583,0.958-5.206l137.171,68.586c4.885,2.442,10.708,6.95,10.708,14.553v344.711h0.001
									C180.592,479.194,167.359,486.285,157.452,479.678z M299.662,403.847c0,8.207-6.677,14.884-14.884,14.884H210.36V122.584
									c0-17.537-9.901-32.546-27.163-41.178L79.919,29.768h204.859c8.207,0,14.884,6.677,14.884,14.884v164.714h-44.651
									c-8.22,0-14.884,6.664-14.884,14.884v59.535c0,8.22,6.664,14.884,14.884,14.884h44.651V403.847z M388.965,313.843v-30.059
									c0-8.22-6.664-14.884-14.884-14.884H269.895v-29.768h104.186c8.22,0,14.884-6.664,14.884-14.884V194.19l81.099,59.827
									L388.965,313.843z"/>
					</svg>
					<span class="ml-2 text-sm font-medium">Log out</span>
				</a>
			</div>
		</div>
		<a class="flex items-center justify-center w-full h-16 mt-auto bg-gray-800 hover:bg-gray-700 hover:text-gray-300" href="#">
			<svg class="w-6 h-6 stroke-current" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
				<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5.121 17.804A13.937 13.937 0 0112 16c2.5 0 4.847.655 6.879 1.804M15 10a3 3 0 11-6 0 3 3 0 016 0zm6 2a9 9 0 11-18 0 9 9 0 0118 0z" />
			</svg>
			<span class="ml-2 text-sm font-medium">Nombre de Usuario</span>
		</a>
	</div>
	<!-- Component End  -->

</body>
</html>