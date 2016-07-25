package com.tiy.ptboat;

public class PTBoat
{
	String row;
	int column;
	
	public PTBoat(String row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	public boolean isHit(String row, int column)
	{
		if((this.row.equals(row)) && (this.column == column))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
