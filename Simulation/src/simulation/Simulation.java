
package simulation;


public class Simulation {

      public static double[] Frequency_to_probabilty(int Counter,double[]Arr ,int sum){
   
       double []probability = new double[Counter];

        for(int i=0;i<Counter;i++){
       probability[i]=Arr[i]/sum;
       }
        return probability;
   
     }
      public static void Probability_to_cumulative(int Counter , double[]Arr)
        {
            double cumulative[]=new double[Counter];
            int i;
            double total=0.0;
            for(i=0;i<Counter;i++)
            {
                total+=Arr[i];
                cumulative[i]=total;
            }
            for(i=0;i<Counter;i++)
                System.out.println(cumulative[i]);
            
            
        }
   
    public static void main(String[] args) {
    
       
        
        
    }
    
}
