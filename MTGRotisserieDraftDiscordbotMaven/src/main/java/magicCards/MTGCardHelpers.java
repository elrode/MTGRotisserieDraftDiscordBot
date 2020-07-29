package magicCards;

import magicCards.named.ConsumerOfNamed;
import magicCards.named.MTGCard;
import org.springframework.boot.SpringApplication;

public class MTGCardHelpers {
    public static String getCardImage(String cardName){
        //todo replace this with a enum so one location to change the string name
        //todo also add code for looking if this information is in the database before going out to scryfall
        cardName = cardName.replaceFirst("!cardImg", "");
        ConsumerOfNamed consumerOfNamed = new ConsumerOfNamed(cardName);
        MTGCard mtgCard = consumerOfNamed.getMtgCard();
        if (mtgCard == null){
            return "That card does not exist as typed";
        }
        String cardImgURL = mtgCard.getImageUris().getLarge();
        if(cardImgURL == null){
            cardImgURL = "That card does not exist as typed";
        }
        return 	cardImgURL;
    }
}
