package composite;

import java.util.List;

public interface IFile {

	void display();
	boolean add(IFile file);
	boolean remove(IFile file);
	List<IFile> getChilds();
}
