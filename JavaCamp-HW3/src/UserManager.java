
public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName+" "+user.lastName+" eklendi");
	}
	public void del(User user) {
		System.out.println(user.firstName+" "+user.lastName+" silindi");
	}
}
