public class Yate extends Embarcacion implements Validacion{

    private int cantCamarotes;

    public Yate(Capitan capitan, int precioBase, int valorAdicional, int anioDeFabricacion, double slora, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, slora);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public String validar() {
        if (cantCamarotes > 7) {
            return "El yate es de lujo, cuenta con"+ cantCamarotes+" camarotes";
        }
        else{
            return "El yate es estandar, cuenta con "+ cantCamarotes+"camarotes";
        }
    }


}



