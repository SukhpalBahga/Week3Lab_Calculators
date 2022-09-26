/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sukhpal
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          request.setAttribute("Result", "---");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstnumber = request.getParameter("firstnumber");
        String secondnumber = request.getParameter("secondnumber");

       
        request.setAttribute("firstnumber", firstnumber);
        request.setAttribute("secondnumber", secondnumber);

    
        if (firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")) {
            request.setAttribute("Result", "invalid");

        } else if (request.getParameter("operation").equals("+")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 + number2;

            request.setAttribute("Result", + value);

        } else if (request.getParameter("operation").equals("-")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 - number2;

            request.setAttribute("Result", + value);
        } else if (request.getParameter("operation").equals("*")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 * number2;

            request.setAttribute("Result", + value);

        } else if (request.getParameter("operation").equals("%")) {
            int number1 = Integer.parseInt(firstnumber);
            int number2 = Integer.parseInt(secondnumber);
            int value = number1 % number2;

            request.setAttribute("Result", + value);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    
    }

 

}
