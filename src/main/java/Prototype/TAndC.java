package Prototype;

public class TAndC extends PrototypeCapableDocument {
    @Override
    public PrototypeCapableDocument cloneDocument() {

        TAndC tAndC = null;
        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }
    @Override
    public String toString() {
        return "[Prototype.TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
