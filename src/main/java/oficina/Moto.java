package oficina;

public class Moto implements Cloneable{

    private String marca;
    private String modelo;
    private String placa;
    private String KM;
    private Proprietario proprietario;


    public Moto(String marca, String modelo, String placa, String KM, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.KM = KM;
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getKM() {
        return KM;
    }

    public void setKM(String KM) {
        this.KM = KM;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", KM='" + KM + '\'' +
                ", proprietario=" + proprietario +
                '}';
    }

    @Override
    public Moto clone() throws CloneNotSupportedException{

        Moto motoClone = (Moto) super.clone();
        motoClone.proprietario = (Proprietario) motoClone.proprietario.clone();

        return motoClone;
    }
}
