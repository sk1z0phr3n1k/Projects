#pragma once
//Person.h Base (Parent) class for the Person hierarchy
//Combined specification and implementation.
//June 25, 2015
#include<iostream>
#include<string>



#ifndef PERSON_H
#define PERSON_H
class Person
{
private:
	std::string name;
	int age;
	char gender;
	static int personCount;
	int personID;
public:
	//default constructor with default parameter values
	Person(std::string na = "John Doe", char g = 'M', int a = 20)
	{
		std::cout << "In the Person constructor...\n";

		SetName(na);
		SetGender(g);
		SetAge(a);
		personCount++;
		std::cout << "Now creating Person #" << personCount << std::endl;
		personID = personCount;
	}

	//setter functions
	void SetName(std::string);
	void SetGender(char);
	void SetAge(int);

	//getter functions
	std::string GetName();
	int GetAge();
	char GetGender();
	int GetID();

	//display function
	void Display();

	~Person();
};
//function definitions
void Person::SetName(std::string n)
{
	name = n;
}
void Person::SetGender(char gen)
{
	gender = gen;
}
void Person::SetAge(int ag)
{
	age = ag;
}

std::string Person::GetName()
{
	return name;
}
int Person::GetAge()
{
	return age;
}
char Person::GetGender()
{
	return gender;
}

void Person::Display()
{
	std::cout << "Name:\t" << name << std::endl;
	std::cout << "Gender:\t";
	if (gender == 'M')
		std::cout << "Male\n";
	else
		std::cout << "Female\n";
	std::cout << "Age:\t" << age << std::endl;
}

Person::~Person()
{
	std::cout << "In the Person destructor for ..." << personID << std::endl;
}

int Person::GetID()
{
	return personID;
}
int Person::personCount = 0;
#endif

