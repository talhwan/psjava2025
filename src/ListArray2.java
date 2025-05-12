public class ListArray2 {
    String[] list = null;

    public ListArray2() {
        list = new String[0];
    }

    public void printThis(){
        /*
        for(int i = 0; i < list.length; i++) {
            String each = list[i];
            System.out.println(each);
        }
        */
        for(String each : list) {
            System.out.println(each);
        }
    }
    public int size(){
        return list.length;
    }

    public void add(String each){
        String[] newList = new String[list.length + 1];
        for(int i=0;i<list.length;i++){
            newList[i] = list[i];
        }
        newList[list.length] = each;
        this.list = newList;
    }
    public String get(int index){
        if(index < 0 || index >= list.length) {
            return null;
        }
        return list[index];
    }
    public void set(int index, String each){
        if(index < 0 || index >= list.length) {
        } else {
            list[index] = each;
        }
    }
    public void remove(int index){
        if(index < 0 || index >= list.length) {
            //지울 것이 없음..
        } else {
            /*
            0 1 2 3 4 5 6 7 8 9 => 10개
            4번 삭제!! 3번까지는 복사!!
            0 1 2 3 () 5 6 7 8 9 => 9개로 수정!!
             */
            String[] newList = new String[list.length - 1];
            for(int i=0;i<index;i++){
                newList[i] = list[i];
            }
            for(int i=index + 1;i<list.length;i++){
                newList[i-1] = list[i];
            }
            this.list = newList;
        }


    }
}
