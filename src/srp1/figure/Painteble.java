package srp1.figure;

public interface Painteble<T extends Shape>{
    void draw(T shape);
}
