public class Velero extends Embarcacion implements Validacion {

    private int cantMastiles;
    public Velero(Capitan capitan, int precioBase, int valorAdicional, int anioDeFabricacion, double slora, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, slora);
        this.cantMastiles = cantMastiles;

    }

    @Override
    public String validar() {
        if (cantMastiles > 4) {
            return "El velero es grande, cuenta con " +cantMastiles+" mastiles.";
        }
        else {
            return "El Velero es pequeño, cuenta con "+cantMastiles+ " mastiles";
        }
        }








}






