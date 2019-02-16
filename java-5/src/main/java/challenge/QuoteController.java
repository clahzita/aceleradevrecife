package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class QuoteController {

	@Autowired
	private QuoteService service;

	@RequestMapping("/teste")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/v1/quote")
	public Quote getQuote() {
		return service.getQuote();
	}

	@RequestMapping("/v1/quote/{actor}")
	public Quote getQuoteByActor(@PathVariable("actor") String actor) {
		return service.getQuoteByActor(actor);
	}


}
