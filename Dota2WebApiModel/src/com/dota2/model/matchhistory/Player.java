package com.dota2.model.matchhistory;

public class Player {
	private final long account_id;
	private final long player_slot;
	private final long hero_id;
	
	public Player(long account_id, long player_slot, long hero_id){
		this.account_id = account_id;
		this.player_slot = player_slot;
		this.hero_id = hero_id;
	}
	
	/**
	 * @return the account_id
	 */
	public long getAccount_id() {
		return account_id;
	}
	
	/**
	 * @return the player_slot
	 */
	public long getPlayer_slot() {
		return player_slot;
	}

	/**
	 * @return the hero_id
	 */
	public long getHero_id() {
		return hero_id;
	}

}
