import java.util.Arrays;

public class GettersAndSetters {
	
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int set_a[] = {1,2,3,4,5,6,7,8,9,10};
		int setb[] = new int [num];	
		int set_c[] = new int [num];
	
	for (int i = 0 ; i < 10 ; i++)
		{
			if(set_a[i] %2 == 0)
			{
			setb[i] = set_a[i];	
				
			}
			else
			{
				setb[i] = 0;
				
			}
			
			
			
		}
	System.out.println(Arrays.toString(setb));
	
	for (int j=0 ; j<10 ;j++)
	{
		if(setb [j] == 0 )
		{
			set_c [j] = setb[j+1]; 
			
		}
		else
		{
			set_c [j] = setb[j];
		}
		
		}
	System.out.println(Arrays.toString(set_c));
	
	// for the duplicate
	int n = 10;
	for (int i = 0 ; i < n ; i++)
    {
    	for (int j = i+1 ; j < n ; j++)
    	{
    		if (set_c[i] == set_c[j])
    		{
    			for (int k = j ; k < n ; k++)
    			{
    				set_c[k] = set_c [k+1];
    			}
    			n--;
    			j--;
    		}
    	}
    }
	
	
	System.out.println(Arrays.toString(set_c));
	}

}
