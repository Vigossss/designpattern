package composite;

import java.util.List;

/**
 * 组合模式
 * 构造型设计模式
 * 
 * 通过递归手段来构造树形的对象结构
 * 并通过一个对象来访问整个树
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IFile file = new NormalFile("1.txt");
		IFile folder = new Folder("C:\\myNote");
		folder.add(file);
		
		IFile file2 = new NormalFile("2.txt");
		IFile folder2 = new Folder("C:\\myNote\\monday");
		folder2.add(file2);
		
		folder.add(folder2);
		/*folder.display();
		for(IFile f : folder.getChilds()){
			f.display();
		}*/
		displayTree(folder);
	}
	
	static void displayTree(IFile file){
		file.display();
		List<IFile> fis = file.getChilds();
		for(IFile f : fis){
			if(f instanceof NormalFile){
				f.display();
			}else{
				displayTree(f);
			}
		}
	}
}
