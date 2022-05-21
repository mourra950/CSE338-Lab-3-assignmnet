public class DigitalWatch {
    public boolean isOpen = false;
    public boolean isTimerSet = false;
    public float timer = 0;

    public String turnOn() {
        if (!isOpen) {
            isOpen = true;
            return "Turned On!";
        } else {
            return "Already turned on";
        }
    }

    public String setTimer(float time) {
        if (isOpen) {
            timer = time;
            isTimerSet = true;
            return "Timer set";
        } else {
            return "Watch os closed";
        }
    }

    public String doSomething() {
        if (isTimerSet) {
            return "Wait for timer to end";
        } else {
            return "Accepted";
        }
    }

    public String turnOff() {
        if (isOpen) {
            isOpen = false;
            return "Turned off";
        } else {
            return "Error";
        }
    }
}