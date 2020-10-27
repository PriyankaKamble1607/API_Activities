package activities

class Activity7 
{
	static void main(args) 
	{
	File file = new File("C:/Users/PriyankaKamble/Desktop/test.txt")
	file.createNewFile();
	file.write("Priyanka\$")
	file.eachLine{line->println line }
	
	}
}
