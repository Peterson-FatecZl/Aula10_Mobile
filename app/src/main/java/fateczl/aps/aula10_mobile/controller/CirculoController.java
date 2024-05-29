package fateczl.aps.aula10_mobile.controller;

import fateczl.aps.aula10_mobile.model.Circulo;

public class CirculoController implements IGeometriaController<Circulo> {
    public CirculoController() {
        super();
    }

    @Override
    public float calcularArea(Circulo circulo) {
        float area = (float) Math.pow(Math.PI * circulo.getRaio(), 2);
        return area;
    }

    @Override
    public float calcularPerimetro(Circulo circulo) {
        float perimetro = (float) (2 * Math.PI * circulo.getRaio());
        return perimetro;
    }
}
