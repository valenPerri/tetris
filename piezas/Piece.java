package piezas;

public abstract class Piece {
    protected int lado=0;
    protected int matriz [][] = new int [4][4];
    protected int posicion[][]=new int [10][20];
    
    public Piece(){
    }
    public int getValor(int pos1,int pos2){
        return matriz[pos1][pos2];
    }
    protected void setValor1(int pos1,int pos2){
        matriz[pos1][pos2]=1;
    }
    public void reset(){
        for (int i=0; i<4;i++){
            for (int x=0;x<4;x++){
                matriz[i][x]=0;
            }
        }
    }
}