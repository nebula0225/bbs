package com.bbs.jpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bbs.jpa.entity.Bbs;
import com.bbs.jpa.repository.BbsRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class findTest {
	
	@Autowired
	BbsRepository bbsRepository;
	
	@Test
	public void findAll() {
		
		List<Bbs> list = bbsRepository.findAll();
		list.stream().forEach(System.out::println);
	}
	
	@Test
	public void findById() {
		Optional<Bbs> list = bbsRepository.findById(2);
		log.info(list.toString());
	}

}
