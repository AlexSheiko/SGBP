package aleksey.sheyko.sgbp.helpers;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String CATEGORY_FOOD = "Food & drinks";
    public static final String CATEGORY_AUTO = "Auto services";
    public static final String CATEGORY_SOUND = "Sound systems";
    public static final String CATEGORY_BODY_CARE = "Body care";
    public static final String CATEGORY_HOTELS = "Hotels";

    public Map<String, String> categories;

    public Constants() {
        categories = new HashMap<>();
        categories.put("0", Constants.CATEGORY_FOOD);
        categories.put("1", Constants.CATEGORY_AUTO);
        categories.put("2", Constants.CATEGORY_SOUND);
        categories.put("3", Constants.CATEGORY_BODY_CARE);
        categories.put("4", Constants.CATEGORY_HOTELS);
    }
}
