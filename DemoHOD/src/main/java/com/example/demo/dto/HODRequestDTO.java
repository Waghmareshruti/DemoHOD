package com.example.demo.dto;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HODRequestDTO {
	private String name;
	private String email;
	private Float experience;
	private Float salary;
	private String address;
	private String password;
	private List<String> subjects;
	private String mob;

}
