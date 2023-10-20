public class tafadzwag4 {
    public static void main (String[] arg) {

        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeight = 83;
        marsWeight =(earthWeight * "kg on earth" + marsWeight + " kg on Mars");

        //assignment (compatible types) from float to double
        marsWeightInDouble = marsWeight ;
        System.out.println("kilograms on Mars after convrting to double " +marsWeightInDouble);

        //printing a variable limiting the length of printing to 4 decimal places
        System.out.printf("kilograms on Mars displayed to four decimal places: %.4f %n"; marsWeightInDouble
    }
}
