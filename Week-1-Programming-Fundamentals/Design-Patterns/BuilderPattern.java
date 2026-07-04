class Computer {

    private String processor;
    private int ram;

    public Computer(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public void display() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}

public class BuilderPattern {

    public static void main(String[] args) {

        Computer pc = new Computer("Intel i7", 16);
        pc.display();
    }
}