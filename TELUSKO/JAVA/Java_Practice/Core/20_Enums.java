enum Status{
    Pending,Approved,Completed,Success;
}

class Enums {
    public static void main(String[] args) {
        // Status s = Status.Walking;
        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal()); // gives index

        Status[] all = Status.values();
        System.out.println(all[0]);
        for(Status stat : all){
            System.out.println(stat);
        }

        if(s == Status.Approved){
            System.out.println("Approved");
        } else if(s == Status.Completed){
            System.out.println("Completed");
        }

        switch(s){
            case Pending:
                System.out.println("PEnidng");
                break;
            case Approved:
                System.out.println("Approved");
                break;
            case Completed:
                System.out.println("Completed");
                break;
            case Success:
                System.out.println("Success");
        }
    }
}
