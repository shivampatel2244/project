class StringThread extends Thread {
    String str;

    StringThread(String st) {
        str = st;
    }

    public void run() {
        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}

class ImplStringThread {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.println("Enter String: ");
        st = sc.nextLine();
        StringThread th = new StringThread(st);
        th.start();
    }
}