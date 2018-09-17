package com.flafitte.beans;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Connect {
	// Only static variables
	public static Cookie cookie;
	public static HttpSession sess;
	
	public Connect() {
		
	}
			
	// On load ...
	public static  void initiateSession(HttpServletRequest request){
		// Retrieves server infos
		request.setAttribute("serverInfo",request.getServletContext().getServerInfo());
		request.setAttribute("server",  request.getServerName().toString());
		request.setAttribute("port", Integer.toString(request.getServerPort()));		
		// ...add session...
		sess=request.getSession();
		// ... find cookies if any
		getConnectionParams(request);
	}
	

	// If cookie is found, add Nom and Prenom to session
	private static boolean getConnectionParams (HttpServletRequest request) {
		Cookie cookies[]=request.getCookies();
		if (cookies != null) {
			// Cookie exists
			// Parse values in cookie
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("Nom")) {
					// Add user name
					sess.setAttribute("Nom", cookie.getValue());
				} else if (cookie.getName().equals("Prenom")) {
					// Add user name
					sess.setAttribute("Prenom", cookie.getValue());
				}
				return true;
			}	
		}
		return false;
	}
		
	// User has just log in
	public static void setConnection(HttpServletRequest request, HttpServletResponse response) {
		String Nom=request.getParameter("Nom");
		String Prenom=request.getParameter("Prenom");
		// Test if empty
		if (Nom != null && Prenom != null) {
			// Define session varaibles
			sess.setAttribute("Nom", Nom);
			sess.setAttribute("Prenom", Prenom);
			// Add cookies
			Cookie cookieN=new Cookie("Nom",Nom);
			Cookie cookieP=new Cookie("Prenom",Prenom);
			cookieN.setMaxAge(60*60*60);
			cookieP.setMaxAge(60*60*60);
			response.addCookie(cookieN);
			response.addCookie(cookieP);
		}
		
	}
	
	// Invalidate session
	public static void destroyConnection () {
		sess.invalidate();
	}


}