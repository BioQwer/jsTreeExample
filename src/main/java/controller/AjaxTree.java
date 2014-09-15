package controller;

import data.Data;
import data.LocalDataImpl;
import utils.JsonConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/ajax"})
public class AjaxTree extends HttpServlet {

    private Data data;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=utf-8");
        String nodeId = request.getParameter("id");
        try (PrintWriter out = response.getWriter()) {
            if (nodeId.equals("root"))
                out.println(JsonConverter.toJson(data.getRoot()));
            else
                out.println(JsonConverter.toJson(data.getById(nodeId)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
        data = LocalDataImpl.getInstance();
    }
}
