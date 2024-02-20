package com.clouddefenseAI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PromptModel {
	@NotNull
	private String userId;
	@NotNull
	private String prompt; // Request

	private String sessionId;
}
