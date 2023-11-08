package clases;

 public class Direccion {
     private String zipcode;
     private String calle;
     private String distrito;
     private String provincia;

     public Direccion(String zipcode, String calle, String distrito, String provincia) {
         this.zipcode = zipcode;
         this.calle = calle;
         this.distrito = distrito;
         this.provincia = provincia;
     }

     public String getZipcode() {
         return zipcode;
     }

     public String getCalle() {
         return calle;
     }

     public String getDistrito() {
         return distrito;
     }

     public String getProvincia() {
         return provincia;
     }

     public void setZipcode(String zipcode) {
         this.zipcode = zipcode;
     }

     public void setCalle(String calle) {
         this.calle = calle;
     }

     public void setDistrito(String distrito) {
         this.distrito = distrito;
     }

     public void setProvincia(String provincia) {
         this.provincia = provincia;
     }

}
