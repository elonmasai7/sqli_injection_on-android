@Dao  
interface UserDao {  
  @Query("SELECT * FROM users WHERE email = :email")  
  fun getUser(email: String): User // Automatic parameterization  
}  
