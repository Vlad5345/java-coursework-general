import java.util.ArrayList;

class Bah{
    private ArrayList<Integer> list1;

    public void setList1(ArrayList<Integer> list2){
        list1 = list2;
    }
    public String Babah(String bum){

        int bam = Integer.parseInt(bum);
        String result = "Мимо";

        if (bam == list1.indexOf(1) || bam == (list1.indexOf(1) + 1) || bam == (list1.indexOf(1) + 2)) {
            result = "Попал";
            list1.set(list1.indexOf(1), 0);
        }
        if (list1.indexOf(1) == -1) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}