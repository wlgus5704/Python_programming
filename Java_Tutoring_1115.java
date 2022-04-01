class Example{

int count(String st, char ch){
    int cou =0;
    for(int i=0; i<st.length(); i++){
        if(st.charAt(i) == ch){
            cou +=1}}
    return cou;}

    void capital(char n){
        String nn = String.value.Of(n);
        System.out.println(nn.toUpperCase());}

class Appliancd{
    private String name;
    private int Power;
    
    Applianc(String str, int i){
        name = str;
        Power = i;
    }

    String getName(){
        return name;}

    int getPower(){
        return Power;}
    }

class Aircon{
    private String name;
    private int power;
    prviate int on;

    Aircon(String st, int i, int j){
        name = st;
        power =i;
        on = j;
    }

    void show(){
        System.out.println(name+"("+power+"V)의 온도는" +on +"도")}

}
 Public class Main{
     public static void main (Stirng[] args){
         Example ex = new Esample();
         System.out.println(ex.count ("oxxoooxoox", 'o'));

         ex.capital('n');
         
         Appliance tv - new Appliance("jihyeon tv", 110);
         System.out.println(tv.getName() + '('+ tv.getPower() + "V)");

         Aircon cool = new Aircon("jihyeon aircon", 220,20);
         cool.show();
     }}
        
