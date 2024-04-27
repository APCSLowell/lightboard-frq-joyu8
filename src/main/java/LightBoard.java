public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
      int e = 0;
	    for(int r = 0; r < lights.length; r++){
	    	if(lights[row][col] == true)
			    e++;
			if(lights[r][col] == true)
				e++;
			if(e % 2 == 0)
				return false;
		if(lights[row][col] == false)
			if(lights[r][col] == true)
				e++;
			if(e % 3 == 0)
				return true;
	} return lights[row][col];
}

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    int e = 0;
	for(int r = 0; r < lights.length; r++){
		if(lights[row][col] == true)
			e++;
			if(lights[r][col] == true)
				e++;
			if(e % 2 == 0)
				return false;
		if(lights[row][col] == false)
			if(lights[r][col] == true)
				e++;
			if(e % 3 == 0)
				return true;
	} return lights[row][col];
}

   
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
