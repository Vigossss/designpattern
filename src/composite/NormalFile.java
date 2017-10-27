package composite;

import java.util.List;

public class NormalFile extends File{

	public NormalFile(String name) {
		super(name);
	}

	@Override
	public boolean add(IFile file) {
		return false;
	}

	@Override
	public boolean remove(IFile file) {
		return false;
	}

	@Override
	public List<IFile> getChilds() {
		return null;
	}


}
