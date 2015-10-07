import javax.swing.JOptionPane;

public class Assignment333 {
	public enum AccountType {
		Admin, Student, Staff,
	};

	/**
	 * Author, Karl Lyttek
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AccountType[] choices = { AccountType.Admin, AccountType.Staff,
				AccountType.Student };
		String TrueUser, TruePassword, password, TrueUserPass, user, CreatedAccount;
		TrueUser = ("name");
		int Legitimacy = (3), Test = (4);
		TruePassword = ("password");
		TrueUserPass = (TrueUser + TruePassword);
		TrueUserPass.equals(AccountType.Admin);
		int limit = 3, x = 0;
		user = JOptionPane.showInputDialog("Input your Username");
		while (user != TrueUser && (x < (limit)) && Legitimacy != Test) {
			if (user.equals(TrueUser)) {
				password = JOptionPane.showInputDialog("Input your password");
				if (password.equals(TruePassword)) {
					CreatedAccount = (user + password);
					// created account can equal any number of accounts, inputed
					// username and inputed password
					AccountType select = (AccountType) JOptionPane
							.showInputDialog(null, "select your account.",
									"Account Type",
									JOptionPane.INFORMATION_MESSAGE, null,
									choices, choices[0]);
					while (Legitimacy != Test) {
						while (select != null) {
							if (CreatedAccount.equals(TrueUserPass)) {
								switch (select) {
								case Admin:

									break;
								case Student:

									break;
								case Staff:
									;
									break;
								default:
								}
								if (select.equals(AccountType.Admin)) {
									JOptionPane
											.showMessageDialog(null,
													"Welcome Admin! You can update and read files.");
									Legitimacy = (Legitimacy + 1);
								} else {
									while (select.equals(AccountType.Student)
											|| select.equals(AccountType.Staff)) {
										AccountType selection = (AccountType) JOptionPane
												.showInputDialog(
														null,
														"select your account.",
														"Account Type",
														JOptionPane.INFORMATION_MESSAGE,
														null, choices,
														choices[0]);
										switch (selection) {
										case Admin:
											break;
										case Student:
											break;
										case Staff:
											break;
										default:
										}
										if (selection.equals(AccountType.Admin)) {
											JOptionPane
													.showMessageDialog(null,
															"Welcome Admin! You can update and read files.");
											Legitimacy = (Legitimacy + 1);
											break;
										}
									}
								}
							}
							break;
						}
					}
				} else if (password != TruePassword) {
					JOptionPane.showMessageDialog(null,
							"Incorrect password, please Input your password");
					x = (x + 1);
				} else {
					break;
				}
			} else if (user != TrueUser) {
				JOptionPane.showMessageDialog(null, "Invalid Username");
				x = (x + 1);
				user = JOptionPane.showInputDialog("Input your Username");
			} else {
				break;
			}
		}
		while (x >= limit) {
			JOptionPane
					.showMessageDialog(
							null,
							"You have been locked out of your account due to too many attempts to log in, please contact the administrator");
			break;
			// The above is an unbreakable loop causing the user to have to
			// restart the program
		}
	}
}

