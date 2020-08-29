package com.citizens4.web.repository;

import com.citizens4.web.model.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}