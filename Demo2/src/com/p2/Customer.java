package com.p2;

public class Customer {
int cid;
public void setCid(int cid) {
	this.cid = cid;
}
public void setCname(String cname) {
	this.cname = cname;
}
public void setAdr(String adr) {
	this.adr = adr;
}
public void setCmp(String cmp) {
	this.cmp = cmp;
}
String cname,adr;


Customer()
{
	System.out.println("Customer init");
}
void show()
{
	System.out.println(cid);
	System.out.println(cname);
	System.out.println(adr);
}
String cmp;

void init()
{
	cmp="Eviden";
	System.out.println("init called");
}

void destroy()
{
	cmp=null;
	System.out.println("destroy called ");
}

}
