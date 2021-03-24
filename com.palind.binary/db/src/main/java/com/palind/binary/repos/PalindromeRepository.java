package com.palind.binary.repos;

import org.springframework.data.repository.CrudRepository;

import com.palind.binary.entities.Palindrome;

public interface PalindromeRepository extends CrudRepository<Palindrome, Long> {

}
