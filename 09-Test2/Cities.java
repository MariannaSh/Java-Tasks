import java.util.ArrayList;


public class Cities {

    private String[] citiesNames; // массив строк с именами городов

    public Cities(String[] citiesNames) {
        this.citiesNames = citiesNames; //инициализация переменной класса
    }

//set позволяет обновлять массив
    public void setCitiesNames(String[] citiesNames) {
        this.citiesNames = citiesNames; 
    }

//возвращает массив
    public String[] getCitiesNames() {
        return citiesNames;
    }

    public Cities filter(char ch){ //char - jedna literka
    // в аррей будем складывать отфильтрованные города
        ArrayList<String> a1 =new ArrayList<String>(); 
        //цикл который проходит по всем элементам массива 
        for (String citiesNames: this.citiesNames){
//проверяем начинается ли текущее название города с указаного символа.
            if(citiesNames.startsWith(String.valueOf(ch))){ //Метод startsWith проверяет, начинается ли строка с указанной подстроки
                a1.add(citiesNames);
            }
        }
// ArrayList a1 преобразуется в массив строк (String[]). Метод toArray выполняет эту операцию.
// создется пустой массив, который соответствует нашему по размерам и копирует все элементы в этот новый массив, чтобы он был в виде String
        String[] object =a1.toArray(new String[a1.size()]);
//Создается новый объект класса Cities, используя отфильтрованный массив городов.
        Cities result1 = new Cities(object); 
        return result1;
    }

    public String cities(){
        String result="";
        for (int i = 0; i < citiesNames.length; i++) {
            result+=citiesNames[i];
        }
        return result;
    }

    public static void main(String[] args) {

        String[] arr1 = {"Slupsk","Warszawa","Sopot","Kielce","Szczecin","Krakow"};
        Cities c1=new Cities(arr1);
        
        System.out.println(c1.filter('S').cities());
    }

    
}