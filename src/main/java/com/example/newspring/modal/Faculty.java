package com.example.newspring.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;



/**
 * The persistent class for the faculty database table.
 * 
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Faculty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@Column(name="fac_email")
	@NonNull
	private String facEmail;

	@Column(name="fac_name")
	@NonNull
	private String facName;

}