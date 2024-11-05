package visitor;

public class SearchVisitor implements IFileSystemVisitor {

    @Override
    public void visit(Directory directory) {
        System.out.println("Directory: " + directory.getName());
        System.out.println("Files: ");
        for (IFileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }

    }
    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getName());
    }
}
