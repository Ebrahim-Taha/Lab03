package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String currentAge = request.getParameter("ageInput");
        int birthdayAge;
        request.setAttribute("currentAge", currentAge);
        
        if (currentAge == null || currentAge.equals("")) {
            
            String invalidMessage1 = "You must give your current age.";
            request.setAttribute("message", invalidMessage1);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        } else{            
            try{
                
                birthdayAge = Integer.parseInt(currentAge);
                birthdayAge++;
                String nextBirthday = "Your age next birthday will be " + birthdayAge;
                request.setAttribute("message", nextBirthday);
                
            } catch (Exception e){
                
                String invalidMessage2 = "You must enter a number.";
                request.setAttribute("message", invalidMessage2);
                
            }
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
    }

}
