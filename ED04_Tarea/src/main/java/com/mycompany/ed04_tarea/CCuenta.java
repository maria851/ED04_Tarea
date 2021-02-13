/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad4;

/**
 *
 * @author maria
 */
public class CCuenta {


    // Propiedades de la Clase Cuenta
  /**
   * 
   */
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /** Constructor sin argumentos 
     */
    public CCuenta ()
    {
    }
    /** Constructor con parametro para iniciar todas las propiedades de la clase
     * 
     * @param string
     * @param string1
     * @param d
     * @param d1
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   /** Metodo para asignar el nombre del titular de la cuenta
     * 
     * @param nom Nombre del titular
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    /** Metodo que me devuelve el nombre del titular
     * 
     * @return <code>nombre</code> Nombre del titular
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /** Metodo que me devuelve el saldo disponible en cada momento
     * 
     * @return <code>saldo</code> Saldo disponible en la cuenta
     */
     public double estado ()
    {
        return saldo;
    }

    /** Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
      * 
      * @param cantidad Dinero a ingresar en cuenta
      * @throws Exception  Controlamos que no se introduzcan cantidades negativas
      */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }



    /** Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     * 
     * @param cantidad Dinero a sacar de la cuenta
     * @throws Exception  Controlamos que no se retiren cantidades negativas ni superiores al saldo
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * Devuelve el numero de cuenta 
     * @return <code>cuenta</code> Cadena con el numero de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Asignamos el numero de la cuenta
     * @param cuenta Numero de la cuenta del cliente
     */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Asignamos el valor al saldo
   * @param saldo Introduce el saldo actual
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Nos devuelve el tipo de interes
   * @return <code>tipoInteres</code> Porcentaje a aplicar
   */
  public double getTipoInteres() {
    return tipoInteres;
  }

  /**
   * Asignamos el valor del tipo de interes
   * @param tipoInteres Porcentaje a aplicar
   */
  public void setTipoInteres(double tipoInteres) {
    this.tipoInteres = tipoInteres;
  }
}
