using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GriffithsListsAndDictionaries
{
    class Program
    {
        static void Main(string[] args)
        {
            // Books
            Book book1 = new Book() { ISBN = "12345", author = "JRR Tolkien", title = "Fellowship of the Ring", publisher = "George Allen & Unwin", copyrightDate = "July 29, 1954" };
            Book book2 = new Book() { ISBN = "23456", author = "Douglas Adams", title = "The Hitchhiker's Guide to the Galaxy", publisher = "Pan Books", copyrightDate = "October 12, 1979" };
            Book book3 = new Book() { ISBN = "34567", author = "Robert A. Heinlein", title = "The Moon is a Harsh Mistress", publisher = "G.P. Putnam's Sons", copyrightDate = "June 2, 1966" };
            Book book4 = new Book() { ISBN = "45678", author = "Robert E. Howard", title = "Wolves Beyond the Border", publisher = "Lancer Books", copyrightDate = "1967" };
            Book book5 = new Book() { ISBN = "56789", author = "Bernard Cornwell", title = "The Last Kingdom", publisher = "Harper Collins", copyrightDate = "October 4, 2004" };


            // Book List
            List<Book> bookList = new List<Book>();
            bookList.Add(book1);
            bookList.Add(book2);
            bookList.Add(book3);
            bookList.Add(book4);
            bookList.Add(book5);

            Console.WriteLine("BOOK LIST\n=============================\n\n");
            foreach(Book novel in bookList)
            {
                Console.WriteLine("ISBN: {0} \nAuthor: {1} \nTitle: {2} \nPublisher: {3} \nCopyright Date: {4} \n", novel.ISBN, novel.author, novel.title, novel.publisher, novel.copyrightDate);
                Console.WriteLine("----------------------------\n");

            } // end display books

            Dictionary<string, Book> bookTionary = new Dictionary<string, Book>();

            bookTionary.Add(book1.ISBN, book1);
            bookTionary.Add(book2.ISBN, book2);
            bookTionary.Add(book3.ISBN, book3);
            bookTionary.Add(book4.ISBN, book4);
            bookTionary.Add(book5.ISBN, book5);

            Console.WriteLine("BOOK DICTIONARY\n===============================\n\n");
            foreach (Book things in bookTionary.Values)
            {
                Console.WriteLine("Author: {0} \nTitle: {1} \nPublisher {2} \nCopyright Date: {3}\n", things.author, things.title, things.publisher, things.copyrightDate);
                Console.WriteLine("----------------------------\n");
            }


            // Search by isbn

            int menuChoice = 0;
            do 
            {
                Console.WriteLine("Search for a book?");
                Console.WriteLine("[1] Yes \n[2] No");
                menuChoice = Convert.ToInt32(Console.ReadLine());

                if (menuChoice == 1) {
                    Console.WriteLine("Enter an ISBN to search: ");
                    string isbn = Console.ReadLine();

                    while (!bookTionary.ContainsKey(isbn))
                    {
                        Console.WriteLine("ISBN not found.\nEnter an ISBN to search: ");
                        isbn = Console.ReadLine();
                    }

                    Console.WriteLine("Author: {0} \nTitle: {1} \nPublisher {2} \nCopyright Date: {3}\n", bookTionary[isbn].author, bookTionary[isbn].title, bookTionary[isbn].publisher, bookTionary[isbn].copyrightDate);
                       
                    
                }

                else
                {
                    Console.WriteLine("Thank you for using the search feature!");
                }
                
            }while (menuChoice == 1); // end search by isbn


            //  remove book from dictionary

            do
            {
                Console.WriteLine("Remove a book from the dictionary?");
                Console.WriteLine("[1] Yes \n[2] No");
                menuChoice = Convert.ToInt32(Console.ReadLine());

                if (menuChoice == 1)
                {
                    foreach (Book things in bookTionary.Values)
                    {
                        Console.WriteLine("Author: {0} \nTitle: {1} \nPublisher {2} \nCopyright Date: {3}\n", things.author, things.title, things.publisher, things.copyrightDate);
                    }

                    Console.WriteLine("Enter an ISBN of the book to remove: ");
                    string isbn = Console.ReadLine();
                    Console.WriteLine("------------------------------------");

                    while (!bookTionary.ContainsKey(isbn))
                    {
                        Console.WriteLine("ISBN not found.\nEnter an ISBN of the book to remove: ");
                        isbn = Console.ReadLine();
                        Console.WriteLine("-------------------------------------");
                    }

                    
                    bookTionary.Remove(isbn);

                    Console.WriteLine("Book removed!");
                    Console.WriteLine("------------------------------------\n");
                    foreach (Book things in bookTionary.Values)
                    {
                        Console.WriteLine("Author: {0} \nTitle: {1} \nPublisher {2} \nCopyright Date: {3}\n", things.author, things.title, things.publisher, things.copyrightDate);
                    }



                }

                else
                {
                    Console.WriteLine("Thank you for using this program!");
                }

            } while (menuChoice == 1); // end remove book from dictionary

            Console.ReadLine();
        } // end main
    } // class

    class Book
    {
        public string ISBN { get; set; }
        public string author { get; set; }
        public string title { get; set; }
        public string publisher { get; set; }
        public string copyrightDate { get; set; }
    } // end class

    
}

