public void loginAttempt(View v) {  
    String email = ((EditText)findViewById(R.id.emailInput)).getText().toString();  
    String password = ((EditText)findViewById(R.id.passwordInput)).getText().toString();  
    SQLiteDatabase db = new DBHelper(this).getReadableDatabase();  
    // VULNERABLE: Concatenated input  
    Cursor result = db.rawQuery(  
        "SELECT * FROM users WHERE email='" + email + "' AND password='" + password + "'",  
        null  
    );  
    if (result.moveToFirst())  
        Toast.makeText(this, "Authentication successful", Toast.LENGTH_SHORT).show();  
    else  
        Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();  
}  
