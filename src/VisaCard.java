/*
 * validate visa card
 *
 */

public class VisaCard extends TemplatePattern {

    protected String cardNum;
    protected int expMM, expYY;

    public VisaCard(String num, int expMonth, int expYear) {
        super(num, expMonth, expYear);
        cardNum = num;
        expMM = expMonth;
        expYY = expYear;
    }

    @Override
    public boolean isNumOfDigitsValid() {
        if ((cardNum.length() == 13) ||
                (cardNum.length() == 16)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isValidPrefix() {
        String prefix = cardNum.substring(0, 1);
        if (prefix.equals("4")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAccountInGoodStand() {
    /*
      Make necessary VISA API calls to
      perform other checks.


    */
        return true;
    }
} //end visa class
