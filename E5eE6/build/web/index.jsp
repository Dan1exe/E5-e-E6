
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Envio de Arquivo</title>
    </head>
    <body>
        <h2>Envio de Arquivo</h2>
        <form action="upload" method="post" enctype="multipart/form-data">
            <label for="file"> Escolha um arquivo:</label>
            <input type="file" name="file" id="file"/>
            <br/><br/>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
