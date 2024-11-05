package visitor;

public interface IFileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
