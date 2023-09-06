package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        boolean invalidInputs =
                username.isEmpty() ||
                        email.isEmpty() ||
                        password.isEmpty();

        if(invalidInputs) {
            response.sendRedirect("/register");
            return;
        }
        User newUser = new User(username, email, password);
        DaoFactory.getUsersDao().insert(newUser);
        response.sendRedirect("/login");

        // TODO: create a new user based off of the submitted information
//        User user = new User(username, email, password);
        // TODO: if a user was successfully created, send them to the login page\
//        request.getRequestDispatcher("/login.jsp");
    }
}
