package debugging;

import java.net.URI;
import java.net.URISyntaxException;

public class Debug {


    public static void main(String[] args) throws URISyntaxException {

        String errorString = "http://hotels-kong-gds-main.ecs.mmt/gds-search-engine/api/v1.0/search?isDom=false&hotelCount=30&correlationKey=4784a6a1-0868-4527-643f-b8cc6079bbda | _hes | 346436663638363937341702531909 | ios:1bfd64136399ee49192f7e914418f5a99d546edbeaa652da80bc337e73afa32451702531843 | QJAiGaTLuk1702531909_1&aff=359641&flow=DEFAULT&availabityCount=null&pax=3.0&los=5&ap=13&source=GI&clientId=GI&slotReq=false";

        for (int i = 0; i< errorString.length();i++){
            System.out.println(i+ " " + errorString.charAt(i) + "====");
        }

        URI uri = new URI(errorString);
        System.out.println(uri.toString());






    }




}
