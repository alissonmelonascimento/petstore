package org.acme.petstore.dto;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
	public Long id;
	public Category category;
	public String name;
	public List<String> photoUrls = new ArrayList<>();
	public List<Tag> tags = new ArrayList<>();
	public String status;

}
