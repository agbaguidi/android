package ng.prk.prkngandroid;

import android.os.Build;

import com.mapbox.mapboxsdk.geometry.LatLng;

public class Const {

    public static final String DATABASE_NAME = "prkng.db";
    public static final String APP_PREFS_NAME = "prkngPrefs";
    public static final int UNKNOWN_VALUE = -1;

    public interface UiConfig {
        double DEFAULT_ZOOM = 15.0d;
        double SPOTS_MIN_ZOOM = 15.0d;
        double LOTS_MIN_ZOOM = 14.0d;
        double CARSHARE_VEHICLES_MIN_ZOOM = 13.0d;
        double SMALL_BUTTONS_ZOOM = 17.0d;
        double BIG_BUTTONS_ZOOM = 18.0d;
        double MY_LOCATION_ZOOM = 17.0d;
        double MIN_UPDATE_DISTACE = 50.0d; // Metres
        double MONTREAL_NATURAL_NORTH_ROTATION = -34.0d;
        LatLng MONTREAL_LAT_LNG = new LatLng(45.5016889d, -73.567256d);
        float LOT_INFO_ATTRS_OPACITY = 0.4f;
    }

    public interface MapSections {
        int _COUNT = 4;
        int OFF_STREET = 0;
        int ON_STREET = 1;
        int CARSHARE_SPOTS = 2;
        int CARSHARE_VEHICLES = 3;
    }

    public interface TutorialSections {
        int _COUNT = 5;
        int ONE = 0;
        int TWO = 1;
        int THREE = 2;
        int FOUR = 3;
        int LAST = 4;
    }

    public interface ApiArgs {
        String API_KEY = "X-API-KEY";
        String LATITUDE = "latitude";
        String LONGITUDE = "longitude";
        String GEO_LAT = "lat";
        String GEO_LNG = "long";
        String EVENT = "event";
        String QUERY = "query";
        String RADIUS = "radius";
        String PERMITS = "permit";
        String CARSHARE_COMPANIES = "company";
        String LIMIT = "limit";
        String CITY = "city";
        String PARTNER_NAME = "partner_name";
        String ACCESSIBLE = "handicap";
        String STREET_VIEW = "street_view";
        String USER_ID = "user_id";
        String LOT_ID = "lot_id";
        String SPOT_ID = "slot_id";
        String CHECKIN_ID = "id";
        String USE_FILTER = "filter";
        String LANG = "lang";
        String DEVICE_TYPE = "device_type";
        String DEVICE_ID = "device_id";
        String IMAGE_TYPE = "image_type";
        String FILE_NAME = "file_name";
        String OAUTH_TOKEN = "access_token";
        String PASSWORD = "password";
        String OAUTH_TYPE = "type";
        String EMAIL = "email";
        String NAME = "name";
        String GENDER = "gender";
        String BIRTH_YEAR = "birthyear";
        String IMAGE_URL = "image_url";
        String NOTES = "notes";
        String USE_CARSHARE = "carsharing";
        String USE_COMPACT = "compact";
        String CHECKIN_TIMESTAMP = "checkin";
        String CHECKIN_START_TIME = "checkin_time";
        String CHECKIN_END_TIME = "checkout_time";
        String DURATION = "duration";
    }

    public interface ApiValues {
        String OAUTH_TYPE_FACEBOOK = "facebook";
        String OAUTH_TYPE_GOOGLEPLUS = "google";
        int DEFAULT_RADIUS = 300; // Radius search in meters
        float DEFAULT_DURATION = 0.5f; // Desired Parking time in hours
        String SPOT_TYPE_PAID = "paid";
        String SPOT_TYPE_PERMIT = "permit";
        String CAR_TYPE_ELECTRIC = "electric";
        String CARSHARE_COMPANY_CAR2GO = "car2go";
        String CARSHARE_COMPANY_COMMUNAUTO = "communauto";
        String CARSHARE_COMPANY_AUTOMOBILE = "auto-mobile";
        String CARSHARE_COMPANY_ZIPCAR = "zipcar";
        // Following are ISO days-of-week
        String AGENDA_DAY_MONDAY = "1";
        String AGENDA_DAY_TUESDAY = "2";
        String AGENDA_DAY_WEDNESDAY = "3";
        String AGENDA_DAY_THURSDAY = "4";
        String AGENDA_DAY_FRIDAY = "5";
        String AGENDA_DAY_SATURDAY = "6";
        String AGENDA_DAY_SUNDAY = "7";
        String DEVICE_TYPE_ANDROID = "android";
    }

    public interface ApiPaths {
        // String BASE_URL = BuildConfig.API_BASE_URL; // "https://{api|test}.prk.ng/v1/"

        String POST_ANALYTICS_EVENT = "analytics/event";
        String POST_ANALYTICS_SEARCH = "analytics/search";
        String GET_AREAS = "areas";
        String GET_CARSHARE_LOTS = "carshare_lots";
        String GET_CARSHARE_VEHICLES = "carshares";
        String GET_CHECKINS = "checkins";
        String POST_CHECKINS = "checkins";
        String DELETE_CHECKIN = "checkins/{" + ApiArgs.CHECKIN_ID + "}";
        String GET_CITIES = "cities";
        String POST_HELLO = "hello";
        String POST_IMAGES = "images";
        String POST_LOGIN = "login";
        //        String POST_PASSWD_CHANGE = "login/changepass";
        String POST_REGISTER = "login/register";
        String POST_PASSWD_RESET = "login/resetpass";
        String GET_LOTS = "lots";
        String GET_LOT = "lots/{" + ApiArgs.LOT_ID + "}";
        String POST_REPORT = "reports";
        String GET_SPOTS = "slots";
        String GET_SPOT = "slots/{" + ApiArgs.SPOT_ID + "}";
        String GET_USER_PROFILE = "user/profile";
        String PUT_USER_PROFILE = "user/profile";
    }

    public interface FragmentTags {
        String MAP = "f_map";
        String ABOUT = "f_about";
        String SETTINGS = "f_settings";
    }

    public interface RequestCodes {
        int PERMISSION_ACCESS_LOCATION = 10;
        int PERMISSION_ACCESS_FINE_LOCATION = 20;
        int PERMISSION_ACCESS_COARSE_LOCATION = 30;
        int ONBOARDING = 40;
        int AUTH_LOGIN = 50;
        int AUTH_LOGIN_GOOGLE = 60;
        int AUTH_LOGIN_GOOGLE_RESOLVE = 61;
        int AUTH_LOGIN_EMAIL = AUTH_LOGIN;
        int AUTH_LOGIN_FACEBOOK = 64206; // 0xface
        int NOTIFY_CHECKIN = 100; // 0xface
    }

    public interface BundleKeys {
        String IS_INITIAL_ONBOARDING = "onboarding_skip_login";
        String PAGE = "page";
        String URL = "url";
        String EMAIL = "email";
        String LATITUDE = "latitude";
        String LONGITUDE = "longitude";
        String ZOOM = "zoom";
    }

    /**
     * The agenda's different parking restriction types.
     */
    public interface ParkingRestrType {
        int NONE = 0;
        int ALL_TIMES = 1;
        int TIME_MAX = 2;
        int PAID = 3;
        int TIME_MAX_PAID = 4;
    }

    /**
     * Renaming Spot's restrictions for Lot's state
     */
    public interface BusinnessHourType {
        int FREE = ParkingRestrType.NONE; // 0
        int CLOSED = ParkingRestrType.ALL_TIMES; // 1
        int OPEN = ParkingRestrType.PAID; // 3
    }

    public static interface TypeFaces {
        final int _COUNT = 3;
        final String REGULAR = "fonts/intro_regular.ttf";
        final String BOOK = "fonts/intro_book.ttf";
        final String LIGHT = "fonts/intro_light.ttf";
    }

    public interface PrefsNames {
        String IS_ONBOARDING = "p_is_onboarding";
        // Authentication
        String AUTH_API_KEY = "p_api_key";
        String AUTH_USER_NAME = "p_auth_name";
        String AUTH_USER_EMAIL = "p_auth_email";
        String AUTH_USER_PICTURE = "p_auth_picture";
        // Checkin
        String CHECKIN_ID = "p_checkin_id";
        String CHECKIN_ADDRESS = "p_checkin_address";
        String CHECKIN_START_AT = "p_checkin_start_at";
        String CHECKIN_END_AT = "p_checkin_end_at";
        String CHECKIN_SMART_REMINDER = "p_checkin_smart_reminder";
        String CHECKIN_LAT = "p_checkin_lat";
        String CHECKIN_LNG = "p_checkin_lng";
        // PreferenceScreens
        String TOGGLE_LOGIN = "prefs_toggle_login";
        String CITY = "prefs_city";
        String ONBOARDING = "prefs_onboarding";
        String TERMS = "prefs_terms";
        String FAQ = "prefs_faq";
    }

    public interface PrefsValues {
        String CITY_MONTREAL = "montreal";
        String CITY_NEW_YORK = "new_york";
        String CITY_QUEBEC = "quebec";
        String CITY_SEATTLE = "seattle";
    }

    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static final boolean SUPPORTS_M = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    public static final boolean SUPPORTS_LOLLIPOP_MR1 = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1;
    public static final boolean SUPPORTS_LOLLIPOP = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    public static final boolean SUPPORTS_KITKAT = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    public static final boolean SUPPORTS_JELLY_BEAN_MR2 = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2;
    public static final boolean SUPPORTS_JELLY_BEAN_MR1 = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    public static final boolean SUPPORTS_JELLY_BEAN = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
}
