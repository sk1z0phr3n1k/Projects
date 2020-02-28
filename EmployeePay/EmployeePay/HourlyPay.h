#pragma once
//Hourly Pay Header Algorithm
//November 11, 2015
//Mark Griffiths

#include "EmployeePay.h"
#include<iostream>

#ifndef HOURLYPAY_H
#define HOURLYPAY_H

using namespace std;

class HourlyPay : public EmployeePay
{

private:
	double hourlyRate, overtimeRate;
	int hours;

public:
	HourlyPay()
	{
		hourlyRate = 0.0;
		overtimeRate = 0.0;
		hours = 0;
	}

	HourlyPay(string na, string ssnum, string eNum, double yrlyPay, double wklyPay, double hrRate, double otRate, int hr) :EmployeePay(na, ssnum, eNum, yrlyPay, wklyPay)
	{
		hourlyRate = hrRate;
		overtimeRate = otRate;
		hours = hr;
	}

	//Setter Functions

	void SetHourlyRate();
	bool SetOverTimeRate();
	bool SetHours(int);

	//Getter Functions

	double GetHourlyRate();
	double GetOverTimeRate();
	int GetHours();
};
#endif
#pragma once
