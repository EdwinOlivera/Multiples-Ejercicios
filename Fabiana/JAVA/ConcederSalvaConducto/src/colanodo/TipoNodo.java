
package colanodo;

/**
 * @author Ricardo Rivera
 */
public class TipoNodo {

    private TipoInfo info;
    private TipoNodo sig;

    public TipoNodo() {
        this.info = null;
        this.sig = null;
    }

    public TipoInfo getInfo() {
        return info;
    }

    public void setInfo(TipoInfo info) {
        this.info = info;
    }

    public TipoNodo getSig() {
        return sig;
    }

    public void setSig(TipoNodo sig) {
        this.sig = sig;
    }

}
