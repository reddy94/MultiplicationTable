
public class NestedFor {
	public static String getTable(){
		String result="";
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				result+=i+"x"+j+"="+(i*j)+"\n";
		}
			result+="\n";
	}
	       return result;
	}
public static void main(String[] args){
	System.out.println(getTable());
}
}
