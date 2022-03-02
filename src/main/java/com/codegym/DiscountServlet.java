package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double  price = Double.parseDouble(request.getParameter("price"));
        int percent = Integer.parseInt(request.getParameter("percent"));
        double discountAmount = price * percent * 0.01;
        double discountPrice = price - discountAmount;
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Product Description: "+request.getParameter("description"));
        printWriter.println("List Price: " + price);
        printWriter.println("Discount Percent: " + percent + "%");
        printWriter.println("Discount Amount: " + discountAmount);
        printWriter.println("Discount Price: " + discountPrice);
    }
}
