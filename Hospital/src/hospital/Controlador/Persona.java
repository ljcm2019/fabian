package hospital.Controlador;

import co.edu.sena.controlador.utilitario.LlenarObjetos;
import co.edu.sena.controlador.utilitario.ExpandirVentanasInternas;
import co.edu.sena.controlador.utilitario.LlenarTabla;
import co.edu.sena.interfaces.CRUD;
import co.edu.sena.interfaces.Instancias;
import co.edu.sena.interfaces.Listas;
import co.edu.sena.modelo.Persona;
import co.edu.sena.vista.PersonaVista;
import static co.edu.sena.vista.principal.Inicio.escritorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class PersonaControlador implements ActionListener, CRUD, Listas, Instancias {

    private PersonaVista Vista;

    public PersonaControlador(final PersonaVista Vista) {
        this.Vista = Vista;
        //Agrego la acción de escucha para cada botón.
        this.Vista.btnActualizar.addActionListener(this);
        this.Vista.btnRegistrar.addActionListener(this);
        this.Vista.btnEliminar.addActionListener(this);
        this.Vista.btnConsultar.addActionListener(this);
        this.Vista.btnGuardar.addActionListener(this);

        //Asigno la actividad que va a desarrollar cada botón.
        this.Vista.btnActualizar.setActionCommand("Actualizar");
        this.Vista.btnEliminar.setActionCommand("Eliminar");
        this.Vista.btnConsultar.setActionCommand("Consultar");
        this.Vista.btnGuardar.setActionCommand("Guardar");
        this.Vista.btnRegistrar.setActionCommand("Registrar");
        this.Vista.lbMasEspecialidad.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                escritorio.add(es);
            }
        });
        this.Vista.lbMasRol.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escritorio.add(r);
            }
        });
        /*
        Expando el tamaño de la ventana interna al maximo posible
         */

        ExpandirVentanasInternas ex = new ExpandirVentanasInternas(Vista);
        rellenarTabla();
        rellenarInfo();
    }

    private void rellenarInfo() {
        Vista.cbxEspecialidad.removeAllItems();
        Vista.cbxRol.removeAllItems();
        for (int i = 0; i < ESPECIALIDADES.size(); i++) {
            Vista.cbxEspecialidad.addItem(ESPECIALIDADES.get(i).getEspecialidad());
        }
        for (int i = 0; i < ROLES.size(); i++) {
            Vista.cbxRol.addItem(ROLES.get(i).getRol());
        }
    }
    
    private void rellenarTabla() {
       
        
        Vista.tablaPersona.setModel(new LlenarTabla().getModeloTabla(PERSONAS));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Actualizar":
                actualizar();
                break;
            case "Eliminar":
                eliminar();
                break;
            case "Consultar":
                consultar();
                break;
            case "Guardar":
                guardar();
                break;
            case "Registrar":
                registrar();
                break;
        }
    }

    @Override
    public void registrar() {
        Persona t = new Persona();
        int n = Integer.parseInt(Vista.txtDocumento.getText());
        t.setDocumento(n);
        t.setPrimerNombre(Vista.txtPNombre.getText());
        t.setSegundoNombre(Vista.txtSNombre.getText());
        t.setPrimerApellido(Vista.txtPApellido.getText());
        t.setSegundoApellido(Vista.txtSApellido.getText());
        long cel=Long.parseLong(Vista.txtCelular.getText());
        t.setCelular(cel);
        t.setClave(Vista.txtPass1.getText());
        LlenarObjetos op=new LlenarObjetos();
        t.setEspecialidad(op.llenarEspecialidadPorEspecialidad(Vista.cbxEspecialidad.getSelectedItem().toString()));
        t.setRol(op.llenarRolPorRol(Vista.cbxRol.getSelectedItem().toString()));
        op=null;
        System.gc();
        PERSONAS.add(t);
        rellenarTabla();
    }

    @Override
    public void actualizar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void consultar() {

    }

    @Override
    public void guardar() {

    }


}
