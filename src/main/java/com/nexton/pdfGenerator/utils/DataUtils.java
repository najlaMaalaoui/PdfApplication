package com.nexton.pdfGenerator.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataUtils {

	@Value("${file.path}")
	private String path;

	private String[] pathnames;
	private Path p;
	private byte[] pdf;

	public byte[] convertPdfToByte(String ref) throws Exception {

		File f = new File(path);

		pathnames = f.list();

		for (String pathname : pathnames) {
			p = Paths.get(path+"/"+pathname);

			if (pathname.contains(ref))
				pdf = Files.readAllBytes(p);
		}

		return pdf;
	}
}
