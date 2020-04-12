package com.lawencon.pendaftaranmahasiswa.controller;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

abstract class BaseController<T> {

	public T readValue(String jsonString, Class<T> classType)
			throws JsonMappingException, JsonMappingException, IOException {
		return new ObjectMapper().readValue(jsonString, classType);
	}
}
