//made_by_Sips_Patidar
//contact = sipspatidar@gmail.com
import java.io.*;
class contact_saving
{
	public static void main(String ar[])
	throws Exception
	{
		//input stream
		FileInputStream fis = new FileInputStream("pastenumberhere.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		String s = " ";
		String gname = " ";
		s = bf.readLine();
		s=s.toString();
		for(int i =0;i<s.length();i++)
				{
					char ch = s.charAt(i);
					int chh = ch;
					if(chh>=65 && chh<=90 || chh>=97 && chh<=122)
					{
							gname = gname+ch;
					}
				}
		System.out.println(gname);

		//out put stream
		FileOutputStream fos = new FileOutputStream(gname+".vcf",true);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw,true);
		pw.println("BEGIN:VCARD");
		pw.println("VERSION:3.0");
		pw.println("N:"+s);
		pw.println("FN:"+s);
		s = " ";
		while(s!=null)
		{
			s = bf.readLine();
			if(s!=null)
			{
				pw.println("TEL;CELL:"+s);
			}
		}
		pw.println("END:VCARD");
	
		
	}
}

//use_only_for_educational_purpose
//Thank_You_:)