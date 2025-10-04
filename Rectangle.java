public class Rectangle {
    private float x=0;
    private float y=0;
    private float width=0,height=0;
    private static int rectCount=0;

    Rectangle (float px, float py, float w, float h){
        x=px;
        y=py;
        width=w;
        height=h;
        rectCount++;
    }

    public static int getRectCount(){
        return rectCount;
    }

    public boolean contains(float sx, float sy){
        boolean res=false;
        
        if(sx>=x && sy>=y && sx <= x+width && sy <= y+height){
            res=true;
        }
        
        return res;
    }


}
