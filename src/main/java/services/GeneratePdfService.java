package services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.nexton.pdfGenerator.utils.PdfGenaratorUtil;

import Models.PdfModel;
@Service
public class GeneratePdfService {
	
	@Autowired
	private PdfGenaratorUtil pdfGenaratorUtil;
	
	public void generate(PdfModel model) throws Exception
	{
		Map<String,String> data = new HashMap<String,String>();
	    data.put("name",model.getName());
	    pdfGenaratorUtil.createPdf("test",data,model.getReference()); 
	}

}
