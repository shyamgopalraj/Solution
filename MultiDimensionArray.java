class MultiDimensionArray {
    // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
    int n = lengthOfDimension.Length;
		int[] indices = new int[n]; // all zeroes
		int prev = n-2;
		Long sum = 0l;
		while (prev >=0)
		{
    		for (indices[n-1] = 0; indices[n-1] < lengthOfDimension[n-1]; indices[n-1]++)
    		{
        		sum += getValue(indices);
    		}
    		while (prev >= 0)
    		{
          indices[prev]++;
          if (indices[prev] == lengthOfDimension[prev])
        	   indices[prev--] = 0;
    		}
    		if (prev >= 0) prev = n-2;
		}
   		return sum;
    }
}
