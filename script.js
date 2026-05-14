let assentos = document.querySelectorAll(".assento");


assentos.forEach(function(assento){

    assento.addEventListener("click", function(){
        if(assento.classList.contains("ocupado")){
            return;
        }

        assento.classList.toggle("selecionado");

        let marcados = document.querySelectorAll(".selecionado");

    let nomes = "";

    marcados.forEach(function(item){

       let letra = item.parentElement.getAttribute("data-fileira");

     nomes += letra + item.innerHTML + " ";

    });

    document.getElementById("selecionados").innerHTML =
    "Assentos selecionados: " + nomes;

});

    });


