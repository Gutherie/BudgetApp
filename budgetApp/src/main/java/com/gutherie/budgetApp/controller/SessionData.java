package com.gutherie.budgetApp.controller;

import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)

public class SessionData {
	public void setLocal(Locale aLocale){
		locale = aLocale;
	}
	
	public Locale getLocale(){
		return locale;
	}
	
	private Locale locale;
}
