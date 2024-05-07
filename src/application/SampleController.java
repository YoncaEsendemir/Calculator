package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	
	double islem=0;
	double ilksayi=0;
	double ikincisayi=0;
	String operator;
	String text_sonuc="";

    @FXML
    private Button btn_Par;

    @FXML
    private Button btn_alti;

    @FXML
    private Button btn_bes;

    @FXML
    private Button btn_bir;

    @FXML
    private Button btn_bol;

    @FXML
    private Button btn_carp;

    @FXML
    private Button btn_cikar;

    @FXML
    private Button btn_dokuz;

    @FXML
    private Button btn_dort;

    @FXML
    private Button btn_esit;

    @FXML
    private Button btn_iki;

    @FXML
    private Button btn_sekiz;

    @FXML
    private Button btn_sifir;

    @FXML
    private Button btn_sil;

    @FXML
    private Button btn_ters;

    @FXML
    private Button btn_top;

    @FXML
    private Button btn_uc;

    @FXML
    private Button btn_vir;

    @FXML
    private Button btn_yedi;

    @FXML
    private Button btn_yuzde;

    @FXML
    private TextField txt_islem;
    
    @FXML
    private Label lbl_text;

    @FXML
    void btn_Par_click(ActionEvent event) {
        
    }

    @FXML
    void btn_alti_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
           if((txt_islem.getText().isEmpty())) {
            txt_islem.setText("6");
           }
           else {
        	   txt_islem.setText(text_sonuc+"6");
           }
    }

    @FXML
    void btn_bes_click(ActionEvent event) {
    	
    	text_sonuc=txt_islem.getText();
        if((txt_islem.getText().isEmpty())) {
         txt_islem.setText("5");
        }
        else {
     	   txt_islem.setText(text_sonuc+"5");
        }
    }

    @FXML
    void btn_bir_click(ActionEvent event) {
    	
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("1");
        }
        else {
     	   txt_islem.setText(text_sonuc+"1");
        }
    }

    @FXML
    void btn_bol_click(ActionEvent event) {
        if(txt_islem.getText().isEmpty()) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgi");
    		alert.setContentText("Bu işlem geçersiz");
    	   // Alert kutusunu göster
            alert.showAndWait();   
        }
        else {
        	
       		ilksayi=Double.parseDouble(txt_islem.getText().replace(',','.'));
    	    operator="/";
    	    txt_islem.clear();	
        }
    	
    }

    @FXML
    void btn_carp_click(ActionEvent event) {
           if(txt_islem.getText().isEmpty())
           {
       		Alert alert = new Alert(AlertType.INFORMATION);
       		alert.setTitle("Bilgi");
       		alert.setContentText("Bu işlem geçersiz");
       	   // Alert kutusunu göster
               alert.showAndWait();   
           }
           else {
        	   ilksayi=Double.parseDouble(txt_islem.getText().replace(',','.'));
    	    operator="x";
    	    txt_islem.clear();	
    			
           }
    }

    @FXML
    void btn_cikar_click(ActionEvent event) {
    	if((txt_islem.getText().isEmpty())) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgi");
    		alert.setContentText("Bu işlem geçersiz");
    	   // Alert kutusunu göster
            alert.showAndWait();	
    	}
    	else {
    		/*
    		if(txt_islem.getText().contains("-")) {
    			operator="-";
    			txt_islem.setText(txt_islem.getText()+operator);
    			opekonum=txt_islem.getText().indexOf('-');
    			int i=txt_islem.getText().length();
    			System.out.println(opekonum);
    			System.out.println(ilksayi);
    		}
    		else {
    	    	
    	    	operator="-";
    	        txt_islem.setText(txt_islem.getText()+operator);      
    		}
        */
    		/*
    		
    		if((ilksayi!=0)) {
    			
    			ikincisayi=Double.parseDouble(txt_islem.getText());
    			islem=ilksayi-ikincisayi;
    		    lbl_sonuc=(Double.toString(islem));
    			lbl_text.setText(lbl_sonuc);
    			ilksayi=islem;
    			operator="-"; 
    			System.out.println(ilksayi);
    			System.out.println(ikincisayi);
    			System.out.println(islem);
    		}  */
    		
    		ilksayi=Double.parseDouble(txt_islem.getText().replace(',','.'));
    	    operator="-";
    	    txt_islem.clear();	
    			
 
     }
    }

    @FXML
    void btn_dokuz_click(ActionEvent event) {
    	
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("9");
        }
        else {
     	   txt_islem.setText(text_sonuc+"9");
        }
    }

    @FXML
    void btn_dort_click(ActionEvent event) {
    	
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("4");
        }
        else {
     	   txt_islem.setText(text_sonuc+"4");
      }
    }

    @FXML
    void btn_esit_click(ActionEvent event) {
    	
           if(operator=="-") {
        	   ikincisayi=Double.parseDouble(txt_islem.getText());
        	   islem=ilksayi-ikincisayi;
        	   System.out.println(islem);
        	   txt_islem.setText(Double.toString(islem));
           }
           else if(operator=="+") {
        	   ikincisayi=Double.parseDouble(txt_islem.getText());
        	   islem=ilksayi+ikincisayi;
        	   System.out.println(islem);
        	   txt_islem.setText(Double.toString(islem)); 
        	   
           }
           else if(operator=="x") {
        	   ikincisayi=Double.parseDouble(txt_islem.getText());
        	   islem=ilksayi*ikincisayi;
        	   System.out.println(islem);
        	   txt_islem.setText(Double.toString(islem));
           }
           else if(operator=="/") {
        	   ikincisayi=Double.parseDouble(txt_islem.getText());
        	   islem=ilksayi/ikincisayi;
        	   System.out.println(islem);
        	   txt_islem.setText(Double.toString(islem)); 
           }
           else if(operator=="%") {
        	   ikincisayi=Double.parseDouble(txt_islem.getText());
        	   islem=(ilksayi*ikincisayi)/100;
        	   System.out.println(islem);
        	   txt_islem.setText(Double.toString(islem)); 
           }
    }

    @FXML
    void btn_iki_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("2");
        }
        else {
     	   txt_islem.setText(text_sonuc+"2");
      }
    }

    @FXML
    void btn_sekiz_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("8");
        }
        else {
     	   txt_islem.setText(text_sonuc+"8");
      }
    }

    @FXML
    void btn_sifir_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("0");
        }
        else {
     	   txt_islem.setText(text_sonuc+"0");
      }
    }

    @FXML
    void btn_sil_click(ActionEvent event) {
       	text_sonuc=txt_islem.getText();
       	if(!text_sonuc.isEmpty())
           text_sonuc="";
       	txt_islem.setText(text_sonuc);
           
    }

    @FXML
    void btn_ters_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
        if( !text_sonuc.isEmpty() &&  !text_sonuc.equals("0")) {
        	islem=Double.parseDouble(text_sonuc);
        	if(islem>0) {
        		islem=-islem; //mevcut "islem" değerini negatif yapar
        		text_sonuc= Double.toString(islem);
        		txt_islem.setText(text_sonuc);
        	}
        	else if(islem <0){
        		islem= Math.abs(islem);
        		text_sonuc= Double.toString(islem);
        		txt_islem.setText(text_sonuc);
        	}
        	
        }
    	
    }

    @FXML
    void btn_top_click(ActionEvent event)
    {
        if(txt_islem.getText().isEmpty()) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgi");
    		alert.setContentText("Bu işlem geçersiz");
    	   // Alert kutusunu göster
            alert.showAndWait();   
        }
        else {
        	ilksayi=Double.parseDouble(txt_islem.getText().replace(',','.'));
        	operator="+";
        	  txt_islem.clear();
        }
    }

    @FXML
    void btn_uc_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("3");
        }
        else {
     	   txt_islem.setText(text_sonuc+"3");
      }
    }

    @FXML
    void btn_vir_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
           text_sonuc+=",";
           txt_islem.setText(text_sonuc);
    }

    @FXML
    void btn_yedi_click(ActionEvent event) {
    	text_sonuc=txt_islem.getText();
        if((text_sonuc.isEmpty())) {
         txt_islem.setText("7");
        }
        else {
     	   txt_islem.setText(text_sonuc+"7");
      }
    }

    @FXML
    void btn_yuzde_click(ActionEvent event) {
        if(txt_islem.getText().isEmpty()) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Bilgi");
    		alert.setContentText("Bu işlem geçersiz");
    	   // Alert kutusunu göster
            alert.showAndWait();   
        }
        else {
        	ilksayi=Double.parseDouble(txt_islem.getText().replace(',','.'));
        	operator="%";
        	  txt_islem.clear();
        }

    	
    }

}
