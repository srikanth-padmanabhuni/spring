package com.presidio.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String patientName;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	// We cannot make variables as required. We can make only setter methods of the variables annotated
	// This annaotation makes the field as required and if it is missing then throws an exception while instantiating the bean
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + "]";
	}

	
}
