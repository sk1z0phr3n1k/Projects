
//EmployeePay Header File 
//November 11, 2015
//Mark Griffiths
#pragma once
#include<iostream>
#include "Employee.h"

using namespace std;

#ifndef EMPLOYEEPAY_H
#define EMPLOYEEPAY_H

class EmployeePay : public Employee
{

private:
	double annualPay, weeklyPay;

public:
	EmployeePay()
	{
		annualPay = 0.0;
		weeklyPay = 0.0;
	}

	EmployeePay(string na, string ssnum, string eNum, double yrlyPay, double wklyPay) :Employee(na, ssnum, eNum)
	{
		annualPay = yrlyPay;
		wklyPay = weeklyPay;
	}

	//Setter Functions
	bool SetAnnualPay(double);
	void SetWeeklyPay(double);

	//Getter Functions

	double GetAnnualPay();
	double GetWeeklyPay();
};
#endif
