package teluskoJava;

public class TeluskoPattern {

	public static void main(String[] args) {
		
		int count=34;		//it is used to print K letter in TELUSKO
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=40;j++)
			{
				//this if block used to print space after each later
				if(j==6 || j==12 || j==18 || j==24 || j==30 || j==35)
				{
					System.out.print(" ");
				}
				//this if block used to print T letter
				if(j<=5)
				{
					if(i==1 || j==3)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print E letter
				if(j>=7 && j<=11)
				{
					if(j==7 || i==1 || i==3 || i==5)
    				{
    					System.out.print("* ");
    				}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print L letter
				if(j>=13 && j<=17)
				{
					if(j==13 || i==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print U letter
				if(j>=19 && j<=23)
				{
					if(j==19 || j==23 || i==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print S letter
				if(j>=25 && j<=29)
				{
					if(i==1 || i==3 || i==5 || (j==25 && i==2) || (j==29 && i==4))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print K letter
				if(j>=31 && j<=34)
				{
					if(j==31 || j==count)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print O letter
				if(j>=36 && j<=40)
				{
					if(i==1 || i==5 || j==36 || j==40)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			//this if block is used to Increment & Decrement count
			if(i<3)
			{
				count--;
			}
			else
			{
				count++;
			}
			System.out.println();
		}
	}

}
