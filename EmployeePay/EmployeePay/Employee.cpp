//EmployeeCPP Algorithm
//Nov 1, 2015
//Mark Griffiths
#include"Employee.h"
#include<iostream>
#include<string>
#include<cstring>
#pragma once
using namespace std;

//Setter Functions

void Employee::SetName(string na)
{
	name = na;
}

bool Employee::SetSSNum(string socialN)
{
	int len = socialN.length();

	if (len != 11)
	{
		cout << "Must be 11 characters.\n";
		return false;
	}

	for (int i = 0; i < 3; i++)
		if (!isdigit(socialN[i]))
		{
			cout << "Must be digits only. \n";
			return false;
		}
	for (int i = 4; i < 6; i++)
		if (!isdigit(socialN[i]))
		{
			cout << "Must be digits only.\n";
			return false;
		}
	for (int i = 7; i < 11; i++)
		if (!isdigit(socialN[i]))
		{
			cout << "Must be digits only.\n";
			return false;
		}
	for (int i = 0; i < 11; i++)
		if (socialN[3] && socialN[6] != '-')
		{
			cout << "Must contain hyphens.\n";
			return false;
		}

		else
			ssn = socialN;
	return true;
}

bool Employee::SetEmpNum(string emNumber)
{
	int len = emNumber.length();

	if (len != 5)
	{
		cout << "Must be 5 characters long.\n";
		return false;
	}

	for (int i = 0; i < 3; i++)

		if (!isdigit(emNumber[i]))
		{
			cout << "The first three characters must be digits.\n";
			return false;
		}

	if (emNumber[3] != '-' || !isalpha(emNumber[4]))
	{
		cout << "Must contain a hypen then a letter.\n";
		return false;
	}
	if (emNumber[4] < 'A' or emNumber[4] > 'M')
	{
		cout << "Must choose a letter A-M and be capitalized.\n";
		return false;
	}

	else
		employeeNum = emNumber;
	return true;
}


//Getter Functions

string Employee::GetName()
{
	return name;
}

string Employee::GetSSNum()
{
	return ssn;
}

string Employee::GetEmpNum()
{
	return employeeNum;
}


