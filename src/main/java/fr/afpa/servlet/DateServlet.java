package fr.afpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * TODO : compléter la classe suivante pour en faire un "servlet" qui répondra aux attentes suivantes
 * - réponse à une requête HTTP "GET"
 * - renvoie une page HTML contenant la date actuelle dans un paragraph
 *
 * Il va falloir vous inspirer du code de "WelcomeServlet" pour parvenir à vous fin.
 *
 * Compétences couvertes par le développement :
 * - notion de Servlet
 * - requêtage HTTP
 * - déploiement d'un WAR sur serveur Tomcat pour tester
 */
@WebServlet("/date")
public class DateServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        LocalDate date = LocalDate.now();

        response.getWriter().write(LocalDate.now().toString());

    }
}
