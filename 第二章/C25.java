public class C25 {

	public static void main(String[] args) {
		String sName = "周信静";
        String strHex;//用于存放每个字的Unicode编码
        String  strRes="";  //用于连接各编码，并保存结果
        for(int i = 0; i < sName.length(); i++ )//获得名字中字符的个数
        {
        	char c = sName.charAt(i);   //获得名字中的单个字符；
        	int intAsc =(int)c;  //将字符转成int型
        	if(intAsc > 128)
        	{
        	    strHex = Integer.toHexString(intAsc);  //通过Integer的toHexString方法，将字符转成Unicode编码
        	    strRes += "&#x" + strHex + ";";  //将编码结果连接起来
        	}
        	else
        	{
        		strRes += c;
        	}
        }        
	    System.out.println(strRes);
	}
}
