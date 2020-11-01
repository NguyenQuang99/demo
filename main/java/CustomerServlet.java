import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static sun.awt.PaintEventDispatcher.dispatcher;

@WebServlet(name = "CustomerServlet",urlPatterns = "/h")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Miku Ohashi","0123456789","Ha Noi","10-10-1995"));
        customerList.add(new Customer("Honda Nanako","012345677","Nhat Ban","10-10-2000"));
        customerList.add(new Customer("Tachibana","012345677","NhatBan","10-10-1999"));
        customerList.add(new Customer("Trieu Le Dinh","012345677","Trung Quoc","10-10-1994"));
        customerList.add(new Customer("Minh Quang","0123456789","Ha Noi","14-09-1999"));

        request.setAttribute("customer",customerList);
        dispatcher.foward(request,response);



    }
}
