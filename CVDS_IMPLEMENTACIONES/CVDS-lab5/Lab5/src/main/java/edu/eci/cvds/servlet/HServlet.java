package edu.eci.cvds.servlet;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.NoSuchElementException;




import edu.eci.cvds.servlet.*;
import edu.eci.cvds.servlet.model.Todo;

import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(
	    urlPatterns = "/HServlet"
	)
public class HServlet extends HttpServlet {
	
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        Writer responseWriter = resp.getWriter();
	        
	       //Exito 200
	        try {
	            Optional<String> optId = Optional.ofNullable(req.getParameter("id_consulta"));
	            Integer id = (Integer.parseInt(optId.get()));
	            Todo lista = Service.getTodo(id);           
	            ArrayList<Todo> listaDeToDos = new ArrayList<Todo>();
	            listaDeToDos.add(lista);
	            resp.setStatus(HttpServletResponse.SC_OK);
	            responseWriter.write(Service.todosToHTMLTable(listaDeToDos));
	            responseWriter.flush();              
	        }
	        
	        //El id es invalido (Ingreso un String o no ingreso nada) 
	        // Codigo de error 400
	        catch ( NumberFormatException e){
	            responseWriter.write("Requerimiento Inválido");
	        }
	        
	        //El id no fue encontrado, Error 404
	        catch (FileNotFoundException e){
	            responseWriter.write(tablaVacia() + "\n");
	            responseWriter.write("No encontrado.");
	        }
	        
	        //MalformedURL, Error 500
	        catch (MalformedURLException e){
	            responseWriter.write("Error interno en el Servidor ");
	        }
	        
	        //Los otros errores, Error 400
	        catch (Exception e){
	            responseWriter.write("Requerimiento Invalido");
	        }  
	    }
	    
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        Writer responseWriter = resp.getWriter();
	        
	        //Exito 200
	        try {
	            Optional<String> optId = Optional.ofNullable(req.getParameter("id_consulta"));
	            Integer id = (Integer.parseInt(optId.get()));
	            Todo lista = Service.getTodo(id);           
	            ArrayList<Todo> listaDeToDos = new ArrayList<Todo>();
	            listaDeToDos.add(lista);
	            resp.setStatus(HttpServletResponse.SC_OK);
	            responseWriter.write(Service.todosToHTMLTable(listaDeToDos));
	            responseWriter.flush();              
	        }
	        
	        
	       //El id es invalido (Ingreso un String o no ingreso nada) 
	        catch ( NumberFormatException e){
	            responseWriter.write("Requerimiento inválido");
	        }
	        
	       //El id no fue encontrado
	        catch (FileNotFoundException e){
	           responseWriter.write(tablaVacia() + "\n");
	           responseWriter.write("ID no encontrado.");
	        }
	        
	        //MalformedURL
	        catch (MalformedURLException e){
	            responseWriter.write("Error interno en el servidor.");
	        }
	        
	        //otros errores
	        catch (Exception e){ 
	            responseWriter.write("Requerimiento inválido");
	        }  
	    }
	    
	    private String tablaVacia(){
	        StringBuilder stringBuilder = new StringBuilder("<table>")
	        .append("<tr>")
	        .append("<th>User Id</th>")
	        .append("<th>Id</th>")
	        .append("<th>Title</th>")
	        .append("<th>Completed</th>")
	        .append("</tr>");
	        stringBuilder.append("</table>");
	        return stringBuilder.toString();
	    }
}
