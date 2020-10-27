package activities



class Exercise4 
{
	public static void main(String[] args)
	{
	def c="This is a Groovy Language"
	def reverse=c.reverse()
	println reverse
	println c.substring(10,25)
	println c.split(" ")
	println c.minus("Groovy")
	println c.toLowerCase()
	println c.toUpperCase()
	def matchsuccess=c.matches("(.*)Groovy(.*)")
	if(matchsuccess)
		println "String matched"
		
	println (c.replaceAll(".*Groovy", "Python"))
	println(c.replace('G', '*'))
	println c
	
}
}