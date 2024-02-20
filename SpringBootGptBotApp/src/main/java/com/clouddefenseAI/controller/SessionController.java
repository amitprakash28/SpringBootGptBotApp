package com.clouddefenseAI.controller;

import com.clouddefenseAI.model.PromptModel;
import com.clouddefenseAI.model.SessionHistory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/sessions/")
public class SessionController {

	/**
	 * Continues the existing session with new prompt and uses ChatGpt's content aware api to send last prompt of this session as history and
	 * new prompt as the new request
	 *
	 * @param sessionId
	 * @param promptModel
	 * @return
	 */
	@PostMapping("v1/continue/{session-id}")
	public ResponseEntity continueSessionHandler(@PathVariable(required = true, name = "session-id") String sessionId,
												 @RequestBody(required = true) PromptModel promptModel) {
		if (StringUtils.isEmpty(promptModel.getSessionId())) {
			return new ResponseEntity("Please provide session id to continue chat!", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(HttpStatus.OK);
	}


	/**
	 * Fetches list of sessions associated with a user
	 *
	 * @param userId
	 * @return
	 */
	@GetMapping("v1/history/get/{user-id}")
	public ResponseEntity fetchSessionHistoryForUserHandler(@PathVariable(required = true, name = "user-id") String userId) {
		List<SessionHistory> foundSessions = new ArrayList<>(); // Fetches from the Database
		return new ResponseEntity(foundSessions, HttpStatus.OK);
	}
}
