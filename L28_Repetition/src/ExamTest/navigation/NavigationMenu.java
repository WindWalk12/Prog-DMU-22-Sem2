package ExamTest.navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    ArrayList<NavigationComponent> navigationComponents = new ArrayList<>();

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public void addChild(NavigationComponent navigationComponent)
    {
        navigationComponents.add(navigationComponent);
    }

    @Override
    public ArrayList<NavigationComponent> getChildren()
    {
        return new ArrayList<>(navigationComponents);
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void print()
    {
        System.out.println("Menu: " + this.name);
        for (NavigationComponent navigationComponent : navigationComponents) {
            System.out.print("  ");
            navigationComponent.print();
        }
    }
}
