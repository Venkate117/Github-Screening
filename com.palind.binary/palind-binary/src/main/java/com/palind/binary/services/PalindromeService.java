package com.palind.binary.services;

import java.util.List;

import com.palind.binary.entities.Palindrome;

public interface PalindromeService {
	
	Palindrome findLongestPalindromSubstring(String input);
	
	List<Palindrome> getAll();
	
}
