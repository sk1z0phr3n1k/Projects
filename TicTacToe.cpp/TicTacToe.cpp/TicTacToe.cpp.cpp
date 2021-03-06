// TicTacToe.cpp.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#pragma once
#include "pch.h"
#include<iostream>
#include "ttt.h"



void DisplayMenu(int&);

using namespace std;

int main()
{
	int menuChoice = 0;
	char pMove;
	string firstP, secondP;
	TTT game1;

	cout << "Welcome to the Tic Tac Toe program!\n\n";

	do
	{
		DisplayMenu(menuChoice);
		game1.ResetGame();



		if (menuChoice == 1)

		{
			game1.ResetMatch();
			int turn = 0;
			cout << "Please enter player 1's name: ";
			cin >> firstP;
			cout << "Please enter player 2's name: ";
			cin >> secondP;
			game1.SetPlayerName(firstP, secondP, 'X', 'O');
			game1.PrintPlayer();
			game1.DisplayBoard();


			if (game1.GetWinner() == 0 && game1.GetPlayer1Symbol() == 'X')
				while (game1.GetWinner() == 0)
				{

					{
						do
						{
							cout << game1.GetPlayer1Name() << "'s turn!\n";
							pMove = game1.GetPlayer1Symbol();
							game1.ChoosePosition(pMove);
							game1.DisplayBoard();

						} while (game1.GetPlayer1Symbol() == 'O');
						turn++;
						game1.SetTurnNum(turn);
						game1.CheckForWinner();
						game1.SetWinner();
						game1.SetPWins();
					}

					if (game1.GetWinner() == 0 && game1.GetPlayer2Symbol() == 'O')
					{
						do
						{
							cout << game1.GetPlayer2Name() << "'s turn!\n";
							pMove = game1.GetPlayer2Symbol();
							game1.ChoosePosition(pMove);
							game1.DisplayBoard();

						} while (game1.GetPlayer2Symbol() == 'X');
						turn++;
						game1.SetTurnNum(turn);
						game1.CheckForWinner();
						game1.SetWinner();
						game1.SetPWins();
					}

				}
			game1.DisplayWinner();
			game1.DisplayScore();
		}

		else if (menuChoice == 2)
		{

			int turn = 0;
			game1.PrintPlayer();
			game1.DisplayBoard();

			if (game1.GetWinner() == 0 && game1.GetPlayer1Symbol() == 'X')
				while (game1.GetWinner() == 0)
				{

					{
						do
						{
							cout << game1.GetPlayer1Name() << "'s turn!\n";
							pMove = game1.GetPlayer1Symbol();
							game1.ChoosePosition(pMove);
							game1.DisplayBoard();

						} while (game1.GetPlayer1Symbol() == 'O');
						turn++;
						game1.SetTurnNum(turn);
						game1.CheckForWinner();
						game1.SetWinner();
						game1.SetPWins();
					}

					if (game1.GetWinner() == 0 && game1.GetPlayer2Symbol() == 'O')
					{
						do
						{
							cout << game1.GetPlayer2Name() << "'s turn!\n";
							pMove = game1.GetPlayer2Symbol();
							game1.ChoosePosition(pMove);
							game1.DisplayBoard();

						} while (game1.GetPlayer2Symbol() == 'X');
						turn++;
						game1.SetTurnNum(turn);
						game1.CheckForWinner();
						game1.SetWinner();
						game1.SetPWins();
					}

				}
			game1.DisplayWinner();
			game1.DisplayScore();
		}

		else if (menuChoice == 3)
		{
			cout << "Thanks for playing!!\n\n";
		}
		else if (menuChoice < 3 || menuChoice > 3)
		{
			cout << "Invalid selection, please choose 1-3 on the menu.\n\n";
		}
	} while (menuChoice != 3);

	return 0;
}


void DisplayMenu(int &menuChoice)
{
	cout << "1) Start a New match\n2) Continue the Current Match\n3) Exit\n\n";

	cin >> menuChoice;
	cout << "*****************************************************************************\n";
	cout << endl;
}

