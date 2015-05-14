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
			if( rolls[ i ] == 10 ){ // strike
					score += 10 + rolls[ i + 1 ] + rolls[ i + 2 ];
				i ++;
			
			}
			else if(isSpare(i)) //spare
			{
				score += 10 + rolls[i+2];
				i+=2;
			}
			else
			{
				score += rolls[i] + rolls[i+1];
				i+=2;
			}
		}
		return score;
	}
	
	private boolean isSpare(int frameIndex){
		return rolls[frameIndex] + rolls[frameIndex+1] == 10;
	}
	
}

