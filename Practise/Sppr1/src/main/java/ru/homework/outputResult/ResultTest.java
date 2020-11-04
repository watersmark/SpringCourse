package ru.homework.outputResult;

import ru.homework.askQuestion.AbstractAsc;
import ru.homework.person.Student;

public class ResultTest implements AbstractOut {
    private Student student;
    private int countResult;

    public ResultTest(){
        this.student = new Student("Mark", 32);
    }

    @Override
    public String getResult() {
        if(countResult > 2){
            System.out.println(countResult);
            return "Good";
        }
        System.out.println(countResult);
        return "Bad";
    }


    @Override
    public void setTest(AbstractAsc test) {
        System.out.println("Start test");
        test.questions();
        this.countResult = test.getCountCorrect();
    }
}
