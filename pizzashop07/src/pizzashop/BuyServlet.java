package pizzashop;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.*;

import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("no url...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String title = req.getParameter("example");
		String count2 = req.getParameter("text");
		int count = Integer.parseInt(count2);
		String topping = req.getParameter("topping");
		String delivery ="送料300円";
		if(count>9) delivery="送料無料";
		if (count > 4)
			count++;
		if (count2.equals("0"))
			resp.sendRedirect("/index2.html");
		else {
		
			Date date = Calendar.getInstance().getTime();
			Last mdata = new Last(title, count, topping, date,delivery);
			PersistenceManagerFactory factory = PMF.get();
			PersistenceManager manager = factory.getPersistenceManager();

			try {
				manager.makePersistent(mdata);
			} finally {
				manager.close();
			}
			resp.sendRedirect("/Last.html");
		}
	}
}// (次にやること)テキストフィールドを一つにして、チェックボックスで一つだけ選ばせてテキストフィールドに選んだピザの注文したい枚数を入力させる。まだ注文があるならindexに戻ってくるようにする。
