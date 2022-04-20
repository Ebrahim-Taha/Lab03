package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {
    
    private Object invalidMessage = "invalid";
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String operation = request.getParameter("operation");
        int result = 0;

        if (firstInput == null || firstInput.equals("") || secondInput == null || secondInput.equals("")){
            
            request.setAttribute("message", invalidMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
            
        } else{   
            try{ 
                int firstValue = Integer.parseInt(firstInput);
                int secondValue = Integer.parseInt(secondInput);
                
                switch (operation){
                    case "+":
                    {
                        result = firstValue + secondValue;
                        break;
                    }
                    case "-":
                    {
                        result = firstValue - secondValue;
                        break;
                    }
                    case "*":
                    {
                        result = firstValue * secondValue;
                        break;
                    }
                    case "%":
                    {
                        result = firstValue % secondValue;
                        break;
                    }
                }
            }catch (Exception e){
                request.setAttribute("message", invalidMessage);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            
        request.setAttribute("message", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
        
        }
        
    }

}
