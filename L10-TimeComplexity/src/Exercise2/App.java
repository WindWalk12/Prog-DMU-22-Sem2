package Exercise2;

public class App {
    // O(n*log(n))
    public int method1(int n){
        int result = 0;
        for (int i = 0; i<n ; i++){
            for (int j = 1; j < n; j = j*2){
                result++;
            }
        }
        return result;
    }
}
