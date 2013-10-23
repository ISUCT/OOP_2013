
package feed;

/**
 * @author Бессонова Татьяна
 */
public class Feed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FeedData feedData = new FeedData ();
        ParrotsDisplay parrotsDisplay = new ParrotsDisplay (feedData);
        
        feedData.setMeasurements(7, 13, 22);
        feedData.setMeasurements(8, 16, 19);
        feedData.setMeasurements(9, 15, 00);
        
        
        
    }
}
