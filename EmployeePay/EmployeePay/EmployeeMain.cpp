//EmployeeMain.cpp Project 3
//November 12, 2015
//Mark Griffiths
#pragma once
//#include "Employee.h"
#include"HourlyPay.h"
#include<iostream>
#include<string>
#include<iomanip>

void PrintCheck(HourlyPay&);
void GetEmployee(HourlyPay&);

using namespace std;

int main()
{
	HourlyPay hourPay1;

	GetEmployee(hourPay1);

	PrintCheck(hourPay1);
	return 0;
}

void PrintCheck(HourlyPay& tempEmp)
{

	double weekPay;
	int overtimeHours = tempEmp.GetHours() - 40;

	if (tempEmp.GetHours() <= 40)
	{
		weekPay = tempEmp.GetHours() * tempEmp.GetHourlyRate();
	}
	else if (tempEmp.GetHours() > 40)
	{
		weekPay = (40 * tempEmp.GetHourlyRate()) + (overtimeHours * tempEmp.GetOverTimeRate());
	}
	cout << fixed << showpoint << setprecision(2);
	cout << endl;
	cout << "|------------------------------------------------------------|" << endl;
	cout << "|----------------------Pay Check-----------------------------|" << endl;
	cout << "|" << tempEmp.GetName() << "\t\t\t" << endl << "|" << "SS# " << tempEmp.GetSSNum() << "\t\t\t" << "Employee Number:" << tempEmp.GetEmpNum() << endl << "|" << "Hourly Rate: $" << tempEmp.GetHourlyRate() << "\t\t\t" << "      OT Rate: $" << tempEmp.GetOverTimeRate() << endl << "|" << endl << "|";
	cout << "\t   $" << weekPay << "\t\tU.S. Dollars" << endl << "|";
	cout << "------------------------------------------------------------|" << endl << "|" << endl << "|";

	cout << "Hours This Pay Period: " << tempEmp.GetHours() << endl << "|";
	cout << "Overtime Hours This Pay Period: " << overtimeHours << endl << "|";
	cout << "------------------------------------------------------------|" << endl;
	cout << "|------------------------------------------------------------|" << endl;
}

void GetEmployee(HourlyPay& tempEmployee)
{
	string empName, socialN, emNumber;
	double anPay;
	int workHours;

	cout << "Please enter the employee's name: ";
	getline(cin, empName);
	tempEmployee.SetName(empName);

	do
	{
		cout << "Enter the employees Social Security Number: ";
		cin >> socialN;
	} while (!tempEmployee.SetSSNum(socialN));

	do
	{
		cout << "Enter the Employee Number: ";
		cin >> emNumber;
	} while (!tempEmployee.SetEmpNum(emNumber));

	do
	{
		cout << "Please enter the employee's annual salary: ";
		cin >> anPay;
	} while (!tempEmployee.SetAnnualPay(anPay));

	do
	{
		cout << "Please enter the amount of hours the employee worked: ";
		cin >> workHours;
	} while (!tempEmployee.SetHours(workHours));

	tempEmployee.SetWeeklyPay(anPay);
	tempEmployee.SetHourlyRate();
	tempEmployee.SetOverTimeRate();
}
