package famouslab.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import famouslab.demo.model.Complete;
import famouslab.demo.model.Tiny;

@Controller
public class InventerController {
	@Autowired
	InventerService inventerService;
	@RequestMapping("/")
	public ModelAndView index() {
	 return  new ModelAndView("index");}
	 @RequestMapping("/tiny")
	public ModelAndView showtiny() {
		List<Tiny> tiny = inventerService.tinyNames();
		
	 return  new ModelAndView("tiny","tiny",tiny);
	}
	@RequestMapping("/complete")
	public ModelAndView showcomplete()
	{
		List<Complete>complete= inventerService.completeNames();
		return new ModelAndView("complete","complete",complete);
	}
	


}
