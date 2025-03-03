import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private static Map<String, Boolean> allowanceMap = new HashMap<>();

    Static{
        allowanceMap.put("Smart", false);
        allowanceMap.put("Globe", true);
        allowanceMap.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        if (unliCallText == false ){
           return "No Unli Calls/Text Offer";
        }else{
            if (unliCallText == true){
                return "Unlimited Calls/Text to all networks.";
            }
        }
    }
}