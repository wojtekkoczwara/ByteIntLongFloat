package academy.learnProgramming.OperatorsTypes;

public class First {

    int[] table = {0, 4, 5, 6, 2, 10};

    public void setNewTable(int integer){
        int[] newTable = new int [this.table.length +1];
        for (int i = 0; i<this.table.length; i++){
            newTable[i] = this.table[i];
            System.out.println(newTable[i]);
        }
        newTable[newTable.length-1] = integer;
        System.out.println(newTable[newTable.length -1]);
    }

    public static void main(String[] args) {
        First first = new First();
        first.setNewTable(2);
    }
}
