
public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(double promoPrice, String telcoName, boolean unliCallText){
        this.promoPrice = money;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    private String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.UsagePromo(telcoName, promoPrice);
    }
    @Override
    private String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        this.unliPackage = unliPackage;
        return unliPackage.UnliCallsTextOffer(telcoName, unliCallText);

    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }

    public String getTelcoName() {
        return telcoName;
    }
    public double getPromoPrice(){
        return promoPrice;
    }
}