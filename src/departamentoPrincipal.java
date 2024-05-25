import java.util.Vector;

public class departamentoPrincipal implements Component{
    private String name;
    private Vector<Component> children;

    public void addComponent(Component c){

    }

    public void deleteComponent(String name){

    }

    public boolean searchComponent(String name){

    }

    public Component getComponent(String name){

    }

    public Vector<Component> getChildren() {
        return children;
    }
    @Override
    public void execute() {
        System.out.println("Do some work");
    }
}
