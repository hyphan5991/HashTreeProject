import java.util.LinkedList;

/**
 * Created by timroels on 5/5/16.
 */
public class SpecificHashMap extends MyHashMap {

    public SpecificHashMap() {
        buckets = new LinkedList[50];
        for (int i = 0; i < 50; i++) {
            buckets[i] = new LinkedList<String>();
        }
    }

    @Override
    protected int hash(String token) {
        char firstletter= '?';
        char secondletter ='?';
        char thirdletter = '?';
        char fourthletter = '?';
        int base = 0;
        firstletter = token.charAt(0);
        secondletter = token.charAt(1);
        if(token.length()>2) {
             thirdletter = token.charAt(2);
        }
        if(token.length()>3) {
            fourthletter = token.charAt(3);
        }
        switch (firstletter){
            case 'a' :
                switch (secondletter){
                    case 'b':
                        base = 0;
                        break;
                    case 's':
                        base =1;
                        break;
                }
                break;
            case 'b':
                switch(secondletter){
                    case'o':
                        base = 2;
                        break;
                    case 'r':
                        base =3;
                        break;
                    case 'y':
                        base = 4;
                        break;
                }
                break;
            case'c':
                switch (secondletter){
                    case 'a':
                        switch (thirdletter){
                            case's':
                                base =5;
                                break;
                            case 't':
                                base =6;
                                break;
                        }
                        break;
                    case'h':
                        base =7;
                        break;
                    case 'l':
                        base =8;
                        break;
                    case 'o':
                        switch(thirdletter){
                            case 'n':
                                switch (fourthletter){
                                    case's':
                                        base =9;
                                        break;
                                    case 't':
                                        base = 10;
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
            case 'd':
                switch(secondletter){
                    case 'e':
                        base =11;
                            break;
                    case'o':
                        if(thirdletter == '?'){
                            base = 12;
                        }
                        else{
                            base = 13;}
                        break;
                }
                break;
            case'e':
                switch (secondletter){
                    case 'l':
                        base =14;
                        break;
                    case 'n':
                        base =15;
                        break;
                    case'x':
                        base = 16;
                        break;
                }
                break;
            case 'f':
                switch (secondletter){
                    case 'i':
                        if(token.length()<6){
                            base = 17;
                        }
                        else
                            base = 18;
                        break;
                    case 'l':
                        base =19;
                        break;
                    case 'o':
                        base =20;
                        break;
                }
                break;
            case 'g':
                base = 21;
                break;
            case 'i':
                switch (secondletter){
                    case 'f':
                        base = 22;
                        break;
                    case 'm':
                        if(fourthletter =='l'){
                            base =23;
                        }
                        else base = 24;
                        break;
                    case'n':
                        switch (thirdletter){
                            case 's':
                                base =25;
                                break;
                            case 't':
                                if(token.length()==3){
                                    base = 26;
                                }
                                else
                                    base = 27;
                                break;
                        }
                        break;
                        }
                break;
            case'l':
                base = 28;
                break;
            case 'n':
                switch (secondletter){
                    case 'a':
                        base =29;
                        break;
                    case 'e':
                        base = 30;
                        break;
                }
                break;
            case 'p':
                switch (secondletter){
                    case 'a':
                        base =31;
                        break;
                    case 'r':
                        switch (thirdletter){
                            case 'i':
                                base =32;
                                break;
                            case 'o':
                                base = 33;
                                break;
                        }
                        break;
                    case 'u':
                        base = 34;
                        break;
                }
                break;
            case 'r':
                base =35;
                break;
            case 's':
                switch (secondletter){
                    case 'h':
                        base =36;
                        break;
                    case 't':
                        switch (thirdletter){
                            case 'a':
                                base =37;
                                break;
                            case 'r':
                                base =38;
                                break;
                        }
                        break;
                    case 'u':
                        base =39;
                        break;
                    case'w':
                        base =40;
                        break;
                    case 'y':
                        base =41;
                        break;
                }
                break;
            case 't':
                switch (secondletter){
                    case 'h':
                        switch (thirdletter){
                            case 'i':
                                base =42;
                                break;
                            case 'r':
                                if(token.length()==5){
                                    base =43;
                                }
                                else
                                    base =44;
                                break;
                        }
                        break;
                    case 'r':
                        switch (thirdletter){
                            case 'a':
                                base =45;
                                break;
                            case 'y':
                                base = 46;
                                break;
                        }
                        break;
                }
                break;
            case 'v':
                switch (thirdletter){
                    case 'i':
                        base =47;
                        break;
                    case 'l':
                        base = 48;
                        break;
                }
                break;
            case 'w':
                base =49;
                break;
                }
        return base;

        }


    @Override
    public void add(String token) {


        // TODO: IMPLEMENT ADD METHOD USING BUCKETS
        int index = hash(token);
        this.buckets[index].add(token);

    }

    @Override
    public void display() {
        for(int i = 0; i<buckets.length;i++){
            System.out.print("bucket index " + i);
            for(int j = 0; j<buckets[i].size(); j++){
                System.out.print(buckets[i].get(j));
            }
            System.out.println();
        }
        // TODO: IMPLEMENT DISPLAY METHOD TO SHOW CONTENTS OF ALL BUCKETS

    }
    public static void main(String[] args){
        SpecificHashMap hashm = new SpecificHashMap();
        System.out.println(testHashMap(hashm,"keywords.txt", 30.0));
        hashm.display();
    }
}
