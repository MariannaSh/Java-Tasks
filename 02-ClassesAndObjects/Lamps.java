public class Lamps {
    boolean lampIsOn;

    void switchOnLamp(){
        if (!lampIsOn){
            lampIsOn = true;
        }
    }
    //Этот блок проверяет, не включена ли лампа уже (lampIsOn != true). Если она не включена, метод устанавливает lampIsOn в true, фактически включая лампу.

    void switchOffLamp(){
        if (lampIsOn){
            lampIsOn = false;
        }
    }
    
    void info(){
        String switchStatus = (lampIsOn)? "Lamp is already on":"Lamp has been switched off";
        System.out.println(switchStatus);
    }
}
