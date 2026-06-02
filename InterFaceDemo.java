public class InterFaceDemo {
    
}


interface  Animal {
    default void sleep(){
        System.out.print("This Is Sleep");
    }

    void bark();
    
}

interface Pet {
    void ownerName();
    
}

class  Dog implements Animal, Pet{

    @Override
    public void bark() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bark'");
    }

    @Override
    public void ownerName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ownerName'");
    }

    
}
