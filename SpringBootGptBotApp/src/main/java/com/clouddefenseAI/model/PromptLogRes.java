package com.clouddefenseAI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PromptLogRes {

	private String promptLogId;
	private String request; // user prompt request
	private String response; // chatgpt response
	private LocalDateTime timestamp;
	private String promptId;
}
