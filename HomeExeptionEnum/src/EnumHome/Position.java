package EnumHome;

import java.util.Arrays;

/**
 * Created by Ирина on 18.01.2016.
 */
public class Position {
    int n;
    int m;
    int[][] matr;
    Directry directry;
    int x = 0;
    int y = 0;
    int nN;
    int mM;

    public Position(int n, int m) {
        this.n = n;
        this.nN = n - 1;
        this.m = m;
        this.mM = m - 1;
        directry = Directry.RIGHT;
        matr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr[i][j] = 0;
                System.out.print(" " + matr[i][j]);
            }
            System.out.println();
        }
    }
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                str = str + " " + matr[i][j];
            }
            str = str + "\n";
        }
        return str;
    }

    void startRight() {
        try {
            for (int i = x; i < m + 1; i++) {
                if (matr[x][i] == 1) {  x++;
                    throw new OllReadyVisitedPlaseexception();
                } else {
                    matr[x][i] = 1;
                }
            }
        } catch (IndexOutOfBoundsException ex) {
            directry = directry.nextDirectory();
            System.out.println(directry + "  Index");
        }
        x++;
    }
    void startLeft() {
        System.out.println("startLeft");
        try {
            for (int i = mM; i >= -1; i--) {
                if ( matr[nN][i] == 1) {
                    nN--;
                    throw new OllReadyVisitedPlaseexception();
                } else {
                matr[nN][i] = 1;
            }}
        } catch (IndexOutOfBoundsException ex) {
            directry = directry.nextDirectory();
            System.out.println(directry + "cath left");
        }
        nN--;
    }

    void startDown() {
        try {
            System.out.println("startDown");
            for (int i = x; i < n + 1; i++) {
                if ( matr[i][mM] == 1) {
                    mM--;
                    throw new OllReadyVisitedPlaseexception();
                } else {
                matr[i][mM] = 1;
            }}
        } catch (IndexOutOfBoundsException ex) {
            directry = directry.nextDirectory();
            System.out.println(directry + "  Index");
        }
        mM--;
    }
    void startUp() {
        try {
            System.out.println("startUp");
            for (int i = nN; i >= -1; i--) {
                if ( matr[i][y]  == 1) {y++;
                    throw new OllReadyVisitedPlaseexception();
                } else {
                matr[i][y] = 1;
            }}
        } catch (IndexOutOfBoundsException ex) {
            directry = directry.nextDirectory();
            System.out.println(directry + "  Index");
        }
        y++;
    }
    void nextPosition() {
        System.out.println(directry + " next ");
        try {
            switch (directry) {
                case RIGHT:
                startRight();
                    break;
           case DOWN:
            System.out.println("caseDown");
            startDown();
            break;
            case LEFT:
            System.out.println("caseLeft");
            startLeft();
           break;
           case UP:
           System.out.println("caseUp");
            startUp();
             break;
    }
}catch (OllReadyVisitedPlaseexception e){
            directry=directry.nextDirectory();
                System.out.println(directry+"  OllReadyVisitedPlaseexception ");
        }
      }
}
