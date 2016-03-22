
public class chckprime {
	public void prime(int n)
	{ int j, isprime=0;
		for(j=2; j<=n/2; j++)  
        {  
            if(n%j==0)  
            {  
                isprime = 1;  
                break;  
            }  
        }//for ends
		
		if(isprime==0)
		{
			System.out.println(n+" is a prime number ");
		}
		else
		{
			System.out.println(n+" is not a prime number ");
		}
		
	}


	public static void main(String args[])
	{
	chckprime cp = new chckprime();
	cp.prime(47);
	}

}
