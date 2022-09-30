package com.dxc.luxoft.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonSerialize
public class StudentTO {
	
	public String studentName;
	
	public String studentEmail;
	
	public String password;

	public String optedCourse;
	
	public String qualification;
	
	public Date startDate;
	
	public String trainer;

}
