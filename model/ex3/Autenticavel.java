package model.ex3;

public interface Autenticavel {
    public boolean login(String usuario, String senha);
    public void logout();
}