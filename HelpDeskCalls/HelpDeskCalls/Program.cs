using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelpDeskCalls
{
    class Program
    {
        static void Main(string[] args)
        {
            List<HelpDeskCall> calls = new List<HelpDeskCall>()
            {

                new HelpDeskCall { Description = "PEBKAC", Date = "2/12/2020", Status = Status.InProg, Priority = Priority.Low, Person = "Bob Johnson", Notes = "" },
                new HelpDeskCall { Description = "Low on HDD fluid", Date = "1/15/19", Status = Status.Completed, Priority = Priority.Medium, Person = "Smitty Smithson", Notes = "" },
                new HelpDeskCall { Description = "BSOD", Date = "5/23/17", Status = Status.Unresolved, Priority = Priority.High, Person = "Bill Gates", Notes = "" },
                new HelpDeskCall { Description = "Computer trying to kill us", Date = "7/19/18", Status = Status.NotStarted, Priority = Priority.High, Person = "David Bowman", Notes = "" },
                new HelpDeskCall { Description = "No Internet", Date = "3/17/2020", Status = Status.Completed, Priority = Priority.Low, Person = "David Tennant", Notes = "" }
            }; //  end list



            foreach(var call in calls)
            {
                switch (call.Status)
                {
                    case Status.NotStarted:
                        call.Notes = "Just reported";
                        break;

                    case Status.InProg:
                        call.Notes = "Help Desk personnel on scene";
                        break;

                    case Status.Completed:
                        call.Notes = "Ticket is complete";
                        break;

                    case Status.Unresolved:
                        call.Notes = "Ongoing investigation";
                        break;
                }
            } // end foreach

           

            foreach(var call in calls)
            {
                Console.WriteLine("Description: {0}\nDate: {1}\nStatus: {2}\nPriority: {3}\nPerson Reporting Issue: {4}\nNotes: {5}\n", call.Description, call.Date, call.Status, call.Priority, call.Person, call.Notes);

            } // end foreach

            foreach (var call in calls)
            {
                switch (call.Priority)
                {

                    case Priority.Low:
                        Console.WriteLine("Call: {0}\nPriority: {1}\nThe problem is on the back burner\n", call.Description, call.Priority);
                        break;

                    case Priority.Medium:
                        Console.WriteLine("Call: {0}\nPriority: {1}\nThe problem is important\n", call.Description, call.Priority);
                        break;

                    case Priority.High:
                        Console.WriteLine("Call: {0}\nPriority: {1}\nThe problem is critical\n", call.Description, call.Priority);
                        break;

                }
            } // end foreach

            Console.ReadLine();

        } //  end main
    } // end class



    class HelpDeskCall
    {
        public string Description { get; set; }
        public string Date { get; set; }
        public Status Status { get; set; }
        public Priority Priority { get; set; }
        public string Person { get; set; }
        public string Notes { get; set; }

    } // end HelpDeskCall class

    enum Status
    {
        NotStarted,
        InProg,
        Completed,
        Unresolved
    } // end Status enum

    enum Priority
    {
        Low,
        Medium,
        High
    } // end Priority enum

} // end namespace
