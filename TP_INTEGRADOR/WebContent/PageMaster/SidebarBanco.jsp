<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sidebar Banco</title>
<link rel="stylesheet" type="text/css" href="assets/css/tailwind.min.css">
</head>
<body class="flex h-screen w-screen bg-gray-300">	
	<!-- Component Start -->
	
	<div class="flex flex-col items-center w-40 h-full fixed overflow-hidden text-gray-50 bg-blue-900 ">
		<div class="flex items-center w-full px-3 mt-3">
			
			<!-- Logo UTN BANK -->
			<svg class="w-8 h-8 fill-current" fill="currentColor" viewBox="0 0 512 512" xmlns="http://www.w3.org/2000/svg">
				<path d="M472.215 353.215C478.819 353.215 484.193 347.854 484.193 341.265V320.504H499.908C506.575 320.504 511.999 315.079 511.999 308.412V280.973C511.999 274.306 506.574 268.881 499.908 268.881H478.297V186.443C480.413 186.97 482.582 187.248 484.768 187.248C487.142 187.248 489.534 186.935 491.892 186.301C498.916 184.414 504.768 179.92 508.354 173.67C511.977 167.41 512.937 160.092 511.057 153.064C509.176 146.032 504.685 140.166 498.413 136.547L270.569 5.00501C266.397 2.57801 261.358 1.29501 255.998 1.29501C250.638 1.29501 245.599 2.57801 241.449 4.99301L13.575 136.55C0.60197 144.059 -3.85403 160.706 3.63697 173.661C7.25697 179.934 13.117 184.425 20.14 186.306C24.666 187.518 29.314 187.544 33.728 186.444V268.88H12.117C5.44897 268.88 0.0249695 274.305 0.0249695 280.972V308.411C0.0249695 315.078 5.44997 320.503 12.117 320.503H27.831V341.264C27.831 347.854 33.192 353.214 39.781 353.214H48.807V426.37H39.781C33.192 426.37 27.831 431.743 27.831 438.348V459.081H12.117C5.44897 459.081 0.0249695 464.506 0.0249695 471.173V498.612C0.0249695 505.279 5.44997 510.704 12.117 510.704H240.352C244.494 510.704 247.852 507.346 247.852 503.204C247.852 499.062 244.495 495.704 240.352 495.704H15.024V474.081H497V495.704H274.961C270.819 495.704 267.461 499.062 267.461 503.204C267.461 507.346 270.818 510.704 274.961 510.704H499.908C506.575 510.704 511.999 505.279 511.999 498.612V471.173C511.999 464.506 506.574 459.081 499.908 459.081H484.193V438.348C484.193 431.743 478.819 426.37 472.215 426.37H463.19V353.214H472.215V353.215ZM33.256 170.617C30.45 172.235 27.172 172.661 24.02 171.817C20.871 170.973 18.245 168.966 16.629 166.164C16.627 166.161 16.626 166.159 16.624 166.156C13.268 160.357 15.271 152.899 21.082 149.536L248.97 17.971C250.8 16.906 253.362 16.295 255.998 16.295C258.673 16.295 261.169 16.89 263.048 17.983L490.917 149.538C493.717 151.154 495.724 153.783 496.569 156.941C497.413 160.095 496.988 163.368 495.36 166.181C493.759 168.97 491.146 170.971 488.001 171.817C484.848 172.664 481.572 172.241 478.772 170.62L259.748 44.167C258.588 43.497 257.293 43.162 255.998 43.162C254.703 43.162 253.408 43.497 252.248 44.167L33.256 170.617ZM15.024 283.881H240.352C244.494 283.881 247.852 280.523 247.852 276.381C247.852 272.239 244.495 268.881 240.352 268.881H48.727V179.004L255.998 59.322L463.298 179.005V268.881H273.714C269.572 268.881 266.214 272.239 266.214 276.381C266.214 280.523 269.571 283.881 273.714 283.881H497V305.504H15.024V283.881ZM209.5 338.215V320.504H302.496V338.215H209.5ZM281.492 353.215V426.371H230.504V353.215H281.492ZM42.831 338.215V320.504H135.798V338.215H42.831ZM114.823 353.215V426.371H63.807V353.215H114.823ZM135.798 459.082H42.831V441.371H135.798V459.082ZM194.5 438.349V459.082H150.797V438.349C150.797 431.744 145.437 426.371 138.847 426.371H129.822V353.215H138.847C145.437 353.215 150.797 347.854 150.797 341.265V320.504H194.5V341.265C194.5 347.855 199.874 353.215 206.478 353.215H215.504V426.371H206.478C199.874 426.371 194.5 431.744 194.5 438.349ZM302.496 459.082H209.5V441.371H302.496V459.082ZM361.198 438.349V459.082H317.495V438.349C317.495 431.744 312.121 426.371 305.517 426.371H296.492V353.215H305.517C312.121 353.215 317.495 347.854 317.495 341.265V320.504H361.198V341.265C361.198 347.855 366.572 353.215 373.177 353.215H382.202V426.371H373.177C366.572 426.371 361.198 431.744 361.198 438.349ZM469.194 441.371V459.082H376.198V441.371H469.194ZM397.202 426.371V353.215H448.19V426.371H397.202ZM376.198 338.215V320.504H469.194V338.215H376.198Z"/>
				<path d="M288.611 119.004C288.611 101.63 274.477 87.495 257.103 87.495C239.729 87.495 225.595 101.63 225.595 119.004C225.595 136.378 239.729 150.513 257.103 150.513C274.477 150.513 288.611 136.378 288.611 119.004ZM240.595 119.004C240.595 109.901 248.001 102.495 257.103 102.495C266.205 102.495 273.611 109.901 273.611 119.004C273.611 128.107 266.205 135.513 257.103 135.513C248.001 135.513 240.595 128.107 240.595 119.004Z" />
				<path d="M328.748 205.246L357.52 245H376.265V172H357.55V212.771L328.327 172H310V245H328.748V205.246Z"/>
				<path d="M265.169 245V187.854H285.883V172H226V187.854H246.762V245H265.169Z"/>
				<path d="M183.527 212.07C183.529 221.706 183.38 224.599 180.072 227.168C176.912 229.624 168.378 229.99 164.312 226.997C160.427 224.14 160.275 220.098 160.342 213.198L160.356 172H142V210.29C142 223.617 142 236.205 156.777 242.571C163.563 245.5 178.798 246.028 186.977 242.78C201.883 236.859 201.883 224.319 201.883 209.739V172H183.527V212.07Z" />
			</svg>
			<span class="ml-2 text-sm font-bold">UTN BANK</span>
		</div>
		
		<div class="w-full px-2">
			<div class="flex flex-col items-center w-full mt-3 border-t border-gray-700">
				<a class="flex items-center w-full h-12 px-3 mt-2 rounded hover:bg-gray-700 hover:text-gray-300" href="#">
					<svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M9 13.75c-2.34 0-7 1.17-7 3.5V19h14v-1.75c0-2.33-4.66-3.5-7-3.5zM4.34 17c.84-.58 2.87-1.25 4.66-1.25s3.82.67 4.66 1.25H4.34zM9 12c1.93 0 3.5-1.57 3.5-3.5S10.93 5 9 5 5.5 6.57 5.5 8.5 7.07 12 9 12zm0-5c.83 0 1.5.67 1.5 1.5S9.83 10 9 10s-1.5-.67-1.5-1.5S8.17 7 9 7zm7.04 6.81c1.16.84 1.96 1.96 1.96 3.44V19h4v-1.75c0-2.02-3.5-3.17-5.96-3.44zM15 12c1.93 0 3.5-1.57 3.5-3.5S16.93 5 15 5c-.54 0-1.04.13-1.5.35.63.89 1 1.98 1 3.15s-.37 2.26-1 3.15c.46.22.96.35 1.5.35z"/></svg>
					<span class="ml-2 text-sm font-medium">Clientes</span>
				</a>
				
				<a class="flex items-center w-full h-12 px-3 mt-2 rounded hover:bg-gray-700 hover:text-gray-300" href="#">
					<svg xmlns="http://www.w3.org/2000/svg" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><path d="M0 0h24v24H0V0z" fill="none"/><path d="M21 7.28V5c0-1.1-.9-2-2-2H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2v-2.28c.59-.35 1-.98 1-1.72V9c0-.74-.41-1.37-1-1.72zM20 9v6h-7V9h7zM5 19V5h14v2h-6c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h6v2H5z"/><circle cx="16" cy="12" r="1.5"/></svg>
					<span class="ml-2 text-sm font-medium">Cuentas</span>
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
			<svg xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 24 24" height="24px" viewBox="0 0 24 24" width="24px" fill="#FFFFFF"><g><rect fill="none" height="24" width="24"/></g><g><g><circle cx="17" cy="15.5" fill-rule="evenodd" r="1.12"/><path d="M17,17.5c-0.73,0-2.19,0.36-2.24,1.08c0.5,0.71,1.32,1.17,2.24,1.17 s1.74-0.46,2.24-1.17C19.19,17.86,17.73,17.5,17,17.5z" fill-rule="evenodd"/><path d="M18,11.09V6.27L10.5,3L3,6.27v4.91c0,4.54,3.2,8.79,7.5,9.82 c0.55-0.13,1.08-0.32,1.6-0.55C13.18,21.99,14.97,23,17,23c3.31,0,6-2.69,6-6C23,14.03,20.84,11.57,18,11.09z M11,17 c0,0.56,0.08,1.11,0.23,1.62c-0.24,0.11-0.48,0.22-0.73,0.3c-3.17-1-5.5-4.24-5.5-7.74v-3.6l5.5-2.4l5.5,2.4v3.51 C13.16,11.57,11,14.03,11,17z M17,21c-2.21,0-4-1.79-4-4c0-2.21,1.79-4,4-4s4,1.79,4,4C21,19.21,19.21,21,17,21z" fill-rule="evenodd"/></g></g></svg>
			<span class="ml-2 text-sm font-medium">Administrador</span>
		</a>
	</div>
	
	<!-- Component End  -->

</body>
</html>