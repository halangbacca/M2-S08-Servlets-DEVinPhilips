package novaEmpresa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class Empresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Empresa() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recebe o parâmetro informado na URL
		String name = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Empresa</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Nome da empresa: " + name);
		out.println("</body>");
		out.println("</html>");
		
		System.out.println(name);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
