package visitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");
        File file1 = new File("file1", 10);
        File file2 = new File("file2", 20);
        File file3 = new File("file3", 30);
        File file4 = new File("file4", 40);
        File file5 = new File("file5", 50);
        root.addChild(dir1);
        root.addChild(dir2);
        dir1.addChild(file1);
        dir1.addChild(file2);
        dir2.addChild(file3);
        dir2.addChild(file4);
        dir2.addChild(file5);
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        IFileSystemVisitor search = new SearchVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalSize());
        root.accept(search);
    }
    
}
