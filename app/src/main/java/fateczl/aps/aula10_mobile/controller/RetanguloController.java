package fateczl.aps.aula10_mobile.controller;

import fateczl.aps.aula10_mobile.model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo> {

    public RetanguloController() {
        super();
    }

    @Override
    public float calcularArea(Retangulo retangulo) {
        float area = retangulo.getAltura() * retangulo.getBase();
        return area;
    }

    @Override
    public float calcularPerimetro(Retangulo retangulo) {
        float perimetro = (retangulo.getAltura() * 2) + (retangulo.getBase() * 2);
        return perimetro;
    }
}
