//"Welcome to Eployee Wage Computation"
import java.util.*;

public class OopsEmpWage
{
		static int TotalWage=0;
		static int WagePerHr=20;
		static int Full_time=8;

			public static int attendance()
			{
				Random emp = new Random();
				int attend=(int)(Math.floor(Math.random()*10)%3);
				return attend;
			}


			public void EmpCheck()
			{
				int check=attendance();

				if(check==0)
				{
					System.out.println("Employee is Present");
					TotalWage+=Full_time*WagePerHr;
					System.out.println("Total Wage is "+TotalWage);

				}
				else
				{
					System.out.println("Employee is Absent");
				}
			}


			public static void main(String args[])
			{

				OopsEmpWage emp1=new OopsEmpWage();
				emp1.EmpCheck();

			}
}
