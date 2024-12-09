public class Program
{
    public static void Main(string[] args)
    {
        Dictionary<string, int> wordCounter = new Dictionary<string, int>();
        Console.WriteLine("Inserire una frase");
        Console.Write(">>");
        string input = Console.ReadLine();
        string[] tokens = input.Split(" ");
        foreach (string token in tokens)
        {
            if (!wordCounter.ContainsKey(token))
            {
                wordCounter[token] = 1;
            }
            else wordCounter[token]++;
        }
        foreach (KeyValuePair<string, int> kvp in wordCounter)
        {
            Console.WriteLine("Token = {0}, Occorrenze = {1}",
                kvp.Key, kvp.Value);
        }
    }

}