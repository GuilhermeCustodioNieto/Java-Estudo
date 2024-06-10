package vetor.test01;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i=0; i<=9; i++){
            vetor[i] = i;
        }

        for (int i=0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
