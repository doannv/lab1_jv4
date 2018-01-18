package box;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PRIVATE_MEMBER;


@WebServlet("/SearchAccount")
public class SearchAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SearchAccount() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		doGet(request, response);
		
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>SearchAccount</title></head>");
		out.println("<body><h1>Ket qua</h1>");
		out.println("<table border=1 cellPadding=1 cellPacing=1>");
		Connect con = new Connect();
		ResultSet rs = null;
		java.sql.Statement pst=null;
		Connection cn = con.getConnectDB();
		String tentbao= request.getParameter("txtThuebao");
		String newSQL ="select * from Customer";
		if (tentbao!= null && tentbao.length() != 0) {
			newSQL = newSQL + "where TenThueBao like'%"+ tentbao +"%'";
		}
		try {		
				pst =cn.createStatement();
				rs= pst.executeQuery(newSQL);
				if(rs != null) {
					for(int i=1; rs.next(); ) {
						out.println("<tr>"+"<td>"+i+"</td>"
					+ "<td>" +rs.getString(2) + "</td>"
					+ "<td>" +rs.getString(3) + "</td>"
					+ "<td>" +rs.getString(4) + "</td> </tr>\n" );
					}
				}
				out.println("</table>");
				pst.close();
				rs.close();			
				cn.close();
			} catch (Exception e) 
			{
				System.out.println("Error: " +e );
			}
	
		
	}
}
