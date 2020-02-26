#include "pch.h"
#include<iostream>
#include "ttt.h"
#pragma once

using namespace std;


void TTT::SetPlayerName(string temp1Name, string temp2Name, char temp1Char, char temp2Char)
{
	player1.name = temp1Name;
	player1.symbol = temp1Char;
	player2.name = temp2Name;
	player2.symbol = temp2Char;
}

int TTT::GetTieGames()
{
	return ties;
}

void TTT::SetWinner()
{
	currentWinner = CheckForWinner();
}

int TTT::GetWinner()
{
	return currentWinner;
}

int TTT::GetPlayer1Score()
{
	return player1.currentScore;
}

int TTT::GetPlayer2Score()
{
	return player2.currentScore;
}

void TTT::SetTurnNum(int turnNum)
{
	turnNumber = turnNum;
}

int TTT::GetTurnNum()
{
	return turnNumber;
}

char TTT::GetPlayer1Symbol()
{
	return player1.symbol;
}

char TTT::GetPlayer2Symbol()
{
	return player2.symbol;
}


string TTT::GetPlayer1Name()
{
	return player1.name;
}

string TTT::GetPlayer2Name()
{
	return player2.name;
}

void TTT::SetPWins()
{
	if (GetWinner() == 1)
	{
		player1.currentScore = GetPlayer1Score() + 1;
	}
	else if (GetWinner() == 2)
	{
		player2.currentScore = GetPlayer2Score() + 1;
	}
	else if (GetWinner() == 3)
	{
		ties = GetTieGames() + 1;
	}
}


void TTT::ResetMatch()
{
	player1.currentScore = 0;
	player2.currentScore = 0;
	ties = 0;
	turnNumber = 0;
	currentWinner = 0;
	board[0][0] = '1';
	board[0][1] = '2';
	board[0][2] = '3';
	board[1][0] = '4';
	board[1][1] = '5';
	board[1][2] = '6';
	board[2][0] = '7';
	board[2][1] = '8';
	board[2][2] = '9';
}

void TTT::ResetGame()
{
	turnNumber = 0;
	currentWinner = 0;
	board[0][0] = '1';
	board[0][1] = '2';
	board[0][2] = '3';
	board[1][0] = '4';
	board[1][1] = '5';
	board[1][2] = '6';
	board[2][0] = '7';
	board[2][1] = '8';
	board[2][2] = '9';
}
void TTT::DisplayBoard()
{
	cout << " " << board[0][0] << " " << "|" << " " << board[0][1] << " " << "|" << " " << board[0][2] << endl;
	cout << "----------\n";
	cout << " " << board[1][0] << " " << "|" << " " << board[1][1] << " " << "|" << " " << board[1][2] << endl;
	cout << "----------\n";
	cout << " " << board[2][0] << " " << "|" << " " << board[2][1] << " " << "|" << " " << board[2][2] << endl;

}

void TTT::ChoosePosition(char pChar)
{
	char tempMove;

	do
	{
		cout << "Choose a space to make a move: ";
		cin >> tempMove;

		if (tempMove == '1' && board[0][0] == 'X' || tempMove == '1' && board[0][0] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '2' && board[0][1] == 'X' || tempMove == '2' && board[0][1] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '3' && board[0][2] == 'X' || tempMove == '3' && board[0][2] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '4' && board[1][0] == 'X' || tempMove == '4' && board[1][0] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '5' && board[1][1] == 'X' || tempMove == '5' && board[1][1] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '6' && board[1][2] == 'X' || tempMove == '6' && board[1][2] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '7' && board[2][0] == 'X' || tempMove == '7' && board[2][0] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '8' && board[2][1] == 'X' || tempMove == '8' && board[2][1] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}
		else if (tempMove == '9' && board[2][2] == 'X' || tempMove == '9' && board[2][2] == 'O')
		{
			cout << "This space is already taken, please choose again.\n";
		}

	} while (tempMove == '1' && board[0][0] == 'X' || tempMove == '1' && board[0][0] == 'O' || tempMove == '2' && board[0][1] == 'X' || tempMove == '2' && board[0][1] == 'O' ||
		tempMove == '3' && board[0][2] == 'X' || tempMove == '3' && board[0][2] == 'O' || tempMove == '4' && board[1][0] == 'X' || tempMove == '4' && board[1][0] == 'O' ||
		tempMove == '5' && board[1][1] == 'X' || tempMove == '5' && board[1][1] == 'O' || tempMove == '6' && board[1][2] == 'X' || tempMove == '6' && board[1][2] == 'O' ||
		tempMove == '7' && board[2][0] == 'X' || tempMove == '7' && board[2][0] == 'O' || tempMove == '8' && board[2][1] == 'X' || tempMove == '8' && board[2][1] == 'O' ||
		tempMove == '9' && board[2][2] == 'X' || tempMove == '9' && board[2][2] == 'O');

	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)

		{

			if (tempMove == board[i][j])
			{
				board[i][j] = pChar;
			}
		}
	}



}


int TTT::CheckForWinner()
{
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
				board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
				board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
				board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
				board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
				board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' ||
				board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
				board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
			{
				return 1;
			}
			else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
				board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
				board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
				board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
				board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
				board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O' ||
				board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
				board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
			{
				return 2;
			}
			else if (GetTurnNum() >= 9)
			{
				return 3;
			}
			else
				return 0;

		}
	}
}


void TTT::DisplayWinner()
{
	if (GetWinner() == 1)
	{
		cout << GetPlayer1Name() << " wins! \n\n";
	}
	if (GetWinner() == 2)
	{
		cout << GetPlayer2Name() << " wins! \n\n";
	}
	if (GetWinner() == 3)
	{
		cout << "Its a tie!\n\n";
	}
}
void TTT::DisplayScore()
{
	cout << "\t*****CURRENT SCORE*****\n";
	cout << "\t-----------------------\n";
	cout << "\t\t" << player1.name << ": \t" << player1.currentScore << endl;
	cout << "\t\t" << player2.name << ": \t" << player2.currentScore << endl;
	cout << "\t\tTies: \t" << ties << endl << endl;
}

void TTT::PrintPlayer()
{
	cout << player1.name << " is " << player1.symbol << "!" << endl;
	cout << player2.name << " is " << player2.symbol << "!" << endl;
}
