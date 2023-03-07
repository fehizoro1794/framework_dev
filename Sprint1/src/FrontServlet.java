/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package etu1794.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ITU
 */
public class FrontServlet extends HttpServlet {

    protected HashMap<String ,String> getURLDatas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String url=request.getRequestURL().toString();
        String uri=request.getRequestURI().toString();
        String contextPath=request.getContextPath().toString();
        String[] url_split=uri.split(contextPath);
        // String[] url_split=uri.split("/"+contextPath);
        String activClass=url_split[url_split.length-1];
        HashMap<String ,String> urlDatas=new HashMap<>();
        urlDatas.put("url_with_dns", url);
        urlDatas.put("url", uri);
        urlDatas.put("contextPath", contextPath);
        urlDatas.put("direct_url", activClass);

        return urlDatas;
    }

    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
            processRequest(request, response);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            
            HashMap<String ,String> urlDatas=getURLDatas(request, response);
            // if (urlDatas.get("class")) {
                
            // }
            out.println("Url complet: "+urlDatas.get("url_with_dns"));
            out.println("url sans DNS/sans IP: "+urlDatas.get("url"));
            out.println("Context: "+urlDatas.get("contextPath"));
            out.println("=====> URL direct: "+urlDatas.get("direct_url"));
            
            out.println("Ecrire par exemple '"+urlDatas.get("url_with_dns")+"/test/home' ");
            out.println("----------------------------");
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println(e.getStackTrace().toString());
        }
    }
    // public void showURLfromRequest(PrintWriter out,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    //     response.setContentType("text/plain");
    //         out.println("*************************");
    //         out.println("Get the URL");
    //         String url=request.getRequestURL().toString();
    //         String uri=request.getRequestURI().toString();
    //         String contextPath=request.getContextPath().toString();
    //         String[] url_split=uri.split("/");
    //         String activClass=url_split[url_split.length-1];
    //         out.println("URL => "+url);
    //         out.println("URI => "+uri);
    //         out.println("contextPath => "+contextPath);
    //         out.println("activClass => "+activClass);
    //         // out.println(request.getPathInfo().toString());
    //         out.println("*************************");
    // }
}
