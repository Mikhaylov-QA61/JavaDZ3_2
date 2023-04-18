public class BmiService {
    public float calculate (float mass, float height) {
        float index;
        height=height/100;
        index = mass/(height*height);
        return index;
    }
}
