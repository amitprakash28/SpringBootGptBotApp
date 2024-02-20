package com.clouddefenseAI.entity;


import javax.persistence.*;

@Entity
@Table(name = "PROMPT_LOG")
public class PromptLogEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String promptLogId;
	@Column(nullable = false)
	private String promptId;
	@Column(name = "PROMPT_REQUEST", nullable = false)
	private String promptRequest;
	@Column(name = "PROMPT_RESPONSE", nullable = false)
	private String promptResponse;
	@Column(nullable = false)
	private String userId;
}
