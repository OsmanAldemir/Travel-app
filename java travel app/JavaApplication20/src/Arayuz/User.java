/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arayuz;
public abstract class User implements ILoginable{
    private String username;
    private String password;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getkad() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
   public String getsifre() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public abstract boolean login(String username, String password);
}

