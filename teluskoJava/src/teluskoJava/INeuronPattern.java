package teluskoJava;

public class INeuronPattern {
	public static void main(String[] args) {
		
		int count=7;		//it is used to print first N in INEURON
		int count1=37;		//it is used to print last N in INEURON

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=41;j++)
			{
				//this if block used to print space after each later
				if(j==7 || j==12 || j==18 || j==24 || j==30 || j==36)
				{
					System.out.print(" ");
				}
				//this if block used to print I letter
				if(j<=5)
				{
					if(i==1 || i == 5 || j==3)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print N letter
				if(j>=7 && j<=11)
				{
					if(j==7 || j==count || j==11)
    				{
    					System.out.print("* ");
    				}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print E letter
				if(j>=13 && j<=17)
				{
					if(i==1 || i==3 || i==5 || j==13)
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
				//this if block used to print R letter
				if(j>=25 && j<=29)
				{
					if(i==1 || i==3 || j==25 || (j==29 && i==2) || (j==27 && i==4)  || (j==28 && i==5))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print O letter
				if(j>=31 && j<=35)
				{
					if(i==1 || i==5 || j==31 || j==35)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				//this if block used to print N letter
				if(j>=37 && j<=41)
				{
					if(j==37 || j==count1 || j==41)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			count++;
			count1++;
		}
	}

}

