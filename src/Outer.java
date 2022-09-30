public class Outer {
    private int out;
    private int data;

    public Outer(int out) {
        this.out = out;
        this.data = out;
    }

    public void display() {
        System.out.println("out = " + out);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public class Inner {
        private int in;
        private int data;

        public Inner(int in) {
            this.in = in;
            this.data = in;
        }

        public void display() {
            Outer.this.display();
            System.out.println("out = " + out  + " data = " + Outer.this.data +" in = " + in + " data = " + data);
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }
    }
}
