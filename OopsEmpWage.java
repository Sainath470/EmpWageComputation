///"Welcome to Eployee Wage Computation"
import java.util.Random;
public class OopsEmpWage{

			public static int WorkingHrs=0;
			public static int calculateEmpWage(String company, int Full_Time,
			 int Part_Time, int WagePerHr, int totalWorkingDays, int totalWorkingHrs)
			{
					int attend=(int)(Math.floor(Math.random()*10)%3);
					int WorkingDays=1;

					while((WorkingDays<=totalWorkingDays)&&(WorkingHrs<totalWorkingHrs))
					{

						WorkingDays++;
						int check=attend;

						switch(check)
						{
								case 0://fulltime
										WorkingHrs+=Full_Time;
										break;


								case 1://part time
										WorkingHrs+=Part_Time;
										break;

								case 2://for absent
										break;

								default:
										System.out.println("Invalid");
										break;
						}
					}

					int totalWage=WorkingHrs*WagePerHr;
					System.out.println("Total Wage of an Employee in company " +company+ "is "+totalWage );
					return totalWage;
				}
					public static void main(String args[])
					{
						calculateEmpWage("A-Company",10,8,12,20,80);
						calculateEmpWage("D-Company",8,4,8,30,90);
					}


}
