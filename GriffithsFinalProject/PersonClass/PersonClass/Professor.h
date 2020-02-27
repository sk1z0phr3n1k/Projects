#pragma once
//Professor.h Derived (Child) class; derived from Person.

#include "Person.h"
#include<iostream>
#include<string>


#ifndef PROFESSOR_H
#define PROFESSOR_H

//define the Professor class
class Professor : public Person
{
private:
	std::string dept;
	int bldg, roomNum, numYears;
	bool isTenured;

public:
	//constructor - parameter constructor with default values
	//name, gender, age, dept, bldg, roomNum, numYears
	Professor(std::string na = "Jane Doe", char gen = 'F', int a = 25, std::string dep = "CS", int bd = 13, int room = 144, int yrs = 12) : Person(na, gen, a) //explicit call to the constructor
	{
		std::cout << "In the Professor constructor...\n";
		dept = dep;
		bldg = bd;
		roomNum = room;
		numYears = yrs;

		if (numYears >= 10)
			isTenured = true;
		else
			isTenured = false;
	}

	void SetDepartment(std::string de)
	{
		dept = de;
	}
	void SetBuilding(int bd)
	{
		bldg = bd;
	}
	void SetRoomNum(int rm)
	{
		roomNum = rm;
	}
	void SetNumYears(int yr)
	{
		numYears = yr;
	}

	//getter functions
	std::string GetDepartment()
	{
		return dept;
	}
	int GetBuilding()
	{
		return bldg;
	}
	int GetRoomNum()
	{
		return roomNum;
	}
	int GetNumYears()
	{
		return numYears;
	}
	bool IsTenured()
	{
		return isTenured;
	}

	//additional function
	//redefine the Display function
	//same prototype as the Base class
	void Display()
	{	//explicit call to the Display function from the base class
		Person::Display();
		std::cout << "Department: " << dept << std::endl;
		std::cout << "Building: " << bldg << std::endl;
		std::cout << "Room Number: " << roomNum << std::endl;
	}



	~Professor()
	{
		std::cout << "Now destructing Professor #" << GetID() << std::endl;
	}



};

#endif
