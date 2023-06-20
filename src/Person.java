class Person
{
    String name ;
    String address;
    final String country = " Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    Person(String paramName)
    {
        this(paramName,null);
    }

    void sayHello(String paramName )
    {
        System.out.println(" Hello " + paramName + " Myname is "+ name ) ;
    }

    class Manager
    {
        String name;
        void sayHello(String name ){
            System.out.println();
        }
    }

}