class ConstructorDemoInner {
    int balance;

    //Defaul Constructor
    public ConstructorDemoInner(){
         balance = 100;
    }

    //parameterised constructor
    public ConstructorDemoInner(int _balance){
        balance = _balance;
    }

    public void printBal(){
        System.out.println(balance);
    }
}


class ConstructorDemo {

    public static void main(String[] args) {
        ConstructorDemoInner demo = new ConstructorDemoInner();
        demo.printBal();
        ConstructorDemoInner demo1 = new ConstructorDemoInner(400);
        demo1.printBal();

        
    }
}
