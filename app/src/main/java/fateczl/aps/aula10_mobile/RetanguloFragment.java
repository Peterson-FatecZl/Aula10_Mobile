package fateczl.aps.aula10_mobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fateczl.aps.aula10_mobile.controller.RetanguloController;
import fateczl.aps.aula10_mobile.model.Retangulo;

public class RetanguloFragment extends Fragment {

    private View view;
    private TextView tvAlturaRetangulo;
    private EditText etAlturaRetangulo;
    private TextView tvBaseRetangulo;
    private EditText etBaseRetangulo;
    private Button btnCalcularAreaRetangulo;
    private Button btnCalcularPerimetroRetangulo;
    private TextView tvResultadoRetangulo;
    private Retangulo retangulo;
    private RetanguloController retanguloController;

    public RetanguloFragment() {
        super();
        retangulo = new Retangulo();
        retanguloController = new RetanguloController();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        tvAlturaRetangulo = view.findViewById(R.id.tvAlturaRetangulo);
        etAlturaRetangulo = view.findViewById(R.id.etAlturaRetangulo);
        tvBaseRetangulo = view.findViewById(R.id.tvBaseRetangulo);
        etBaseRetangulo = view.findViewById(R.id.etBaseRetangulo);

        btnCalcularAreaRetangulo = view.findViewById(R.id.btnCalcularAreaRetangulo);
        btnCalcularPerimetroRetangulo = view.findViewById(R.id.btnCalcularPerimetroRetangulo);

        tvResultadoRetangulo = view.findViewById(R.id.tvResultadoRetangulo);

        btnCalcularAreaRetangulo.setOnClickListener(click -> calculaArea());
        btnCalcularPerimetroRetangulo.setOnClickListener(click -> calculaPerimetro());
        return view;
    }

    private void calculaArea() {

        retangulo.setAltura(Float.parseFloat(etAlturaRetangulo.getText().toString()));
        retangulo.setBase(Float.parseFloat(etBaseRetangulo.getText().toString()));

        float area = retanguloController.calcularArea(retangulo);
        String res = ("A área do Retangulo é: " + area);
        tvResultadoRetangulo.setText(res);
        limpaCampos();
    }

    private void calculaPerimetro() {
        float perimetro = retanguloController.calcularPerimetro(retangulo);
        String res = ("O perímetro do Retangulo é: " + perimetro);
        tvResultadoRetangulo.setText(res);
        limpaCampos();
    }

    private void limpaCampos() {
        etBaseRetangulo.setText("");
        etAlturaRetangulo.setText("");
    }

}