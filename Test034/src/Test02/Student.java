package Test02;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		double avg;
		avg=(double)(korean+english+math+science)/4;
		return avg;
	}
	public String getResult() {
		double avg=getAvg();
		String result="S";
		if(avg>=90&&avg<=100) {
			result="A 학점";
		}else if(avg>=70&&avg<90) {
			result="B 학점";
		}else if(avg>=50&&avg<70) {
			result="C 학점";
		}else if(avg>=30&&avg<50) {
			result="D 학점";
		}else {result="F 학점";}
		return "이름: "+name+", 평균: "+avg+"점, 학점 :"+result;
	}
}
