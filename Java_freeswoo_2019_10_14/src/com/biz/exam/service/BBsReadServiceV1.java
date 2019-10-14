package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsReadServiceV1 implements BBsReadService {

	private List<BBsVO> bbsList;
	@Override
	public void readBBS(String bbsFile) throws IOException {

		bbsList = new ArrayList<BBsVO>();
		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
						
			String[] read = reader.split(":");
			BBsVO vo = new BBsVO();
			vo.setSeq(Integer.valueOf(read[0]));
			vo.setAuth(read[1]);
			vo.setDate(Integer.valueOf(read[2]));
			vo.setSubject(read[3]);
			vo.setText(read[4]);
			vo.setCount(Integer.valueOf(read[5]));
			
			bbsList.add(vo);
			
		}
		buffer.close();
		fileReader.close();
	}

	@Override
	public List<BBsVO> getBBsList() {
		
		return null;
	}

}
