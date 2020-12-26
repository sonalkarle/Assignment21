public class employeeWage
<<<<<<< HEAD
<<<<<<< HEAD
{
<<<<<<< HEAD
	public static void main(String[] args)
	{
		
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3_AddPartTime_UC3
                 int isfulltime=1;
                int isparttime=2;
                int empRatePerHr=20;
                int empHr=0;
                int salary=0;
                int res=(int)(Math.random()*10)%3;
<<<<<<< HEAD
      
public class employeewage
=======
>>>>>>> 5_WagesforMonth_UC5
{
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_RATE_PER_HR=20;
<<<<<<< HEAD
        public static final int NUM_OF_WORKINGDAYS=2;
        public static final int MAX_HRS_IN_MONTH=10;

        public static void main(String[] args)
        {
                int empHr=0;
                int totalEmpHr=0;
                int totalWorkingDays=0;
                while (totalEmpHr<=MAX_HRS_IN_MONTH && totalWorkingDays<=NUM_OF_WORKINGDAYS)
=======
                int isPresent=1;
                int empRatePerHr=20;
                int salary=0;
                int empHr=0;
                int res=(int)(Math.random()*10)%2;
                if(res==isPresent)
                {
                        System.out.println("Employee is present");
                        empHr=8;
                }
                else
>>>>>>> 2_DailyEmployewage_UC2
                {
                        totalWorkingDays++;
                        int empCheck=(int) Math.floor(Math.random()*10)%3;
                        switch (empCheck)
                        {
                        case FULL_TIME:
                        System.out.println("Employee is fulltime");
                        empHr=8;
                        break;
                        case PART_TIME:
                        System.out.println("Employee is parttime");
                        empHr=4;
                        break;
                        default:
                        System.out.println("Employee is absent");
                        empHr=0;
<<<<<<< HEAD
                        }
                totalEmpHr += empHr;

                }
                int totalsalary = totalEmpHr * EMP_RATE_PER_HR;
                System.out.println("Total salary: "+totalsalary);
=======
                }
                salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);		

>>>>>>> 2_DailyEmployewage_UC2
=======
                if(res==isfulltime)
                {
=======
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;
        public static final int EMP_RATE_PER_HR=20;

=======
	public static final int NO_OF_WORKINGDAYS=2;
>>>>>>> 5_WagesforMonth_UC5

        public static void main(String[] args)
        {
                //variable
                int empHr=0;
                int salary=0;
		int totalsalary=0;
                //Computation
                int empCheck=(int)Math.floor(Math.random()*10)%3;
		
		for(int day=0; day< NO_OF_WORKINGDAYS; day++)
                {

                switch (empCheck) {

                        case FULL_TIME:
>>>>>>> 4_usingSwitchCase_UC4
                        System.out.println("Employee is fulltime");
                        empHr=8;
                        break;
			 case PART_TIME:
                        System.out.println("Employee is parttime");
                        empHr=4;
<<<<<<< HEAD
                }
		
>>>>>>> 3_AddPartTime_UC3
=======
{
	//Calculating wages till condition of total working hours or days per month reached
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKINGDAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;

	public static void main(String[] args)
	{
		//variable
		int empHr=0;
		int totalEmpHr=0;
		int totalWorkingDays=0;
		//computaation
		while (totalEmpHr<=MAX_HRS_IN_MONTH && totalWorkingDays<=NUM_OF_WORKINGDAYS)
		{
			totalWorkingDays++;
			//computation
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch (empCheck)
			{
			case FULL_TIME:
			System.out.println("Employee is fulltime");
			empHr=8;
			break;
			case PART_TIME:
			System.out.println("Employee is parttime");
			empHr=4;
			break;
			default:
			System.out.println("Employee is absent");
			empHr=0;
			}
		totalEmpHr += empHr;
	
		}
		//computation
		int totalsalary = totalEmpHr * EMP_RATE_PER_HR;	
		System.out.println("Total salary: "+totalsalary);
>>>>>>> 6_tillreachedtohour

				
	}
}
<<<<<<< HEAD



=======
                        break;
                        default:
                        System.out.println("Employee is absent");
                        empHr=0;

                }
                salary=(empHr*EMP_RATE_PER_HR);
		totalsalary+=salary;


                System.out.println("Salary is "+salary);
}
		 System.out.println("Totalsalary is "+totalsalary);

        }
}

<<<<<<< HEAD
>>>>>>> 4_usingSwitchCase_UC4
=======

>>>>>>> 5_WagesforMonth_UC5
=======
>>>>>>> 6_tillreachedtohour
