package PractiseCode;
class Student{
	String sid;
	String sname;

	public Student(String sid,String sname) {
		this.sid=sid;
		this.sname=sname;
System.out.println("linarju mangaraju");
	}

	
}
class Course {
	String cid;
    String cname;
    Student [] st;
   public Course(String cid,String cname,Student[] st) {
	   this.cid=cid;
	   this.cname=cname;
	   this.st=st;
   }
   public void dis() {
	   System.out.println("Course details");
	   System.out.println("Course id:"+cid);
	   System.out.println("Course name:"+cname);
	   System.out.println("Student details");
	   for(Student s:st)
	   {
	   System.out.println("Student id:"+s.sid);
	   System.out.println("Student name:"+s.sname);
	   }

}
	

}

public class PractiseCode{
	public static void main(String[] args) {
      Student sd1=new Student("s101","Gadilinga");
      Student sd2=new Student("s102","Manju");
      Student sd3=new Student("s103","Tamma");
      Student[] stds= {sd1,sd2,sd3};
      Course cs=new Course("c101","java",stds);
      Course cs1=new Course("c102","sql",stds);
      Course cs2=new Course("c103","ReactJs",stds);
      cs.dis();
      cs1.dis();
      cs2.dis();
    		  }
}
