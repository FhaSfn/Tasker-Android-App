package sfr.com.tasker.Database;

import android.provider.BaseColumns;

/**
 * Created by sfr.
 */


// this class is for database use. Reference https://developer.android.com/training/basics/data-storage/databases.html
public final class TodoListContract {
    private TodoListContract() {}

    public static class TodoListEntries implements BaseColumns {
        public static final String TABLE_NAME = "TodolistEntries";
        public static final String COLUMN_NAME_CONTENT = "content";
        public static final String COLUMN_NAME_DONE = "done";
        public static final String COLUMN_NAME_REMINDERDATE = "reminderdate";
    }
}
