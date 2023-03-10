public class BlankFinal {
    public static void main(String[] args) {

        TrafficSignal[] signals = TrafficSignal.values();

        for(TrafficSignal signal: signals){
            System.out.println("name: "+ signal.name() + "  action: " + signal.getAction());
        }
    }
}

    enum TrafficSignal {
        RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

        private String action;
        public String getAction() {
            return this.action;
        }
        private TrafficSignal(String action) {
            this.action = action;
        }
    }



