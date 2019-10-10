package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSettings;

/*
 * 도서정보.txt 파일을 읽어서
 * 문자열을 콜론(:)을 기준으로 분리하고
 * BookVO에 담은 후 bookList에 추가하는 method를 작성
 */
public class BookReadServiceV1 {

	private List<BookVO> bookList ;
	
	public List<BookVO> getBookList() {
		return bookList;
	}
	
	public void readBookInfo(String bookFile) throws Exception {
		
		bookList = new ArrayList<BookVO>();
		FileReader fileReader = new FileReader(bookFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		int lineNum = 0;
		while(true) {
			
			System.out.println(++lineNum);
			reader = buffer.readLine();
			if(reader == null) break;
						
			String[] books = reader.split(":");
			
			BookVO bookVO = new BookVO();
			bookVO.setB_isbn(books[BookSettings.File.ISBN]);
			bookVO.setB_comp(books[BookSettings.File.COMP]);
			bookVO.setB_title(books[BookSettings.File.TITLE]);
			bookVO.setB_writer(books[BookSettings.File.WRITER]);
			bookVO.setB_date(books[BookSettings.File.DATE]);
			bookVO.setB_trans(books[BookSettings.File.TRANS]);
			
			int price = Integer.valueOf(books[BookSettings.File.PRICE].trim());
			bookVO.setB_price(price);
			
			int page = Integer.valueOf(books[BookSettings.File.PRICE].trim());
			bookVO.setB_page(page);
			
			bookList.add(bookVO);
			
		}
		
	}
	
	
}
