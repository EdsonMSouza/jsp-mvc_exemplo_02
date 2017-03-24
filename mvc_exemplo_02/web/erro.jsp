<%-- 
    Document   : erro.jsp
    Created on : 24/03/2017, 09:56:13
    Author     : Edson Melo de Souza (prof.edson.melo@gmail.com)
--%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Exemplo MVC 02</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css">
        <link rel="stylesheet" href="//d2d3qesrx8xj6s.cloudfront.net/dist/bootsnipp.min.css?ver=7d23ff901039aef6293954d33d23c066">
    </head>
    <body>
        <div class="col-md-12">
            <div class="modal-dialog" style="margin-bottom:0;">
                <div class="panel panel-danger">
                    <div class="panel-heading">
                        <h3 class="panel-title">Erros Ocorreram</h3>
                    </div>
                    <div class="panel-body">
                        <p><% out.print(request.getAttribute("mensagem"));%></p>
                        <p class="text-right"><a href="javascript: history.go(-1);">Voltar</a></p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
