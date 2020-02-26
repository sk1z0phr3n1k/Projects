#pragma once
#include<iostream>
#include<string>
using namespace std;
#ifndef TTT_H
#define TTT_H

struct Player
{
	string name;
	char symbol;
	int currentScore;

	Player()
	{
		name = "Default";
		symbol = 'Q';
		currentScore = 0;

	}

};



class TTT
{

private:
	Player player1;
	Player player2;
	int currentWinner, turnNumber, ties;
	char board[3][3];


public:
	TTT()
	{
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


	void SetPlayerName(string, string, char, char);
	void SetWinner();
	void SetTurnNum(int);
	void SetPWins();
	int GetTieGames();
	int GetTurnNum();
	char GetPlayer1Symbol();
	char GetPlayer2Symbol();
	int GetPlayer1Score();
	int GetPlayer2Score();
	int GetWinner();
	string GetPlayer1Name();
	string GetPlayer2Name();

	void ResetMatch();
	void ResetGame();
	void DisplayBoard();

	void PrintPlayer();
	void ChoosePosition(char);
	int CheckForWinner();
	void DisplayWinner();

	void DisplayScore();

};

#endif

