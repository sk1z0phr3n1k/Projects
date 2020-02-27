// Mark Griffiths
// 2.18.2020
// CSC253
// LINQ Assignment



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GriffithsLinq
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Book> bookList = new List<Book>()
            { new Book(){ISBN = "1234-45-34-3939", title = "The Long Road", publisher = "New York", price = 25.00, copyright = 2016},
              new Book(){ISBN = "988-65-34-9012", title = "The Warrior", publisher = "McGraw", price = 55.00, copyright = 2013},
              new Book(){ISBN = "8712-45-84-2539", title = "Yesterday", publisher = "New York", price = 67.00, copyright = 2016},
              new Book(){ISBN = "1234-78-99-3478", title = "Programming Essentials", publisher = "Dalton", price = 35.00, copyright = 2015},
              new Book(){ISBN = "8356-89-33-3251", title = "Hello  World", publisher = "Chicago Press", price = 115.00, copyright = 2016}
            }; // end list


            // ISBN, Title, Publisher, sorted by New York publisher
            var bookInfo = bookList.Where(p => p.publisher == "New York");
            Console.WriteLine("New York Published Books");
            Console.WriteLine("========================\n");
            foreach (var book in bookInfo)
            {  
                Console.WriteLine("ISBN: {0}\nTitle: {1}\nPublisher: {2}\n", book.ISBN, book.title, book.publisher);
            }
            Console.WriteLine("========================\n");

            // in descending order by copyright date, all fields
            Console.WriteLine("Descending by Copyright Date");
            Console.WriteLine("========================\n");
            var bookInfo2 = bookList.OrderByDescending(p => p.copyright);
            foreach(var book in bookInfo2)
            {
                Console.WriteLine("ISBN: {0} \nTitle: {1}\nPublisher: {2}\nPrice: {3}\nCopyright: {4}\n", book.ISBN, book.title, book.publisher, book.price, book.copyright);
            }
            Console.WriteLine("========================\n");

            // descending order by copyright date AND published in New York, all fields
            Console.WriteLine("Descending by Copyright Date and Published in New York");
            Console.WriteLine("========================\n");
            var bookInfo3 = bookList.OrderByDescending(p => p.copyright).Where(p => p.publisher == "New York");
            foreach (var book in bookInfo3)
            {
                Console.WriteLine("ISBN: {0} \nTitle: {1}\nPublisher: {2}\nPrice: {3}\nCopyright: {4}\n", book.ISBN, book.title, book.publisher, book.price, book.copyright);
            }
            Console.WriteLine("========================\n");

            // ISBN and Title for all books with copyright after 2015
            Console.WriteLine("Books Published after 2015");
            Console.WriteLine("========================\n");
            var bookInfo4 = bookList.Where(p => p.copyright > 2015);
            foreach (var book in bookInfo4)
            {
                Console.WriteLine("ISBN: {0} \nTitle: {1}\n", book.ISBN, book.title);
            }
            Console.WriteLine("========================\n");

            // order list in descending order by Title, display ISBN, Title of first book in list
            Console.WriteLine("Descending by Title, first book is: ");
            Console.WriteLine("========================\n");
            var bookInfo5 = bookList.OrderByDescending(p => p.title).First();

            Console.WriteLine("ISBN: {0} \nTitle: {1}\n", bookInfo5.ISBN, bookInfo5.title);
            Console.WriteLine("========================\n");

            // Calculate sum of price of all books and display average
            double averagePrice = bookList.Average(p => p.price);
            Console.WriteLine("Average Price of all Books");
            Console.WriteLine("==========================");
            Console.WriteLine("Average Price: {0:C}\n", averagePrice);

            // Calculate 3% markup for each book, display title and price
            var bookInfo6 = bookList.Where(p => p.price > 0);
            Console.WriteLine("Calculating Prices with 3% MarkUp ");
            Console.WriteLine("========================\n");
            foreach (var book in bookInfo6)
            {
                Console.WriteLine("Title: {0}\nPrice: {1}", book.title, (book.price += book.price * .03));
            }
            Console.WriteLine("========================\n");


            Console.ReadLine();


        } // end main
    } // end class



    class Book
    {
        public string ISBN { get; set; }
        public string title { get; set; }
        public string publisher { get; set; }
        public double price { get; set; }
        public int copyright { get; set; }

    }
}


