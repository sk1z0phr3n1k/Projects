//EmployePay.cpp file
//November 11, 2015
//Mark Griffiths
#pragma once
#include"EmployeePay.h"
#include<iostream>

using namespace std;


bool EmployeePay::SetAnnualPay(double anPay)
{
	if (anPay < 0)
	{
		cout << "Must be a positive number.\n";
		return false;
	}
	else
		annualPay = anPay;
	return true;
}

void EmployeePay::SetWeeklyPay(double anPay)
{
	weeklyPay = anPay / 52;
}


double EmployeePay::GetAnnualPay()
{
	return annualPay;
}

double EmployeePay::GetWeeklyPay()
{
	return weeklyPay;
}
