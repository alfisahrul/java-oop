package Application;

import data.HelloWorld;

public class HelloWorldApp
{
    public static void main(String[] args)
    {
        HelloWorld english = new HelloWorld()
        {
            @Override
            public void sayHello()
            {
                System.out.println("Hello");
            }

            @Override
            public void sayHelo(String name)
            {
                System.out.println("Hello"+name);
            }
        };

        english.sayHello();
        english.sayHelo("alfi");
    }
}
