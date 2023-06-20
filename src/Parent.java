class Parent
{
    String name;
    void doIt()
    {
        System.out.println("Do now from parent");
    }
}
class Child extends Parent
{
    String name;
    void doIt()
    {
        System.out.println("Do it from child");
    }
}