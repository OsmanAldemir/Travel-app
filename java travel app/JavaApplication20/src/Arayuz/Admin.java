/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arayuz;

public class Admin extends User{
    
public Admin(String username, String password) {
        super(username, password);
    }
 @Override
    public String getkad() {
        // Admin sınıfına özgü kullanıcı adı işlemleri
        return super.getkad();
    }

    @Override
    public String getsifre() {
        // Admin sınıfına özgü şifre işlemleri
        return super.getsifre();
    }

    @Override
    public boolean login(String username, String password) {
    return username.equals("a") && password.equals("a");
    }
    


   
    
    
}
