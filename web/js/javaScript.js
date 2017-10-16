$(document).ready(function(){
var total = 0;
$("section").append(total);


    $("button").click(function(){
        if($("#precio").val() == ""){
            alert("Ingrese un numero");
        } else {
            var nombreProducto = $("#producto").val();  
            var precioProducto = $("#precio").val();
            console.log(precioProducto);
            var boton = $("<button><i class='fa fa-minus-square fa-2x' aria-hidden='true'> Eliminar</i></button>");
            total+=parseFloat(precioProducto);
            $("tbody").append("<tr><td>"+ nombreProducto +"</td><td>"+ precioProducto +"</td><td><span></span></td></tr> ");
                $("span").last().append(boton);
                boton.click(function(){
                    total-=parseFloat($(this).parent().parent().prev().text());
                    $(this).parent().parent().parent().remove();
                    $("section").remove();
                    $("tr").children().last().append("<section>"+total+"</section>");
                });
            $("section").remove();
            $("tr").children().last().append("<section>"+total+"</section>");
            }
        });
});