@Controller
public class Hello {
	@RequestMapping("/hello")
	public String hello() {
		return "hi";
	}

}
