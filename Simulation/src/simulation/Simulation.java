
package simulation;


public class Simulation {
    public static double[][] get_intervals(double[] cumulative, int rows) {
        double[][] intervals = new double[rows][2];
       intervals[0][0]=01;
        for (int i = 0; i < cumulative.length; i++) {
            if (i == (cumulative.length) - 1) {
                intervals[i][1] = 0.0;

            }
            intervals[i][1] = cumulative[i]*100;

        }
        for (int j = 1, v=0; j < cumulative.length; j++) {

          
            intervals[j][0] = (cumulative[v] * 100) + 1.0;
            v++;
        }
       return intervals;



}



       

    
    
      public static double[] Frequency_to_probabilty(int Counter,double[]Arr ,int sum){
   
       double []probability = new double[Counter];

        for(int i=0;i<Counter;i++){
       probability[i]=Arr[i]/sum;
       }
        return probability;
   
     }
       public static double[] Probability_to_probabilty(int Counter,double[]Arr ){
   
       double []probability = new double[Counter];

        for(int i=0;i<Counter;i++){
       probability[i]=Arr[i];
       }
        return probability;
   
     }
     
      
      public static double[] Probability_to_cumulative(int Counter , double[]Arr)
        {
            double cumulative[]=new double[Counter];
            int i;
            double total=0.0;
            for(i=0;i<Counter;i++)
            {
                total+=Arr[i];
                cumulative[i]=total;
            }
           return cumulative;
            
            
        }
   
    public static void main(String[] args) {
    
       
        Home obj=new Home();
        obj.setVisible(true);
        
        
    }
    
}
