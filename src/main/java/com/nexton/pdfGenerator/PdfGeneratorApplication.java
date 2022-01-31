package com.nexton.pdfGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Models.PdfModel;
import services.GeneratePdfService;

@SpringBootApplication
@Configurable
@ComponentScan (basePackages={"services","com.nexton.pdfGenerator.utils","controllers"})
public class PdfGeneratorApplication implements CommandLineRunner{
	@Autowired
	private GeneratePdfService g ;
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PdfGeneratorApplication.class, args);
	
		
	}
	@Override
	public void run(String... args) throws Exception {
//		PdfModel model = new PdfModel("nnnnnnnn");
//		
//		g.generate(model);		
	}

}
