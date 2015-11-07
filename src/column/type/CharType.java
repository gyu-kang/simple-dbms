package column.type;

public class CharType extends ColumnType {
    private static final long serialVersionUID = 1L;

    private int size;
    
    public CharType() {
    }
    
    public CharType(int size) {
	this.size = size;
    }

    @Override
    public String toString() {
	return "char(" + size + ")";
    }
}
