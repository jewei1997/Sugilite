package edu.cmu.hcii.sugilite.model.operation;

/**
 * Created by JeremyWei on 5/3/17.
 */

public class SugiliteCrucialOperation extends SugiliteOperation {
    private boolean isCrucial;
    private String crucialKeyword;

    public SugiliteCrucialOperation() {
        super();
    }

    public boolean getIsCrucial() { return isCrucial; }
    public String getCrucialKeyword () { return crucialKeyword; }
    public void setIsCrucial (boolean isCrucial) { this.isCrucial = isCrucial; }
    public void setCrucialKeyword (String crucialKeyword) { this.crucialKeyword = crucialKeyword; }

}
