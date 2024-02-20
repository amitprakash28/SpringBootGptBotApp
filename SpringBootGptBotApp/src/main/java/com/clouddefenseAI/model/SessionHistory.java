package com.clouddefenseAI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SessionHistory {
	private String sessionId;
	private String headline;
	private LocalDateTime timestamp;
	private String userId;
}
