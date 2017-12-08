package uom.gr.imagecfs.data;

import android.provider.BaseColumns;

public class ImageEntry {


    public static final class ImageTable implements BaseColumns {

        public static final String TABLE_NAME_IMAGE = "Image";

        // the Uri and the key of image.
        public static final String COLUMN_URI = "Uri";
        // Date, stored as long in milliseconds since the epoch
        public static final String COLUMN_DATE = "Date";

        public static final String COLUMN_LABEL_ID = " Label";

        public static final String COLUMN_FACE_ID = " Face";

        public static final String COLUMN_LANDMARK_ID = " Landmark";

        public static final String COLUMN_LOGO_ID = "Logo";

        public static final String COLUMN_TYPE_ID = "Type";

        public static final String COLUMN_TEXT_ID = "Text";

        public static final String COLUMN_SAFE_ID = "Safe_search";

        public static final String COLUMN_WEB_ID = "WEB";

    }

    public static final class LebelTable implements BaseColumns {

        public static final String TABLE_NAME= "Lebel";

        public static final String COLUMN_ID = "ID";

        public static final String COLUMN_SCORE = "Score";

        public static final String COLUMN_DESCRIPTION = "Description";


    }


    public static final class FaceTable implements BaseColumns {

        public static final String TABLE_NAME= "Face";

        // the Uri and the key of image.
        public static final String COLUMN_ID = "ID";
        // Date, stored as long in milliseconds since the epoch
        public static final String COLUMN_ANGER_LIKELIHOOD = "AngerLikelihood";

        public static final String COLUMN_BLURRED_LIKELIHOOD = "BlurredLikelihood";

        public static final String COLUMN_JOY_LIKELIHOOD = "JoyLikelihood";

        public static final String COLUMN_SORROW_LIKELIHOOD = "SorrowLikelihood";

        public static final String COLUMN_SURPRISE_LIKELIHOOD = "SurpriseLikelihood";

        public static final String COLUMN_HEADWEAR_LIKELIHOOD = "HeadwearLikelihood";


    }


    public static final class LogosTable implements BaseColumns {

        public static final String TABLE_NAME= "Logo";

        public static final String COLUMN_ID = "ID";

        public static final String COLUMN_SCORE = "Score";

        public static final String COLUMN_DESCRIPTION = "Description";


    }


    public static final class TextTable implements BaseColumns {

        public static final String TABLE_NAME= "Text";

        public static final String COLUMN_ID = "ID";

        public static final String COLUMN_DESCRIPTION = "Description";


    }



    public static final class SafeTable implements BaseColumns {

        public static final String TABLE_NAME= "Safe";

        public static final String COLUMN_ID = "ID";

        public static final String COLUMN_ADULT = "Adult";

        public static final String COLUMN_MEDICAL= "Medical";

        public static final String COLUMN_SPOOF = "Spoof";

        public static final String COLUMN_VIOLENCE= "Violence";


    }

}