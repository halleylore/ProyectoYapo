package com.project.test;

import org.testng.annotations.Test;
import com.project.base.Base;
import com.project.pages.Login;

public class Yapo_Lorena extends Base {
	//WebDriver driver; 	

  @Test
  public void tarea() {
	
	  	Login login = new Login(driver);
	  	login.ingresaUsuario();
		
	  	//Busqueda busqueda = new Busqueda(driver);
	  	//busqueda.buscarRegion();
	  		  


  }
 }
