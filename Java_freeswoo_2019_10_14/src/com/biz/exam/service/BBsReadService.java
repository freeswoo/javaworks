package com.biz.exam.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public interface BBsReadService {

	public void readBBS(String bbsFile) throws FileNotFoundException, IOException;
	public List<BBsVO> getBBsList();
}
