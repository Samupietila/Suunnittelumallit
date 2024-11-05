package visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystemElement {
    private String name;
    private List<IFileSystemElement> children = new ArrayList<>();
    
    public Directory(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addChild(IFileSystemElement child) {
        children.add(child);
    }

    public void accept(IFileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public List<IFileSystemElement> getChildren() {
        return children;
    }
}
