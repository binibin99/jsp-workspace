package chap07_webprocess;

import javax.servlet.http.HttpServletRequest;

public class IndexWebProcess implements WebProcess{

	@Override
	public String process(HttpServletRequest req) {
		// 처리가 있으면 하고

		// 처리가 끝난 후 다음으로 포워드해야하는 뷰 페이지를 반환
		return "/WEB-INF/views/index.jsp";
	}
}
