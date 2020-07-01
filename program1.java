 import java.util.*; 
  
class GFG { 
  
     public static void  main (String h[])
    { 
  
        // triplet: a^2 + b^2 = c^2 
        int a, b, c = 0; 
  
        // loop from 2 to max_limitit 
        int m = 2; 
  
        // Limiting c would limit 
        // all a, b and c 
        while (c < limit) { 
  
            // now loop on j from 1 to i-1 
            for (int n = 1; n < m; ++n) { 
                // Evaluate and print 
                // triplets using 
                // the relation between 
                // a, b and c 
                a = m * m - n * n; 
                b = 2 * m * n; 
                c = m * m + n * n; 
  
                if (c > limit) 
                    break; 
  
                System.out.println(a + " " + b + " " + c); 
            } 
            m++; 
        } 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int limit = 20; 
        pythagoreanTriplets(limit); 
    } 
} 