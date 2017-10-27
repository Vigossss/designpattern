package composite;


public abstract class File implements IFile{
	private String name;
	
	public File(String name){
		this.name = name;
	}
	
	@Override
	public void display() {
		System.out.println("文件名：" + name);
	}
}
