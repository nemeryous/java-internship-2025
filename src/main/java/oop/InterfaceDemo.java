package oop;
    
public interface InterfaceDemo {
    void methodA();
    int methodB(String param);
}

class InterfaceDemoImpl implements InterfaceDemo {
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public int methodB(String param) {
        System.out.println("Method B implementation with param: " + param);
        return param.length();
    }
}
