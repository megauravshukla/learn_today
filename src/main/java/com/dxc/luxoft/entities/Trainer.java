package com.dxc.luxoft.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="trainer")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "trainer_id")
	public int trainerId;
	
	@Column(name = "trainer_name")
	public String trainerName;
	
	@Column(name = "trainer_email", unique = true)
	public String trainerEmail;
	
	@Column(name = "expertise")
	public String expertise;
	
	@Column(name = "qualification")
	public String qualification;
	
	@Column(name = "register_date")
	public String registerdate;

}
