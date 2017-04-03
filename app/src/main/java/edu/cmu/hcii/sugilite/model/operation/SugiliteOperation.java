package edu.cmu.hcii.sugilite.model.operation;

import java.io.Serializable;

/**
 * @author toby
 * @date 6/10/16
 * @time 2:19 PM
 */
public class SugiliteOperation implements Serializable {
    private int operationType;
    private String parameter;
    private boolean isCrucial;
    public static final int CLICK = 1, LONG_CLICK = 2, SET_TEXT = 3, CLEAR_TEXT = 4, CHECK = 5, UNCHECK = 6, RETURN = 7, SELECT = 8, READ_OUT = 9, LOAD_AS_VARIABLE = 10, SPECIAL_GO_HOME = 11;
    public SugiliteOperation(){
        operationType = 0;
    }
    public SugiliteOperation(int operationType){
        this.operationType = operationType;
    }
    public int getOperationType(){
        return operationType;
    }
    public String getParameter(){
        return parameter;
    }
    public boolean getIsCrucial() { return isCrucial; }
    public void setOperationType(int operationType){
        this.operationType = operationType;
    }
    public void setParameter(String parameter){
        this.parameter = parameter;
    }
    public void setIsCrucial (boolean isCrucial) { this.isCrucial = isCrucial; }
}

