package com.clouddefenseAI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdatePromptReq {
	@NotNull
	private String sessionId;
	@NotNull
	private String promptId;
	@NotNull
	private String userId;
	@NotNull
	private String prompt; // new request
}
