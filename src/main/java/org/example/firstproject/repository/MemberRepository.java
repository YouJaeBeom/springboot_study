package org.example.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.example.firstproject.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
