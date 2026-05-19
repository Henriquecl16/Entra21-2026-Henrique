<<<<<<< HEAD
function cadastrarCliente(){

    let nome = document.getElementById("nome").value;
    let email = document.getElementById("email").value;
    let telefone = document.getElementById("telefone").value;

    if(nome === "" || email === "" || telefone === ""){

        alert("Preencha todos os campos!");
        return;
    }

    let tabela = document.getElementById("tabelaClientes");

    let novaLinha = tabela.insertRow();

    let colunaNome = novaLinha.insertCell(0);
    let colunaEmail = novaLinha.insertCell(1);
    let colunaTelefone = novaLinha.insertCell(2);

    colunaNome.innerHTML = nome;
    colunaEmail.innerHTML = email;
    colunaTelefone.innerHTML = telefone;

    document.getElementById("nome").value = "";
    document.getElementById("email").value = "";
    document.getElementById("telefone").value = "";
}
=======
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


>>>>>>> a05a099d58942169683b981cb1d51d4650bbf482
