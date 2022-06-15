# bbs
Spring Boot 연습


# JPA 에서 사용중인 테이블
CREATE TABLE bbs (
	num int NOT NULL AUTO_INCREMENT,
	title varchar(100) NOT NULL,
	content text NOT NULL,
	read_cnt int NOT NULL DEFAULT 0,
	reg_id varchar(100) NOT NULL,
	reg_date datetime NOT NULL DEFAULT now(),
	PRIMARY key(num)
);
