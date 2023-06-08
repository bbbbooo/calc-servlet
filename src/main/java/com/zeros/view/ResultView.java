package com.zeros.view;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcresult")
public class ResultView extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder redirectText = new StringBuilder();
        int result = (int) req.getAttribute("result");
        System.out.println("result = " + result);


        redirectText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1>결과는")
                .append(result)
                .append("입니다.</h1>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print(redirectText);

        out.flush();
        out.close();
    }

}
