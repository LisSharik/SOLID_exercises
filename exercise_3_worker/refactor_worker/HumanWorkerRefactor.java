package exercise_3_worker.refactor_worker;

public class HumanWorkerRefactor implements Workeable, Eatable {

    @Override
    public String work() {
        return "Human work";
    }

    @Override
    public String eat() {
        return "Human eat";

    }
    
}
