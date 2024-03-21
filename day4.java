
// 1 : Time Class
class time {
    public static void main(String[] args) {
        tuna tunaObj = new tuna();
        tunaObj.setTime(12, 12, 02);
        System.out.println(tunaObj.printTime());
    }
}

/*
 * day 4
 * watched up to tutorial 44
 * 
 * <What I've learned>
 * [38]
 * 'this.x' makes public function to use its argument
 * even though there is a variable with same name in its
 * class (x = variable name)
 * 
 * [39]
 * if there is same name function w diff args,
 * it will fall into the function w same arg type.
 * 
 * [42]
 * When you use 'this' & need string object, 
 * it looks for 'toString' function (return type String).
 */