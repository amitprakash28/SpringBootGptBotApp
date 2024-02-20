package com.clouddefenseAI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "USER_DETAIL")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	@Column(name = "mobile", nullable = false)
	private String mobile;
	private String userName;
	@Column(nullable = false)
	private String password;
}
