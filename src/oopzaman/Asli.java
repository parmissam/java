package oopzaman;

public class Asli {

	public static void main(String[] args) {
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
		t1.readAll();
		t2.readAll();
		if ((t1.getHour()*3600)+t1.getMinute()*60+t1.getSecond()<=t2.getHour()*3600+t2.getMinute()*60+t2.getSecond())
			{t3=t1;
			t1=t2;
			t2=t3;}
		if(t1.getSecond()<t2.getSecond())
			{t3.setSecond(t1.getSecond()+60-t2.getSecond());
			t1.setMinute(t1.getMinute()-1);}
		else
			t3.setSecond(t1.getSecond()+-t2.getSecond());
		if(t1.getMinute()<t2.getMinute()) {
			t3.setMinute(t1.getMinute()+60-t2.getMinute());
			t1.setHour(t1.getHour()-1);
		}
		else
			t3.setMinute(t1.getMinute()-t2.getMinute());
		t3.setHour(t1.getHour()-t2.getHour());
		t3.printAll();
	}

}
