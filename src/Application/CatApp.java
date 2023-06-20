package Application;

import data.Category;

public class CatApp
{
    public static void main(String[] args)
    {
        var category = new Category();
        category.setId("ID");

        System.out.println(category.getId());

    }
}
