package activities

class exercise1 
{
	static void main(args) {
	def x
	int y
	def arr=[4,5.0,"priya",true,x,y]
    arr.each { println "Value is: " + it +". Data type is: " + it.getClass() }
	}
}
