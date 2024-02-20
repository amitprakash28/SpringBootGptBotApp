package com.clouddefenseAI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "USER_PROMPT")
public class PromptEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String promptId;
	@Column(nullable = false)
	private String sessionId;
	private LocalDateTime timestamp;

	@Column(nullable = false)
	private String userId;
}
