package fr.afpa.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Pour créer un servlet il vous faut créer une classe héritée de {@link HttpServlet}.
 * Il vous faut également ajouter l'annotation {@link WebServlet} avec des paramétres permettant de préciser le chemin traité.
 */
@WebServlet("/")
public class WelcomeServlet extends HttpServlet {

    /**
     * Cette méthode est un ré-implémentation d'une méthode de {@link HttpServlet}.
     * Elle est appelée par le serveur pour traiter une requête http GET reçue.
     *
     * @param request  un objet {@link HttpServletRequest} qui contient les informations de la requête effectuée par le client
     * @param response un objet {@link HttpServletResponse} qui contient la réponse que le serveur devra renvoyer du serveur
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // on renvoie du html
        // text/html est un type Mime : https://developer.mozilla.org/fr/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
        response.setContentType("text/html");

        // récupération d'une classe permettant d'écrire la réponse
        PrintWriter out = response.getWriter();

        out.println("<html><body align=\"center\">");
        out.println(
                "<img src=\"/img/afpa-logo.png\" alt=\"Logo Afpa\" width=\"500\">");
        out.println("<h1>" + "Cette page est une réponse du servlet <code>WelcomeServlet</code>." + "</h1>");
        out.println("<h2>" + "A vous de jouer, complétez la classe <code>DateServlet</code> qui devra " +
                "retourner une page web contenant la date actuelle lors d'une requête GET sur <code>/date</code>.</h2>");
        out.println("</body></html>");
    }
}