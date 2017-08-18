package com.example.abhishek.restaurantfindeer.datamodel;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABHISHEK on 02-08-2017.
 */

public class LocationRestaurantsList implements Serializable{


    /**
     * results_found : 1280730
     * results_start : 0
     * results_shown : 20
     * restaurants : [{"restaurant":{"R":{"res_id":16614000},"apikey":"9d2944162894f32711911d556083025a","id":"16614000","name":"Tha Fish","url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Pier Point Road","locality":"Cairns City","city":"Cairns City","city_id":2435,"latitude":"-16.9202800000","longitude":"145.7802430000","zipcode":"","country_id":14,"locality_verbose":"Cairns City, Cairns City"},"switch_to_order_menu":0,"cuisines":"Seafood, Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.8","rating_text":"Good","rating_color":"9ACD32","votes":"101"},"photos_url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16614000","has_table_booking":0,"events_url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16613127},"apikey":"9d2944162894f32711911d556083025a","id":"16613127","name":"Spirit House","url":"https://www.zomato.com/yandina-qld/spirit-house-yandina?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"20 Ninderry Rd","locality":"Yandina","city":"Yandina","city_id":2613,"latitude":"-26.5508040000","longitude":"152.9584960000","zipcode":"4561","country_id":14,"locality_verbose":"Yandina, Yandina"},"switch_to_order_menu":0,"cuisines":"Asian, Thai","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"4.6","rating_text":"Excellent","rating_color":"3F7E00","votes":"688"},"photos_url":"https://www.zomato.com/yandina-qld/spirit-house-yandina/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/yandina-qld/spirit-house-yandina/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16613127","has_table_booking":0,"events_url":"https://www.zomato.com/yandina-qld/spirit-house-yandina/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16605343},"apikey":"9d2944162894f32711911d556083025a","id":"16605343","name":"Snow Pony","url":"https://www.zomato.com/mount-buller-vic/snow-pony-mt-buller?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"231 New Summit Rd","locality":"Mount Buller","city":"Mount Buller","city_id":1447,"latitude":"-37.1440390000","longitude":"146.4456410000","zipcode":"03723","country_id":14,"locality_verbose":"Mount Buller, Mount Buller"},"switch_to_order_menu":0,"cuisines":"Tapas","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.4","rating_text":"Average","rating_color":"CDD614","votes":"51"},"photos_url":"https://www.zomato.com/mount-buller-vic/snow-pony-mt-buller/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/mount-buller-vic/snow-pony-mt-buller/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16605343","has_table_booking":0,"events_url":"https://www.zomato.com/mount-buller-vic/snow-pony-mt-buller/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16607393},"apikey":"9d2944162894f32711911d556083025a","id":"16607393","name":"Swiss Mountain Hotel Restaurant","url":"https://www.zomato.com/blampied-vic/swiss-mountain-hotel-restaurant-blampied?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"3454 Midland Hwy","locality":"Blampied","city":"Blampied","city_id":1562,"latitude":"-37.3673726000","longitude":"144.0420122000","zipcode":"3364","country_id":14,"locality_verbose":"Blampied, Blampied"},"switch_to_order_menu":0,"cuisines":"Bar Food, Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.6","rating_text":"Good","rating_color":"9ACD32","votes":"26"},"photos_url":"https://www.zomato.com/blampied-vic/swiss-mountain-hotel-restaurant-blampied/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/blampied-vic/swiss-mountain-hotel-restaurant-blampied/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16607393","has_table_booking":0,"events_url":"https://www.zomato.com/blampied-vic/swiss-mountain-hotel-restaurant-blampied/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16609052},"apikey":"9d2944162894f32711911d556083025a","id":"16609052","name":"PumpHouse Restaurant","url":"https://www.zomato.com/kununurra-wa/pumphouse-restaurant-kununurra?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Lot 3005, Lakeview Drive","locality":"Kununurra","city":"Kununurra","city_id":1832,"latitude":"-15.7908779000","longitude":"128.7211305000","zipcode":"6743","country_id":14,"locality_verbose":"Kununurra, Kununurra"},"switch_to_order_menu":0,"cuisines":"Seafood, Steak, Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.7","rating_text":"Good","rating_color":"9ACD32","votes":"61"},"photos_url":"https://www.zomato.com/kununurra-wa/pumphouse-restaurant-kununurra/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/kununurra-wa/pumphouse-restaurant-kununurra/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16609052","has_table_booking":0,"events_url":"https://www.zomato.com/kununurra-wa/pumphouse-restaurant-kununurra/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16604402},"apikey":"9d2944162894f32711911d556083025a","id":"16604402","name":"Lake House","url":"https://www.zomato.com/daylesford-vic/lake-house-daylesford?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"4 King St, Daylesford, Daylesford","locality":"Daylesford","city":"Daylesford","city_id":1555,"latitude":"-37.3489770000","longitude":"144.1413590000","zipcode":"03460","country_id":14,"locality_verbose":"Daylesford, Daylesford"},"switch_to_order_menu":0,"cuisines":"Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"4.4","rating_text":"Very Good","rating_color":"5BA829","votes":"835"},"photos_url":"https://www.zomato.com/daylesford-vic/lake-house-daylesford/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/daylesford-vic/lake-house-daylesford/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16604402","has_table_booking":1,"book_url":"https://www.zomato.com/daylesford-vic/lake-house-daylesford/book?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","events_url":"https://www.zomato.com/daylesford-vic/lake-house-daylesford/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16608826},"apikey":"9d2944162894f32711911d556083025a","id":"16608826","name":"Balcony Bar and Restaurant at The Palace Hotel","url":"https://www.zomato.com/kalgoorlie-wa/balcony-bar-and-restaurant-at-the-palace-hotel-kalgoorlie?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"137 Hannan St","locality":"Kalgoorlie","city":"Kalgoorlie","city_id":1872,"latitude":"-30.7520160000","longitude":"121.4673080000","zipcode":"6430","country_id":14,"locality_verbose":"Kalgoorlie, Kalgoorlie"},"switch_to_order_menu":0,"cuisines":"Seafood, Steak, Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.8","rating_text":"Good","rating_color":"9ACD32","votes":"77"},"photos_url":"https://www.zomato.com/kalgoorlie-wa/balcony-bar-and-restaurant-at-the-palace-hotel-kalgoorlie/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/kalgoorlie-wa/balcony-bar-and-restaurant-at-the-palace-hotel-kalgoorlie/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16608826","has_table_booking":0,"events_url":"https://www.zomato.com/kalgoorlie-wa/balcony-bar-and-restaurant-at-the-palace-hotel-kalgoorlie/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16613623},"apikey":"9d2944162894f32711911d556083025a","id":"16613623","name":"Nunu","url":"https://www.zomato.com/palm-cove-qld/nunu-palm-cove?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"1 Veivers Rd","locality":"Palm Cove","city":"Palm Cove","city_id":2430,"latitude":"-16.7499120000","longitude":"145.6703993000","zipcode":"04879","country_id":14,"locality_verbose":"Palm Cove, Palm Cove"},"switch_to_order_menu":0,"cuisines":"Breakfast, Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"4.3","rating_text":"Very Good","rating_color":"5BA829","votes":"265"},"photos_url":"https://www.zomato.com/palm-cove-qld/nunu-palm-cove/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/palm-cove-qld/nunu-palm-cove/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16613623","has_table_booking":0,"events_url":"https://www.zomato.com/palm-cove-qld/nunu-palm-cove/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16608157},"apikey":"9d2944162894f32711911d556083025a","id":"16608157","name":"The Lord Lyndoch","url":"https://www.zomato.com/lyndoch-sa/the-lord-lyndoch-lyndoch?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"23 Barossa Valley Hwy","locality":"Lyndoch","city":"Lyndoch","city_id":1764,"latitude":"-34.6001700000","longitude":"138.8892970000","zipcode":"5351","country_id":14,"locality_verbose":"Lyndoch, Lyndoch"},"switch_to_order_menu":0,"cuisines":"Desserts, International, Seafood","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"https://b.zmtcdn.com/data/res_imagery/16608157_RESTAURANT_9335e149720b840b2668ad437aff6386_c.jpg?fit=around%7C200%3A150&crop=200%3A150%3B%2A%2C%2A","user_rating":{"aggregate_rating":"3.8","rating_text":"Good","rating_color":"9ACD32","votes":"70"},"photos_url":"https://www.zomato.com/lyndoch-sa/the-lord-lyndoch-lyndoch/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/lyndoch-sa/the-lord-lyndoch-lyndoch/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"https://b.zmtcdn.com/data/res_imagery/16608157_RESTAURANT_9335e149720b840b2668ad437aff6386_c.jpg","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16608157","has_table_booking":0,"events_url":"https://www.zomato.com/lyndoch-sa/the-lord-lyndoch-lyndoch/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16602141},"apikey":"9d2944162894f32711911d556083025a","id":"16602141","name":"Peewee's at the Point","url":"https://www.zomato.com/east-point-nt-aus-nt/peewees-at-the-point-darwin?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Alec Fong Lim Dr","locality":"East Point","city":"East Point","city_id":1322,"latitude":"-12.4114573000","longitude":"130.8245175000","zipcode":"0820","country_id":14,"locality_verbose":"East Point, East Point"},"switch_to_order_menu":0,"cuisines":"Desserts, Seafood, Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.8","rating_text":"Good","rating_color":"9ACD32","votes":"183"},"photos_url":"https://www.zomato.com/east-point-nt-aus-nt/peewees-at-the-point-darwin/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/east-point-nt-aus-nt/peewees-at-the-point-darwin/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16602141","has_table_booking":0,"events_url":"https://www.zomato.com/east-point-nt-aus-nt/peewees-at-the-point-darwin/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16606986},"apikey":"9d2944162894f32711911d556083025a","id":"16606986","name":"Brae","url":"https://www.zomato.com/birregurra-vic/brae-birregurra?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"4285 Cape Otway Road, Birregurra, Birregurra","locality":"Birregurra","city":"Birregurra","city_id":1708,"latitude":"-38.3481350000","longitude":"143.8054900000","zipcode":"3242","country_id":14,"locality_verbose":"Birregurra, Birregurra"},"switch_to_order_menu":0,"cuisines":"Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"https://b.zmtcdn.com/data/res_imagery/16606986_RESTAURANT_a8d3bec85020a1dffcb4e409d189b29b.jpg?fit=around%7C200%3A150&crop=200%3A150%3B%2A%2C%2A","user_rating":{"aggregate_rating":"4.5","rating_text":"Excellent","rating_color":"3F7E00","votes":"288"},"photos_url":"https://www.zomato.com/birregurra-vic/brae-birregurra/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/birregurra-vic/brae-birregurra/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"https://b.zmtcdn.com/data/res_imagery/16606986_RESTAURANT_a8d3bec85020a1dffcb4e409d189b29b.jpg","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16606986","has_table_booking":0,"events_url":"https://www.zomato.com/birregurra-vic/brae-birregurra/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16605417},"apikey":"9d2944162894f32711911d556083025a","id":"16605417","name":"Zirky's Restaurant","url":"https://www.zomato.com/mount-hotham-vic/zirkys-restaurant-mount-hotham?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Great Alpine Rd","locality":"Mount Hotham","city":"Mount Hotham","city_id":1417,"latitude":"-36.9937700000","longitude":"147.1510400000","zipcode":"3741","country_id":14,"locality_verbose":"Mount Hotham, Mount Hotham"},"switch_to_order_menu":0,"cuisines":"Asian, International","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"2.7","rating_text":"Average","rating_color":"FFBA00","votes":"24"},"photos_url":"https://www.zomato.com/mount-hotham-vic/zirkys-restaurant-mount-hotham/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/mount-hotham-vic/zirkys-restaurant-mount-hotham/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16605417","has_table_booking":0,"events_url":"https://www.zomato.com/mount-hotham-vic/zirkys-restaurant-mount-hotham/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16616255},"apikey":"9d2944162894f32711911d556083025a","id":"16616255","name":"The Paddock Restaurant and Bar","url":"https://www.zomato.com/westcourt-queensland/the-paddock-restaurant-and-bar-westcourt-westcourt?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"312-314 Mulgrave Road, Westcourt","locality":"Westcourt","city":"Westcourt","city_id":2439,"latitude":"-16.9350700000","longitude":"145.7514090000","zipcode":"4870","country_id":14,"locality_verbose":"Westcourt, Westcourt"},"switch_to_order_menu":0,"cuisines":"Steak, Modern Australian, Bar Food","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.3","rating_text":"Average","rating_color":"CDD614","votes":"16"},"photos_url":"https://www.zomato.com/westcourt-queensland/the-paddock-restaurant-and-bar-westcourt-westcourt/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/westcourt-queensland/the-paddock-restaurant-and-bar-westcourt-westcourt/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16616255","has_table_booking":0,"events_url":"https://www.zomato.com/westcourt-queensland/the-paddock-restaurant-and-bar-westcourt-westcourt/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16614468},"apikey":"9d2944162894f32711911d556083025a","id":"16614468","name":"Mariners Seafood Restaurant","url":"https://www.zomato.com/hamilton-island-qld/mariners-seafood-restaurant-hamilton-island?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Front St","locality":"Hamilton Island","city":"Hamilton Island","city_id":2677,"latitude":"-20.3457485801","longitude":"148.9518749714","zipcode":"4803","country_id":14,"locality_verbose":"Hamilton Island, Hamilton Island"},"switch_to_order_menu":0,"cuisines":"Seafood","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.6","rating_text":"Good","rating_color":"9ACD32","votes":"45"},"photos_url":"https://www.zomato.com/hamilton-island-qld/mariners-seafood-restaurant-hamilton-island/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/hamilton-island-qld/mariners-seafood-restaurant-hamilton-island/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16614468","has_table_booking":0,"events_url":"https://www.zomato.com/hamilton-island-qld/mariners-seafood-restaurant-hamilton-island/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16605805},"apikey":"9d2944162894f32711911d556083025a","id":"16605805","name":"The New Spanish Bar and Grill","url":"https://www.zomato.com/mildura-vic/the-new-spanish-bar-and-grill-mildura?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Quality Hotel Mildura Grand, Cnr Langtree Ave & Seventh St,","locality":"Mildura","city":"Mildura","city_id":1504,"latitude":"-34.1837044000","longitude":"142.1645300000","zipcode":"3500","country_id":14,"locality_verbose":"Mildura, Mildura"},"switch_to_order_menu":0,"cuisines":"Steak","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.2","rating_text":"Average","rating_color":"CDD614","votes":"37"},"photos_url":"https://www.zomato.com/mildura-vic/the-new-spanish-bar-and-grill-mildura/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/mildura-vic/the-new-spanish-bar-and-grill-mildura/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16605805","has_table_booking":0,"events_url":"https://www.zomato.com/mildura-vic/the-new-spanish-bar-and-grill-mildura/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16610108},"apikey":"9d2944162894f32711911d556083025a","id":"16610108","name":"Biota Dining","url":"https://www.zomato.com/bowral-nsw/biota-dining-bowral?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"18 Kangaloon Rd","locality":"Bowral","city":"Bowral","city_id":2142,"latitude":"-34.4870630000","longitude":"150.4165770000","zipcode":"2576","country_id":14,"locality_verbose":"Bowral, Bowral"},"switch_to_order_menu":0,"cuisines":"Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"4.3","rating_text":"Very Good","rating_color":"5BA829","votes":"266"},"photos_url":"https://www.zomato.com/bowral-nsw/biota-dining-bowral/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/bowral-nsw/biota-dining-bowral/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16610108","has_table_booking":0,"events_url":"https://www.zomato.com/bowral-nsw/biota-dining-bowral/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16605597},"apikey":"9d2944162894f32711911d556083025a","id":"16605597","name":"Warrenmang Vineyard Restaurant","url":"https://www.zomato.com/moonambel-vic/warrenmang-vineyard-restaurant-moonambel?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"188 Mountain Creek Rd","locality":"Moonambel","city":"Moonambel","city_id":1574,"latitude":"-36.9742330000","longitude":"143.2961090000","zipcode":"3478","country_id":14,"locality_verbose":"Moonambel, Moonambel"},"switch_to_order_menu":0,"cuisines":"Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.5","rating_text":"Good","rating_color":"9ACD32","votes":"28"},"photos_url":"https://www.zomato.com/moonambel-vic/warrenmang-vineyard-restaurant-moonambel/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/moonambel-vic/warrenmang-vineyard-restaurant-moonambel/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16605597","has_table_booking":0,"events_url":"https://www.zomato.com/moonambel-vic/warrenmang-vineyard-restaurant-moonambel/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16611046},"apikey":"9d2944162894f32711911d556083025a","id":"16611046","name":"Whale Restaurant","url":"https://www.zomato.com/narooma-nsw/whale-restaurant-narooma?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"102 Wagonga Street, Narooma","locality":"Narooma","city":"Narooma","city_id":2179,"latitude":"-36.2178020000","longitude":"150.1315520000","zipcode":"2546","country_id":14,"locality_verbose":"Narooma, Narooma"},"switch_to_order_menu":0,"cuisines":"Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.7","rating_text":"Good","rating_color":"9ACD32","votes":"18"},"photos_url":"https://www.zomato.com/narooma-nsw/whale-restaurant-narooma/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/narooma-nsw/whale-restaurant-narooma/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16611046","has_table_booking":0,"events_url":"https://www.zomato.com/narooma-nsw/whale-restaurant-narooma/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16609632},"apikey":"9d2944162894f32711911d556083025a","id":"16609632","name":"Muse Restaurant and Cafe","url":"https://www.zomato.com/pokolbin-nsw/muse-restaurant-and-cafe-pokolbin?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"1 Broke Rd, Pokolbin","locality":"Pokolbin","city":"Pokolbin","city_id":2295,"latitude":"-32.7732660000","longitude":"151.3118130000","zipcode":"2320","country_id":14,"locality_verbose":"Pokolbin, Pokolbin"},"switch_to_order_menu":0,"cuisines":"Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"https://b.zmtcdn.com/data/res_imagery/16609632_CHAIN_f12b54a1fe4f06a7699de74741731a32.jpg?fit=around%7C200%3A150&crop=200%3A150%3B%2A%2C%2A","user_rating":{"aggregate_rating":"4.0","rating_text":"Very Good","rating_color":"5BA829","votes":"252"},"photos_url":"https://www.zomato.com/pokolbin-nsw/muse-restaurant-and-cafe-pokolbin/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/pokolbin-nsw/muse-restaurant-and-cafe-pokolbin/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"https://b.zmtcdn.com/data/res_imagery/16609632_CHAIN_f12b54a1fe4f06a7699de74741731a32.jpg","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16609632","has_table_booking":1,"book_url":"https://www.zomato.com/pokolbin-nsw/muse-restaurant-and-cafe-pokolbin/book?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","events_url":"https://www.zomato.com/pokolbin-nsw/muse-restaurant-and-cafe-pokolbin/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}},{"restaurant":{"R":{"res_id":16605114},"apikey":"9d2944162894f32711911d556083025a","id":"16605114","name":"Pickled Pig","url":"https://www.zomato.com/warrnambool-vic/pickled-pig-warrnambool?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"78 Liebig Street","locality":"Warrnambool","city":"Warrnambool","city_id":1681,"latitude":"-38.3846510000","longitude":"142.4831240000","zipcode":"3280","country_id":14,"locality_verbose":"Warrnambool, Warrnambool"},"switch_to_order_menu":0,"cuisines":"Modern Australian, Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"4.0","rating_text":"Very Good","rating_color":"5BA829","votes":"374"},"photos_url":"https://www.zomato.com/warrnambool-vic/pickled-pig-warrnambool/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/warrnambool-vic/pickled-pig-warrnambool/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16605114","has_table_booking":0,"events_url":"https://www.zomato.com/warrnambool-vic/pickled-pig-warrnambool/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}}]
     */

    private int results_found;
    private int results_start;
    private int results_shown;
    private List<RestaurantsBean> restaurants;


    public int getResults_found() {
        return results_found;
    }

    public void setResults_found(int results_found) {
        this.results_found = results_found;
    }

    public int getResults_start() {
        return results_start;
    }

    public void setResults_start(int results_start) {
        this.results_start = results_start;
    }

    public int getResults_shown() {
        return results_shown;
    }

    public void setResults_shown(int results_shown) {
        this.results_shown = results_shown;
    }

    public List<RestaurantsBean> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantsBean> restaurants) {
        this.restaurants = restaurants;
    }

    public static class RestaurantsBean {
        /**
         * restaurant : {"R":{"res_id":16614000},"apikey":"9d2944162894f32711911d556083025a","id":"16614000","name":"Tha Fish","url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Pier Point Road","locality":"Cairns City","city":"Cairns City","city_id":2435,"latitude":"-16.9202800000","longitude":"145.7802430000","zipcode":"","country_id":14,"locality_verbose":"Cairns City, Cairns City"},"switch_to_order_menu":0,"cuisines":"Seafood, Modern Australian","average_cost_for_two":25000017,"price_range":4,"currency":"$","offers":[],"thumb":"","user_rating":{"aggregate_rating":"3.8","rating_text":"Good","rating_color":"9ACD32","votes":"101"},"photos_url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop","menu_url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop","featured_image":"","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/16614000","has_table_booking":0,"events_url":"https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}
         */

        private RestaurantBean restaurant;


        public RestaurantBean getRestaurant() {
            return restaurant;
        }

        public void setRestaurant(RestaurantBean restaurant) {
            this.restaurant = restaurant;
        }

        public static class RestaurantBean {
            /**
             * R : {"res_id":16614000}
             * apikey : 9d2944162894f32711911d556083025a
             * id : 16614000
             * name : Tha Fish
             * url : https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
             * location : {"address":"Pier Point Road","locality":"Cairns City","city":"Cairns City","city_id":2435,"latitude":"-16.9202800000","longitude":"145.7802430000","zipcode":"","country_id":14,"locality_verbose":"Cairns City, Cairns City"}
             * switch_to_order_menu : 0
             * cuisines : Seafood, Modern Australian
             * average_cost_for_two : 25000017
             * price_range : 4
             * currency : $
             * offers : []
             * thumb :
             * user_rating : {"aggregate_rating":"3.8","rating_text":"Good","rating_color":"9ACD32","votes":"101"}
             * photos_url : https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop
             * menu_url : https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop
             * featured_image :
             * has_online_delivery : 0
             * is_delivering_now : 0
             * deeplink : zomato://restaurant/16614000
             * has_table_booking : 0
             * events_url : https://www.zomato.com/cairns-city-qld/tha-fish-cairns-city/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
             * establishment_types : []
             */

            private RBean R;
            private String apikey;
            private String id;
            private String name;
            private String url;
            private LocationBean location;
            private int switch_to_order_menu;
            private String cuisines;
            private int average_cost_for_two;
            private int price_range;
            private String currency;
            private String thumb;
            private UserRatingBean user_rating;
            private String photos_url;
            private String menu_url;
            private String featured_image;
            private int has_online_delivery;
            private int is_delivering_now;
            private String deeplink;
            private int has_table_booking;
            private String events_url;
            private List<?> offers;
            private List<?> establishment_types;





            public RBean getR() {
                return R;
            }

            public void setR(RBean R) {
                this.R = R;
            }

            public String getApikey() {
                return apikey;
            }

            public void setApikey(String apikey) {
                this.apikey = apikey;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public int getSwitch_to_order_menu() {
                return switch_to_order_menu;
            }

            public void setSwitch_to_order_menu(int switch_to_order_menu) {
                this.switch_to_order_menu = switch_to_order_menu;
            }

            public String getCuisines() {
                return cuisines;
            }

            public void setCuisines(String cuisines) {
                this.cuisines = cuisines;
            }

            public int getAverage_cost_for_two() {
                return average_cost_for_two;
            }

            public void setAverage_cost_for_two(int average_cost_for_two) {
                this.average_cost_for_two = average_cost_for_two;
            }

            public int getPrice_range() {
                return price_range;
            }

            public void setPrice_range(int price_range) {
                this.price_range = price_range;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public UserRatingBean getUser_rating() {
                return user_rating;
            }

            public void setUser_rating(UserRatingBean user_rating) {
                this.user_rating = user_rating;
            }

            public String getPhotos_url() {
                return photos_url;
            }

            public void setPhotos_url(String photos_url) {
                this.photos_url = photos_url;
            }

            public String getMenu_url() {
                return menu_url;
            }

            public void setMenu_url(String menu_url) {
                this.menu_url = menu_url;
            }

            public String getFeatured_image() {
                return featured_image;
            }

            public void setFeatured_image(String featured_image) {
                this.featured_image = featured_image;
            }

            public int getHas_online_delivery() {
                return has_online_delivery;
            }

            public void setHas_online_delivery(int has_online_delivery) {
                this.has_online_delivery = has_online_delivery;
            }

            public int getIs_delivering_now() {
                return is_delivering_now;
            }

            public void setIs_delivering_now(int is_delivering_now) {
                this.is_delivering_now = is_delivering_now;
            }

            public String getDeeplink() {
                return deeplink;
            }

            public void setDeeplink(String deeplink) {
                this.deeplink = deeplink;
            }

            public int getHas_table_booking() {
                return has_table_booking;
            }

            public void setHas_table_booking(int has_table_booking) {
                this.has_table_booking = has_table_booking;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public List<?> getOffers() {
                return offers;
            }

            public void setOffers(List<?> offers) {
                this.offers = offers;
            }

            public List<?> getEstablishment_types() {
                return establishment_types;
            }

            public void setEstablishment_types(List<?> establishment_types) {
                this.establishment_types = establishment_types;
            }

            public static class RBean {
                /**
                 * res_id : 16614000
                 */

                private int res_id;



                public int getRes_id() {
                    return res_id;
                }

                public void setRes_id(int res_id) {
                    this.res_id = res_id;
                }
            }

            public static class LocationBean {
                /**
                 * address : Pier Point Road
                 * locality : Cairns City
                 * city : Cairns City
                 * city_id : 2435
                 * latitude : -16.9202800000
                 * longitude : 145.7802430000
                 * zipcode :
                 * country_id : 14
                 * locality_verbose : Cairns City, Cairns City
                 */

                private String address;
                private String locality;
                private String city;
                private int city_id;
                private String latitude;
                private String longitude;
                private String zipcode;
                private int country_id;
                private String locality_verbose;


                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getLocality() {
                    return locality;
                }

                public void setLocality(String locality) {
                    this.locality = locality;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public int getCity_id() {
                    return city_id;
                }

                public void setCity_id(int city_id) {
                    this.city_id = city_id;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getZipcode() {
                    return zipcode;
                }

                public void setZipcode(String zipcode) {
                    this.zipcode = zipcode;
                }

                public int getCountry_id() {
                    return country_id;
                }

                public void setCountry_id(int country_id) {
                    this.country_id = country_id;
                }

                public String getLocality_verbose() {
                    return locality_verbose;
                }

                public void setLocality_verbose(String locality_verbose) {
                    this.locality_verbose = locality_verbose;
                }
            }

            public static class UserRatingBean {
                /**
                 * aggregate_rating : 3.8
                 * rating_text : Good
                 * rating_color : 9ACD32
                 * votes : 101
                 */

                private String aggregate_rating;
                private String rating_text;
                private String rating_color;
                private String votes;


                public String getAggregate_rating() {
                    return aggregate_rating;
                }

                public void setAggregate_rating(String aggregate_rating) {
                    this.aggregate_rating = aggregate_rating;
                }

                public String getRating_text() {
                    return rating_text;
                }

                public void setRating_text(String rating_text) {
                    this.rating_text = rating_text;
                }

                public String getRating_color() {
                    return rating_color;
                }

                public void setRating_color(String rating_color) {
                    this.rating_color = rating_color;
                }

                public String getVotes() {
                    return votes;
                }

                public void setVotes(String votes) {
                    this.votes = votes;
                }
            }
        }
    }
}
