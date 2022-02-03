package controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nexton.pdfGenerator.utils.DataUtils;

import Models.PdfModel;
import services.GeneratePdfService;

@RestController
@RequestMapping("/api")
public class GeneratePdfController {
	
	@Autowired
	GeneratePdfService generatePdfService;
	
	@Autowired
	DataUtils dataUtils;
	
	@GetMapping(value = "/generate",consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody byte[] generate(@RequestBody PdfModel model) throws Exception
	{
		generatePdfService.generate(model);
		return dataUtils.convertPdfToByte(model.getReference());
	}

}
