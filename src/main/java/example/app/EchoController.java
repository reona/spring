package example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("echo")
public class EchoController {
	
	// Model に追加したオブジェクトは、HttpServletRequest にエクスポートされる仕組みになっているため
	// JSP からはリクエストスコープのオブジェクトとして参照できる
	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "echo/input";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String echo(EchoForm form) {
		return "echo/output";
	}

}
