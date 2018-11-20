package famouslab.demo;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import famouslab.demo.model.Complete;
import famouslab.demo.model.Response;
import famouslab.demo.model.Tiny;

@Component
public class InventerService {

	private RestTemplate restTemplateWithUserAgent;{
	
	restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors().build();
              }
	public List<Tiny> tinyNames()
	{
		 String url="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		 Response response=restTemplateWithUserAgent.getForObject(url, Response.class);
		 return  response.getTiny();
		
	}
	public List<Complete>completeNames()
	{
		String url="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		Response response=restTemplateWithUserAgent.getForObject(url, Response.class);
		return response.getComplete();
	}
}
