package famouslab.demo.model;

import java.util.List;

public class Response {

	private List<Complete> complete;
	private List<Tiny> tiny;
	public List<Complete> getComplete() {
		return complete;
	}
	public void setCompleteList(List<Complete> complete) {
		this.complete = complete;
	}
	public List<Tiny> getTiny() {
		return tiny;
	}
	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}
	
}