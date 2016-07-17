package emailFetch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class getMail {

	public static void main(String[] args) throws IOException, Exception {
		long start = System.currentTimeMillis();
		System.out.println("Getting emails...");
		get("perot email", "passowrd"); //CHANGE AS NEEDED
		System.out.println("Processing emails...");
		write();
		long end = System.currentTimeMillis();
		long totaltime = end - start;
		System.out.println("Finished in " + totaltime + "ms" );
	}
	
	public static void get(String usr, String psd) throws IOException {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
		    Session session = Session.getDefaultInstance(props, null);
		    Store store = session.getStore("imaps");
		    store.connect("imap.gmail.com", usr, psd);
		    Folder inbox = store.getFolder("Inbox");
		    inbox.open(Folder.READ_ONLY);
		    Message messages[] = inbox.getMessages();
		    int cnt = 0;
		    for(Message message:messages) {
		        FileOutputStream os = new FileOutputStream(new File(cnt + "_eml.txt"));
		        message.writeTo(os);
		        os.close();
		        cnt++;
		    }
		} catch (NoSuchProviderException e) {
		    e.printStackTrace();//...
		} catch (MessagingException e) {
		    e.printStackTrace();//...
		}
	}

	@SuppressWarnings("resource")
	public static void write() throws Exception, IOException{
		String fl = "";
		String ma = "";
		String is = "";
		String dt = "";
		List<File> filesInFolder = Files.walk(Paths.get(""))
                .filter(Files::isRegularFile)
                .filter(f -> f.toFile().getName().contains(".txt"))
                .map(Path::toFile)
                .collect(Collectors.toList());
		ArrayList<csv> csv = new ArrayList<csv>();
		csv.add(new csv());
		Scanner kb = new Scanner("");
		for(File f : filesInFolder) {
			kb.close();
			kb = new Scanner(f);
			while(kb.hasNextLine()) {
				String temp = kb.nextLine();
				if(temp.contains("issue")) 
					is = kb.nextLine();
				if(temp.contains("floor"))
					fl = kb.nextLine();
				if(temp.contains("machine"))
					ma = kb.nextLine();
				if(temp.contains("Mon") || temp.contains("Tue") || temp.contains("Wed") || temp.contains("Thu") || temp.contains("Fri") || temp.contains("Sat") || temp.contains("Sun"))
					dt = temp.substring(10, 21).trim();
				if(!ma.equals("") && !is.equals("") && !fl.equals("")) {
					csv.add(new csv(fl, ma, is, dt));
					ma = "";
					fl = "";
					is = "";
					dt = "";
				}
			}
		}
		ArrayList<String> strarr= new ArrayList<String>();
		Exception err = new Exception("close out all _-eml.txt files and the issues.csv");
		for(csv cs : csv) {
			if(!cs.toString().contains("<"))
				strarr.add(cs.toString());
		}
		try {
			Files.write(Paths.get("issues.csv"), strarr);
		}
		catch(IOException e) {
			throw err;
		}
		kb.close();
	}
}
