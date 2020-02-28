# Author:  Mark Griffiths
# Course:  CSC 121
# Assignment:  Lab:  Lists (Part 2)
# Description:  mbox module

# The mbox format is a standards-based email file format 
# where many emails are put in a single file 

def get_mbox_username(line):
	""" 
	Get mbox email username

	Parse username from the start of an email 

	Parameters: 
	line (str): line starting a new email in mbox format

	Returns: (str) email username
	"""
	words=line.split()
	email=words[1]
	# use the double split strategy 
	pieces = email.split('@')
	return(pieces[0])

def get_mbox_domain(line):
	""" 
	Get mbox email domain

	Parse domain from a new email in mbox format

	Parameters: 
	line (str): line starting a new email in mbox format

	Returns: (str) email internet domain
	"""
	words=line.split()
	email=words[1]
	# double split strategy 
	pieces = email.split('@')
	return(pieces[1])

def get_mbox_day(line):
	""" 
	Get mbox email day of the week 

	Parse the day of the week an email was sent from the start of an email 

	Parameters: 
	line (str): line starting a new email in mbox format

	Returns: (str) day of the week abbreviation
	"""
	words=line.split()
	return(words[2])

def get_mbox_minute(line):
	""" 
	Get mbox email minute 

	Parse the minute an email was sent from the start of an email 

	Parameters: 
	line (str): line starting a new email in mbox format

	Returns: (str) minute 
	"""
	words=line.split()

	time=words[5]
	# double split strategy
	pieces = time.split(':')
	return(pieces[1])
