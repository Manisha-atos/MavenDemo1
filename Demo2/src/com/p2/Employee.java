package com.p2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
int eid;
String cmp;

public void setEid(int eid) {
	this.eid = eid;
	System.out.println("Setter "+eid);
}
public void setEname(String ename) {
	this.ename = ename;
	System.out.println("Setter "+ename);
}
public void setLoc(String loc) {
	this.loc = loc;
	System.out.println("Setter "+loc);
}
String ename,loc;
Employee()
{
	System.out.println("employee init...");
}

void show()
{
	System.out.println(cmp);
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(loc);
}
@Override
public void destroy() throws Exception {
	cmp=null;
	System.out.println("destroy called ");
	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("afterPropertiesSet called");
	cmp="Eviden";
}
}
