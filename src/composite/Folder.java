package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File{
	
	private List<IFile> files = new ArrayList<IFile>();

	public Folder(String name) {
		super(name);
	}

	@Override
	public boolean add(IFile file) {
		files.add(file);
		return true;
	}

	@Override
	public boolean remove(IFile file) {
		return files.remove(file);
	}

	@Override
	public List<IFile> getChilds() {
		return files;
	}

}
