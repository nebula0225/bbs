package com.bbs.jpa;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bbs.jpa.entity.Bbs;
import com.bbs.jpa.repository.BbsRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BbsTest {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	Date now = new Date();
	
	@Autowired 
	private BbsRepository bbsRepository;
	
	@Test
	public void save() {
		Bbs bbs1 = new Bbs();
		bbs1.setTitle("test_title 02");
		bbs1.setContent("test_content 02");
		bbs1.setReg_id("test_regId 02");
		bbs1.setReg_date(now);
		
		bbsRepository.save(bbs1);
	}
	
}
