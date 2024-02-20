package com.clouddefenseAI.controller;

import com.clouddefenseAI.model.PromptHistory;
import com.clouddefenseAI.model.PromptModel;
import com.clouddefenseAI.model.UpdatePromptReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/prompts/")
public class PromptController {

	/**
	 * Internal working:
	 * -- Created session entity
	 * -- Create prompt entity
	 * -- Call ChatGpt api to get response agsinst the user prompt request
	 * -- Create prompt log entity against the above prompt entity object
	 *
	 * @return
	 */
	@PostMapping("v1/prompts/create")
	public ResponseEntity userPromptHandler(@RequestBody(required = true) PromptModel promptModel) {
		return new ResponseEntity(HttpStatus.OK);
	}


	/**
	 * Internal working:
	 * -- Updates a target prompt
	 * -- Basically a new Prompt log entity get created against the same existing prompt entity (fetch using above prompt id)
	 *
	 * @param sessionId
	 * @param promptId
	 * @param updatePromptReq
	 * @return
	 */
	@PostMapping("v1/update/{session-id}/{prompt-id}")
	public ResponseEntity updateExisitngPromptHandler(@PathVariable(required = true, name = "session-id") String sessionId,
													  @PathVariable(required = true, name = "prompt-id") String promptId,
													  @RequestBody(required = true) UpdatePromptReq updatePromptReq) {
		return new ResponseEntity(HttpStatus.OK);
	}


	/**
	 * -- Fetches prompt history and the list of prompt log entities associated with each of the prompts
	 *
	 * @param sessionId
	 * @return
	 */
	@GetMapping("v1/history/{session-id}")
	public ResponseEntity fetchPromptHistoryPerSessionHandler(@PathVariable(required = true, name = "session-id") String sessionId) {
		List<PromptHistory> promptHistory = new ArrayList<>(); // Fetch history from the database
		return new ResponseEntity(promptHistory, HttpStatus.OK);
	}


}


