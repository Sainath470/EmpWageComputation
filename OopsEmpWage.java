///"Welcome to Eployee Wage Computation"
import java.util.*;

public class OopsEmpWage
{
		static int WorkingHrs=0;
		static int WagePerHr=20;
		static int Full_Time=8;
		static int Part_Time=4;
		static int TotalWorkingDays=20;

			public static int attendance()
			{
				Random emp = new Random();
				int attend=(int)(Math.floor(Math.random()*10)%3);
				return attend;
			}


			public void EmpCheck()
			{
				int WorkingDays=0;
				while(WorkingDays<=TotalWorkingDays)
				{
					WorkingDays++;
					int check=attendance();

					switch(check)
					{
							case 0:
									System.out.println("Employee is Present on "+WorkingDays+" Day");
									WorkingHrs+=Full_Time;
									break;


							case 1:
									System.out.println("Employee is present and done part time work on "+WorkingDays+" Day");
									WorkingHrs+=Full_Time;
									break;

							case 2:
									System.out.println("Employee is Absent on "+WorkingDays+" Day");
									break;

							default:
									System.out.println("Invalid");
									break;
					}
				}
				System.out.println("Total Wage is "+WorkingHrs*WagePerHr);

			}


			public static void main(String args[])
			{

				OopsEmpWage emp1=new OopsEmpWage();
				emp1.EmpCheck();

			}
}
