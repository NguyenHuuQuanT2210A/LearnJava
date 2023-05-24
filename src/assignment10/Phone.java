package assignment10;

public abstract class Phone {
    public Phone() {
    }

    abstract void insertPhone(String var1, String var2);

    abstract void removePhone(String var1);

    abstract void updatePhone(String var1, String var2, String var3);

    abstract PhoneNumber searchPhone(String var1);

    abstract void sort();
}