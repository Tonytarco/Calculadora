/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.Toolkit;
/**
 *
 * @author Usuario
 */
public class Form1 extends JFrame implements ActionListener{
private JLabel label1;    
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;
  private JButton boton1; 
  private JButton boton2; 
  private JButton boton3; 
  private JButton boton4; 
  private JButton boton5; 
  private JButton boton6; 
  private JButton boton7; 
  private JButton boton8; 
  private JButton boton9; 
  private JButton boton10; 
  private JButton boton11; 
  private JButton boton12; 
  private JButton boton13; 
  private JButton boton14; 
  private JButton boton15; 
  private JButton boton16; 
  private JButton boton17; 
  private JButton boton18; 
  private JButton boton19; 
  private JButton boton20; 
  private JTextField textfield1;
  ImageIcon iconobtnmult = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\multiplicar.png");
  ImageIcon iconobtndivi = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\dividir.png");
  ImageIcon iconobtnrest = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\restar.png");
  ImageIcon iconobtnsuma = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\sumar.png");
  ImageIcon iconobtncalc = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\calcular.png");
  ImageIcon iconobtnback = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\backspace.png");
  ImageIcon iconobtnmasm = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\masmenos.png");
  
  JPanel panel1;
  Font font_header = new Font("Agency FB", Font.BOLD, 24);
  Font font_footer = new Font("Arial",Font.PLAIN,11);
  Font font_esp = new Font("Arial",Font.PLAIN,15);
  Font font_result = new Font("Aaron's Hand",Font.BOLD,36);
  Font font_result_16char = new Font("Aaron's Hand",Font.BOLD,34);
  Font font_result_17char = new Font("Aaron's Hand",Font.BOLD,31);
  Font font_result_18char = new Font("Aaron's Hand",Font.BOLD,29);
  Font font_result_19char = new Font("Aaron's Hand",Font.BOLD,27);
  Font font_result_20char = new Font("Aaron's Hand",Font.BOLD,26);
  Font font_result_21char = new Font("Aaron's Hand",Font.BOLD,25);
  Font font_result_22char = new Font("Aaron's Hand",Font.BOLD,24);
  Font font_result_23char = new Font("Aaron's Hand",Font.BOLD,23);
  Font font_result_24char = new Font("Aaron's Hand",Font.BOLD,22);
  Font font_result_25char = new Font("Aaron's Hand",Font.BOLD,21);
  Font font_result_26char = new Font("Aaron's Hand",Font.BOLD,20);
  Font font_result_27char = new Font("Aaron's Hand",Font.BOLD,19);
  Font font_result_28char = new Font("Aaron's Hand",Font.BOLD,18);
  Font font_btnIcon = new Font("Arial", Font.PLAIN, 22);
  boolean puede_operar = false;
  boolean acarreo_digitos = false;
  String div_zero = "";
    /**
     * Creates new form Form1
     */
  public Form1() {
  setLayout(null);
  setTitle("Calculadora");
 // setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagenes/LogoSoftt.jpg")));
  setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Calculadora\\src\\main\\resources\\imagenes\\LogoSoftt.jpg"));
  panel1 = new JPanel();
  panel1.setBounds(1,460,300,50);
  add(panel1);       
  label1 = new JLabel("Estandar");
  label1.setBounds(40,2,100,50);
  label1.setFont(font_header);
  add(label1);   
  label2 = new JLabel("Copyright 2022 Desarrollado Por Ing. Tony Tarco");
  label2.setBounds(2,480,300,50);
  label2.setFont(font_footer);
  panel1.add(label2);
  label3 = new JLabel("");
  label3.setBounds(285,40,100,50);
  label3.setFont(font_esp);
  label3.setForeground(new Color(121, 117, 117));
  add(label3);
  label4 = new JLabel("0");
  add(label4);

  boton1 = new JButton("7");
  boton1.setBounds(2,230,75,55);
  boton1.setBackground(new Color(247, 245, 245));
  boton1.setFont(font_esp);
  add(boton1);
  boton2 = new JButton("8");
  boton2.setBounds(79,230,75,55);
  boton2.setBackground(new Color(247, 245, 245));
  boton2.setFont(font_esp);
  add(boton2);
  boton3 = new JButton("9");
  boton3.setBounds(156,230,75,55);
  boton3.setBackground(new Color(247, 245, 245));
  boton3.setFont(font_esp);
  add(boton3);
  boton4 = new JButton(new ImageIcon(""));
  boton4.setBounds(233,230,75,55);
  boton4.setBackground(new Color(223, 223, 219));
  boton4.setIcon(iconobtnmult);
  add(boton4);
  boton5 = new JButton("4");
  boton5.setBounds(2,287,75,55);
  boton5.setBackground(new Color(247, 245, 245));
  boton5.setFont(font_esp);
  add(boton5);
  boton6 = new JButton("5");
  boton6.setBounds(79,287,75,55);
  boton6.setBackground(new Color(247, 245, 245));
  boton6.setFont(font_esp);
  add(boton6);
  boton7 = new JButton("6");
  boton7.setBounds(156,287,75,55);
  boton7.setBackground(new Color(247, 245, 245));
  boton7.setFont(font_esp);
  add(boton7);
  boton8 = new JButton("");
  boton8.setBounds(233,287,75,55);
  boton8.setBackground(new Color(223, 223, 219));
  boton8.setIcon(iconobtnrest);
  add(boton8);
  boton9 = new JButton("1");
  boton9.setBounds(2,344,75,55);
  boton9.setBackground(new Color(247, 245, 245));
  boton9.setFont(font_esp);
  add(boton9);
  boton10 = new JButton("2");
  boton10.setBounds(79,344,75,55);
  boton10.setBackground(new Color(247, 245, 245));
  boton10.setFont(font_esp);
  add(boton10);
  boton11 = new JButton("3");
  boton11.setBounds(156,344,75,55);
  boton11.setBackground(new Color(247, 245, 245));
  boton11.setFont(font_esp);
  add(boton11);
  boton12 = new JButton("");
  boton12.setBounds(233,344,75,55);
  boton12.setBackground(new Color(223, 223, 219));
  boton12.setIcon(iconobtnsuma);
  add(boton12);
  boton13 = new JButton("");
  boton13.setBounds(2,401,75,55);
  boton13.setBackground(new Color(247, 245, 245));
  boton13.setIcon(iconobtnmasm);
  add(boton13);
  boton14 = new JButton("0");
  boton14.setBounds(79,401,75,55);
  boton14.setBackground(new Color(247, 245, 245));
  boton14.setFont(font_esp);
  add(boton14);
  boton15 = new JButton(",");
  boton15.setBounds(156,401,75,55);
  boton15.setBackground(new Color(247, 245, 245));
  add(boton15);
  boton16 = new JButton("");
  boton16.setBounds(233,401,75,55);
  boton16.setBackground(new Color(223, 223, 219));
  boton16.setIcon(iconobtncalc);
  add(boton16);
  boton17 = new JButton("CE");
  boton17.setBounds(2,170,75,55);
  boton17.setBackground(new Color(236, 235, 235));
  add(boton17);
  boton18 = new JButton("C");
  boton18.setBounds(79,170,75,55);
  boton18.setBackground(new Color(236, 235, 235));
  add(boton18);
  boton19 = new JButton("");
  boton19.setBounds(156,170,75,55);
  boton19.setBackground(new Color(236, 235, 235));
  boton19.setIcon(iconobtnback);
  add(boton19);
  boton20 = new JButton("");
  boton20.setBounds(233,170,75,55);
  boton20.setBackground(new Color(223, 223, 219));
  boton20.setIcon(iconobtndivi);
  add(boton20);

  textfield1 = new JTextField("0");
  textfield1.setBounds(5,90,300,50);
  textfield1.setHorizontalAlignment(JTextField.RIGHT);
  textfield1.setFont(font_result);
  textfield1.setEditable(false);
  add(textfield1);  

  boton1.addActionListener(this);
  boton2.addActionListener(this);
  boton3.addActionListener(this);
  boton4.addActionListener(this);
  boton5.addActionListener(this);
  boton6.addActionListener(this);
  boton7.addActionListener(this);
  boton8.addActionListener(this);
  boton9.addActionListener(this);
  boton10.addActionListener(this);
  boton11.addActionListener(this);
  boton12.addActionListener(this);
  boton13.addActionListener(this);
  boton14.addActionListener(this);
  boton15.addActionListener(this);
  boton16.addActionListener(this);
  boton17.addActionListener(this);
  boton18.addActionListener(this);
  boton19.addActionListener(this);
  boton20.addActionListener(this);
        initComponents();
    }
  public void actionPerformed(ActionEvent e){
  String cadena=label4.getText();
  String edit=textfield1.getText();
  String tecla = e.getActionCommand();
  int len = edit.length();
  int size = 0;
  int ejecutar=0;

  switch(tecla)   { 
   case "C":
         textfield1.setText("0");
         label4.setText("0");
         label3.setText(""); 
         textfield1.setFont(font_result); 
         break;
   case "CE":
         textfield1.setText("0");
         label4.setText("0");
         textfield1.setFont(font_result); 
         break;

    case "1":case "2":case "3":case "4":case "5":case "6":
    case "7":case "8":case "9":case "0":
  textfield1.setFont(font_result); 
  if(cadena=="0"){
      edit="";
      label4.setText(tecla);
      }  
     if(len <= 17){
       if (div_zero != "")div_zero = "";
       if (len >= 15)textfield1.setFont(font_result_16char);
                   
       if (label3.getText().indexOf("+")!=-1 || label3.getText().indexOf("-")!=-1 || label3.getText().indexOf("x")!=-1 || label3.getText().indexOf("/")!=-1)
           puede_operar = true;
           else puede_operar = false;
       if(len < 17 )textfield1.setText(formatear_numero(edit+tecla)); 
          else if (acarreo_digitos){
                   textfield1.setText(formatear_numero(tecla));
                   acarreo_digitos = false;
                  }
       }
       break;  
     case ",":
       if (edit.indexOf(",")==-1)
          if(cadena=="0"){
            textfield1.setText(cadena+tecla);
            label4.setText("");
            }else if(len < 16)textfield1.setText(edit+tecla);
       break;  
     }

    if (e.getSource() == boton19){
          textfield1.setFont(font_result); 
          if(len > 1){
              edit = edit.substring(0,len-1);
              textfield1.setText(formatear_numero(edit));
             }else {
                   textfield1.setText("0");
                   label4.setText("0");
                   } 
       }else if (e.getSource() == boton13){
                if (cadena=="0" && Double.parseDouble(textfield1.getText())==0){
                   label3.setText("El cero no tiene signo"); 
                   size = alinear_label(label3,305); 
                   label3.setBounds(size,40,285-size,50);
                   }else if (edit.indexOf("-")==-1){
                            if(len < 17) edit = "-" + edit.substring(0);
                            }else if(len <= 17) edit = edit.substring(1);
                         textfield1.setText(formatear_numero(edit));
                    }else if(e.getSource() == boton4)escribir_operacion("x", edit);
                          else if(e.getSource() == boton8)escribir_operacion("-", edit);                        
                               else if(e.getSource() == boton12)escribir_operacion("+", edit);                         
                                    else if(e.getSource() == boton16)escribir_operacion("=", edit);                         
                                         else if(e.getSource() == boton20)escribir_operacion("/", edit);
                                                                            
  }

  String calcular(String operando_in, String operador_in,String operacion){
     double resultado = 0;
     String operando_aux = operando_in;
     String operador_aux = operador_in;
     int pos = 0;
     String salida="";
     
         pos = operando_aux.indexOf(",");
         if(pos!=-1){
            operando_aux = operando_in.substring(0,pos); 
            operando_aux=desformatear(operando_aux);
            operando_aux += "."+operando_in.substring(pos+1);
            }else operando_aux=desformatear(operando_aux);
           
         pos = operador_aux.indexOf(",");
         if(pos!=-1){
            operador_aux = operador_in.substring(0,pos); 
            operador_aux=desformatear(operador_aux)+"."+operador_in.substring(pos+1);
            }else operador_aux=desformatear(operador_aux);     
//     System.out.println(operando_aux+" * "+operador_aux);          
     double operando = Double.parseDouble(operando_aux);
     double operador = Double.parseDouble(operador_aux);
 
  switch(operacion){
   case "+": resultado = operando + operador;
   break;
   case "-": resultado = operando - operador;
   break;
   case "x": resultado = operando * operador;
   break;
   case "/": resultado = operando / operador;
   break;
   } 

  
   if (resultado == Double.POSITIVE_INFINITY || resultado == Double.NEGATIVE_INFINITY)div_zero = "Error:Division entre cero";

       BigDecimal result = new BigDecimal(resultado);
       BigDecimal bd2 = new BigDecimal(9999999999999L); 
       BigDecimal bd3 = new BigDecimal(100000000000000L); 
     //System.out.println(result);    
       double dec_resultado = resultado - parte_entera(resultado);
       if (result.compareTo(bd2) == -1){
           result = result.multiply(bd3); 
           result = result.setScale(0, RoundingMode.HALF_UP);
           result = result.divide(bd3);
           salida = String.valueOf(result);
           pos = salida.indexOf("."); 
           if (pos > -1)salida = formatear_numero(salida.substring(0,pos))+","+salida.substring(pos+1);
               else salida = formatear_numero(salida);
           }else {
                  salida = String.valueOf(resultado);
                  //System.out.println(salida.substring(0,pos));
                  pos = salida.indexOf("."); 
                  if (pos > -1)salida = salida.substring(0,pos)+","+salida.substring(pos+1); 
                 }

     if (salida.length() == 16)textfield1.setFont(font_result_16char);
         else if (salida.length() == 17)textfield1.setFont(font_result_17char);
                  else if (salida.length() == 18)textfield1.setFont(font_result_18char);
                           else if (salida.length() == 19)textfield1.setFont(font_result_19char);
                                    else if (salida.length() == 20)textfield1.setFont(font_result_20char);
                                         else if (salida.length() == 21)textfield1.setFont(font_result_21char);
                                              else if (salida.length() == 22)textfield1.setFont(font_result_22char);
                                                   else if (salida.length() == 23)textfield1.setFont(font_result_23char);
                                                        else if (salida.length() == 24)textfield1.setFont(font_result_24char);
                                                             else if (salida.length() == 25)textfield1.setFont(font_result_25char);
                                                                  else if (salida.length() == 26)textfield1.setFont(font_result_26char);
                                                                      else if (salida.length() == 27)textfield1.setFont(font_result_27char);
                                                                        else if (salida.length() >= 28)textfield1.setFont(font_result_28char);
                                                                           
   return salida;
  }  
    void escribir_operacion(String operacion, String edit){
   int size = 0;
   String txt_lbl = label3.getText();
   int len = txt_lbl.length();
   int len_edit = edit.length();
   String resultado = "";
   int pos = edit.indexOf(",");

    if(pos>-1 && pos == len_edit-1){
       edit = edit.substring(0,len_edit-1);
       textfield1.setText(edit);
       }
    if (operacion == "="){
        if(txt_lbl.indexOf(operacion)==-1 && puede_operar){
                    resultado = calcular(txt_lbl.substring(0,len-2),edit,txt_lbl.substring(len-2,len-1));
                    textfield1.setText(resultado);
                    label3.setText(txt_lbl+edit+" "+operacion+" ");
                    puede_operar = false;
              }
       }else{ 
             if(!puede_operar)label3.setText(edit+" "+operacion+" ");
               else {
                      resultado = calcular(txt_lbl.substring(0,len-2),edit,txt_lbl.substring(len-2,len-1));
                      textfield1.setText(resultado);
                      label3.setText(resultado+" "+operacion+" ");
                      puede_operar = false;
                     }
             if (resultado == "")acarreo_digitos = true;
             }
          if(div_zero != ""){
             label3.setText(div_zero);
             textfield1.setText("0");
             label4.setText("0");
            }
          size = alinear_label(label3,305); 
          label3.setBounds(size,40,305-size,50);
          label4.setText("0");

  } 
   
 int alinear_label(JLabel label,int extremo_x){
   int len = label.getText().length();
   double mult = len*7.2;
   int pos_x = extremo_x - (int) Math.round(mult); 
   return pos_x;
   }

 int parte_entera(double numero){
   
        double parteDecimal = numero % 1; // Lo que sobra de dividir al número entre 1
	double parteEntera = numero - parteDecimal; // Le quitamos la parte decimal usando una resta
        int salida = (int) Math.round(parteEntera);
     return salida;
  }

 String desformatear(String numero){
    String salida="";
    String bloque=numero;
    int index = bloque.indexOf(".");

    if (numero.indexOf(',')==-1)
     while(index != -1){
          bloque = bloque.substring(0,index)+bloque.substring(index+1);
          index = bloque.indexOf(".");
          salida = bloque; 
         }
       if (salida=="")return numero;
          else return salida;
  }

 String formatear_numero(String valor){
   String minus = "";
    if (valor.indexOf("-")!=-1){
       minus="-";
       valor = valor.substring(1);
       }
    String bloque = "";
 
    int total_puntos = 0;
    String numero = desformatear(valor);
    int len = numero.length();
    String salida=numero;
    if (numero.indexOf(',')==-1){
        total_puntos=parte_entera((len-1)/3);
        if (total_puntos > 0){
        for (int i=0;i < total_puntos;i++){
            bloque = "."+salida.substring(len-(3*(i+1)));
            //System.out.println(numero.substring(0,len-(3*(i+1))) +"  "+ bloque);
            salida = numero.substring(0,len-(3*(i+1))) + bloque; 
            }  
         }else salida = numero;
       }
  salida = minus + salida;
  return salida;
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
