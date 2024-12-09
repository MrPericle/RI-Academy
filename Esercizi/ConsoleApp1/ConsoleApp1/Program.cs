// See https://aka.ms/new-console-template for more information
using System;
public class Program
{
    public static void Main(string[] args)
    {
        List<int> numList = new List<int>();
        Console.WriteLine("(Inserire numero > 0) >>");
        int value;
        string choice;
        do
        {
            Console.Write(">>");
            if (int.TryParse(Console.ReadLine(), out value))
            {
                if (value % 2 == 0)
                {
                    Console.WriteLine("Numero pari");
                }
                else Console.WriteLine("Numero dispari");

                numList.Add(value);
            }
        } while (value > 0);

        Console.WriteLine("Stampare i numeri pari? {y/n}");
        choice = Console.ReadLine();
        if (choice == "y")
        {
            numList.FindAll(
                delegate (int num)
                {
                    return num % 2 == 0;
                }
            ).ForEach(p => Console.WriteLine(p));
        }

        else if (choice == "n")
        {
            numList.FindAll(
                delegate (int num)
                {
                    return num % 2 == 1;
                }
            ).ForEach(p => Console.WriteLine(p));
        }
        else Console.WriteLine("invalid option");
    }
}
