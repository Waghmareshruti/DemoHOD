package com.example.demo.model;

import java.util.List;

import com.example.demo.dto.HODRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CollegeHod")
public class HOD {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Float experience;
	private Float salary;
	private String address;
	private String username;
	private String password;
	private List<String> subjects;
	private String mob;
	public HOD(HODRequestDTO dto) {
		this.address=dto.getAddress();
		this.email=dto.getEmail();
		this.experience=dto.getExperience();
		this.mob=dto.getMob();
		this.password=dto.getPassword();
		this.subjects=dto.getSubjects();
		this.name=dto.getName();
		this.salary=dto.getSalary();
		this.username=dto.getName()+dto.getMob().subSequence(0, 4);
	}

}
