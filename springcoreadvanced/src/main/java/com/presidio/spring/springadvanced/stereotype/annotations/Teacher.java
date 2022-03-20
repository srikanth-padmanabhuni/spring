package com.presidio.spring.springadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// By Default the scope of a bean created by spring is `Singleton` if we use or not use @Scope
// This annotataions tells Object of this class can be created by spring internally
// @Component("teacherBean") // This type of annotation helps us to tell spring to create a bean with our userdefined name
@Component
// Scope annottaion can be used only after using @Component only. Cant use it alone
@Scope(scopeName = "prototype") // Name of the scope
public class Teacher {

	// Value annotations helps us to provide a value to the variable instead of default value while creating bean internally
	// Here we provide data statically
	// @Value("101")
	
	// Invoking a static method inside value annotation using SpEL
	// Syntax to provide static methods inside Value annotation is as follows:
		// #{T(packageName).methodName(Params_If_Any)}
	// @Value("#{T(java.lang.Math).abs(-1000)}")
	
	// Creating Objects for primitive types as follows:
		// #{new Integer(Value)}
	//@Value("#{new Integer(100)}")
	
	// Accessing static values inside a class using SpEL
	// Syntax is as follows:
		// #{T(packageName).static_variable_name}
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int id;
	
	// These are used for primitive and collection types
	// Static way of giving string value to it
	// @Value("Srikanth Padmanabhuni")
	
	// Providing the string values using SpEL
	// Syntax: 
		// #{'String_Value'.any_Method_If_required_to_use}
		// OR
		// #{new java.lang.String('String_Value')}
	// @Value("#{'Srikanth Padmanabhuni'}") // Siimple String value using SpEL
	// @Value("#{'Srikanth Padmanabhuni'.toUpperCase()}") // String value with method to invoke
	// @Value("#{(new java.lang.String('Srikanth Padmanabhuni'))}") // Simple String creation using String Object
	@Value("#{(new java.lang.String('Srikanth Padmanabhuni')).toUpperCase()}") // Creating string as object and invoking methods as well
	private String name;
	
	// #{} -> This syntax is called Spring Expression Language(SpEl)
	@Value("#{studentsList}") // studentsList is the id of the util list defiend in the config.xml
	private List<String> students;
	
	// This injects the bean of the `Institution` to this class
	// If it is added then we also need to add component-scan in config also
	@Autowired
	private Institution institutionDetails;
	
	//@Value("#{true}") // Simple boolean assigned using SpEL
	@Value("#{2+3>5?true:false}") // Assigning boolean using Expression
	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}
	

	public Institution getInstitutionDetails() {
		return institutionDetails;
	}

	public void setInstitutionDetails(Institution institutionDetails) {
		this.institutionDetails = institutionDetails;
	}
	

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + ", institutionDetails="
				+ institutionDetails + ", active=" + active + "]";
	}

}
