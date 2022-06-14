package com.bbs.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbs.jpa.entity.Bbs;

public interface BbsRepository extends JpaRepository<Bbs, Integer> { // <엔티티, 엔티티의 기본키>
	// JPA에서 기본적으로 제공해주는 메서드들을 사용할 수 있음
	// CRUD, find 메소드 등등
	
}
