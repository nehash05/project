import java.util.*;
import java.io.*;

public class task2
{
	public static void main(String args[]) throws Exception
	{
			File file= new File("training_data.txt");
			Scanner sc=new Scanner(file);
			int gameontv=0,watchtv=0,feedcat=0,outoffood=0;
			float[][] a=new float[365][4];
			float row=365,column=4;
			float denom=0,num=0;
					for(int i=0;i<row;i++)
					{
						for(int j=0;j<column;j++)
						{
							if(sc.hasNextInt())
								a[i][j]=sc.nextInt();
						}
					}
					for(int i=0;i<row;i++)
					{
						if(a[i][0]==1)
							gameontv=gameontv+1;
					}

						System.out.println("P(baseball game on TV)=" + gameontv/row);
					for(int i=0;i<row;i++)
						if(a[i][2]==1)
							outoffood++;
						System.out.println("P(George out of cat food)=" + outoffood/row);
					for(int i=0;i<row;i++)
						if(a[i][0]==1)
							denom++;
					for(int j=0;j<row;j++)
						if(a[j][1]==1 && a[j][0]==1)
							num++;
						System.out.println("P(George watches tv/baseball game on tv = TRUE)=" + num/denom);	
					denom=0;
					num=0;
					for(int i=0;i<row;i++)
						if(a[i][0]==0)
							denom++;
					for(int j=0;j<row;j++)
						if(a[j][1]==1 && a[j][0]==0)
							num++;
						System.out.println("P(George watches tv/baseball game on tv = FALSE)=" + num/denom);
					denom=0;
					num=0;	
					for(int i=0;i<row;i++)
						if(a[i][1]==1 && a[i][2]==1)
							denom++;
					for(int j=0;j<row;j++)
						if(a[j][1]==1 && a[j][2]==1 && a[j][3]==1)
							num++;
					System.out.println("P(George_feeds_cat/George_watches_TV=TRUE and out_of_cat_food=TRUE)="+ num/denom);
					num=0;
					denom=0;
					for(int i=0;i<row;i++)
						if(a[i][1]==1 && a[i][2]==0)
							denom++;
					for(int j=0;j<row;j++)
						if(a[j][1]==1 && a[j][2]==0 && a[j][3]==1)
							num++;
					System.out.println("P(George_feeds_cat/George_watches_TV=TRUE and out_of_cat_food=FALSE) = "+ num/denom);
					num=0;
					denom=0;
					for(int i=0;i<row;i++)
						if(a[i][1]==0 && a[i][2]==1)
							denom++;
					for(int j=0;j<row;j++)
						if(a[j][1]==0 && a[j][2]==1 && a[j][3]==1)
							num++;
					System.out.println("P(George_feeds_cat/George_watches_TV=FALSE and out_of_cat_food=TRUE) = "+ num/denom);
					num=0;
					denom=0;
					for(int i=0;i<row;i++)
						if(a[i][1]==0 && a[i][2]==0)
							denom++;
					for(int j=0;j<row;j++)
						if(a[j][1]==0 && a[j][2]==0 && a[j][3]==1)
							num++;
					System.out.println("P(George_feeds_cat/George_watches_TV=FALSE and out_of_cat_food=FALSE) = "+ num/denom);
	}
}
