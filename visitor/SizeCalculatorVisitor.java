package visitor;

public class SizeCalculatorVisitor implements IFileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(Directory directory) {
        Integer size = 0;
        System.out.println("Directory: " + directory.getName());
        for (IFileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        System.out.println("File: " + file.getName());
        totalSize += file.getSize();
    }
    public int getTotalSize() {
        return totalSize;
     }
    
}
