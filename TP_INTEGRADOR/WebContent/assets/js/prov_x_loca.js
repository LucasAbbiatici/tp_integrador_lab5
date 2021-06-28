let ddlprovincias = document.querySelector("#provincias");

fetch('https://apis.datos.gob.ar/georef/api/provincias')
.then(response => response.json())
.then(function(data){
    let provincias = data.provincias.sort(compare);
    console.log(provincias);
    provincias.forEach(element => {
        let provincia = document.createElement('option');
        //provincia.value = element.id;
        provincia.value = element.nombre;
        provincia.innerHTML = element.nombre ;
        ddlprovincias.appendChild(provincia);
    });
    
})
.catch(error => console.log(error));

ddlprovincias.addEventListener("change",()=>{
    var ddlLocalidades = document.querySelector("#localidades");
    console.log(ddlLocalidades.options.length)
    $("#localidades").empty();

    fetch(`https://apis.datos.gob.ar/georef/api/localidades?provincia=${ddlprovincias.value}&max=5000`)
    .then(response => response.json())
    .then(function(data){
        let localidades = data.localidades.sort(compare);
        localidades.forEach(element => {
            let localidad = document.createElement('option');
            //localidad.value = element.id;
            localidad.value = element.nombre;
            localidad.innerHTML = element.nombre;
            ddlLocalidades.appendChild(localidad);
        });
        
    })
    .catch(error => console.log(error));
})

function compare(a ,b ){
    if(a.nombre < b.nombre){
        return -1;
    }
    if( a.nombre > b.nombre){
        return 1;
    }
    return 0;
}