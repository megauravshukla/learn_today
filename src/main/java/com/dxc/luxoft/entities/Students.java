package com.dxc.luxoft.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="students")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "student_id")
	public int studentId;
	
	@Column(name = "student_name")
	public String studentName;
	
	@Column(name = "stu_email", unique = true)
	public String studentEmail;
	

	@Column(name = "course_opted")
	public String optedCourse;
	
	@Column(name = "qualification")
	public String qualification;
	
	@Column(name = "start_date")
	public String startDate;
	
	@Column(name = "trainer")
	public String trainer;
	
	@ManyToOne
    @JoinColumn(name = "course_id")
	public Courses course;

}
