
package maths;


public class Distance {
    
    int x1;
    int y1;
    int x2;
    int y2;


    public Distance() {
    }

    public Distance(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Distance(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

   
    
    
    
    public float getDistance(){
    
        int result1=x2-x1;
        int result2=y2-y1;
//        String return result1+" Its  "+result2;
        float distance=(float)Math.sqrt(Math.pow(result1, 2)+Math.pow(result2, 2));
        return distance;
        
    
    }
    
    
    
    
}
