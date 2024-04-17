package com.p1;

public class Address {
String city,state,country;
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
}
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
public void setCountry(String country) {
	this.country = country;
}
Address()
{
	System.out.println("Address init");
}
void show()
{
	System.out.println(city);
	System.out.println(state);
	System.out.println(country);
}
}
