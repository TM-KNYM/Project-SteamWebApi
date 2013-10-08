package com.dota2.model.matchhistory;

import java.util.List;

public class Result {
	private final long status;
	private final long num_results;
	private final long total_results;
	private final long results_remaining;
	private final List<Match> matches;
	
	public Result(long status, long num_results,long total_results,long results_remaining,List<Match> matches){
		this.status = status;
		this.num_results = num_results;
		this.total_results = total_results;
		this.results_remaining = results_remaining;
		this.matches =matches;
	}
	
	
	/**
	 * @return the status
	 */
	public long getStatus() {
		return status;
	}

	/**
	 * @return the num_results
	 */
	public long getNum_results() {
		return num_results;
	}

	/**
	 * @return the results_remaining
	 */
	public long getResults_remaining() {
		return results_remaining;
	}

	/**
	 * @return the matches
	 */
	public List<Match> getMatches() {
		return matches;
	}
	
	/**
	 * @return the total_results
	 */
	public long getTotal_results() {
		return total_results;
	}

}
