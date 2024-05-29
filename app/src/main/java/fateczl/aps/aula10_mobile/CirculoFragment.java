package fateczl.aps.aula10_mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import fateczl.aps.aula10_mobile.controller.CirculoController;
import fateczl.aps.aula10_mobile.model.Circulo;

public class CirculoFragment extends Fragment {

    private View view;
    private TextView tvRaioCirculo;
    private EditText etRaioCirculo;
    private Button btnCalcularAreaCirculo;
    private Button btnCalcularPerimetroCirculo;
    private TextView tvResultadoCirculo;
    private Circulo circulo;
    private CirculoController circuloController;

    public CirculoFragment() {
        super();
        circulo = new Circulo();
        circuloController = new CirculoController();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        tvRaioCirculo = view.findViewById(R.id.tvRaioCirculo);
        etRaioCirculo = view.findViewById(R.id.etRaioCirculo);

        btnCalcularAreaCirculo = view.findViewById(R.id.btnCalcularAreaCirculo);
        btnCalcularPerimetroCirculo = view.findViewById(R.id.btnCalcularPerimetroCirculo);

        tvResultadoCirculo = view.findViewById(R.id.tvResultadoCirculo);

        btnCalcularAreaCirculo.setOnClickListener(click -> calculaArea());
        btnCalcularPerimetroCirculo.setOnClickListener(click -> calculaPerimetro());
        return view;
    }

    private void calculaArea() {
        circulo.setRaio(Float.parseFloat(etRaioCirculo.getText().toString()));
        float area = circuloController.calcularArea(circulo);
        String res = ("A área do Círculo é: "+ area);
        tvResultadoCirculo.setText(res);
        limpaCampos();
    }

    private void calculaPerimetro() {
        circulo.setRaio(Float.parseFloat(etRaioCirculo.getText().toString()));
        float perimetro = circuloController.calcularPerimetro(circulo);
        String res = ("O perímetro do Círculo é: " + perimetro);
        tvResultadoCirculo.setText(res);
        limpaCampos();
    }

    private void limpaCampos() {
        etRaioCirculo.setText("");
    }
}