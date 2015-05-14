package com.luk.kata;

public class Game {
	 
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	public void roll(int points) {
		rolls[currentRoll++]=points;
		
	}
	
	public int score() {
		int score = 0;
		int i =0;
		for(int frame = 0; frame < 10; frame++){
			if( isStrike(i) ){ // strike
				score += 10 + strikeBonus(i);
			i ++;
		
		}
		else if(isSpare(i)) //spare
		{
			score += 10 + spareBonus(i);
			i+=2;
		}
		else
		{
			score +=  sumOfBallsInFrame(i);
			i+=2;
		}
	}
	return score;
	}
	
	private boolean isSpare(int frameIndex){
		return rolls[frameIndex] + rolls[frameIndex+1] == 10;
	}
	
	private boolean isStrike(int frameIndex){
		return rolls[frameIndex] == 10;
	}
	
	private int strikeBonus(int frameIndex){
		return rolls[frameIndex + 1]  + rolls[ frameIndex + 2 ];
	}
	
	private int spareBonus(int frameIndex){
		return rolls[ frameIndex + 2 ];
	}
	
	private int sumOfBallsInFrame(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1];
	}
	
}

