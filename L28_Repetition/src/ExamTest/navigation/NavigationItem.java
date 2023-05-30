package ExamTest.navigation;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;

    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String getLink()
    {
        return this.link;
    }

    @Override
    public void print()
    {
        System.out.println("    Item: " + this.name + " " + this.link);
    }
}
