//Employee.h Header file Algorithm
//Nov 1, 2015
//Mark Griffiths
#pragma once
#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include<iostream>
#include<string>

using namespace std;

class Employee
{

private:
	string name, ssn, employeeNum;

public:
	Employee()
	{
		name = "Bob Johnson";
		ssn = "123-45-6789";
		employeeNum = "123-A";
	}

	Employee(string na, string ssnum, string eNum)
	{
		name = na;
		ssn = ssnum;
		employeeNum = eNum;
	}

	//Setter Functions

	void SetName(string);
	bool SetSSNum(string);
	bool SetEmpNum(string);

	//Getter Functions

	string GetName();
	string GetSSNum();
	string GetEmpNum();


};
#endif
#pragma once
