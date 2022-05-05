package com.example.springdatajdbcsample.repository;

import com.example.springdatajdbcsample.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {
}
