<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleScoreServiceProxyid" scope="session" class="DefaultNamespace.ScoreServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleScoreServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleScoreServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleScoreServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        DefaultNamespace.ScoreService getScoreService10mtemp = sampleScoreServiceProxyid.getScoreService();
if(getScoreService10mtemp == null){
%>
<%=getScoreService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 27:
        gotMethod = true;
        sampleScoreServiceProxyid.reset();
break;
case 30:
        gotMethod = true;
        int getWins30mtemp = sampleScoreServiceProxyid.getWins();
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getWins30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
break;
case 33:
        gotMethod = true;
        int getTies33mtemp = sampleScoreServiceProxyid.getTies();
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getTies33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
break;
case 36:
        gotMethod = true;
        int getLosses36mtemp = sampleScoreServiceProxyid.getLosses();
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getLosses36mtemp));
        %>
        <%= tempResultreturnp37 %>
        <%
break;
case 39:
        gotMethod = true;
        String wins_1id=  request.getParameter("wins48");
        int wins_1idTemp  = Integer.parseInt(wins_1id);
        String losses_2id=  request.getParameter("losses50");
        int losses_2idTemp  = Integer.parseInt(losses_2id);
        String ties_3id=  request.getParameter("ties52");
        int ties_3idTemp  = Integer.parseInt(ties_3id);
        DefaultNamespace.Score updateScore39mtemp = sampleScoreServiceProxyid.updateScore(wins_1idTemp,losses_2idTemp,ties_3idTemp);
if(updateScore39mtemp == null){
%>
<%=updateScore39mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ties:</TD>
<TD>
<%
if(updateScore39mtemp != null){
%>
<%=updateScore39mtemp.getTies()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">losses:</TD>
<TD>
<%
if(updateScore39mtemp != null){
%>
<%=updateScore39mtemp.getLosses()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wins:</TD>
<TD>
<%
if(updateScore39mtemp != null){
%>
<%=updateScore39mtemp.getWins()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 54:
        gotMethod = true;
        int increaseWins54mtemp = sampleScoreServiceProxyid.increaseWins();
        String tempResultreturnp55 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseWins54mtemp));
        %>
        <%= tempResultreturnp55 %>
        <%
break;
case 57:
        gotMethod = true;
        DefaultNamespace.Score getScore57mtemp = sampleScoreServiceProxyid.getScore();
if(getScore57mtemp == null){
%>
<%=getScore57mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ties:</TD>
<TD>
<%
if(getScore57mtemp != null){
%>
<%=getScore57mtemp.getTies()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">losses:</TD>
<TD>
<%
if(getScore57mtemp != null){
%>
<%=getScore57mtemp.getLosses()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wins:</TD>
<TD>
<%
if(getScore57mtemp != null){
%>
<%=getScore57mtemp.getWins()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 66:
        gotMethod = true;
        int increaseTies66mtemp = sampleScoreServiceProxyid.increaseTies();
        String tempResultreturnp67 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseTies66mtemp));
        %>
        <%= tempResultreturnp67 %>
        <%
break;
case 69:
        gotMethod = true;
        int increaseLosses69mtemp = sampleScoreServiceProxyid.increaseLosses();
        String tempResultreturnp70 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseLosses69mtemp));
        %>
        <%= tempResultreturnp70 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>