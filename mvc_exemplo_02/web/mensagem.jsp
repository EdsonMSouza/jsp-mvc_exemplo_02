<%-- 
    Document   : mensagem.jsp
    Created on : 24/03/2017, 09:56:13
    Author     : Edson Melo de Souza (prof.edson.melo@gmail.com)
--%>
<%@page import="bean.Pessoa"%>
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
        <%
            /**
             * Recupera os dados do atributo mensagem enviado pelo Controle
             *
             * 1 - É necessário realizar a importação da classe Pessoa 2 -
             * (Pessoa) significa que os dados contidos no atributo mensagem são
             * do tipo Pessoa
             */
            Pessoa p = (Pessoa) request.getAttribute("mensagem");

            /**
             * Dentro do HTML, abaixo, estão sendo recuperados do objeto
             */

        %>
        <div class="col-md-12">
            <div class="modal-dialog" style="margin-bottom:0;">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Resultado após o processamento pelo Controller</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form">
                            <fieldset>
                                <div class="form-group">
                                    <label>Nome</label><br>
                                    <% out.print(p.getNome()); %>
                                </div>
                                <div class="form-group">
                                    <label>Cpf</label><br>
                                    <% out.print(p.getCpf()); %>
                                </div>
                                <div class="form-group">
                                    <label>Rua</label><br>
                                    <% out.print(p.getEndereco().getRua());%>
                                </div>
                                <div class="form-group">
                                    <label>Número</label><br>
                                    <% out.print(p.getEndereco().getNumero());%>
                                </div>
                                <div class="form-group">
                                    <label>Cep</label><br>
                                    <% out.print(p.getEndereco().getCep());%>
                                </div>        
                                <div class="form-group">
                                    <label>Cidade/Estado</label><br>
                                    <% out.print(p.getEndereco().getCidade() + "/" + p.getEndereco().getEstado());%>
                                </div>                                
                            </fieldset>
                        </form>
                        <p class="text-right"><a href="index.html">Página Inicial</a></p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
