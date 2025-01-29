const formulario = document.querySelector("form");
const inpultnome = document.querySelector(".nome");
const inpultemail = document.querySelector(".email");
const inpultsenha = document.querySelector(".senha");
const inpulttelefone = document.querySelector(".fone");





function Cadastrar(){

    fetch("http://localhost:8080/cadastro",
        {
            headers:{
                'Accept':'application/json',
                'Content-Type':'application/json'
            },
            method:"POST",
            body:JSON.stringify({
                nome: inpultnome.value,
                email: inpultemail.value,
                senha: inpultsenha.value,
                fone: inpulttelefone.value,})
        }
    )

    .then(function(res){console.log(res)})
    .catch(function(res){console.log(res)})

}

function limparInpults(){

    inpultnome.value = "";
    inpultemail.value = "";
    inpultsenha.value = "";
    inpulttelefone.value = "";

};

formulario.addEventListener("submit", function(event){
    event.preventDefault();
    

    Cadastrar();
    limparInpults();

   
})


    
