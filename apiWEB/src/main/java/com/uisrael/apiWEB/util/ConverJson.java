package com.uisrael.apiWEB.util;

import com.google.gson.Gson;

public class ConverJson<T> {

	private final Class<T> objetType;
	private final Gson gson;
	
	public ConverJson(Class<T> objetType) {
		this.gson = new Gson();
		this.objetType = objetType;
	}
}
