package cn.mao.web.servlet;

import cn.mao.domain.User;
import cn.mao.service.UserService;
import cn.mao.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //调用UserService查询
        UserService service = new UserServiceImpl();
        List<User> users = service.findAll();

        //System.out.println(users);

        //将list存入request域中
        request.setAttribute("users", users);
        //转发到list.jsp
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
