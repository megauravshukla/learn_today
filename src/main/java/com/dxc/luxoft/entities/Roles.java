package com.dxc.luxoft.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name ="user_roles")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "role_id")
	public int id;
	
	@Column(name = "user_role", nullable = false)
	public String role;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserDetails user;
	
	

}
