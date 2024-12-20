/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author gardh
 */
public class DataModel {
     private static String data;
    private static int dataInt;
    private static double dataD;
    private static int dataID;
        public static String getData(){
                return data;
        }
        
        public static void setData(String newData){
                data = newData;
        }
        
        public static int getDataInt(){
                return dataInt;
        }
          
            public static void setDataInt(int newData){
                dataInt = newData;
        }
            
              public static double getDataDouble(){
                return dataD;
        }
          
            public static void setDatDouble(double newData){
                dataD = newData;
        }
               public static int getDataID(){
                return dataID;
        }
          
            public static void setDatID(int newData){
                dataID = newData;
        }
            
}

