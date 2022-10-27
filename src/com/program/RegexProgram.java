package com.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProgram {
	
	public void regexRunner(String regexExpression,String userIP) {
		boolean valid=Pattern.compile(regexExpression).matcher(userIP).matches();
		System.out.println(valid);
		}
	
public static void main(String[] args) {
	System.out.println("Welcome To Regex Program");
	RegexProgram obj=new RegexProgram();
	obj.regexRunner("^[a-z]{3}[.]?[a-z]?[@#$&]{1}[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]{2}$", "abc@bi.co.in");
}
}
