package magicCards.named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerOfNamed {
    private MTGCard mtgCard;
    private String cardName;
    private Logger log = LoggerFactory.getLogger(this.getClass());

    public ConsumerOfNamed(String cardName){
        this.cardName = cardName.replace(" ", "+");
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
//            Quote quote = restTemplate.getForObject(
//                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//            log.info(quote.toString());
        };
    }

    @Bean
    public MTGCard getMtgCard(){
        final String uri = "https://api.scryfall.com/cards/named?fuzzy=" + cardName;
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(uri, MTGCard.class);
        } catch (Exception e){
            return null;
        }
    }

}
