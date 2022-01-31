package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.PdfModel;
import services.GeneratePdfService;

@RestController
@RequestMapping("/api")
public class GeneratePdfController {
	
	@Autowired
	GeneratePdfService generatePdfService;
	
	
	@GetMapping(value = "/generate",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void generate(@RequestBody PdfModel model) throws Exception
	{
		generatePdfService.generate(model);
	}

}
