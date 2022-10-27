package com.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProgram {
	
	public void regexRunner(String regexExpression,String userIP) {
		boolean valid=Pattern.compile(regexExpression).matcher(userIP).matches();
		System.out.println(userIP+" is "+valid);
		}
	
public static void main(String[] args) {
	System.out.println("Welcome To Regex Program");
	RegexProgram obj=new RegexProgram();
	System.out.println("--------------------True Cases------------------------");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@yahoo.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc.100@yahoo.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$","abc111@abc.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc-100@abc.net");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc.100@abc.com.au");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@1.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@gmail.com.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc+100@gmail.com");
	System.out.println("----------------------False Cases---------------------");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@.com.my");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc123@gmail.a");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "Password@12345");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc123@.com.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", ".abc@abc.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc()*@gmail.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@%*.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc..2002@gmail.com");
	obj.regexRunner("^[a-zA-Z]+([.+-]?[A-Za-z0-9])*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc.@gmail.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@abc@gmail.com");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@gmail.com.1a");
	obj.regexRunner("^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$", "abc@gmail.com.aa.au");

}
}
