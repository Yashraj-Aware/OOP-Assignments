public class assignment_4{
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.getROI();

        SBI s1 = new SBI();
        s1.getROI();
        s1.getInterest(s1.rate);


        HDFC h1 = new HDFC();
        h1.getROI();
        h1.getInterest(h1.rate);


        ICICI i1 = new ICICI();
        i1.getROI();
        i1.getInterest(i1.rate);

    }
}

class Bank{
    long principal = 500000;
    public void getROI(){
        System.out.println("Rates are:");
        System.out.println("SBI: 8.4%");
        System.out.println("HDFC: 7.3%");
        System.out.println("ICICI: 9.7%");
    }

    public void getInterest(double rate){
        double interest;

        interest = principal * rate / 100;
        
        System.out.println("Simple interest is "+interest+" Rs");
    }
}

class HDFC extends Bank{

    String user = "ROHIT";
    double rate = 7.3;

    public void getROI(){
        System.out.println("User: "+ user);

        System.out.println("Rate for HDFC is "+rate +"%");
    }
}

class SBI extends Bank{

    String user = "RAHUL";
    double rate = 7.3;

    public void getROI(){
        System.out.println("User: "+ user);
        System.out.println("Rate for HDFC is "+rate +"%");
    }
}


class ICICI extends Bank{

    String user = "ROHAN";
    double rate = 9.7;

    public void getROI(){
        System.out.println("User: "+ user);

        System.out.println("Rate for HDFC is "+rate +"%");
    }
}