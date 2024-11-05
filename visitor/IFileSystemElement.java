package visitor;

public interface IFileSystemElement {
    void accept(IFileSystemVisitor visitor);
}
