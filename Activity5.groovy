package activities

class Activity5 
{
	public static void main(String[] args)
	{
		def values=[11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		def intlist=values.subList(0, 4)
		def strlist=values.subList(4, 7)
		println "List of numbers:$intlist.sort()"
		println "String list:$strlist.sort()"
		
	}
}
