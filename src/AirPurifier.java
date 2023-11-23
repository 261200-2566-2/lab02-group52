class AirPurifier {
    String model;
    String serialNo;
    boolean power = false;
    int windspeed =1;
    int time=1;
    String currentmode;
    static int countmodel;

    AirPurifier(String model, String serialNo) {
        this.model = model;
        this.serialNo = serialNo;
        countmodel++;
    }

    void Onoff() {
        if (power == false) {
            power = true;
        } else {
            power = false;
        }
        if (power) {
            System.out.println(model + " is turned on");
            System.out.println(model + " Mode auto");
            currentmode="auto";
        } else {
            System.out.println(model + " is turned off");
        }
    }
    //เป็นfunctionที่ไม่ต้องการinput ทำหน้าที่เหมือนปุ่มๆนึง โดยจะเอาไว้เปิดปิดเครื่อง แล้วเมื่อเปิดเครื่องจะsetค่าmodeเป็นauto
    void speedwind(){
        if(power){
            System.out.println(model + " Mode windspeed ");
            currentmode="windspeed";
            if(windspeed%3==1){
                System.out.println(model + " windspeed : Low");
            }else if(windspeed%3==2){
                System.out.println(model + " windspeed : medium");
            }else{
                System.out.println(model + " windspeed : high");
            }
            windspeed++;
        }else{
            System.out.println(model + " is turned off");
        }
    }
    //เป็นfunctionที่ไม่ต้องการinput ทำหน้าที่เหมือนปุ่มๆนึง โดยจะเอาไว้ปรับspeedลมโดยหากเครื่องเปิดอยู่จะเปลี่ยนmodeเป็นwindspeedแล้วค่อยๆปรับspeed3ระดับคือlow medium high

    void settime(){
        if(power){
            if(time%7==1){
                System.out.println(model + " settime : 1 hour");
            }else if(time%7==2) {
                System.out.println(model + " settime : 2 hour");
            }else if(time%7==3) {
                System.out.println(model + " settime : 3 hour");
            }else if(time%7==4){
                System.out.println(model + " settime : 6 hour");
            }else if(time%7==5) {
                System.out.println(model + " settime : 9 hour");
            }else if(time%7==6) {
                System.out.println(model + " settime : 12 hour");
            }else{
                System.out.println(model + " settime : off");
            }
            time++;
        }else{
            System.out.println(model + " is turned off");
        }
    }
    //เป็นfunctionที่ไม่ต้องการinput ทำหน้าที่เหมือนปุ่มๆนึง โดยจะเอาไว้setเวลาก่อนทำงานก่อนจะปิดเอง โดยจะกดปุ่มนี้ได้หากเครื่องเปิดอยู่

    void mode(){
        if(currentmode.equals("auto")){
            System.out.println(model + " mode : windspeed");
            System.out.println(model + " windspeed : Low");
            currentmode="windspeed";
        }else if(currentmode.equals("windspeed")){
            System.out.println(model + " mode : silent");
            currentmode="silent";
        }else{
            System.out.println(model + " mode : auto");
            currentmode="auto";
        }
    }
    //เป็นfunctionที่ไม่ต้องการinput ทำหน้าที่เหมือนปุ่มๆนึง โดยจะเอาไว้เปลี่ยนmode โดยจะมี3modeคือauto windspeed silent โดยหากเป็นwindspeedจะsetค่าspeed defaultเป็นlow

    static void checkstock(){
        System.out.println("Total of obj : " + countmodel);
    }
}

/* 1.give a complete description of AirPurifier class
    what should be instance variables?
        model
        serialNo
        Power
        WindSpeed
        Time
        currentmode
    what should be instance methods?
        Onoff
        speedwind
        settime
        mode
    what should be class variables?
        countmodel
    what should be class methods?
        checkstock
*/



