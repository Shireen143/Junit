package com.epam.tddjunitassignment;

public class RemoveIfFirst2Chars {


	public String remove(String string) {
		if(string.length()<2) {
			if(string.length()==1 && string.charAt(0)!='A')
			string=string;
			else{
				string="";
			}
		}
		else {
		if(string.charAt(0)=='A' && string.charAt(1)=='A') {
		 string=string.substring(2,string.length());
		}
		else if(string.charAt(1)=='A' && string.charAt(0)!='A') {
			string= string.charAt(0)+string.substring(2,string.length());

		}
		else if(string.charAt(0)=='A'&&string.charAt(1)!='A') {
			string= string.substring(1,string.length());
		}
		
		}

  return string;
	
	}

}
