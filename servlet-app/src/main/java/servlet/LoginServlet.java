package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 处理登录的请求的
// 配置访问链接
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    /**
     * 处理 GET 请求
     * @param req 请求
     * @param resp 响应
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理 GET 请求");
        // 获取请求中【携带的参数】
        String userName = req.getParameter("user_name");
        String passWord = req.getParameter("pass_word");

        System.out.println("账号（1）：" + userName);
        System.out.println("密码（2）：" + passWord);
    }

    /**
     * 处理 POST 请求
     * @param req 请求
     * @param resp 响应
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理 POST 请求");
        // 获取请求中【携带的参数】
        String userName = req.getParameter("user_name");
        String passWord = req.getParameter("pass_word");

        System.out.println("账号【(1)】：" + userName);
        System.out.println("密码【(2)】：" + passWord);
    }
}
