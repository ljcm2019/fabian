package hospital.Controlador;

import hospital.MedicoL;
import hospital.Vista.Medico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Medicos implements ActionListener{

    private Medico Vista;

    public Medicos(final Medico Vista) {
        this.Vista = Vista;
        //Agrego la acción de escucha para cada botón.
        this.Vista.btnRegistrar.addActionListener(this);

        //Asigno la actividad que va a desarrollar cada botón.
        this.Vista.btnRegistrar.setActionCommand("Registrar");
       
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

    public void registrar() {
        MedicoL t = new MedicoL();
        int d = Integer.parseInt(Vista.txtDocumento.getText());
        t.setDocumento(d);
        t.setNombre(Vista.txtNombre.getText());
        t.setApellido(Vista.txtApellido.getText());
        System.gc();
    

    }


}