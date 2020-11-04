package ru.homework.askQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealizeAscF implements AbstractAsc {
    private int countCorrect = 0;

    @Override
    public void questions() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String oneQ = reader.readLine();
            String twoQ = reader.readLine();
            String three = reader.readLine();

            if(oneQ.equals("1")) countCorrect++;
            if(twoQ.equals("2")) countCorrect++;
            if(three.equals("3")) countCorrect++;
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public int getCountCorrect(){
        return this.countCorrect;
    }
}
