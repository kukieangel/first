
public class Employeehome {
	int empno;
	String name;
	String sex;
	int date;
	int phone;
	String addrs;
	Employeehome(){
		
	}
	Employeehome(int empno,String name,String sex,int date,int phone,String addrs){
		this.empno=empno;
		this.name=name;
		this.sex=sex;
		this.date=date;
		this.phone=phone;
		this.addrs=addrs;
	}
	void display() {
		System.out.println("Emp No ="+ empno);
		System.out.println("Name ="+ name);
		System.out.println("Emp No ="+ empno);
		System.out.println("Name ="+ name);
		System.out.println("Emp No ="+ empno);
		System.out.println("Name ="+ name);
	}

}
