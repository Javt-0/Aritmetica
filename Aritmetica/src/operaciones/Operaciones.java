
package operaciones;

/**
 *
 * @author jonat
 */
public class Operaciones {
    private int num[];

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public Operaciones(int[] num) {
        this.num = num;
    }

    public Operaciones() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operaciones{");
        sb.append("num=").append(num);
        sb.append('}');
        return sb.toString();
    }
    
    public int suma(int num[]){
        int suma = 0;
        for(int i=0; i<num.length; i++){
            suma += num[i];
        }
        
        return suma;
    }
    
    public int resta(int num[]){
        int resta = 0;
        for(int i=0; i<num.length; i++){
            resta = resta - num[i];
        }
        
        return resta;
    }
    
    public int multiplicacion(int num[]){
        int multi = 1;
        for(int i=0; i<num.length; i++){
            multi = num[i] * multi;
        }
        
        return multi;
    }
    
    public double division(int num[]){
        double[] numDouble = new double [num.length];
        for(int i=0; i<numDouble.length; i++){
            numDouble[i] = num[i];
        }
        
        double div = numDouble[0];
        for(int i=1; i<numDouble.length; i++){
            if(numDouble[i]>0 || numDouble[i]<0){
                System.out.print("La division entre "+ div +" ÷ " + num[i] + " = ");
                div = div / num[i];
                System.out.println(div);
            }else{
                System.out.println("No se puede dividir un numero por cero");
                break;
            }
        }
        
        return div;
    }
}
