package org.sky;

public class ErrorMaker {
    public void ErrorExample() throws Exception{
        throw new Exception("A wild Error appears!");
    }

    public void ErrorOnInput(int a) throws Exception{
        if (a == 0){
            throw new Exception("That was 0!");
        }
    }

}
