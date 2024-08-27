package com.ohgiraffers.webpractice.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>login</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>로그인</h1>")
                .append("<form action=\"login\" method=\"post\">")
                .append("아이디<input type=\"text\" name=\"id\">")
                .append("비밀번호<input type=\"password\" name=\"pw\" value=\"비밀번호\">")
                .append("<input type=\"submit\" value=\"로그인\">")
                .append("</form>")
                .append("</body>")
                .append("</html>");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(sb.toString());
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        StringBuilder sb = new StringBuilder();
        if(id.equals("test") && pw.equals("test")) {
            sb.append("<h1>로그인 성공!!</h1>");
        }else{
            sb.append("<h1>로그인 실패 ㅜ</h1>");
        }
        sb.append("<a href=\"index.jsp\">돌아가기</a>");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(sb.toString());
        out.flush();
        out.close();
    }


    @Override
    public void destroy() {
        super.destroy();
    }
}
