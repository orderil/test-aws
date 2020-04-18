<%
    java.util.Properties prop = new java.util.Properties();
    prop.load(getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF"));

    out.println("<pre>");
    for(java.util.Map.Entry<Object, Object> e : prop.entrySet()) {
        out.println(e);
    }
    out.println("</pre>");
%>
