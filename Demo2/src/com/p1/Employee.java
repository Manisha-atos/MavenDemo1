package com.p1;

public class Employee {
int eid;
public void setEid(int eid) {
	this.eid = eid;
}
public void setEname(String ename) {
	this.ename = ename;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
String ename;
Address adr;
Employee()
{
	System.out.println("Employee init");
}
void show()
{
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(adr);
}
}
