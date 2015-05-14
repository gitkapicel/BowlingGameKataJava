package com.luk.kata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BowlingGameKataTest {
	
	@Test
 	public void gameWithoutPoints() {
		Game g = new Game();
		
		rollAFewTimes(g,0);
		assertThat( g.score() , is(0) );
		
	
	}
	
	public void rollAFewTimes(Game game , int points)
	{
		for (int i =0; i<20; i++) {
			game.roll(points);
			
		}
	}
	
}