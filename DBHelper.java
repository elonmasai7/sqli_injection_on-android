public class DBHelper extends SQLiteOpenHelper {  
    private static final String TABLE_SCHEMA =  
        "CREATE TABLE users (id INTEGER PRIMARY KEY, email TEXT, password TEXT)";  
    public DBHelper(Context context) {  
        super(context, "UserDB", null, 1);  
    }  
    @Override  
    public void onCreate(SQLiteDatabase db) {  
        db.execSQL(TABLE_SCHEMA);  
        db.execSQL("INSERT INTO users (email, password) VALUES ('admin@university.edu', 'Passw0rd!')");  
    }  
}  
