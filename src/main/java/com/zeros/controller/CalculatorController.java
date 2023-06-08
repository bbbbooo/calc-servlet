package com.zeros.controller;

import com.zeros.model.Calculator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calc")
public class CalculatorController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Fnumber = Integer.parseInt(req.getParameter("num1"));
        int Lnumber = Integer.parseInt(req.getParameter("num2"));
        String oper = req.getParameter("operator");

        Calculator calc = new Calculator();

        int result = calc.Calc(Fnumber, Lnumber, oper);

        req.setAttribute("result", result);

        RequestDispatcher rd = req.getRequestDispatcher("/calcresult");
        rd.forward(req, resp);

    }
}
