package com.clouddefenseAI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PromptHistory {
	private String promptId;
	private LocalDateTime timestamp;
	private List<PromptLogRes> promptLogEntityList;

}
