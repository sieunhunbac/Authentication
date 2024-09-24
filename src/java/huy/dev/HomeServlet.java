/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package huy.dev;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import huy.dev.data.dao.CategoryDao;
import huy.dev.data.dao.Database;
import huy.dev.data.dao.DatabaseDao;
import huy.dev.data.model.Category;

/**
 *
 * @author Admin
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int a = 100;
        request.setAttribute("a", a);
        DatabaseDao.init(new Database());
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        List<Category> categoryList = categoryDao.findAll();
        request.setAttribute("categoryList", categoryList);
        
        request.getRequestDispatcher("index.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    
}
