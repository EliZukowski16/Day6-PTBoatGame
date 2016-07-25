package com.tiy.ptboat;

public class PTBoatGame
{
	private PTBoat[] ptBoats;
	private int numberOfBoats = 0;
	
	public PTBoatGame()
	{
		ptBoats = new PTBoat[6];
	}
	
	public void addBoat(String row, int column)
	{
		ptBoats[numberOfBoats] = new PTBoat(row, column);
	
		numberOfBoats++;
	}
	
	public boolean guess(String row, int column)
	{
		boolean hit = false;
		
		for(int i = 0; i < numberOfBoats; i++)
		{
			if(ptBoats[i].isHit(row, column))
			{
				hit = true;
			}
		}
		
		return hit;
	}
	
	public static void main(String[] args)
	{
		PTBoatGame battlePTBoat = new PTBoatGame();
		String[] rowGuess = {"A", "B", "F", "I", "B", "K"};
		int[] columnGuess = {1, 3, 6, 6, 2, 8};
		
		battlePTBoat.addBoat("A", 1);
		battlePTBoat.addBoat("B", 2);
		battlePTBoat.addBoat("C", 3);
		battlePTBoat.addBoat("D", 4);
		battlePTBoat.addBoat("E", 5);
		battlePTBoat.addBoat("F", 6);
		
		
		for(int i = 0; i < rowGuess.length; i++)
		{
			if(battlePTBoat.guess(rowGuess[i], columnGuess[i]))
			{
				System.out.print("Guess number " + (i + 1) + " at row " + rowGuess[i]);
				System.out.println(", column " + columnGuess[i] + " hit a PTBoat.");
			}
			else if(!(battlePTBoat.guess(rowGuess[i], columnGuess[i])))
			{
				System.out.println("Guess number " + (i + 1) + " missed.");
			}
		}
	}
}
