package com.biz.files;

import java.io.IOException;

import com.biz.files.service.BufferedReaderService;

public class FileEx_05 {

	public static void main(String[] args) throws IOException {

		BufferedReaderService bs = new BufferedReaderService();
		String fileName = "src/com/biz/files/data.txt";
		
		bs.read(fileName);
		
		
	}

}
