package com.clouddefenseAI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterUser {
	@NotNull
	private String mobile;
	@NotNull
	private String userName;
	@NotNull
	private String password;
}
