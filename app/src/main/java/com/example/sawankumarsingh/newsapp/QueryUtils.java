package com.example.sawankumarsingh.newsapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public final class QueryUtils {

private static final String SAMPLE_JSON = "{\"status\":\"ok\",\"totalResults\":20,\"articles\":[{\"source\":{\"id\":\"the-times-of-india\",\"name\":\"The Times of India\"},\"author\":null,\"title\":\"Supreme Court sends three Amrapali directors to police custody\",\"description\":\"India Business News: SC said the directors have been playing hide and seek with the court which had on September 26 asked them to handover all documents within 24 hours. T\",\"url\":\"https://timesofindia.indiatimes.com/business/india-business/supreme-court-sends-three-amrapali-directors-to-police-custody/articleshow/66133514.cms\",\"urlToImage\":\"https://static.toiimg.com/thumb/msid-66133558,width-1070,height-580,imgsize-1909745,resizemode-6,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\"publishedAt\":\"2018-10-09T09:37:23Z\",\"content\":null},{\"source\":{\"id\":null,\"name\":\"Ndtv.com\"},\"author\":null,\"title\":\"10 Facts You Need To Know About Zika Virus In India\",\"description\":\"The first two Zika virus outbreaks were reported in India in early 2017. Both these outbreaks were successfully contained through intensive surveillance and vector management.  After a year, Zika virus has again hit the country, this time in Jaipur. At least …\",\"url\":\"https://www.ndtv.com/india-news/zika-virus-in-india-10-facts-you-need-to-know-1929205\",\"urlToImage\":\"https://c.ndtvimg.com/2018-10/57112rhg_zika-virus_625x300_09_October_18.jpg\",\"publishedAt\":\"2018-10-09T09:23:41Z\",\"content\":\"Zika Virus outbreak in India: The Prime Minister's Office has sought a report.\"},{\"source\":{\"id\":null,\"name\":\"Indianexpress.com\"},\"author\":\"SWEETY KUMARI\",\"title\":\"Student sexually abused by teacher in Kolkata school as parents clash with police\",\"description\":\"Parents of the child claimed that a teacher of the school had sexually abused the girl on September 26. On Tuesday, several parents protested outside the school premises, demanding immediate action against the accused.\",\"url\":\"https://indianexpress.com/article/cities/kolkata/kolkata-school-student-sexual-abuse-5393641/\",\"urlToImage\":\"https://images.indianexpress.com/2018/05/rape-image-7591.jpg?w=759\",\"publishedAt\":\"2018-10-09T09:11:15Z\",\"content\":\"Written by SWEETY KUMARI | Kolkata | Published: October 9, 2018 2:40:51 pm Police rushed to the spot to bring the situation under control. (Representational) A primary student has allegedly been sexually abused by a teacher at a Kolkata school, police officia… [+1159 chars]\"},{\"source\":{\"id\":null,\"name\":\"Ndtv.com\"},\"author\":null,\"title\":\"\\\"Women Take 2-4 Lakh, Target Men\\\": BJP Lawmaker's #MeToo Shocker\",\"description\":\"The #MeToo movement in India is the beginning of a \\\"wrong practice\\\" and women \\\"habitually\\\" take two-four lakhs to fling allegations at men, BJP parliamentarian Udit Raj said on Tuesday, in a series of outrageous comments on Tuesday in support of actor Nana Pa…\",\"url\":\"https://www.ndtv.com/india-news/women-take-2-4-lakh-target-men-bjp-lawmaker-udit-rajs-metoo-shocker-1929195\",\"urlToImage\":\"https://i.ndtvimg.com/i/2018-04/udit-raj-twitter_650x400_71523150222.jpg\",\"publishedAt\":\"2018-10-09T09:08:20Z\",\"content\":\"BJP lawmaker Udit Raj in a series of comments came out in support of actor Nana Patekar New Delhi: The #MeToo movement in India is the beginning of a \\\"wrong practice\\\" and women \\\"habitually\\\" take two-four lakhs to fling allegations at men, BJP parliamentarian … [+2028 chars]\"},{\"source\":{\"id\":null,\"name\":\"News18.com\"},\"author\":\"AFP\",\"title\":\"No Smile Please: CISF Personnel at Airports to Go Grumpy, Blame it on 9/11\",\"description\":\"We cannot be over-friendly with the passengers because one of the reasons cited as to why 9/11 happened... was excessive reliance on passenger friendly features, CISF director general Rajesh Ranjan was quoted as saying.\",\"url\":\"https://www.news18.com/news/india/no-smile-please-cisf-personnel-at-airports-to-go-grumpy-blame-it-on-911-1903449.html\",\"urlToImage\":\"https://images.news18.com/ibnlive/uploads/2018/10/Untitled-design29.png\",\"publishedAt\":\"2018-10-09T08:54:00Z\",\"content\":\"The CISF personnel at airports have been told to cut down on smiling, with officials blaming the 2001 US terror attacks partly on an excessive focus on friendliness, according to a media report. The Central Industrial Security Force, in charge of aviation saf… [+1034 chars]\"},{\"source\":{\"id\":null,\"name\":\"Livemint.com\"},\"author\":\"PTI\",\"title\":\"Nine dead, 14 hurt in blast at SAIL's Bhilai plant\",\"description\":\"The blast took place in a pipeline near the coke oven section of the plant\",\"url\":\"https://www.livemint.com/Companies/Z6PUoLXKENRSKAH7Tr2W3M/Six-dead-12-injured-in-blast-at-SAILs-Bhilai-steel-plant.html\",\"urlToImage\":\"https://www.livemint.com/rf/Image-621x414/LiveMint/Period2/2018/10/10/Photos/Processed/steel-kdaF--621x414@LiveMint-5e77.jpg\",\"publishedAt\":\"2018-10-09T08:48:31Z\",\"content\":\"Raipur: Nine employees were killed and 14 others injured Tuesday in a blast at the Bhilai steel plant of state-owned SAIL in Chhattisgarh’s Durg district, police said. The fire took place around 10.30am in a gas pipe line of Coke Oven Battery Complex No 11 du… [+1279 chars]\"},{\"source\":{\"id\":null,\"name\":\"Ndtv.com\"},\"author\":null,\"title\":\"Alok Nath 'Neither Denies Not Agrees' With Vinta Nanda's Account Of Rape: Report\",\"description\":\"Alok Nath said: \\\"It is useless to react on the allegations as in today's world whatever a woman says, only that will be considered\\\"\",\"url\":\"https://www.ndtv.com/entertainment/alok-nath-neither-denies-not-agrees-with-vinta-nandas-account-of-rape-1929174\",\"urlToImage\":\"https://c.ndtvimg.com/2018-10/4661spho_alok-nath-youtube-_625x300_09_October_18.jpg\",\"publishedAt\":\"2018-10-09T08:44:56Z\",\"content\":\"New Delhi: Actor Alok Nath has offered a defence - a very poor one - after being identified by social media as the ' sanskaari ' actor who allegedly raped writer Vinta Nanda two decades ago. Speaking to ABP News, Mr Nath has said he 'neither denies not agrees… [+2519 chars]\"},{\"source\":{\"id\":\"the-times-of-india\",\"name\":\"The Times of India\"},\"author\":null,\"title\":\"Honda drives in new CR-V to India\",\"description\":\"India Business News: New Delhi, Oct 9 () Japanese auto major Honda Tuesday launched an all-new version of its premium SUV CR-V in India, priced between Rs 28.15 lakh and R\",\"url\":\"https://timesofindia.indiatimes.com/business/india-business/honda-drives-in-new-cr-v-to-india/articleshow/66132541.cms\",\"urlToImage\":\"https://static.toiimg.com/photo/msid-47529300/47529300.jpg\",\"publishedAt\":\"2018-10-09T08:16:24Z\",\"content\":\"New Delhi, Oct 9 () Japanese auto major Honda Tuesday launched an all-new version of its premium SUV CR-V in India, priced between Rs 28.15 lakh and Rs 32.75 lakh (ex-showroom). The two-wheel drive petrol variant of the fifth generation CR-V is priced at Rs 2… [+1494 chars]\"},{\"source\":{\"id\":null,\"name\":\"Ndtv.com\"},\"author\":null,\"title\":\"Minister MJ Akbar Named In #MeToo, Senior Sushma Swaraj Ducks Question\",\"description\":\"Union Minister and former editor MJ Akbar has been accused of sexual harassment on social media in the snowballing #MeToo movement in India that began with a Twitter thread. His senior Sushma Swaraj, the Union Foreign Minister, however, did not respond as she…\",\"url\":\"https://www.ndtv.com/india-news/minister-mj-akbar-named-in-metoo-senior-sushma-swaraj-ducks-question-1929154\",\"urlToImage\":\"https://i.ndtvimg.com/i/2016-08/mj-akbar-twitter_650x400_51471358653.jpg\",\"publishedAt\":\"2018-10-09T08:15:48Z\",\"content\":\"MJ Akbar, a veteran journalist who is junior foreign minister, was named in a tweet (File) New Delhi: Union Minister and former editor MJ Akbar has been accused of sexual harassment on social media in the snowballing #MeToo movement in India that began with a… [+2062 chars]\"},{\"source\":{\"id\":null,\"name\":\"Livemint.com\"},\"author\":\"Kamran Haider & Faseeh Mangi, Bloomberg\",\"title\":\"Pakistan to seek IMF bailout, stocks gain\",\"description\":\"Pakistan’s foreign currency reserves have plunged 40% in 2018 to the lowest in almost four years. The nation is running twin current account and budget deficits of more than 5% of GDP\",\"url\":\"https://www.livemint.com/Politics/fHcc4MbVzUNYL5fDxERV5O/Pakistan-to-seek-IMF-bailout-stocks-gain.html\",\"urlToImage\":\"https://www.livemint.com/rf/Image-621x414/LiveMint/Period2/2018/10/10/Photos/Processed/imrankhan-kI8H--621x414@LiveMint-d32e.jpg\",\"publishedAt\":\"2018-10-09T08:13:24Z\",\"content\":\"Islamabad/Karachi: Pakistan’s stocks and bonds rose and the rupee fell after the government said it would seek the nation’s thirteenth International Monetary Fund bailout since the late 1980s in a bid to stabilize the economy and plug dwindling finances. The … [+4643 chars]\"},{\"source\":{\"id\":null,\"name\":\"News18.com\"},\"author\":\"News18.com\",\"title\":\"All-New Hyundai Santro Hatchback Officially Unveiled in India, Bookings to Open at Rs 11100\",\"description\":\"The all-new 2018 Hyundai Santro gets segment firsts like rear AC vents and a 17.64 cm (6.94-inch) touchscreen audio video system. Bookings for the hatchback open on October 10 for Rs 11,100.\",\"url\":\"https://www.news18.com/news/auto/all-new-hyundai-santro-hatchback-officially-unveiled-in-india-bookings-to-open-at-rs-11000-1903105.html\",\"urlToImage\":\"https://images.news18.com/ibnlive/uploads/2018/10/All-New-Hyundai-Santro-Revealed.jpg\",\"publishedAt\":\"2018-10-09T06:27:46Z\",\"content\":\"Hyundai has unveiled the all-new Santro in India. The World Premiere of The All New SANTRO will be held on October 23, 2018 in New Delhi. The all-new Hyundai Santro gets a ‘Modern Stylish Tallboy design’ which is based around an overall design theme of “Rhyth… [+2603 chars]\"},{\"source\":{\"id\":null,\"name\":\"Hindustantimes.com\"},\"author\":\"HT Correspondent\",\"title\":\"2 defence personnel under scanner for allegedly passing information to ISI through Facebook\",\"description\":\"A senior police officer of UP ATS said Pakistan’s intelligence agency  ISI was using fake Facebook profiles to honey-trap defence personnel and influential civilians to collect sensitive information about defence and government activities.\",\"url\":\"https://www.hindustantimes.com/lucknow/2-defence-personnel-under-scanner-for-allegedly-passing-information-to-isi-through-facebook/story-sDpLa4XRAWTxGTGAoQFeBJ.html\",\"urlToImage\":\"https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2018/10/02/Pictures/screen-picture-silhouettes-projection-laptop-illustration-facebook_e3f2eef4-c617-11e8-978e-6307977af0b0.jpg\",\"publishedAt\":\"2018-10-09T05:44:00Z\",\"content\":\"Two defence personnel, based in Kanpur and Agra, are on the radar of UP anti-terrorism squad (ATS) for allegedly passing on vital information to Pakistan’s intelligence agency Inter-Services Intelligence (ISI). A police officer privy to the investigations sai… [+2536 chars]\"},{\"source\":{\"id\":null,\"name\":\"India.com\"},\"author\":\"India.com News Desk\",\"title\":\"Journalist Nakkeeran Arrested on Sedition Charges For Reporting Governor Link in Sex Scandal\",\"description\":\"Reports in the bi-weekly linking Governor with college sex scandal led to the complaint against the journalist.\",\"url\":\"https://www.india.com/news/india/tamil-nadu-governor-presses-sedition-charges-senior-journalist-nakkeeran-arrested-3371031/\",\"urlToImage\":\"https://www.india.com/wp-content/uploads/2018/10/nakkeeran.jpg\",\"publishedAt\":\"2018-10-09T05:31:33Z\",\"content\":\"Chennai: Veteran Tamil journalist and the editor of Tamil bi-weekly Nakkeeran, Nakkeeran Gopal was arrested by the Chennai City Police on Tuesday morning. The action reportedly followed a complaint from Governor Banwarilal Purohit’s office, said media reports… [+2223 chars]\"},{\"source\":{\"id\":null,\"name\":\"Indianexpress.com\"},\"author\":\"Express Web Desk\",\"title\":\"Haryana BJP leader who announced Rs 10 crore reward for beheading Deepika Padukone back in party\",\"description\":\"The Senior BJP leader had quit from his post of BJP's chief media coordinator, Haryana, in November 2017 after a show cause notice \\r\\nwas issued for his controversial remarks during the Padmavat protest.\",\"url\":\"https://indianexpress.com/article/india/suraj-pal-amu-bjp-karni-sena-padmavat-deepika-padukone-5393191/\",\"urlToImage\":\"https://images.indianexpress.com/2017/11/suraj-pal-amu.jpg?w=759\",\"publishedAt\":\"2018-10-09T05:29:23Z\",\"content\":\"Haryana former BJP’s chief media coordinator Suraj Pal Amu. (File) The Bharatiya Janata Party rejected the resignation of controversial party leader Suraj Pal Amu, who was in the news for announcing a reward of Rs 10 crore for beheading actor Deepika Padukone… [+1152 chars]\"},{\"source\":{\"id\":\"the-times-of-india\",\"name\":\"The Times of India\"},\"author\":null,\"title\":\"Cylcone Titli: Storm may hit Odisha, coastal Andhra Pradesh; heavy rains expected\",\"description\":\"India News: NEW DELHI: The Indian Meteorological Department (IMD) on Monday said a depression over the Bay of Bengal is likely to concentrate into a cyclonic stor.\",\"url\":\"https://timesofindia.indiatimes.com/india/cylcone-titli-storm-may-hit-odisha-coastal-andhra-pradesh-heavy-rains-expected/articleshow/66129863.cms\",\"urlToImage\":\"https://static.toiimg.com/thumb/msid-66129900,width-1070,height-580,imgsize-177229,resizemode-6,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\"publishedAt\":\"2018-10-09T05:25:49Z\",\"content\":\"NEW DELHI: The Indian Meteorological Department (IMD) on Monday said a depression over the Bay of Bengal is likely to concentrate into a cyclonic storm during the next 48 hours. Under its impact, several parts of Odisha and Andhra Pradesh will receive heavy r… [+2609 chars]\"},{\"source\":{\"id\":null,\"name\":\"Moneycontrol.com\"},\"author\":null,\"title\":\"Market Live: Sensex down 100 points, Nifty around 10300; banks, midcaps fall\",\"description\":\"Yes Bank and Adani Ports are the top gainers, while Tata Motors, Eicher Motors and Asian Paints have lost the most.\",\"url\":\"https://www.moneycontrol.com/news/business/markets/stock-market-live-updates-bse-nse-sensex-down-100-points-nifty-around-10300-banks-midcaps-fall-3024851.html\",\"urlToImage\":\"https://static-news.moneycontrol.com/static-mcnews/2018/08/NSE_NIFTY_-770x433.jpg\",\"publishedAt\":\"2018-10-09T05:18:59Z\",\"content\":\"TATA MOTORS NEAR 7-YEAR LOW ON WEAK JLR SALES Tata Motors share price corrected sharply on Tuesday, hitting nearly 7-year low on consistently weak performance from its luxury car brand Jaguar Land Rover. The stock went down almost near Rs 200 levels at Rs 200… [+308 chars]\"},{\"source\":{\"id\":null,\"name\":\"Firstpost.com\"},\"author\":null,\"title\":\"Gujarat migrant exodus: Alpesh Thakor fishing in troubled waters stirred by Chief Minister Vijay Rupani\",\"description\":\"The violent targetting of migrant labours from Uttar Pradesh and Bihar in Gujarat is illustrative of the inimical trend in Indian politics to construct the outsider. Rupani's legislative proposal is a spurious attempt at allaying the unfounded fears of Gujara…\",\"url\":\"https://www.firstpost.com/india/gujarat-migrant-exodus-alpesh-thakore-fishing-in-troubled-waters-stirred-by-chief-minister-vijay-rupani-5342331.html\",\"urlToImage\":\"https://images.firstpost.com/wp-content/uploads/2018/08/00-rupani-social.jpg\",\"publishedAt\":\"2018-10-09T04:18:15Z\",\"content\":\"The violent targetting of migrant labours from Uttar Pradesh and Bihar in Gujarat is illustrative of the inimical trend in Indian politics to construct the outsider. It is he who is accused of turning life insecure and precarious. He is the parasite that fatt… [+8292 chars]\"},{\"source\":{\"id\":\"the-times-of-india\",\"name\":\"The Times of India\"},\"author\":null,\"title\":\"PM Narendra Modi to unveil statue of Sir Chhotu Ram in Sampla today\",\"description\":\"CHANDIGARH: Prime Minister Narendra Modi will unveil a 64-foot-tall statue of peasant leader Sir Chhotu Ram at the latter’s native village at Sampla i.\",\"url\":\"https://timesofindia.indiatimes.com/city/chandigarh/pm-to-unveil-statue-of-sir-chhotu-ram-in-sampla-today/articleshow/66126491.cms\",\"urlToImage\":\"https://static.toiimg.com/thumb/msid-66128978,width-1070,height-580,imgsize-1506921,resizemode-6,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\"publishedAt\":\"2018-10-09T00:55:23Z\",\"content\":\"CHANDIGARH: Prime Minister Narendra Modi will unveil a 64-foot-tall statue of peasant leader Sir Chhotu Ram at the latter’s native village at Sampla in Rohtak district on Tuesday. The PM will also lay the foundation stone of a rail coach refurbishing and reha… [+1485 chars]\"},{\"source\":{\"id\":\"the-times-of-india\",\"name\":\"The Times of India\"},\"author\":\"Bagish K Jha\",\"title\":\"Woman saves many from Gurugram highrise fire, but dies as locked gate traps her\",\"description\":\"Swati Garg, 32, knocked on doors of flats to alert other residents after a fire engulfed a highrise tower in Gurugram. Thanks to her, almost everyone\",\"url\":\"https://timesofindia.indiatimes.com/city/gurgaon/gurugram-woman-saves-many-from-highrise-fire-but-dies-herself/articleshow/66126784.cms\",\"urlToImage\":\"https://static.toiimg.com/thumb/msid-66129440,width-1070,height-580,imgsize-1169652,resizemode-6,overlay-toi_sw,pt-32,y_pad-40/photo.jpg\",\"publishedAt\":\"2018-10-08T22:32:35Z\",\"content\":\"GURUGRAM: A 32-year-old interior designer, saved many lives in a highrise tower at Tulip Orange on Sunday night, knocking on doors of flats to alert other residents to a fire that had started in the stairwell a little after 2am. Thanks to her, almost everyone… [+4002 chars]\"},{\"source\":{\"id\":null,\"name\":\"Indianexpress.com\"},\"author\":null,\"title\":\"J&K local polls: Just 8% turnout in Valley, nearly 70% in Jammu\",\"description\":null,\"url\":\"https://indianexpress.com/article/india/jk-urban-local-body-polls-heavy-voter-turnout-in-leh-kargil-as-valley-gives-a-cold-shoulder-to-polls-again-5392409/\",\"urlToImage\":null,\"publishedAt\":\"2018-10-08T15:46:19Z\",\"content\":null}]}";


    public static ArrayList<News> extractNews(){

        ArrayList<News> news = new ArrayList<>();

        try{
            JSONObject root = new JSONObject(SAMPLE_JSON);
            JSONArray array = root.getJSONArray("articles");
            for (int i=0; i<array.length();i++){
                JSONObject current =array.getJSONObject(i);

                String image = current.getString("urlToImage");
                String title = current.getString("title");
                String published = current.getString("publishedAt");
                String url = current.getString("url");

                News news1 = new News(image, title, published, url);
                news.add(news1);
            }
        }
        catch (JSONException e){
            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
        }
        return news;
    }
}
