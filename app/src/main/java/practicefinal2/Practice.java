/*
 * This source file was generated by the Gradle 'init' task
 */
package practicefinal2;

public class Practice {
    
    public boolean foobar(int[] data){
        int sum = 0;
        for(int i = 0; i<data.length; i++){
            sum += data[i];
        }

        if (sum % 2 == 0){
            return true;
        }

        else{
            return false;
        }
    }

}
