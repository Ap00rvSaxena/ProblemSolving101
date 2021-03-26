import java.util.Random;

public class simulateDist {

    public static double RandomNumberGenerator()
    {
        // Using current time as seed for random generator
        Random generator = new Random(System.currentTimeMillis());
        return generator.nextDouble();
    }

    public static int BernoulliDist(double p)
    {
        double r=RandomNumberGenerator();
        if(r<=p)
            return 1;
        else
            return 0;
    }

    public static int BinomialDist(int n,double p)
    {
        int i,x=0;
        double r;
        for(i=0;i<n;i++)
        {
            r=RandomNumberGenerator();
            if (r<=p)
                x+=1;
        }
        return x;
    }

    public static int GeometricDist(double p)
    {
        int x=1;
        while(RandomNumberGenerator()>p)
        {
            x+=1;
        }
        return x;
    }

    public static int NegBinomialDist(int k,double p)
    {
        int i,x=0;
        for(i=0;i<k;i++)
        {
            x += GeometricDist(p);
        }
        return x;
    }

    public static int PoissonDist(double l)
    {
        int x=0;
        double lx= Math.exp(-l);
        double r=RandomNumberGenerator();
        while(r>=lx)
        {
            x += 1;
            lx += (Math.exp(-l)*Math.pow(l,x))/ fact((int)x);
        }
        return x;
    }

    public static int arb_discreteDist(double p[])
    {
        int x=0,i;
        double r,t;
        t=p[0];
        r=RandomNumberGenerator();
        //printf("r: %lf, t: %lf\n",r,t);
        while(r>=t)
        {
            //printf("entered");
            x = x+1;
            i= x;
            t = t+ p[i];
        }
        return x;
    }
    public static double UniformDist(double a, double b)
    {
        double r;
        r=RandomNumberGenerator();
        return a + r * (b - a);
    }

    public static double ExponentialDist(double l)
    {
        double r;
        r=RandomNumberGenerator();
        return -(Math.log(1 - r )) / l;
    }

    public static double GammaDist(int a,double l)
    {
        double x;
        int i;
        x=0;
        for(i=0;i<a;i++)
        {
            x += ExponentialDist(l);
        }
        return x;
    }

    public static double NormalDist(double m,double s)
    {
        double r1,r2,result;
        r1=RandomNumberGenerator();
        r2=RandomNumberGenerator();
        result= Math.sqrt( -2*Math.log(r1) )*Math.cos(2*3.14*r2);
        return result*s+m;
    }

    public static int fact(int n)
    {
        if(n==1)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] argv)
    {
        int n = Integer.parseInt(argv[0]);
        double[] p = new double[50];

        if(argv[1].equals("arb-discrete"))
        {
            int i;
            for (i=0;i<argv.length-2;i++)
            {
                p[i]=Double.parseDouble(argv[2+i]);
            }
        }
        System.out.println(n+ " samples of "+ argv[1] +" Distribution from Uniformly Random generated variables :\n");
        int i;
        for(i=0;i<n;i++)
        {
            if((argv[1].equals("bernoulli"))){
                System.out.println(BernoulliDist(Double.parseDouble(argv[2])));}

            else if((argv[1].equals("binomial")))
                System.out.println(BinomialDist( (int)Double.parseDouble(argv[2]),Double.parseDouble(argv[3]) )  );

            else if(argv[1].equals("geometric"))
                System.out.println(GeometricDist(Double.parseDouble(argv[2])));

            else if(argv[1].equals("neg-binomial"))
                System.out.println(NegBinomialDist((int)Double.parseDouble(argv[2]),Double.parseDouble(argv[3]) )  );

            else if(argv[1].equals("poisson"))
                System.out.println(PoissonDist(Double.parseDouble(argv[2])) );

            else if(argv[1].equals("arb-discrete"))
            {
                System.out.println(arb_discreteDist(p) );
            }

            else if(argv[1].equals("uniform"))
            {
                System.out.println(UniformDist( Double.parseDouble(argv[2]),Double.parseDouble(argv[3])));
            }

            else if(argv[1].equals("exponential"))
            {
                System.out.println(ExponentialDist(Double.parseDouble(argv[2]))  );
            }

            else if(argv[1].equals("gamma"))
            {
                System.out.println(GammaDist((int) Double.parseDouble(argv[2]),Double.parseDouble(argv[3])));
            }

            else if(argv[1].equals("normal"))
            {
                System.out.println(NormalDist(Double.parseDouble(argv[2]),Double.parseDouble(argv[3])));
            }

            else
            {
                System.out.println("\n Sorry!! Invalid Choice\n");
                break;
            }

        }
    }
}
