using System;
namespace SPR_with_Intelligence
{
    class Program
    {
        //Convention--->0-Scissor, 1-->rock, 2-->Paper;
        private static int playerwins = 0;
        private static int computerwins = 0;
        private static int playerchoice;
        private static int computerchoice;
        private static int WinStatus;         //0-->Player Lost   1-->Draw    2-->Player Won
        private static int SetNumber = 1;
        private static int[] playerchoisedata = {0,0,0};
        static void Main(string[] args)
        {
            Console.Write("Welcome to the Game of Scissor,Paper,Rock.\n\n");
            Console.Write("Convention--->0--Scissor, 1-->rock, 2-->Paper;\n\n");
            while (playerwins < 5 && computerwins < 5)
            {
                Console.Write("Set " + SetNumber + " Started.\n");
                SetNumber++;
                PlayerChoice();
                if (playerchoice.ToString() != "0" || playerchoice.ToString() != "1" || playerchoice.ToString() != "2" )
                {
                    Console.Write("InValid Entry.\n\n");
                    continue;
                }
                Console.Write("You Chose ");
                ChoiseDecoded(playerchoice);
                ComputerChoice();
                Compare();
                ResultAndScoreUpdate();
            }
            PrintFinalResult();
            Console.Write("\n\nThanks for playing...Press Enter key to exit.");
            String exit = Console.ReadLine();
        }
        static void PlayerChoice()
        {
            Console.Write("Enter Your Choice:");
            String inptemp = Console.ReadLine();
            playerchoice = Int16.Parse(inptemp);
            CollectData();
        }
        static void ComputerChoice()
        {
            Random comp = new Random();
            int triggerdecider = comp.Next() % 2;
            if(triggerdecider == 0)
            {
                computerchoice = (comp.Next() % 3);
                Console.Write("\nComputer Chose ");
                ChoiseDecoded(computerchoice);
            }
            else
            {
                computerchoice = IntelligentChoice();
                Console.Write("\nComputer Chose ");
                ChoiseDecoded(computerchoice);
            }
        }
        static void Compare()
        {
            if (playerchoice == 0)
            {
                if (computerchoice == 0) { WinStatus = 1; }
                else if (computerchoice == 1) { WinStatus = 0; }
                else if (computerchoice == 2) { WinStatus = 2; }
            }
            if (playerchoice == 1)
            {
                if (computerchoice == 0) { WinStatus = 2; }
                else if (computerchoice == 1) { WinStatus = 1; }
                else if (computerchoice == 2) { WinStatus = 0; }
            }
            if (playerchoice == 2)
            {
                if (computerchoice == 0) { WinStatus = 0; }
                else if (computerchoice == 1) { WinStatus = 2; }
                else if (computerchoice == 2) { WinStatus = 1; }
            }
        }
        static void ResultAndScoreUpdate()
        {
            if (WinStatus == 0)
            {
                computerwins++;
                Console.Write("\nComputer Won This Set.\n\n");
            }
            if (WinStatus == 2)
            {
                playerwins++;
                Console.Write("\nYou Won This Set.\n\n");
            }
            if (WinStatus == 1)
            {
                Console.Write("\nDraw.\n\n");
            }
        }
        static void PrintFinalResult()
        {
            if (playerwins == 5) { Console.Write("You Won This Match " + playerwins + "-" + computerwins); }
            if (computerwins == 5) { Console.Write("Computer Won This Match " + computerwins + "-" + playerwins); }
        }
        static void ChoiseDecoded(int ChoiseNumber)
        {
            if (ChoiseNumber == 0) { Console.Write("Scissor"); }
            if (ChoiseNumber == 1) { Console.Write("Rock"); }
            if (ChoiseNumber == 2) { Console.Write("Paper"); }
        }
        static void CollectData()
        {
            playerchoisedata[playerchoice]++;
        }
        static int IntelligentChoice()
        {
            int MaxIndex;
            if (playerchoisedata[0] >= playerchoisedata[1])
            {
                MaxIndex = 0;
            }
            else
            {
                MaxIndex = 1;
            }
            if(playerchoisedata[MaxIndex] < playerchoisedata[2])
            {
                MaxIndex = 2;
            }
            return (MaxIndex + 1) % 3;
        }
    }
}

