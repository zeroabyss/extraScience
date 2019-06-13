package com.extra.sciencelaboratory;

import android.content.Context;

public class Constants {
    public static final int type_CL2 = 1;
    public static final int type_CO2 = 2;
    public static final int type_C6H6 = 3;

    public static String getTitleByType(Context context,int type) {
        switch (type) {
            case Constants.type_CL2:
                return context.getString(R.string.main_item_1);
            case Constants.type_CO2:
                return context.getString(R.string.main_item_2);
            case Constants.type_C6H6:
                return context.getString(R.string.main_item_3);
        }
        return null;
    }
}
