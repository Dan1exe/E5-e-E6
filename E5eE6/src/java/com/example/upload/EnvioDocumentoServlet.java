package com.example.upload;




        
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/upload")
@MultipartConfig
public class EnvioDocumentoServlet extends HttpServlet{
    
    private static final long serialVersionUID = 1L;
    private static final String UPLOAD_DIR = "Envios";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIR;
        
        File uploadDir = new File (uploadPath);
        if(!uploadDir.exists()) uploadDir.mkdir();
        
        Part filePart = request.getPart("file");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        String filePath = uploadPath + File.separator + fileName;
        
        filePart.write(filePath);
        
        response.getWriter().println("Arquivo " + fileName + " carregado!" );
        
        
    }








}
