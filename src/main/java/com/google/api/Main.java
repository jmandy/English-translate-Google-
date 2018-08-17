package com.google.api;


import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class Main {
  public static void main(String[] args) throws Exception {
    // Set the HTTP referrer to your website address.
	  
	  String key="";
	  //key=
	  
    GoogleAPI.setHttpReferrer("https://developers.google.com/console/help/new/");

    // Set the Google Translate API key
    // See: http://code.google.com/apis/language/translate/v2/getting_started.html
    GoogleAPI.setKey(key);

    String translatedText = Translate.DEFAULT.execute("", Language.KOREAN, Language.ENGLISH);

    System.out.println(translatedText);
  }
}
