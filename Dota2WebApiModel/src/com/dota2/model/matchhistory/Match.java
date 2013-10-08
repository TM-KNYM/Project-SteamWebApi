package com.dota2.model.matchhistory;

import java.util.List;

public class Match {
	private final long match_id;
	private final long match_seq_num;
	private final long start_time;
	private final long lobby_type;
	private final List<Player> players;
	
	public Match(long match_id,long match_seq_num,long start_time,long lobby_type,  List<Player> players){
		this.match_id = match_id;
		this.match_seq_num = match_seq_num;
		this.start_time = start_time;
		this.lobby_type = lobby_type;
		this.players = players;
	}
	
	/**
	 * @return the match_id
	 */
	public long getMatch_id() {
		return match_id;
	}
	
	/**
	 * @return the match_seq_num
	 */
	public long getMatch_seq_num() {
		return match_seq_num;
	}

	/**
	 * @return the lobby_type
	 */
	public long getLobby_type() {
		return lobby_type;
	}

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * @return the start_time
	 */
	public long getStart_time() {
		return start_time;
	}

	
	
}
