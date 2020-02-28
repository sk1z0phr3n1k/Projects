//Hourly Pay CPP Algorithm
//November 11, 2015
//Mark Griffiths
#pragma once
#include "HourlyPay.h"
#include<iostream>

//using namespace std;

//Setter Functions

void HourlyPay::SetHourlyRate()
{
	hourlyRate = EmployeePay::GetWeeklyPay() / 40;
}


bool HourlyPay::SetOverTimeRate()
{

	if (HourlyPay::GetHours() < 41)
	{
		return false;
	}
	else

		overtimeRate = HourlyPay::GetHourlyRate() * 1.5;
}

bool HourlyPay::SetHours(int weekHrs)
{
	if (weekHrs > 60 || weekHrs < 0)
	{
		cout << "Must have worked more than 0 and less than 60 hours.\n";
		return false;
	}
	else
		hours = weekHrs;
	return true;
}

//Getter Functions

double HourlyPay::GetHourlyRate()
{
	return hourlyRate;
}

double HourlyPay::GetOverTimeRate()
{
	return overtimeRate;
}

int HourlyPay::GetHours()
{
	return hours;
}
