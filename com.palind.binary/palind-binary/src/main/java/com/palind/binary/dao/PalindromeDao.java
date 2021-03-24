package com.palind.binary.dao;

import java.util.List;

import com.palind.binary.entities.Palindrome;

public interface PalindromeDao {
	
	Palindrome savePalindrome(Palindrome palindromeSubString);
	
	List<Palindrome> getAll();

}
