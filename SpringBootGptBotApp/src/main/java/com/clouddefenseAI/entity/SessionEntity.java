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
@Table(name = "USER_SESSION")
public class SessionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String sessionId;

	@Column(nullable = false)
	private String userId;

	@Column(name = "SESSION_HEADLINE")
	private String headline;

	@Column(name = "TIMESTAMP")
	private LocalDateTime timestamp;



}
