
class BankDeposit{

    String name,acc_type;
    long acc_num;
    float balance = 0f;

    BankDeposit(String name,String acc_type,long acc_num,float balance){

        this.name = name;
        this.acc_type = acc_type;
        this.acc_num =acc_num;
        this.balance =balance;

    }

    void deposit(int val){
        balance += val;
    }
    

    void display(){

        System.out.println(name);
        System.out.println(balance);

    }
}

class Saving extends BankDeposit{

    Saving(String name,String acc_type,long acc_num,float balance){
            super(name,acc_type,acc_num,balance);

    }

    double intrest(int month){
        return balance*month * 1.2 / 100;
    }
}

class Current extends BankDeposit{

    Current(String name,String acc_type,long acc_num,float balance){
            super(name,acc_type,acc_num,balance);

    }

     boolean check_min_balance(){
        if(balance > 500){
            return true;
        }else{
            return false;
        }
    }

    void withDraw(int val){
        if(val <= balance){
            balance-=val;
        }
    }
}

class Bank{

    public static void main(String args[]){

        Saving user1 = new Saving("anil","saving",401827,100000f);

        user1.deposit(10000);
        user1.display();

          double num =  user1.intrest(1);

        System.out.println(num + " intrest for " +user1.balance );


        Current user2 = new Current("ak","curerent",401827,100000f);

        // user2.deposit(10000);
        user2.display();


        
        user2.withDraw(100000);
       
        boolean min_balance = user2.check_min_balance();
            System.out.println(min_balance);


        if(!min_balance){
            user2.balance -=100;
        }   

        user2.deposit(500);
        

        System.out.println(user2.balance);
    }
}