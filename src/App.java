public class App {
    public static void main(String[] args) throws Exception {
        int alturaPiramide = 5;
        for(int i=1; i <= alturaPiramide; i++){
            String linha = "";
            for(int j=1; j <= i; j++){
                linha += i;
                
            }   
            System.out.println(linha);
        }
        
    }
}
