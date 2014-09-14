package com.tsdata.common;

import java.io.File;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class TSUtil {

	
	public  static String  saveFile(CommonsMultipartFile file,HttpServletRequest request){
		
		String fileName = file.getOriginalFilename();
		System.out.println(fileName);
		String projectPath = "/resource/uploadimg/";
		String path = request.getSession().getServletContext().getRealPath("/")+projectPath;
	
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		} else {
			Random random = new Random();
			String str = String.valueOf(Math.abs(random.nextInt()));
			targetFile = new File(path, fileName + str);
			if (!targetFile.exists()) {
				targetFile.mkdirs();
			} 
		}
		// ±£´æ
		try {
			file.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return projectPath + "/" + fileName;
	}
}
