package com.talent.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TalentController {

	@GetMapping("/test/{candidateFileName}")
	public String TestCandidateCode(@PathVariable String candidateFileName) throws IOException, InterruptedException {

		ProcessBuilder builder = new ProcessBuilder("CMD", "/c", "mvn test");
		String dir = "C:\\Talent\\" + candidateFileName;
		builder.directory(new File(dir));
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		boolean flag=false;
		String result="Better Luck Next Time";
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			if(line.contains("BUILD SUCCESS"))
			{
				return "pass";
			}
	 
			System.out.println(line);
		}

	//	return new ResponseEntity<String>(result, HttpStatus.OK);
		return "fail";
	}

}
