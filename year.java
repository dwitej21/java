class Yearcon
{
	public static void main(String args[])
{
	int y1=1999;
	int y2=4;
	System.out.println((y1%4==0&&y1%100!=0)?"leap year":"not a leap year");
	System.out.println((y2==1||y2==3||y2==5||y2==7||y2==8||y2==10||y2==12)?"31 days":"no");
	System.out.println((y2==4||y2==6||y2==9||y2==11)?"30 days":"no");
	System.out.println((y1==2)?"28 days":"29 days");
}
}