package models.genericos;
public class Caja<T> {
    private T objeto;

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener(T objeto) {
        return objeto;
    }

    
}
