/*
 * Diners club credit card validation
 *
 */

public class DinersCard extends TemplatePattern{

    protected String cardNum;
    protected int expMM, expYY;

    //constructor
    public DinersCard(String num, int expMonth, int expYear) {
        super(num, expMonth, expYear);
        cardNum = num;
        expMM = expMonth;
        expYY = expYear;
    }

    @Override
    //check number of digits
    public boolean isNumOfDigitsValid() {
        if (cardNum.length() == 14) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    //check prefix
    public boolean isValidPrefix() {
        String prefix = cardNum.substring(0, 1);
        String nextChar = cardNum.substring(1, 2);
        String validChars = "068";  //2nd char must be a 0 or 6, or 8
        //51-55
        if ((prefix.equals("3")) &&   //prefix must be
                (validChars.indexOf(nextChar) >= 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAccountInGoodStand() {
  /*
    Make necessary DINERS CARD API calls to
    perform other checks.
  */
        return true;
    }
}  //end diners card class
