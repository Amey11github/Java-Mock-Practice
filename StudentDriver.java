import java.util.*;

class Student 
{
	String name;
	String edu;
	int stdId;
	double percentage;

	Student(String name,String edu,int stdId,double percentage)
	{
		this.name=name;
		this.stdId=stdId;
		this.edu=edu;
		this.percentage=percentage;
	}

	public String toString()
    {
        return name + " - " + edu + " - " + stdId + " - " + percentage;
    }

}

class StudentDriver
{
	public static void main(String[] args) {

		Student [] sArr=new Student[5];

		sArr[0]=new Student("amey","BE",121,90.67);
		sArr[1]=new Student("vishal","BE",121,90.67);
		sArr[2]=new Student("hemant","BE",121,90.67);
		sArr[3]=new Student("aayush","BE",121,90.67);
		sArr[4]=new Student("vivek","BE",121,90.67);

		Collections.sort(sArr,new Comparator<Student>() {
			public int compare(Student s1,Student s2)
			{
				return s2.name.compareTo(s1.name);
			}
		});

		
	}
}