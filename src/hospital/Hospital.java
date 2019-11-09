package hospital;


import hospital.Vista.HospitalV;
import javax.swing.JOptionPane;

public class Hospital {

    public Hospital() {
       JOptionPane.showMessageDialog(null, "Bienvenido usuario"); 
        HospitalV hv=new HospitalV();
        
        hv.setVisible(true);
        

    }

    public static void main(String[] args) {
           Hospital inicio = new Hospital();
    }
}

