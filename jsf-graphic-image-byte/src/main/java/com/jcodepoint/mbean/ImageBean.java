package com.jcodepoint.mbean;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named("imageBean")
@ApplicationScoped
public class ImageBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String selectedImage;
	
	public String getSelectedImage() {
		return selectedImage;
	}

	public void setSelectedImage(String selectedImage) {
		this.selectedImage = selectedImage;
	}
}

