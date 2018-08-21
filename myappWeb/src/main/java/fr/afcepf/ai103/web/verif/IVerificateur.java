package fr.afcepf.ai103.web.verif;

public interface IVerificateur {
    public boolean isPasswordOk(Long numClient,String pwd);
    public boolean motDePasseValide (Integer idUtilisateur, String pwd);
    //...
}
