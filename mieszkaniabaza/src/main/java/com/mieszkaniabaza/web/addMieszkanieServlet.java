package com.mieszkaniabaza.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mieszkaniabaza.domain.Mieszkania;
import com.mieszkaniabaza.domain.Wynajmujacy;

import com.mieszkaniabaza.service.WynajmujacyManager;
import com.mieszkaniabaza.service.MieszkaniaManager;

@WebServlet(urlPatterns = "/DodajMieszkania")
public class addMieszkanieServlet extends HttpServlet{
    @EJB
    private MieszkaniaManager mm;
    @EJB
    private WynajmujacyManager wm;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  request.setAttribute("WynajmujacyWszystkie", wm.dajWszystkie());
        request.getRequestDispatcher("/mieszkania/dodaj.jsp").forward(request, response);
    }

}
