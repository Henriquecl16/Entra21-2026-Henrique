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