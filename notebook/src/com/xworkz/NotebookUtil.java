package com.xworkz;

import com.xworkz.notebook.Notebook;

public class NotebookUtil {
	
	public static void main(String a[]) {
		
		Notebook n=new Notebook();
		n.setPrice(50.00);
		n.settypeOfNotebook("Ruled notebook");
		System.out.println(n.getPrice()+"\n"+n.gettypeOfNotebook());
	
	}

}
