public class Embarcacion {

    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int anioDeFabricacion;
    private double slora;


    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, int anioDeFabricacion, double slora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.slora = slora;

    }
    public int calcularAlquiler(){
        int alquiler = 0;
        if (anioDeFabricacion > 2020) {
            alquiler = valorAdicional + precioBase;

        }else{
            alquiler= precioBase;
            }
            return alquiler;

    }

    public int calcularValorAdicional() {
        int cv = 0;
        if (anioDeFabricacion > 2020) {
            System.out.println("Este modelo es posterior al año 2020, tiene un recargo adicional de: ");
            return this.valorAdicional;
        } else {
            System.out.println("EL modelo  es considerado antiguo, no tiene recargo adicional");
        }
        return this.valorAdicional=0;
    }


    @Override
    public String toString() {
        return "La embarcacion tiene un precio base de: "  + precioBase + ", una slora de: "+slora+"m"+", su año de fabricacion es: "
                +anioDeFabricacion+", y los acompañara el "+capitan;
    };


    }


