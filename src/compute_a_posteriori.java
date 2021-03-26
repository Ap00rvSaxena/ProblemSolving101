import java.io.*;

public class compute_a_posteriori
{

public static void main(String[] args) throws IOException {
        
		hypo hyp1=new hypo(0.10000,1.00000,0.00000);
        hypo hyp2=new hypo(0.20000,0.75000,0.25000);
        hypo hyp3=new hypo(0.40000,0.50000,0.50000);
        hypo hyp4=new hypo(0.20000,0.25000,0.75000);
        hypo hyp5=new hypo(0.10000,0.00000,1.00000);

		String Observation_string=args[0];
		String[] inputArray=Observation_string.split("");
		File file=new File("Result.txt");
		BufferedWriter output=new BufferedWriter(new FileWriter(file));
		
        output.write("Observation Sequence :");
        output.write(Observation_string);
        output.newLine();
		output.write("P(hyp1 | Q) =\t");
        output.write(String.valueOf(hyp1.hypoPrior));
        output.newLine();
        output.write("P(hyp2 | Q) =\t");
        output.write(String.valueOf(hyp2.hypoPrior));
        output.newLine();
        output.write("P(hyp3 | Q) =\t");
        output.write(String.valueOf(hyp3.hypoPrior));
        output.newLine();
        output.write("P(hyp4 | Q) =\t");
        output.write(String.valueOf(hyp4.hypoPrior));
        output.newLine();
        output.write("P(hyp5 | Q) =\t");
        output.write(String.valueOf(hyp5.hypoPrior));
        output.newLine();
        output.write("Probability that the next candy will be Cherry, given Q: 0.5\n");
        output.write("Probability that the next candy will be Lime, given Q: 0.5\n");

        double C0,L0=0.0;
        double newPrior=0.0;
        int cherryCount=0;
        int limeCount=0;

   for(int i=1;i<inputArray.length;i++)
	{
		C0=((hyp1.hypoPrior*hyp1.hypoCherry) + (hyp2.hypoPrior*hyp2.hypoCherry) + (hyp3.hypoPrior*hyp3.hypoCherry) + (hyp4.hypoPrior*hyp4.hypoCherry) + (hyp5.hypoPrior*hyp5.hypoCherry));
		
		L0 = (hyp1.hypoPrior*hyp1.hypoLime) + (hyp2.hypoPrior*hyp2.hypoLime) + (hyp3.hypoPrior*hyp3.hypoLime) + (hyp4.hypoPrior*hyp4.hypoLime) + (hyp5.hypoPrior*hyp5.hypoLime);

try {
	if(inputArray[i].charAt(0)=='C'|| inputArray[i].charAt(0)=='c' )
	{
		newPrior=((hyp1.hypoCherry*hyp1.hypoPrior)/C0);
		hyp1.hypoPrior=newPrior;
		newPrior=((hyp2.hypoCherry*hyp2.hypoPrior)/C0);
		hyp2.hypoPrior=newPrior;
		newPrior=((hyp3.hypoCherry*hyp3.hypoPrior)/C0);
		hyp3.hypoPrior=newPrior;
		newPrior=((hyp4.hypoCherry*hyp4.hypoPrior)/C0);
		hyp4.hypoPrior=newPrior;
		newPrior=((hyp5.hypoCherry*hyp5.hypoPrior)/C0);
		hyp5.hypoPrior=newPrior;
		cherryCount=cherryCount+1;
}

if(inputArray[i].charAt(0)=='L' || inputArray[i].charAt(0) =='l' )
		{
		newPrior=((hyp1.hypoLime*hyp1.hypoPrior)/L0);
		hyp1.hypoPrior=newPrior;
		newPrior=((hyp2.hypoLime*hyp2.hypoPrior)/L0);
		hyp2.hypoPrior=newPrior;
		newPrior=((hyp3.hypoLime*hyp3.hypoPrior)/L0);
		hyp3.hypoPrior=newPrior;
		newPrior=((hyp4.hypoLime*hyp4.hypoPrior)/L0);
		hyp4.hypoPrior=newPrior;
		newPrior=((hyp5.hypoLime*hyp5.hypoPrior)/L0);
		hyp5.hypoPrior=newPrior;
		limeCount=limeCount+1;
		}
	}
 
 catch(Exception e)
       {
		System.out.println();
       }

       C0=(hyp1.hypoPrior*hyp1.hypoCherry) + (hyp2.hypoPrior*hyp2.hypoCherry) + (hyp3.hypoPrior*hyp3.hypoCherry) + (hyp4.hypoPrior*hyp4.hypoCherry) + (hyp5.hypoPrior*hyp5.hypoCherry);
       L0 = (hyp1.hypoPrior*hyp1.hypoLime) + (hyp2.hypoPrior*hyp2.hypoLime) + (hyp3.hypoPrior*hyp3.hypoLime) + (hyp4.hypoPrior*hyp4.hypoLime) + (hyp5.hypoPrior*hyp5.hypoLime);
   
       try {
               output.newLine();
               output.write("Observation Number:"+i);
               output.newLine();
               output.write("P(hyp1 | Q) =\t");
               output.write(String.valueOf(round(hyp1.hypoPrior,5)));
               output.newLine();
               output.write("P(hyp2 | Q) =\t");
               output.write(String.valueOf(round(hyp2.hypoPrior,5)));
               output.newLine();
               output.write("P(hyp3 | Q) =\t");
               output.write(String.valueOf(round(hyp3.hypoPrior,5)));
               output.newLine();
               output.write("P(hyp4 | Q) =\t");
               output.write(String.valueOf(round(hyp4.hypoPrior,5)));
               output.newLine();
               output.write("P(hyp5 | Q) =\t");
               output.write(String.valueOf(round(hyp5.hypoPrior,5)));
               output.newLine();
               output.write("Probability that the next candy will be Cherry, given Q:"+round(C0,5)+"\n");
               output.write("Probability that the next candy will be Lime, given Q:"+round(L0,5)+"\n");

           }

		catch(Exception e)
			   {
					System.out.println("Error!");
               }


				}
output.close();
System.out.println("Result.txt has been successfully created.");
}

public static double round(double val, int places)
{
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    val = val * factor;
    long tmp = Math.round(val);
    return (double) tmp / factor;
}
private static void exit_function(int val)
	{
        System.out.println("Exit");
        System.exit(val);
    }

}