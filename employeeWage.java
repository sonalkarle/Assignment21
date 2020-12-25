class employeeWage
{
	public static void main(String[] args)
	{
		
                 int isfulltime=1;
                int isparttime=2;
                int empRatePerHr=20;
                int empHr=0;
                int salary=0;
                int res=(int)(Math.random()*10)%3;
                if(res==isfulltime)
                {
                        System.out.println("Employee is fulltime");
                        empHr=8;
                }
                else if(res==isparttime)
                {
                        System.out.println("Employee is Parttime");
                        empHr=4;
		 }
                else
                {
                        System.out.println("Employee is absent");
                        empHr=0;
                }
                salary=(empHr*empRatePerHr);
                System.out.println("Salary is "+salary);


	}
}
