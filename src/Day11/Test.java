package Day11;

public class Test {
		public boolean getMoney(int money){
				int account=getAccount();
				if (account>=money) {
						account=account=money;
						seveAccount(account);
						return true;
				}
				return false;
		}
		public void seveAccount(int account){
			
		}
		
		public int getAccount(){
			return 50000;
		}
}
