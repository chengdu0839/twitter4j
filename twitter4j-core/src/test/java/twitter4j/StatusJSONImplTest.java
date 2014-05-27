package twitter4j;

import junit.framework.TestCase;

/**
 * @author Cedric Meury - cedric at meury.com
 */
public class StatusJSONImplTest extends TestCase {

    public void testReturningNullForMissingIsoLanguageCode() throws Exception {
        // given
        String json = "{\"contributors\":null,\"text\":\"@belbeer After four years of study in radiotechnical college I realized that the language skills are much more useful than fucking math.\",\"geo\":null,\"retweeted\":false,\"in_reply_to_screen_name\":\"belbeer\",\"truncated\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[{\"id\":74987101,\"name\":\"belbeer\",\"indices\":[0,8],\"screen_name\":\"belbeer\",\"id_str\":\"74987101\"}]},\"in_reply_to_status_id_str\":\"297250346298904576\",\"id\":297265580690513920,\"source\":\"web\",\"in_reply_to_user_id_str\":\"74987101\",\"favorited\":false,\"in_reply_to_status_id\":297250346298904576,\"retweet_count\":0,\"created_at\":\"Fri Feb 01 08:50:12 +0000 2013\",\"in_reply_to_user_id\":74987101,\"id_str\":\"297265580690513920\",\"place\":null,\"user\":{\"location\":\"where am i?\",\"default_profile\":true,\"profile_background_tile\":false,\"statuses_count\":1100,\"lang\":\"ru\",\"profile_link_color\":\"0084B4\",\"id\":386522307,\"following\":null,\"protected\":false,\"favourites_count\":13,\"profile_text_color\":\"333333\",\"description\":\"160 ????????\",\"verified\":false,\"contributors_enabled\":false,\"profile_sidebar_border_color\":\"C0DEED\",\"name\":\"???????? ??????\",\"profile_background_color\":\"C0DEED\",\"created_at\":\"Fri Oct 07 12:44:01 +0000 2011\",\"default_profile_image\":false,\"followers_count\":46,\"profile_image_url_https\":\"https://si0.twimg.com/profile_images/2785804589/b0b355c75d3f77658fc94ec05a7bb5af_normal.jpeg\",\"geo_enabled\":true,\"profile_background_image_url\":\"http://a0.twimg.com/images/themes/theme1/bg.png\",\"profile_background_image_url_https\":\"https://si0.twimg.com/images/themes/theme1/bg.png\",\"follow_request_sent\":null,\"entities\":{\"description\":{\"urls\":[]},\"url\":{\"urls\":[{\"expanded_url\":null,\"indices\":[0,29],\"url\":\"http://goodfoto.blogspot.com/\"}]}},\"url\":\"http://goodfoto.blogspot.com/\",\"utc_offset\":7200,\"time_zone\":\"Athens\",\"notifications\":null,\"profile_use_background_image\":true,\"friends_count\":46,\"profile_sidebar_fill_color\":\"DDEEF6\",\"screen_name\":\"LonliLokli2000\",\"id_str\":\"386522307\",\"profile_image_url\":\"http://a0.twimg.com/profile_images/2785804589/b0b355c75d3f77658fc94ec05a7bb5af_normal.jpeg\",\"listed_count\":1,\"is_translator\":false},\"coordinates\":null}";
        Status status = TwitterObjectFactory.createStatus(json);

        // when
        String lang = status.getLang();

        // then
        assertNull(lang);
    }

    public void testIsRetweetedWhenStatusIsRetweeted() throws JSONException, TwitterException {
        String rawJson = "{ \"created_at\":\"Mon Mar 11 19:37:00 +0000 2013\", \"id\":311199093852618752, \"id_str\":\"311199093852618752\", \"text\":\"Introducing application-only authentication for the Twitter REST API v1.1 https:\\/\\/t.co\\/BrLLpVyuCe ^TS\", \"source\":\"web\", \"truncated\":false, \"in_reply_to_status_id\":null, \"in_reply_to_status_id_str\":null, \"in_reply_to_user_id\":null, \"in_reply_to_user_id_str\":null, \"in_reply_to_screen_name\":null, \"user\":{ \"id\":6253282, \"id_str\":\"6253282\", \"name\":\"Twitter API\", \"screen_name\":\"twitterapi\", \"location\":\"San Francisco, CA\", \"description\":\"The Real Twitter API. I tweet about API changes, service issues and happily answer questions about Twitter and our API. Don't get an answer? It's on my website.\", \"url\":\"http:\\/\\/dev.twitter.com\", \"entities\":{ \"url\":{ \"urls\":[ { \"url\":\"http:\\/\\/dev.twitter.com\", \"expanded_url\":null, \"indices\":[ 0, 22 ] } ] }, \"description\":{ \"urls\":[ ] } }, \"protected\":false, \"followers_count\":1533137, \"friends_count\":33, \"listed_count\":11369, \"created_at\":\"Wed May 23 06:01:13 +0000 2007\", \"favourites_count\":25, \"utc_offset\":-28800, \"time_zone\":\"Pacific Time (US & Canada)\", \"geo_enabled\":true, \"verified\":true, \"statuses_count\":3392, \"lang\":\"en\", \"contributors_enabled\":true, \"is_translator\":false, \"profile_background_color\":\"C0DEED\", \"profile_background_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_tile\":true, \"profile_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_banner_url\":\"https:\\/\\/si0.twimg.com\\/profile_banners\\/6253282\\/1347394302\", \"profile_link_color\":\"0084B4\", \"profile_sidebar_border_color\":\"C0DEED\", \"profile_sidebar_fill_color\":\"DDEEF6\", \"profile_text_color\":\"333333\", \"profile_use_background_image\":true, \"default_profile\":false, \"default_profile_image\":false, \"following\":null, \"follow_request_sent\":false, \"notifications\":null }, \"geo\":null, \"coordinates\":null, \"place\":null, \"contributors\":[ 819797 ], \"retweet_count\":131, \"entities\":{ \"hashtags\":[ ], \"urls\":[ { \"url\":\"https:\\/\\/t.co\\/BrLLpVyuCe\", \"expanded_url\":\"https:\\/\\/dev.twitter.com\\/docs\\/auth\\/application-only-auth\", \"display_url\":\"dev.twitter.com\\/docs\\/auth\\/appl…\", \"indices\":[ 74, 97 ] } ], \"user_mentions\":[ ] }, \"favorited\":false, \"retweeted\":true, \"possibly_sensitive\":false, \"lang\":\"en\" }";
        JSONObject json = new JSONObject(rawJson);
        StatusJSONImpl status = new StatusJSONImpl(json);

        assertEquals(true, status.isRetweeted());
    }

    public void testIsRetweetedWhenStatusIsNotRetweeted() throws JSONException, TwitterException {
        String rawJson = "{ \"created_at\":\"Tue Mar 05 23:57:32 +0000 2013\", \"id\":309090333021581313, \"id_str\":\"309090333021581313\", \"text\":\"As announced, @anywhere has been retired per https:\\/\\/t.co\\/bWXjhurvwp The js file now logs a message to the console and exits quietly. ^ARK\", \"source\":\"web\", \"truncated\":false, \"in_reply_to_status_id\":null, \"in_reply_to_status_id_str\":null, \"in_reply_to_user_id\":null, \"in_reply_to_user_id_str\":null, \"in_reply_to_screen_name\":null, \"user\":{ \"id\":6253282, \"id_str\":\"6253282\", \"name\":\"Twitter API\", \"screen_name\":\"twitterapi\", \"location\":\"San Francisco, CA\", \"description\":\"The Real Twitter API. I tweet about API changes, service issues and happily answer questions about Twitter and our API. Don't get an answer? It's on my website.\", \"url\":\"http:\\/\\/dev.twitter.com\", \"entities\":{ \"url\":{ \"urls\":[ { \"url\":\"http:\\/\\/dev.twitter.com\", \"expanded_url\":null, \"indices\":[ 0, 22 ] } ] }, \"description\":{ \"urls\":[ ] } }, \"protected\":false, \"followers_count\":1533137, \"friends_count\":33, \"listed_count\":11369, \"created_at\":\"Wed May 23 06:01:13 +0000 2007\", \"favourites_count\":25, \"utc_offset\":-28800, \"time_zone\":\"Pacific Time (US & Canada)\", \"geo_enabled\":true, \"verified\":true, \"statuses_count\":3392, \"lang\":\"en\", \"contributors_enabled\":true, \"is_translator\":false, \"profile_background_color\":\"C0DEED\", \"profile_background_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_tile\":true, \"profile_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_banner_url\":\"https:\\/\\/si0.twimg.com\\/profile_banners\\/6253282\\/1347394302\", \"profile_link_color\":\"0084B4\", \"profile_sidebar_border_color\":\"C0DEED\", \"profile_sidebar_fill_color\":\"DDEEF6\", \"profile_text_color\":\"333333\", \"profile_use_background_image\":true, \"default_profile\":false, \"default_profile_image\":false, \"following\":null, \"follow_request_sent\":false, \"notifications\":null }, \"geo\":null, \"coordinates\":null, \"place\":null, \"contributors\":[ 7588892 ], \"retweet_count\":74, \"entities\":{ \"hashtags\":[ ], \"urls\":[ { \"url\":\"https:\\/\\/t.co\\/bWXjhurvwp\", \"expanded_url\":\"https:\\/\\/dev.twitter.com\\/blog\\/sunsetting-anywhere\", \"display_url\":\"dev.twitter.com\\/blog\\/sunsettin…\", \"indices\":[ 45, 68 ] } ], \"user_mentions\":[ { \"screen_name\":\"anywhere\", \"name\":\"Anywhere\", \"id\":9576402, \"id_str\":\"9576402\", \"indices\":[ 14, 23 ] } ] }, \"favorited\":false, \"retweeted\":false, \"possibly_sensitive\":false, \"lang\":\"en\" }";
        JSONObject json = new JSONObject(rawJson);
        StatusJSONImpl status = new StatusJSONImpl(json);

        assertEquals(false, status.isRetweeted());
    }

    public void testIsRetweetedWhenStatusHasNoRetweetedProperty() throws JSONException, TwitterException {
        String rawJson = "{ \"created_at\":\"Tue Mar 05 23:57:32 +0000 2013\", \"id\":309090333021581313, \"id_str\":\"309090333021581313\", \"text\":\"As announced, @anywhere has been retired per https:\\/\\/t.co\\/bWXjhurvwp The js file now logs a message to the console and exits quietly. ^ARK\", \"source\":\"web\", \"truncated\":false, \"in_reply_to_status_id\":null, \"in_reply_to_status_id_str\":null, \"in_reply_to_user_id\":null, \"in_reply_to_user_id_str\":null, \"in_reply_to_screen_name\":null, \"user\":{ \"id\":6253282, \"id_str\":\"6253282\", \"name\":\"Twitter API\", \"screen_name\":\"twitterapi\", \"location\":\"San Francisco, CA\", \"description\":\"The Real Twitter API. I tweet about API changes, service issues and happily answer questions about Twitter and our API. Don't get an answer? It's on my website.\", \"url\":\"http:\\/\\/dev.twitter.com\", \"entities\":{ \"url\":{ \"urls\":[ { \"url\":\"http:\\/\\/dev.twitter.com\", \"expanded_url\":null, \"indices\":[ 0, 22 ] } ] }, \"description\":{ \"urls\":[ ] } }, \"protected\":false, \"followers_count\":1533137, \"friends_count\":33, \"listed_count\":11369, \"created_at\":\"Wed May 23 06:01:13 +0000 2007\", \"favourites_count\":25, \"utc_offset\":-28800, \"time_zone\":\"Pacific Time (US & Canada)\", \"geo_enabled\":true, \"verified\":true, \"statuses_count\":3392, \"lang\":\"en\", \"contributors_enabled\":true, \"is_translator\":false, \"profile_background_color\":\"C0DEED\", \"profile_background_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_tile\":true, \"profile_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_banner_url\":\"https:\\/\\/si0.twimg.com\\/profile_banners\\/6253282\\/1347394302\", \"profile_link_color\":\"0084B4\", \"profile_sidebar_border_color\":\"C0DEED\", \"profile_sidebar_fill_color\":\"DDEEF6\", \"profile_text_color\":\"333333\", \"profile_use_background_image\":true, \"default_profile\":false, \"default_profile_image\":false, \"following\":null, \"follow_request_sent\":false, \"notifications\":null }, \"geo\":null, \"coordinates\":null, \"place\":null, \"contributors\":[ 7588892 ], \"retweet_count\":74, \"entities\":{ \"hashtags\":[ ], \"urls\":[ { \"url\":\"https:\\/\\/t.co\\/bWXjhurvwp\", \"expanded_url\":\"https:\\/\\/dev.twitter.com\\/blog\\/sunsetting-anywhere\", \"display_url\":\"dev.twitter.com\\/blog\\/sunsettin…\", \"indices\":[ 45, 68 ] } ], \"user_mentions\":[ { \"screen_name\":\"anywhere\", \"name\":\"Anywhere\", \"id\":9576402, \"id_str\":\"9576402\", \"indices\":[ 14, 23 ] } ] }, \"favorited\":false, \"possibly_sensitive\":false, \"lang\":\"en\" }";
        JSONObject json = new JSONObject(rawJson);
        StatusJSONImpl status = new StatusJSONImpl(json);

        assertEquals(false, status.isRetweeted());
    }

    public void testLoadingGeoLocationWithCoordinatesField() throws Exception {

        //given
        String json = "{\"filter_level\":\"medium\",\"contributors\":null,\"text\":\"@Livvy_Scott1 because I am a clever  boy.\",\"geo\":{\"type\":\"Point\",\"coordinates\":[52.25604116,0.70928444]},\"retweeted\":false,\"in_reply_to_screen_name\":\"Livvy_Scott1\",\"truncated\":false,\"lang\":\"en\",\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[{\"id\":476669159,\"name\":\"livs ?\",\"indices\":[0,13],\"screen_name\":\"Livvy_Scott1\",\"id_str\":\"476669159\"}]},\"in_reply_to_status_id_str\":\"320934680662794241\",\"id\":320936613498744832,\"source\":\"<a href=\\\"http://twitter.com/download/android\\\" rel=\\\"nofollow\\\">Twitter for Android<\\/a>\",\"in_reply_to_user_id_str\":\"476669159\",\"favorited\":false,\"in_reply_to_status_id\":320934680662794241,\"retweet_count\":0,\"created_at\":\"Sun Apr 07 16:30:26 +0000 2013\",\"in_reply_to_user_id\":476669159,\"favorite_count\":0,\"id_str\":\"320936613498744832\",\"place\":{\"id\":\"55c6bcd3013a0607\",\"bounding_box\":{\"type\":\"Polygon\",\"coordinates\":[[[0.38178,52.055592],[0.38178,52.400796],[0.967452,52.400796],[0.967452,52.055592]]]},\"place_type\":\"city\",\"contained_within\":[],\"name\":\"St. Edmundsbury\",\"attributes\":{},\"country_code\":\"GB\",\"url\":\"http://api.twitter.com/1/geo/id/55c6bcd3013a0607.json\",\"polylines\":[],\"geometry\":null,\"country\":\"United Kingdom\",\"full_name\":\"St. Edmundsbury, Suffolk\"},\"user\":{\"location\":\"Attleborough\",\"default_profile\":false,\"profile_background_tile\":true,\"statuses_count\":2520,\"lang\":\"en\",\"profile_link_color\":\"009999\",\"profile_banner_url\":\"https://si0.twimg.com/profile_banners/448404395/1365018601\",\"id\":448404395,\"following\":null,\"protected\":false,\"favourites_count\":203,\"profile_text_color\":\"333333\",\"description\":\"Born at a very young age. Top Jock - DJ Bookings-maxwellDJ18@hotmail.co.uk \",\"verified\":false,\"contributors_enabled\":false,\"profile_sidebar_border_color\":\"EEEEEE\",\"name\":\"DJ MaxwellJ \",\"profile_background_color\":\"131516\",\"created_at\":\"Tue Dec 27 23:49:48 +0000 2011\",\"default_profile_image\":false,\"followers_count\":309,\"profile_image_url_https\":\"https://si0.twimg.com/profile_images/3472432483/07133836faedec0252f17d691cb7eb5d_normal.jpeg\",\"geo_enabled\":true,\"profile_background_image_url\":\"http://a0.twimg.com/images/themes/theme14/bg.gif\",\"profile_background_image_url_https\":\"https://si0.twimg.com/images/themes/theme14/bg.gif\",\"follow_request_sent\":null,\"url\":null,\"utc_offset\":0,\"time_zone\":\"Casablanca\",\"notifications\":null,\"profile_use_background_image\":true,\"friends_count\":342,\"profile_sidebar_fill_color\":\"EFEFEF\",\"screen_name\":\"maxwellDJ18\",\"id_str\":\"448404395\",\"profile_image_url\":\"http://a0.twimg.com/profile_images/3472432483/07133836faedec0252f17d691cb7eb5d_normal.jpeg\",\"listed_count\":0,\"is_translator\":false},\"coordinates\":{\"type\":\"Point\",\"coordinates\":[0.70928444,52.25604116]}}\n";

        //when
        Status status = TwitterObjectFactory.createStatus(json);
        GeoLocation geoLocation = status.getGeoLocation();
        //then
        assertNotNull(geoLocation);
        assertEquals(geoLocation.getLongitude(), 0.70928444, 0.00000001);
        assertEquals(geoLocation.getLatitude(), 52.25604116, 0.00000001);
    }

    public void testLangWithLangFieldDefined() throws Exception {
        //given
        String rawJson = "{ \"created_at\":\"Mon Mar 11 19:37:00 +0000 2013\", \"id\":311199093852618752, \"id_str\":\"311199093852618752\", \"text\":\"Introducing application-only authentication for the Twitter REST API v1.1 https:\\/\\/t.co\\/BrLLpVyuCe ^TS\", \"source\":\"web\", \"truncated\":false, \"in_reply_to_status_id\":null, \"in_reply_to_status_id_str\":null, \"in_reply_to_user_id\":null, \"in_reply_to_user_id_str\":null, \"in_reply_to_screen_name\":null, \"user\":{ \"id\":6253282, \"id_str\":\"6253282\", \"name\":\"Twitter API\", \"screen_name\":\"twitterapi\", \"location\":\"San Francisco, CA\", \"description\":\"The Real Twitter API. I tweet about API changes, service issues and happily answer questions about Twitter and our API. Don't get an answer? It's on my website.\", \"url\":\"http:\\/\\/dev.twitter.com\", \"entities\":{ \"url\":{ \"urls\":[ { \"url\":\"http:\\/\\/dev.twitter.com\", \"expanded_url\":null, \"indices\":[ 0, 22 ] } ] }, \"description\":{ \"urls\":[ ] } }, \"protected\":false, \"followers_count\":1533137, \"friends_count\":33, \"listed_count\":11369, \"created_at\":\"Wed May 23 06:01:13 +0000 2007\", \"favourites_count\":25, \"utc_offset\":-28800, \"time_zone\":\"Pacific Time (US & Canada)\", \"geo_enabled\":true, \"verified\":true, \"statuses_count\":3392, \"lang\":\"en\", \"contributors_enabled\":true, \"is_translator\":false, \"profile_background_color\":\"C0DEED\", \"profile_background_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_background_images\\/656927849\\/miyt9dpjz77sc0w3d4vj.png\", \"profile_background_tile\":true, \"profile_image_url\":\"http:\\/\\/a0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_image_url_https\":\"https:\\/\\/si0.twimg.com\\/profile_images\\/2284174872\\/7df3h38zabcvjylnyfe3_normal.png\", \"profile_banner_url\":\"https:\\/\\/si0.twimg.com\\/profile_banners\\/6253282\\/1347394302\", \"profile_link_color\":\"0084B4\", \"profile_sidebar_border_color\":\"C0DEED\", \"profile_sidebar_fill_color\":\"DDEEF6\", \"profile_text_color\":\"333333\", \"profile_use_background_image\":true, \"default_profile\":false, \"default_profile_image\":false, \"following\":null, \"follow_request_sent\":false, \"notifications\":null }, \"geo\":null, \"coordinates\":null, \"place\":null, \"contributors\":[ 819797 ], \"retweet_count\":131, \"entities\":{ \"hashtags\":[ ], \"urls\":[ { \"url\":\"https:\\/\\/t.co\\/BrLLpVyuCe\", \"expanded_url\":\"https:\\/\\/dev.twitter.com\\/docs\\/auth\\/application-only-auth\", \"display_url\":\"dev.twitter.com\\/docs\\/auth\\/appl…\", \"indices\":[ 74, 97 ] } ], \"user_mentions\":[ ] }, \"favorited\":false, \"retweeted\":true, \"possibly_sensitive\":false, \"lang\":\"en\" }";

        //when
        JSONObject json = new JSONObject(rawJson);
        StatusJSONImpl status = new StatusJSONImpl(json);

        //then
        assertNotNull(status.getLang());
        assertEquals("en", status.getLang());
    }

    public void testExtendedMediaEntities() throws Exception {
        //given from https://dev.twitter.com/docs/api/multiple-media-extended-entities
        String rawJson = "{  \"created_at\": \"Fri Mar 28 21:34:45 +0000 2014\",  \"id\": 449660889793581060,  \"id_str\": \"449660889793581056\",  \"text\": \"\\\"I hope you'll keep...building bonds of friendship that will enrich your lives & enrich our world\\\" —FLOTUS in China, http://t.co/fxmuQN9JL9\",  \"source\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\",  \"truncated\": false,  \"in_reply_to_status_id\": null,  \"in_reply_to_status_id_str\": null,  \"in_reply_to_user_id\": null,  \"in_reply_to_user_id_str\": null,  \"in_reply_to_screen_name\": null,  \"user\":  {    \"id\": 1093090866,    \"id_str\": \"1093090866\",    \"name\": \"The First Lady\",    \"screen_name\": \"FLOTUS\",    \"location\": \"Washington, DC\",    \"description\": \"This account is run by the Office of First Lady Michelle Obama. Tweets from the First Lady are signed –mo. Tweets may be archived. More at http://t.co/9DxP65hB\",    \"url\": \"http://t.co/RvRZspIO8c\",    \"entities\":  {      \"url\":  {        \"urls\":  [           {            \"url\": \"http://t.co/RvRZspIO8c\",            \"expanded_url\": \"http://www.whitehouse.gov\",            \"display_url\": \"whitehouse.gov\",            \"indices\":  [              0,              22            ]          }        ]      },      \"description\":  {        \"urls\":  [           {            \"url\": \"http://t.co/9DxP65hB\",            \"expanded_url\": \"http://wh.gov/privacy\",            \"display_url\": \"wh.gov/privacy\",            \"indices\":  [              139,              159            ]          }        ]      }    },    \"protected\": false,    \"followers_count\": 878857,    \"friends_count\": 21,    \"listed_count\": 5349,    \"created_at\": \"Tue Jan 15 20:03:17 +0000 2013\",    \"favourites_count\": 0,    \"utc_offset\": -14400,    \"time_zone\": \"Eastern Time (US & Canada)\",    \"geo_enabled\": false,    \"verified\": true,    \"statuses_count\": 813,    \"lang\": \"en\",    \"contributors_enabled\": false,    \"is_translator\": false,    \"is_translation_enabled\": false,    \"profile_background_color\": \"0084B4\",    \"profile_background_image_url\": \"http://pbs.twimg.com/profile_background_images/766168824/6d7e9bac6f5904ab0843bd1e9d935695.jpeg\",    \"profile_background_image_url_https\": \"https://pbs.twimg.com/profile_background_images/766168824/6d7e9bac6f5904ab0843bd1e9d935695.jpeg\",    \"profile_background_tile\": false,    \"profile_image_url\": \"http://pbs.twimg.com/profile_images/453354757499781120/WsSISQK__normal.jpeg\",    \"profile_image_url_https\": \"https://pbs.twimg.com/profile_images/453354757499781120/WsSISQK__normal.jpeg\",    \"profile_banner_url\": \"https://pbs.twimg.com/profile_banners/1093090866/1396923217\",    \"profile_link_color\": \"0084B4\",    \"profile_sidebar_border_color\": \"FFFFFF\",    \"profile_sidebar_fill_color\": \"DDEEF6\",    \"profile_text_color\": \"333333\",    \"profile_use_background_image\": true,    \"default_profile\": false,    \"default_profile_image\": false,    \"following\": false,    \"follow_request_sent\": false,    \"notifications\": false  },  \"geo\": null,  \"coordinates\": null,  \"place\": null,  \"contributors\": null,  \"retweet_count\": 222,  \"favorite_count\": 295,  \"entities\": {      \"hashtags\": [],      \"media\": [          {              \"display_url\": \"pic.twitter.com/fxmuQN9JL9\",              \"expanded_url\": \"http://twitter.com/FLOTUS/status/449660889793581056/photo/1\",              \"id\": 449660809380380673,              \"id_str\": \"449660809380380673\",              \"indices\": [                  121,                  143              ],              \"media_url\": \"http://pbs.twimg.com/media/Bj2EH6yIQAEYvxu.jpg\",              \"media_url_https\": \"https://pbs.twimg.com/media/Bj2EH6yIQAEYvxu.jpg\",              \"sizes\": {                  \"large\": {                      \"h\": 426,                      \"resize\": \"fit\",                      \"w\": 640                  },                  \"medium\": {                      \"h\": 399,                      \"resize\": \"fit\",                      \"w\": 600                  },                  \"small\": {                      \"h\": 226,                      \"resize\": \"fit\",                      \"w\": 340                  },                  \"thumb\": {                      \"h\": 150,                      \"resize\": \"crop\",                      \"w\": 150                  }              },              \"type\": \"photo\",              \"url\": \"http://t.co/fxmuQN9JL9\"          }      ],      \"symbols\": [],      \"urls\": [],      \"user_mentions\": []  },  \"extended_entities\": {      \"media\": [          {              \"display_url\": \"pic.twitter.com/fxmuQN9JL9\",              \"expanded_url\": \"http://twitter.com/FLOTUS/status/449660889793581056/photo/1\",              \"id\": 449660809380380673,              \"id_str\": \"449660809380380673\",              \"indices\": [                  121,                  143              ],              \"media_url\": \"http://pbs.twimg.com/media/Bj2EH6yIQAEYvxu.jpg\",              \"media_url_https\": \"https://pbs.twimg.com/media/Bj2EH6yIQAEYvxu.jpg\",              \"sizes\": {                  \"large\": {                      \"h\": 426,                      \"resize\": \"fit\",                      \"w\": 640                  },                  \"medium\": {                      \"h\": 399,                      \"resize\": \"fit\",                      \"w\": 600                  },                  \"small\": {                      \"h\": 226,                      \"resize\": \"fit\",                      \"w\": 340                  },                  \"thumb\": {                      \"h\": 150,                      \"resize\": \"crop\",                      \"w\": 150                  }              },              \"type\": \"photo\",              \"url\": \"http://t.co/fxmuQN9JL9\"          },          {              \"display_url\": \"pic.twitter.com/fxmuQN9JL9\",              \"expanded_url\": \"http://twitter.com/FLOTUS/status/449660889793581056/photo/1\",              \"id\": 449660806754738177,              \"id_str\": \"449660806754738177\",              \"indices\": [                  121,                  143              ],              \"media_url\": \"http://pbs.twimg.com/media/Bj2EHxAIIAE8dtg.jpg\",              \"media_url_https\": \"https://pbs.twimg.com/media/Bj2EHxAIIAE8dtg.jpg\",              \"sizes\": {                  \"large\": {                      \"h\": 426,                      \"resize\": \"fit\",                      \"w\": 640                  },                  \"medium\": {                      \"h\": 399,                      \"resize\": \"fit\",                      \"w\": 600                  },                  \"small\": {                      \"h\": 226,                      \"resize\": \"fit\",                      \"w\": 340                  },                  \"thumb\": {                      \"h\": 150,                      \"resize\": \"crop\",                      \"w\": 150                  }              },              \"type\": \"photo\",              \"url\": \"http://t.co/fxmuQN9JL9\"          },          {              \"display_url\": \"pic.twitter.com/fxmuQN9JL9\",              \"expanded_url\": \"http://twitter.com/FLOTUS/status/449660889793581056/photo/1\",              \"id\": 449660808537333761,              \"id_str\": \"449660808537333761\",              \"indices\": [                  121,                  143              ],              \"media_url\": \"http://pbs.twimg.com/media/Bj2EH3pIYAE4LQn.jpg\",              \"media_url_https\": \"https://pbs.twimg.com/media/Bj2EH3pIYAE4LQn.jpg\",              \"sizes\": {                  \"large\": {                      \"h\": 427,                      \"resize\": \"fit\",                      \"w\": 640                  },                  \"medium\": {                      \"h\": 400,                      \"resize\": \"fit\",                      \"w\": 600                  },                  \"small\": {                      \"h\": 227,                      \"resize\": \"fit\",                      \"w\": 340                  },                  \"thumb\": {                      \"h\": 150,                      \"resize\": \"crop\",                      \"w\": 150                  }              },              \"type\": \"photo\",              \"url\": \"http://t.co/fxmuQN9JL9\"          },          {              \"display_url\": \"pic.twitter.com/fxmuQN9JL9\",              \"expanded_url\": \"http://twitter.com/FLOTUS/status/449660889793581056/photo/1\",              \"id\": 449660877097406464,              \"id_str\": \"449660877097406464\",              \"indices\": [                  121,                  143              ],              \"media_url\": \"http://pbs.twimg.com/media/Bj2EL3DIEAAzGAX.jpg\",              \"media_url_https\": \"https://pbs.twimg.com/media/Bj2EL3DIEAAzGAX.jpg\",              \"sizes\": {                  \"large\": {                      \"h\": 426,                      \"resize\": \"fit\",                      \"w\": 640                  },                  \"medium\": {                      \"h\": 399,                      \"resize\": \"fit\",                      \"w\": 600                  },                  \"small\": {                      \"h\": 226,                      \"resize\": \"fit\",                      \"w\": 340                  },                  \"thumb\": {                      \"h\": 150,                      \"resize\": \"crop\",                      \"w\": 150                  }              },              \"type\": \"photo\",              \"url\": \"http://t.co/fxmuQN9JL9\"          }      ]  },  \"favorited\": false,  \"retweeted\": false,  \"possibly_sensitive\": false,  \"lang\": \"en\"}";

        //when
        JSONObject json = new JSONObject(rawJson);
        StatusJSONImpl status = new StatusJSONImpl(json);

        //then
        assertEquals(4, status.getExtendedMediaEntities().length);
    }


}
