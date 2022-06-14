package com.bbs.jpa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 매개변수로 다 받는 생성자 생성 public
@NoArgsConstructor // 매개변수 필요 없는 생성자 생성
@Entity // 실제 DB의 테이블과 매칭될 class임을 명시
@Table(name = "bbs")
public class Bbs {
	
	@Id // pk필드 나타냄
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동 생성 옵션 IDENTITY는 주로 mysql
	private int num;
	
	private String title;
	private String content;
	private int read_cnt;
	private String reg_id;
	private Date reg_date;

	
	
}
