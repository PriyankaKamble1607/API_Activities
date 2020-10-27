package activities

class exercise3
{
	public static void main(String[] args)
	{
		def a=0
		def b=1
		def c=a+b
		print "$a,$b"
		for (def i=2;i<10;i++)
		 {
		 c+=b 
		print ","+ c
		(b,c)=[c,b]
		 } 
	}
}
