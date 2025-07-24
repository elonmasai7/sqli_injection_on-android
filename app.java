String sql = "SELECT * FROM users WHERE email = ?";  
SQLiteStatement stmt = db.compileStatement(sql);  
stmt.bindString(1, email); // Input safely handled  
