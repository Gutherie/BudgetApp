package com.gutherie.budgetApp.controller;

import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("session")

public class SessionData {
	public void setLocal(Locale aLocale){
		locale = aLocale;
	}
	
	public Locale getLocale(){
		return locale;
	}
	
	private Locale locale;
}
