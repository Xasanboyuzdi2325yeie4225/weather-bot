package org.example;

import org.example.btns.InterfaceBtns;
import org.example.btns.InterfaceBtnsIMPL;
import org.example.ob_havo.obHavo.Ob_Havo;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    private final InterfaceBtns btns=new InterfaceBtnsIMPL();
    private final Ob_Havo obHavo=new Ob_Havo();
    public List<String>getBosh(){
        List<String> list = new ArrayList<String>();
        list.add("Bosh menu");
        return list;
    }

    public List<String>getMenu(){
        List<String> list = new ArrayList<String>();
        list.add("viloyatlar bo`yicha");
        list.add("lokatsiya bo`yicha");
        return list;
    }
    public List<String>getLocation(){
        List<String>a=new ArrayList<>();
        a.add("Lokatsiyani yuborish");
        return a;
    }

    public List<String>getViloyatlar(){
        List<String>a=new ArrayList<>();
        a.add("Toshkent shaxar");
        a.add("Toshkent viloyati");
        a.add("Andijon viloyati");
        a.add("Farg`ona viloyati");
        a.add("Namangan viloyati");
        a.add("Sirdaryo viloyati");
        a.add("Jizzax viloyati");
        a.add("Samarqand viloyati");
        a.add("Qashqadaryo viloyati");
        a.add("Surxondaryo viloyati");
        a.add("Navoiy viloyati");
        a.add("Buxoro viloyati");
        a.add("Xorazm viloyati");
        a.add("Qoraqalpog`iston Respublikasi");
        a.add("Bosh menu");
        return a;
    }
    public Boolean viloyatmi(String text){
        for (int i = 0; i < getViloyatlar().size(); i++) {
            if (text.equals(getViloyatlar().get(i))){
                return true;
            }
        }
        return false;
    }

    public SendMessage obhavoVil(String text,Long chatid){
        double lat=0;
        double lon=0;
        for (int i = 0; i < getViloyatlar().size(); i++) {
            if (text.equals("Toshkent shaxar")){
                lat=41.3412877
                ;
//                tatu hududi
                lon= 69.2865991
                ;break;
            }
            if (text.equals("Toshkent viloyati")){
// 40.8094897,69.2263324,15.38  bo`ka hududi
                lat=40.8094897
                ;
                lon= 69.2263324
                ;break;
            }
            if (text.equals("Andijon viloyati")){
                lat=40.7881104
//                https://www.google.com/maps/place/Andijon+davlat+pedagogika+instituti+talabalar+turar+joyi/@
//                40.7881104,72.364324,18.89
//                z/data=!4m9!1m2!2m1!1sXayrullo+Boboyevlar!3m5!1s0x38bced8e22060f83:0xe122f701485c860a!8m2!3d40.7879617!4d72.3648948!16s%2Fg%2F11sm5vkmlf?entry=ttu
                ;
                lon= 72.364324
                ;break;
            }
            if (text.equals("Farg`ona viloyati")){
                lat=40.5342541
//                https://www.google.com/maps/place/%D0%A4%D0%B5%D1%80%D0%B3%D0%B0%D0%BD%D1%81%D0%BA%D0%B0%D1%8F+%D0%9E%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D1%8C,+%D0%A3%D0%B7%D0%B1%D0%B5%D0%BA%D0%B8%D1%81%D1%82%D0%B0%D0%BD/@
//                40.5342541,70.9306431,19.5
//                z/data=!4m6!3m5!1s0x38ba35e21e649803:0xcd6937bf69229b68!8m2!3d40.4568081!4d71.2874209!16zL20vMDZzd2h2?entry=ttu
                ;
                lon= 70.9306431
                ;break;
            }
            if (text.equals("Namangan viloyati")){
                lat=41.0035751
//                https://www.google.com/maps/place/Afsonalar+vodiysi,+Namangan/@
//                41.0035751,71.6194145,17.12
//                z/data=!4m15!1m8!3m7!1s0x38a4c708e5b54231:0x4e71cd6bb0e2df44!2z0J3QsNC80LDQvdCz0LDQvdGB0LrQsNGPINC-0LHQu9Cw0YHRgtGMLCDQo9C30LHQtdC60LjRgdGC0LDQvQ!3b1!8m2!3d41.0510037!4d71.097317!16zL20vMDZzd2Rw!3m5!1s0x38bb4b980dc68ce9:0x6f36578d3ae2778a!8m2!3d41.0030409!4d71.6183174!16s%2Fg%2F11q2w_j1df?entry=ttu
                ;
                lon= 71.6194145
                ;break;
            }
            if (text.equals("Sirdaryo viloyati")){
                lat=40.5689562
//                https://www.google.com/maps/place/40%C2%B034'09.1%22N+68%C2%B040'58.6%22E/@
//                40.5689562,68.6825525,18.5
//                z/data=!4m13!1m8!3m7!1s0x38ade9cca3f36d5f:0xc830f01b9aaeedac!2z0KHRi9GA0LTQsNGA0YzQuNC90YHQutCw0Y8g0L7QsdC70LDRgdGC0YwsINCj0LfQsdC10LrQuNGB0YLQsNC9!3b1!8m2!3d40.3863808!4d68.7154975!16zL20vMDZ0Nndy!3m3!8m2!3d40.569199!4d68.682952?entry=ttu
                ;
                lon= 68.6825525
                ;break;
            }
            if (text.equals("Jizzax viloyati")){
                lat=40.3274997
//                https://www.google.com/maps/place/Masjid/@
//                40.3274997,67.8736238,21
//                z/data=!4m15!1m8!3m7!1s0x38b2ea58f711aca9:0xe18d916c84a0f4df!2z0JTQttC40LfQsNC60YHQutCw0Y8g0L7QsdC70LDRgdGC0YwsINCj0LfQsdC10LrQuNGB0YLQsNC9!3b1!8m2!3d40.4706415!4d67.5708536!16s%2Fg%2F121cs39s!3m5!1s0x38b29d9f67e70c1f:0xbb25983790311be3!8m2!3d40.3275598!4d67.8737792!16s%2Fg%2F11ks0drpj4?entry=ttu
                ;
                lon= 67.8736238
                ;break;
            }
            if (text.equals("Samarqand viloyati")){
                lat=39.6172472
//                https://www.google.com/maps/place/%D0%9C%D0%B5%D1%87%D0%B5%D1%82%D1%8C+%D0%A5%D0%BE%D0%B4%D0%B6%D0%B0+%D0%90%D1%85%D1%80%D0%BE%D1%80%D0%B8+%D0%92%D0%B0%D0%BB%D0%B8/@
//                39.6172472,66.9572859,16.39
//                z/data=!4m15!1m8!3m7!1s0x3f4d192105ad6575:0x3dd6eaee02d96aa6!2z0KHQsNC80LDRgNC60LDQvdC00YHQutCw0Y8g0L7QsdC70LDRgdGC0YwsINCj0LfQsdC10LrQuNGB0YLQsNC9!3b1!8m2!3d39.920791!4d66.4271499!16zL20vMDZ0Zm5q!3m5!1s0x3f4d1f1e5b4a60b1:0x2af984f4ffa3daff!8m2!3d39.6188488!4d66.9532813!16s%2Fg%2F1yh7_w18m?entry=ttu
                ;
                lon= 66.9572859
                ;break;
            }
            if (text.equals("Qashqadaryo viloyati")){
                lat=39.0574515
//                https://www.google.com/maps/place/Ak-Saray+Palace/@
//                39.0574515,66.8248757,16.11
//                z/data=!4m15!1m8!3m7!1s0x3f4c0f733ef3784f:0xad8977474640b0e7!2z0JrQsNGI0LrQsNC00LDRgNGM0Y8sINCj0LfQsdC10LrQuNGB0YLQsNC9!3b1!8m2!3d38.8986231!4d66.0463534!16zL20vMDZ0ODl0!3m5!1s0x3f4c9aa18685badd:0x9d058b6b46472d32!8m2!3d39.0608031!4d66.8295561!16s%2Fg%2F12353rgd?entry=ttu
                ;
                lon= 66.8248757
                ;break;
            }
            if (text.equals("Surxondaryo viloyati")){
                lat=37.2665785
//                https://www.google.com/maps/place/%D0%90%D1%80%D1%85%D0%B8%D1%82%D0%B5%D0%BA%D1%82%D1%83%D1%80%D0%BD%D1%8B%D0%B9+%D0%BF%D0%B0%D0%BC%D1%8F%D1%82%D0%BD%D0%B8%D0%BA+%D0%94%D0%B2%D0%BE%D1%80%D0%B5%D1%86+%D0%9A%D1%8B%D1%80%D0%BA-%D0%BA%D1%8B%D0%B7/@
//                37.2665785,67.2897467,20.39
//                z/data=!4m15!1m8!3m7!1s0x38b5110fcbfa23c3:0xb095bebbc47ce718!2z0KHRg9GA0YXQsNC90LTQsNGA0YzRjywg0KPQt9Cx0LXQutC40YHRgtCw0L0!3b1!8m2!3d37.9409005!4d67.5708536!16zL20vMDZ0N250!3m5!1s0x3f3532260e5d281b:0x593d9e3e0559f79d!8m2!3d37.2666377!4d67.290144!16s%2Fg%2F11g9gnp007?entry=ttu
                ;
                lon= 67.2897467
                ;break;
            }
            if (text.equals("Navoiy viloyati")){
                lat=41.5745355
//                https://www.google.com/maps/place/UZUM+MARKET/@
//                41.5745355,64.2125473,18.61
//                z/data=!4m15!1m8!3m7!1s0x3f58007030619501:0x4e9722f8f8bc17f8!2z0J3QsNCy0L7QuNC50YHQutCw0Y8g0L7QsdC70LDRgdGC0YwsINCj0LfQsdC10LrQuNGB0YLQsNC9!3b1!8m2!3d42.6988575!4d64.6337685!16zL20vMDZ0Zl8w!3m5!1s0x3f582529058661f5:0x325940761956cb60!8m2!3d41.574694!4d64.213093!16s%2Fg%2F11t_rmk17l?entry=ttu
                ;
                lon= 64.2125473
                ;break;
            }
            if (text.equals("Buxoro viloyati")){
//                https://www.google.com/maps/place/%D0%9C%D0%B5%D1%87%D0%B5%D1%82%D1%8C+%D0%9A%D0%B0%D0%BB%D0%BE%D0%BD/@
//                39.7760156,64.4140188,20.67
//                z/data=!4m15!1m8!3m7!1s0x3f50060e65993cd5:0x7d54acc77acd3717!2z0JHRg9GF0LDRgNCwLCDQo9C30LHQtdC60LjRgdGC0LDQvQ!3b1!8m2!3d40.2504162!4d63.2032151!16zL20vMDZ0ZnRy!3m5!1s0x3f50061dcfb11e2d:0xae4ed3e594fa1b2d!8m2!3d39.7759159!4d64.4140867!16zL20vMGNrZmgw?entry=ttu
                lat=39.7760156
                ;
                lon= 64.4140188
                ;break;
            }
            if (text.equals("Xorazm viloyati")){
                lat=41.5570642
//                https://www.google.com/maps/place/Qabriston+%2F+Cemetery+%2F+%D0%9A%D0%BB%D0%B0%D0%B4%D0%B1%D0%B8%D1%89%D0%B5/@
//                41.5570642,60.5931823,
//                21z/data=!4m15!1m8!3m7!1s0x41de3cbf7f89baef:0xe874bc482a2737e!2z0KXQvtGA0LXQt9C80YHQutCw0Y8g0L7QsdC70LDRgdGC0YwsINCj0LfQsdC10LrQuNGB0YLQsNC9!3b1!8m2!3d41.3565336!4d60.8566686!16zL20vMDZ0bnFk!3m5!1s0x41dfc98ab049c1c9:0x208b05b2bb89ad84!8m2!3d41.5570709!4d60.5932866!16s%2Fg%2F11gmysgd6c?entry=ttu
                ;
                lon= 60.5931823
                ;break;
            }
            if (text.equals("Qoraqalpog`iston Respublikasi")){
                lat=42.4606124;
                https://www.google.com/maps/place/Joqargy+Ken'es/@4
                // 2.4606124,59.6180097,19.67z
                // /data=!4m15!1m8!3m7!1s0x41e9b68886e89265:0xc7f1caf0e51ae55a!2z0KDQtdGB0L_Rg9Cx0LvQuNC60LAg0JrQsNGA0LDQutCw0LvQv9Cw0LrRgdGC0LDQvSwg0KPQt9Cx0LXQutC40YHRgtCw0L0!3b1!8m2!3d43.8041334!4d59.4457988!16zL20vMDF6Y2Zq!3m5!1s0x41dd9b33371aa591:0xddc5a593844ead50!8m2!3d42.4605028!4d59.619001!16s%2Fg%2F11rmfvjpzt?entry=ttu
                ;
                lon= 59.6180097
                ;break;
            }

        }
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText(obHavo.getObHavo(lat,lon));
        sendMessage.setReplyMarkup(btns.btnKeyboardBTN(getBosh()));
        return sendMessage;
    }

}
