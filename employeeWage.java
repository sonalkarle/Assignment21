class employeeWage
{
	public static void main(String[] args)
	{
		
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
                {
                        System.out.println("Employee is absent");
                        empHr=0;
                }
                salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);		


	}
}
