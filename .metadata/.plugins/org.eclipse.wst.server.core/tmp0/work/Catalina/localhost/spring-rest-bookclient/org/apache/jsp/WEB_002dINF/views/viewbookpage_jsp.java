/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-05-14 10:32:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewbookpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1620486509120L));
    _jspx_dependants.put("jar:file:/E:/Spring%20tut/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-rest-bookclient/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1620468329484L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1619090875402L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("#backgroundimage{\r\n");
      out.write("            background-image: url('https://images.unsplash.com/photo-1507842217343-583bb7270b66?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bGlicmFyeXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80');\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-size: 100%;\r\n");
      out.write("           /*  filter:alpha(opacity=40); */\r\n");
      out.write("            height:110%;\r\n");
      out.write("            width:110%;\r\n");
      out.write("            z-index:0.1;\r\n");
      out.write("        \r\n");
      out.write("}\r\n");
      out.write("#container{\r\n");
      out.write("border: 1px solid black; \r\n");
      out.write("height: 450px;\r\n");
      out.write("width:300px;\r\n");
      out.write("margin-top: 15px;\r\n");
      out.write("margin-left: 250px;\r\n");
      out.write("margin-bottom: 40px;\r\n");
      out.write("background-color:#E95B5B;\r\n");
      out.write("border-radius: 20px; \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("*{\r\n");
      out.write("top: 0px;\r\n");
      out.write("bottom: opx;\r\n");
      out.write("}\r\n");
      out.write("#image{\r\n");
      out.write("/* border:2px solid red; */\r\n");
      out.write("height:150px;\r\n");
      out.write("width:150px;\r\n");
      out.write("margin-top:25px;\r\n");
      out.write("margin-left: 75px;\r\n");
      out.write("}\r\n");
      out.write("img{\r\n");
      out.write("margin-top:15px;\r\n");
      out.write("height:148px;\r\n");
      out.write("width:148px;\r\n");
      out.write("}\r\n");
      out.write("h3{\r\n");
      out.write("margin-left: 80px;\r\n");
      out.write("}\r\n");
      out.write(".btn{\r\n");
      out.write("margin-left: 43px;\r\n");
      out.write("margin-top: 20px;\r\n");
      out.write("height:35px;\r\n");
      out.write("width:95px;\r\n");
      out.write("border-radius: 10px;\r\n");
      out.write("background-color: pink;\r\n");
      out.write("}\r\n");
      out.write(".btn:hover {\r\n");
      out.write("\tbackground-color:#FF33FF;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#loginheader{\r\n");
      out.write("height:50px;\r\n");
      out.write("background-color:black;\r\n");
      out.write("color:white;\r\n");
      out.write("text-align: center;\r\n");
      out.write("z-index: -1;\r\n");
      out.write("top: 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"loginheader\">\r\n");
      out.write("<h1 >Welcome To Book App</h1>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div id=\"backgroundimage\">\r\n");
      out.write("<button class=\"btn\" style=\"margin-left: 0px;margin-top: 0px\" onclick=\"location.href='home'\">Home</button>\r\n");
      out.write(" <div id=\"container\"> \r\n");
      out.write("\r\n");
      out.write(" <div id=\"image\">\r\n");
      out.write("  <img  src=\"https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1347642664l/1188948.jpg\">\r\n");
      out.write(" </div>\r\n");
      out.write(" <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.bookTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write(" <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.bookAuthor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write(" <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.bookCategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write(" <input class=\"btn\" type=\"submit\" value=\"E-Book\">\r\n");
      out.write("  <input class=\"btn\" type=\"submit\" value=\"AddToCart\"><br>\r\n");
      out.write(" <input class=\"btn\" type=\"submit\" value=\"Pay ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.bookPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"margin-left: 110px;\">\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".footer{\r\n");
      out.write("height:70px;\r\n");
      out.write("background-color:black;\r\n");
      out.write("color:white;\r\n");
      out.write("font-size:10px;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<h1>@no copyright applications</h1>\r\n");
      out.write("<h1>Contact us at:rajat4211joshi@gmail.com</h1>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
