
import java.util.Arrays;
public class Questions {
	
		public String[] getAns() {
			return ans;
		}
		public void setAns(String[] ans) {
			this.ans = ans;
		}
		public Questions(String que, String[] ans) {
			super();
			this.que = que;
			this.ans = ans;
		}
		private String que ;
		 String ans [] = new String[5];
		public String getQue() {
			return que;
		}
		public void setQue(String que) {
			this.que = que;
		}
		
		@Override
		public String toString() {
			return "Questions [que=" + que + ", ans=" + Arrays.toString(ans) + "]";
		}
}
