package pq1;

public class ServiciosAdicionales {
    private String[] servicios;
    private int costoPorServicio;

    public ServiciosAdicionales(String[] servicios, int costoPorServicio) {
        this.servicios = servicios;
        this.costoPorServicio = costoPorServicio;
    }

    public String[] getServicios() {
        return servicios;
    }

    public int getCostoPorServicio() {
        return costoPorServicio;
    }
}
