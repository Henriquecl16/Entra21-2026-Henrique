let indexEditando = -1;

function cadastrarCliente(){

    let nome = document.getElementById("nome").value;
    let email = document.getElementById("email").value;
    let telefone = document.getElementById("telefone").value;

    // Limpando mensagens antigas

    document.getElementById("erroNome").innerHTML = "";
    document.getElementById("erroEmail").innerHTML = "";
    document.getElementById("erroTelefone").innerHTML = "";

    document.getElementById("mensagem").innerHTML = "";

    // Removendo bordas vermelhas antigas

    document.getElementById("nome").classList.remove("input-erro");
    document.getElementById("email").classList.remove("input-erro");
    document.getElementById("telefone").classList.remove("input-erro");

    // Validação do nome

    if(nome === ""){

        document.getElementById("erroNome").innerHTML =
        "Preencha o nome";

        document.getElementById("nome").classList.add("input-erro");

        document.getElementById("nome").focus();

        return;
    }

    // Validação do e-mail

    if(email === ""){

        document.getElementById("erroEmail").innerHTML =
        "Preencha o e-mail";

        document.getElementById("email").classList.add("input-erro");

        document.getElementById("email").focus();

        return;
    }

    // Validação do telefone

    if(telefone === ""){

        document.getElementById("erroTelefone").innerHTML =
        "Preencha o telefone";

        document.getElementById("telefone").classList.add("input-erro");

        document.getElementById("telefone").focus();

        return;
    }

    // Criando objeto do cliente

   let cliente = {

    nome: nome,

    email: email,

    telefone: telefone,

    cep: document.getElementById("cep").value,

    rua: document.getElementById("rua").value,

    bairro: document.getElementById("bairro").value,

    cidade: document.getElementById("cidade").value,

    estado: document.getElementById("estado").value
}

    // Pegando clientes do localStorage

    let clientes =
    JSON.parse(localStorage.getItem("clientes")) || [];

    // Adicionando cliente

   let clienteEditando =
   JSON.parse(localStorage.getItem("clienteEditando"));

    if(clienteEditando){

    clientes[clienteEditando.index] = cliente;

    localStorage.removeItem("clienteEditando");

}else{

    clientes.push(cliente);
}
    // Salvando novamente

    localStorage.setItem(
        "clientes",
        JSON.stringify(clientes)
    );

    // Limpando inputs

    document.getElementById("nome").value = "";
    document.getElementById("email").value = "";
    document.getElementById("telefone").value = "";

    // Mensagem de sucesso

    document.getElementById("mensagem").innerHTML =
    "Cliente cadastrado com sucesso!";
}

function mostrarClientes(){

    let lista = document.getElementById("listaClientes");

    if(!lista){
        return;
    }

    let clientes =
    JSON.parse(localStorage.getItem("clientes")) || [];

    lista.innerHTML = "";

    clientes.forEach((cliente, index) => {

       lista.innerHTML += `

    <div class="card">

        <h3>${cliente.nome}</h3>

        <p>
            <strong>E-mail:</strong>
            ${cliente.email}
        </p>

        <p>
            <strong>Telefone:</strong>
            ${cliente.telefone}
        </p>

        <p>
            <strong>CEP:</strong>
            ${cliente.cep}
        </p>

        <p>
            <strong>Rua:</strong>
            ${cliente.rua}
        </p>

        <p>
            <strong>Bairro:</strong>
            ${cliente.bairro}
        </p>

        <p>
            <strong>Cidade:</strong>
            ${cliente.cidade}
        </p>

        <p>
            <strong>Estado:</strong>
            ${cliente.estado}
        </p>

        <div class="acoes">

            <button
                class="btn-editar"
                onclick="editarCliente(${index})"
            >
                Editar
            </button>

            <button
                class="btn-excluir"
                onclick="excluirCliente(${index})"
            >
                Excluir
            </button>

        </div>

    </div>
`;
    });
}

function editarCliente(index){

    let clientes =
    JSON.parse(localStorage.getItem("clientes")) || [];

    let cliente = clientes[index];

    localStorage.setItem(
        "clienteEditando",
        JSON.stringify({
            cliente: cliente,
            index: index
        })
    );

    window.location.href = "cadastro.html";
}

function excluirCliente(index){

    let clientes =
    JSON.parse(localStorage.getItem("clientes")) || [];

    clientes.splice(index, 1);

    localStorage.setItem(
        "clientes",
        JSON.stringify(clientes)
    );

    mostrarClientes();
}

let clienteEditando =
JSON.parse(localStorage.getItem("clienteEditando"));

if(clienteEditando){

    document.getElementById("nome").value =
    clienteEditando.cliente.nome;

    document.getElementById("email").value =
    clienteEditando.cliente.email;

    document.getElementById("telefone").value =
    clienteEditando.cliente.telefone;
}

mostrarClientes();

async function buscarCEP(){

    let cep =
    document.getElementById("cep").value;

    let resposta =
    await fetch(`https://viacep.com.br/ws/${cep}/json/`);

    let dados = await resposta.json();

    document.getElementById("rua").value =
    dados.logradouro;

    document.getElementById("bairro").value =
    dados.bairro;

    document.getElementById("cidade").value =
    dados.localidade;

    document.getElementById("estado").value =
    dados.uf;
}