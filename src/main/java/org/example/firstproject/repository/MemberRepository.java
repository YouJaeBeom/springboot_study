package org.example.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.example.firstproject.entity.Member;

import java.util.ArrayList;

public interface MemberRepository extends CrudRepository<Member, Long> {
    @Override
    ArrayList<Member> findAll();
}
