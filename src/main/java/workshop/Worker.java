package workshop;

public class Worker {

    public static void main(String[] args) {

        Tool[] tools = {
                new Tool("śrubokrynt"), new Tool("młot")
        };

        for (Tool tool : tools) {
            tool.useTool();
        }
    }
}
