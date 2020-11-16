package grp3.ase.ntu.model;

import com.opensymphony.xwork2.ActionSupport;

public class LoginCred extends ActionSupport{

		private String username, password;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		/**
		 * execute() function called upon login button pressed
		 * @return
		 */
		public String execute() {
			int a=grp3.ase.ntu.controller.ValidateLogin.verify(username,password);
			if (a==1){
				//System.out.println("yes");
				return "success";
			}
			//System.out.println("no");
			return "error";
		}
		
}
